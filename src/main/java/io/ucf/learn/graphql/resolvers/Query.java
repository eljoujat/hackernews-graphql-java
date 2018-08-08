package io.ucf.learn.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import io.ucf.learn.graphql.reposiory.LinkRepository;
import io.ucf.learn.graphql.types.Link;

import java.util.List;

public class Query implements GraphQLRootResolver {

    private final LinkRepository linkRepository;

    public Query(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> allLinks() {
        return linkRepository.getAllLinks();
    }
}
