package taskSix;

/**
 * Created by Daria Serebryakova on 23.04.2017.
 */
public class OfficeFactory {


    public Office createOffice(String officeLocation, String company){
        return new Office(officeLocation,company);
    }



}
