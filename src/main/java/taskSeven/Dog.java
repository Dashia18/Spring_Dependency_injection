package taskSeven;

/**
 * Created by Daria Serebryakova on 23.04.2017.
 */
public class Dog {
    private String color;
    private String type;



    public Dog() {
    }

    public Dog(String color, String type) {
        this.color = color;
        this.type = type;
        System.out.println(color + " "+ type+" dog created");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
