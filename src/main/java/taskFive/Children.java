package taskFive;

/**
 * Created by Daria Serebryakova on 23.04.2017.
 */
public class Children {
    private Person person;
    private Person mother;
    private Person father;


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    @Override
    public String toString() {
        return "Children{" +
                "person=" + person +
                ", mother=" + mother +
                ", father=" + father +
                '}';
    }
}
