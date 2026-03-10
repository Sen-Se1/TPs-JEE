package com.example.orderservice.controller;

import com.example.orderservice.client.ProductClient;
import com.example.orderservice.model.Order;
import com.example.orderservice.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final ProductClient productClient;
    private final Map<Long, Order> orderMap = new HashMap<>();
    private Long nextOrderId = 1L;

    public OrderController(ProductClient productClient) {
        this.productClient = productClient;
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        // Get product details from product-service
        Product product = productClient.getProduct(order.getProductId());

        // Set order details
        order.setId(nextOrderId++);
        order.setProduct(product);
        order.setTotalPrice(product.getPrice() * order.getQuantity());

        // Save order
        orderMap.put(order.getId(), order);
        return order;
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id) {
        return orderMap.get(id);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return new ArrayList<>(orderMap.values());
    }
}