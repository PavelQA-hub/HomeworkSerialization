package task1JsonV2;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "permanent",
        "phoneNumbers",
        "address",
        "role",
        "cities",
        "properties"
})
@Generated("jsonschema2pojo")
public class HomeworkTask implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("permanent")
    private Boolean permanent;
    @JsonProperty("phoneNumbers")
    private List<Integer> phoneNumbers = null;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("role")
    private String role;
    @JsonProperty("cities")
    private List<String> cities = null;
    @JsonProperty("properties")
    private Properties properties;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4374124884648209901L;

    /**
     * No args constructor for use in serialization
     *
     */
    public HomeworkTask() {
    }

    /**
     *
     * @param address
     * @param role
     * @param cities
     * @param permanent
     * @param name
     * @param id
     * @param phoneNumbers
     * @param properties
     */
    public HomeworkTask(Integer id, String name, Boolean permanent, List<Integer> phoneNumbers, Address address, String role, List<String> cities, Properties properties) {
        super();
        this.id = id;
        this.name = name;
        this.permanent = permanent;
        this.phoneNumbers = phoneNumbers;
        this.address = address;
        this.role = role;
        this.cities = cities;
        this.properties = properties;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("permanent")
    public Boolean getPermanent() {
        return permanent;
    }

    @JsonProperty("permanent")
    public void setPermanent(Boolean permanent) {
        this.permanent = permanent;
    }

    @JsonProperty("phoneNumbers")
    public List<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

    @JsonProperty("phoneNumbers")
    public void setPhoneNumbers(List<Integer> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("cities")
    public List<String> getCities() {
        return cities;
    }

    @JsonProperty("cities")
    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HomeworkTask.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("permanent");
        sb.append('=');
        sb.append(((this.permanent == null)?"<null>":this.permanent));
        sb.append(',');
        sb.append("phoneNumbers");
        sb.append('=');
        sb.append(((this.phoneNumbers == null)?"<null>":this.phoneNumbers));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("cities");
        sb.append('=');
        sb.append(((this.cities == null)?"<null>":this.cities));
        sb.append(',');
        sb.append("properties");
        sb.append('=');
        sb.append(((this.properties == null)?"<null>":this.properties));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
