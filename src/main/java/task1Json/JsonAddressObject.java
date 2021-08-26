package task1Json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

public class JsonAddressObject implements Serializable {
    private JsonData address;

    @Override
    public String toString() {
        return "JsonAddressObject{" +
                "address=" + address +
                '}';
    }

    public JsonAddressObject() {
    }

    public JsonData getAddress() {
        return address;
    }

    public void setAddress(JsonData address) {
        this.address = address;
    }

}
