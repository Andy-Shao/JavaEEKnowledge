package basic;

public class PersonNoProps {
    @SuppressWarnings("unused")
    private int age;
    @SuppressWarnings("unused")
    private String gender;
    @SuppressWarnings("unused")
    private String name;

    public PersonNoProps(String name , int age , String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}