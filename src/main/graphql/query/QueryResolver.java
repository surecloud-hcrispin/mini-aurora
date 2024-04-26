package main.graphql.query;


import org.springframework.stereotype.Component;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    public String greeting(String name) {
        return "Hello, " + (name != null ? name : "World") + "!";
    }
}