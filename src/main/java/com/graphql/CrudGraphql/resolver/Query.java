package com.graphql.CrudGraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.CrudGraphql.model.Author;
import com.graphql.CrudGraphql.model.Tutorial;
import com.graphql.CrudGraphql.repository.AuthorRepository;
import com.graphql.CrudGraphql.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    private AuthorRepository authorRepository;
    private TutorialRepository tutorialRepository;

    @Autowired
    public Query(AuthorRepository authorRepository, TutorialRepository tutorialRepository) {
        this.authorRepository = authorRepository;
        this.tutorialRepository = tutorialRepository;
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public Iterable<Tutorial> findAllTutorials() {
        return tutorialRepository.findAll();
    }

    public long countAuthors() {
        return authorRepository.count();
    }

    public long countTutorials() {
        return tutorialRepository.count();
    }

}
