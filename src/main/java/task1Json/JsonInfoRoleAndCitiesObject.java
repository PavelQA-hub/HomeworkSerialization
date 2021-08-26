package task1Json;

import java.io.Serializable;

public class JsonInfoRoleAndCitiesObject implements Serializable {
    private RoleData role;
    private CitiesData cities;

    @Override
    public String toString() {
        return "JsonInfoRoleAndCitiesObject{" +
                "role=" + role +
                ", cities=" + cities +
                '}';
    }

    public RoleData getRole() {
        return role;
    }

    public void setRole(RoleData role) {
        this.role = role;
    }

    public CitiesData getCities() {
        return cities;
    }

    public void setCities(CitiesData cities) {
        this.cities = cities;
    }

    public JsonInfoRoleAndCitiesObject() {
    }
}
