package java8features.flatmapexmpl;

import java.util.List;

public class User {
    private Long id;
    private String name;
    private List<Role> roles;

    public User(Long id, String name, List<Role> roles) {
        this.id = id;
        this.name = name;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Role> getRoles() {
        return roles;
    }
}
