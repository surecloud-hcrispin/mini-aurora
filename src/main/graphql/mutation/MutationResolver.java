package main.graphql.mutation;


@Component
public class MutationResolver implements GraphQLMutationResolver {

    public String updateUserName(String id, String newName) {
        // Logic to update user's name in the database
        return "User with ID " + id + " has been updated with the name " + newName;
    }
}

