package taskFour;

/**
 * Created by Daria Serebryakova on 19.04.2017.
 */
public class MonthInfo {
    private String season;
    private String month;
    private int monthNumber;

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    @Override
    public String toString() {
        return "MonthInfo{" +
                "season='" + season + '\'' +
                ", month='" + month + '\'' +
                ", monthNumber=" + monthNumber +
                '}';
    }
}
