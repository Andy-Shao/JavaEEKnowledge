import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Skier {
    @SuppressWarnings("rawtypes")
    private Collection majorAchievements;
    private String nationalTeam;
    private Person person;

    // constructors
    public Skier() {
    } // required for unmarshaling

    public Skier(Person person , String nationalTeam , Collection<String> majorAchievements) {
        this.setPerson(person);
        this.setNationalTeam(nationalTeam);
        this.setMajorAchievements(majorAchievements);
    }

    @SuppressWarnings("rawtypes")
    public Collection getMajorAchievements() {
        return this.majorAchievements;
    }

    public String getNationalTeam() {
        return this.nationalTeam;
    }

    // properties
    public Person getPerson() {
        return this.person;
    }

    public void setMajorAchievements(@SuppressWarnings("rawtypes") Collection majorAchievements) {
        this.majorAchievements = majorAchievements;
    }

    public void setNationalTeam(String nationalTeam) {
        this.nationalTeam = nationalTeam;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
