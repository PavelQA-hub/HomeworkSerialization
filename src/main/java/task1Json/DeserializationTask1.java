package task1Json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

import java.util.Arrays;

public class DeserializationTask1 {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        String jsonPhoneNumberArray = "{\"phoneNumbers\": [123456, 987654]}";
        PhoneNumber1 listPhoneNumbers = objectMapper.readValue(jsonPhoneNumberArray, PhoneNumber1.class);
        System.out.println(Arrays.toString(listPhoneNumbers.getPhoneNumbers().toArray(new Integer[0])));

        String jsonWithAddressObject = "{\"address\": {\"street\": \"Albany Dr\", \"city\": \"San Jose\", \"zipcode\": 95129}}";
        JsonAddressObject addresses = objectMapper.readValue(jsonWithAddressObject, JsonAddressObject.class);
        System.out.println(addresses);

        String jsonWithPropertyObject = "{\"properties\": {\"age\": \"29 years\", \"salary\": \"1000 USD\"}}";
        JsonPropertyObject properties = objectMapper.readValue(jsonWithPropertyObject, JsonPropertyObject.class);
        System.out.println(properties);

        String jsonWithRoleObject = "{\"role\": \"Manager\"}";
        JsonInfoRoleAndCitiesObject someRoles = objectMapper.readValue(jsonWithRoleObject, JsonInfoRoleAndCitiesObject.class);
        System.out.println(someRoles);

        String jsonWithCitiesObject = "{\"cities\": [\"Los Angeles\", \"New York\"]}";
        Cities listCities = objectMapper.readValue(jsonWithCitiesObject, Cities.class);
        System.out.println(Arrays.toString(listCities.getCities().toArray(new String[0])));

//        String jsonWithIdObject = "{\"id\": 123, \"name\": \"Pankaj\", \"permanent\": true}";
//        JsonIdObject someInfo = objectMapper.readValue(jsonWithIdObject, JsonIdObject.class);
//        System.out.println(someInfo);
    }
}
