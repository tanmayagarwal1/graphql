package com.uhg.gpd.ole;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;

public class GraphqlService {
    private GraphQL graphQL;

    public GraphQL getGraphQL() {
        return graphQL;
    }

    @Value("classpath:object.graphql")
    Resource resource;

    @PostConstruct
    public void loadSchema() throws IOException {
        File file = resource.getFile();
        TypeDefinitionRegistry typeDefinitionRegistry = new SchemaParser().parse(file);
        RuntimeWiring wiring = buildRunTimeWiring();
        GraphQLSchema graphQLSchema = new SchemaGenerator().makeExecutableSchema(typeDefinitionRegistry, wiring);
        graphQL = GraphQL.newGraphQL(graphQLSchema).build();
    }

    private RuntimeWiring buildRunTimeWiring() {
        return RuntimeWiring.newRuntimeWiring().type("Query", typeWiring -> typeWiring.dataFetcher("info", myExtractor)).build();
    }
}
