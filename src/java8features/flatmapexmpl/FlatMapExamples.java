package java8features.flatmapexmpl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExamples {

    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        Role adminRole = new Role(1L, "ADMIN");
        Role managerRole = new Role(2L, "MANAGER");
        Role userRole = new Role(3L, "USER");
        Role defaultRole = new Role(4L, "DEFAULT");

        users.add(new User(1231321L, "Alex", Arrays.asList(managerRole, userRole)));
        users.add(new User(4343431L, "John", Arrays.asList(defaultRole)));
        users.add(new User(234234L, "Robert", Arrays.asList(adminRole, defaultRole)));

        // I want to get a unique roles for all users - >
        Set<Role> allUsersRoles = users.stream()
//                .map(user -> user.getRoles()) // Stream<List<Roles>> but we want to get Stream<Role>
                .flatMap(user -> user.getRoles().stream()) // Stream<Roles> is merges all roles of all users to a single stream of Role
                .filter(user -> !"DEFAULT".equals(user.getName()))
                .collect(Collectors.toSet());
        allUsersRoles.forEach(role -> System.out.println(role.getName()));

        System.out.println("=== I want to get a unique roles names ordered alphabetically for all user in a single string via comma");
        String rolesNames = users.stream()
                .flatMap(user -> user.getRoles().stream()) // Stream<Roles> is merges all roles of all users to a single stream of Role
                .map(role -> role.getName()) // Stream<String>
                .distinct()
                .sorted() // String implementing Comparable
                .collect(Collectors.joining(","));// Collectors.joining() is uniting elements via the delimiter
        // "ADMIN,DEFAULT,MANAGER,USER"
        System.out.println("Role names " + rolesNames);
    }
}
