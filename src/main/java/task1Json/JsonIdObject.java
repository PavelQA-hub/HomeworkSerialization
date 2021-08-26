package task1Json;

import java.io.Serializable;

public class JsonIdObject implements Serializable {
    private IdData id;

    @Override
    public String toString() {
        return "JsonIdObject{" +
                "id=" + id +
                '}';
    }

    public IdData getId() {
        return id;
    }

    public void setId(IdData id) {
        this.id = id;
    }

    public JsonIdObject() {
    }
}
