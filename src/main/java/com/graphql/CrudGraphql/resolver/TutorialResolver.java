package com.graphql.CrudGraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.CrudGraphql.model.Author;
import com.graphql.CrudGraphql.model.Tutorial;
import com.graphql.CrudGraphql.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TutorialResolver implements GraphQLResolver<Tutorial> {
    @Autowired
    private AuthorRepository authorRepository;
    public TutorialResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Tutorial tutorial) {
        return authorRepository.findById(tutorial.getAuthor().getId()).orElseThrow(null);
    }

}
