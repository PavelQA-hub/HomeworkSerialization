package task1Json;

import java.io.Serializable;
import java.util.List;

public class Cities implements Serializable {
    private List<String> cities;

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public Cities() {
    }
}
