package com.graphQl.GraphQL.Application;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id, String name) {

    public static List<Author> authors = Arrays.asList(
            new Author(12, "Kevin Hert"),
            new Author(11, "Chris Andrew")
    );

    public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream()
                .filter(b -> b.id.equals(id))
                .findFirst();
    }
}
