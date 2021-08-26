package task1Json;

import java.io.Serializable;
import java.util.List;

public class PhoneNumber1 implements Serializable {


    private List<Integer> phoneNumbers;

    public PhoneNumber1() {

    }

    public List<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Integer> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
