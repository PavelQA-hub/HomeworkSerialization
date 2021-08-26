package task1Json;

import java.io.Serializable;

public class CitiesData implements Serializable {
    private String cities;

    @Override
    public String toString() {
        return "CitiesData{" +
                "cities='" + cities + '\'' +
                '}';
    }

    public String getCities() {
        return cities;
    }

    public void setCities(String cities) {
        this.cities = cities;
    }

    public CitiesData() {
    }
}
