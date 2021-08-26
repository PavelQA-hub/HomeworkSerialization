package task1Json;

public class PropertyData {
    private String age;
    private String salary;

    @Override
    public String toString() {
        return "PropertyData{" +
                "age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public PropertyData() {
    }
}
