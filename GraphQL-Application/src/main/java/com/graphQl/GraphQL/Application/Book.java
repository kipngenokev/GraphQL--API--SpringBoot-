package com.graphQl.GraphQL.Application;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id, String name, Integer pageCount, Integer authorId) {

    public static List<Book> books = Arrays.asList(
          new Book(1, "Encyclopedia of Cars",200,12),
            new Book(2,"Bible",1897,11),
            new Book(3, "God of Abraham", 234,12),
            new Book(4,"Billy the Goat", 2345,12)
    );

    public static Optional<Book> getBookById(Integer id) {
        return books.stream()
                .filter(b -> b.id.equals(id))
                .findFirst();
    }
}
