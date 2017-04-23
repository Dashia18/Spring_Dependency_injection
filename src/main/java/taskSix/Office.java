package taskSix;

/**
 * Created by Daria Serebryakova on 23.04.2017.
 */
public class Office {
    private String officeLocation;
    private String company;

    public Office() {
    }

    Office(String officeLocation, String company) {
        this.officeLocation = officeLocation;
        this.company = company;
    }


     void printOfficeLocation(){
        System.out.println("officeLocation = " + officeLocation + ", company = " + company );
    }
}
