import javax.xml.bind.annotation.XmlType;

@XmlType
public class Person {

    private int age;
    private String gender;
    // fields
    private String name;

    // constructors
    public Person() {
    }

    public Person(String name , int age , String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    // properties: name, age, gender
    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }
}
