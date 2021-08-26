package task1Json;

import java.io.Serializable;

public class JsonData implements Serializable {
    private String street;
    private String city;
    private int zipcode;

    @Override
    public String toString() {
        return "JsonData{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }

    public JsonData() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}
