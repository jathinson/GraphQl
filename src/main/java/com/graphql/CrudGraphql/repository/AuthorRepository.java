package com.graphql.CrudGraphql.repository;

import com.graphql.CrudGraphql.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
