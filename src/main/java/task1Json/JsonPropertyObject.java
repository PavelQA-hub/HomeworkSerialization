package task1Json;

public class JsonPropertyObject {
    private PropertyData properties;

    @Override
    public String toString() {
        return "JsonPropertyObject{" +
                "properties=" + properties +
                '}';
    }

    public PropertyData getProperties() {
        return properties;
    }

    public void setProperties(PropertyData properties) {
        this.properties = properties;
    }

    public JsonPropertyObject() {
    }
}
