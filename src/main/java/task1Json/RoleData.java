package task1Json;

import java.io.Serializable;

public class RoleData implements Serializable {
    private String role;

    @Override
    public String toString() {
        return "RoleData{" +
                "role='" + role + '\'' +
                '}';
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public RoleData() {
    }
}
