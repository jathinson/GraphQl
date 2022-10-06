package com.graphql.CrudGraphql.repository;

import com.graphql.CrudGraphql.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial,Long> {
}
