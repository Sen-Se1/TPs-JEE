package com.example.bookcatalog.config;

import com.example.bookcatalog.model.Book;
import com.example.bookcatalog.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDate;

@Configuration
public class DataInitializer {

    @Bean
    @Profile("!prod")
    public CommandLineRunner loadData(BookRepository bookRepository) {
        return args -> {
            if (bookRepository.count() == 0) {
                bookRepository.save(new Book(null, "To Kill a Mockingbird", "Harper Lee",
                        "9780061120084", LocalDate.of(1960, 7, 11),
                        12.99, "A novel about racial injustice in a small Alabama town.", "Fiction"));

                bookRepository.save(new Book(null, "1984", "George Orwell",
                        "9780451524935", LocalDate.of(1949, 6, 8),
                        10.99, "A dystopian novel set in a totalitarian society.", "Fiction"));

                bookRepository.save(new Book(null, "The Great Gatsby", "F. Scott Fitzgerald",
                        "9780743273565", LocalDate.of(1925, 4, 10),
                        9.99, "A novel exploring themes of decadence and idealism.", "Fiction"));

                bookRepository.save(new Book(null, "The Hobbit", "J.R.R. Tolkien",
                        "9780345339683", LocalDate.of(1937, 9, 21),
                        14.99, "A fantasy novel about the adventures of Bilbo Baggins.", "Fantasy"));

                bookRepository.save(new Book(null, "Pride and Prejudice", "Jane Austen",
                        "9780141439518", LocalDate.of(1813, 1, 28),
                        8.99, "A romantic novel following Elizabeth Bennet.", "Romance"));

                System.out.println("Sample books loaded into database!");
            }
        };
    }
}