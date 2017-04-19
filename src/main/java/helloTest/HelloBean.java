package helloTest;

/**
 * Created by Daria Serebryakova on 18.04.2017.
 */
public class HelloBean {
    private String massage;

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getMassage() {

        return massage;
    }

    @Override
    public String toString() {
        return "helloTest.HelloBean{" +
                "massage='" + massage + '\'' +
                '}';
    }
}
