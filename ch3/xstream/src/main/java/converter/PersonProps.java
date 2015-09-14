package converter;

public class PersonProps {
    private int age;
    private String gender;
    private String name;

    // constructor
    public PersonProps() {
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // properties
    public void setName(String name) {
        this.name = name;
    }
}
