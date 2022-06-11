package java2.onclass.part2;

public class Employee {
    public int id;
    public String name;
    public String email;
    public String[] role;
    private boolean manager;

    public Employee() {
    }

    public Employee(int id, String name, String email, String[] role, boolean manager) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.manager = manager;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getRole() {
        return role;
    }

    public void setRole(String[] role) {
        this.role = role;
    }

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

}
