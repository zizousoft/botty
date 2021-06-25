
import java.util.Objects;

@SuppressWarnings("LossyEncoding")
public class Model1 {

    private Integer Cur_ID;
    private String Date;
    private String Cur_Abbreviation;
    private Integer Cur_Scale;
    private String Cur_Name;
    private Double Cur_OfficialRate;
    private String currencyName;
    private String Cur_Name_Eng;
    Translator translator = new Translator();

    public Model1() {
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public Integer getCur_ID() {
        return Cur_ID;
    }

    public void setCur_ID(Integer cur_ID) {
        Cur_ID = cur_ID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getCur_Abbreviation() {
        return Cur_Abbreviation;
    }

    public void setCur_Abbreviation(String cur_Abbreviation) {
        Cur_Abbreviation = cur_Abbreviation;
    }

    public Integer getCur_Scale() {
        return Cur_Scale;
    }

    public void setCur_Scale(Integer cur_Scale) {
        Cur_Scale = cur_Scale;
    }

    public String getCur_Name() {
        return Cur_Name;
    }

    public void setCur_Name(String cur_Name) {
        Cur_Name = cur_Name;
    }

    public Double getCur_OfficialRate() {
        return Cur_OfficialRate;
    }

    public void setCur_OfficialRate(Double cur_OfficialRate) {
        Cur_OfficialRate = cur_OfficialRate;
    }

    public String getCur_Name_Eng() {
        return Cur_Name_Eng;
    }

    public void setCur_Name_Eng(String cur_Name_Eng) {
        Cur_Name_Eng = cur_Name_Eng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model1 model1 = (Model1) o;
        return Objects.equals(Cur_ID, model1.Cur_ID) && Objects.equals(Date, model1.Date) && Objects.equals(Cur_Abbreviation, model1.Cur_Abbreviation) && Objects.equals(Cur_Scale, model1.Cur_Scale) && Objects.equals(Cur_Name, model1.Cur_Name) && Objects.equals(Cur_OfficialRate, model1.Cur_OfficialRate) && Objects.equals(currencyName, model1.currencyName) && Objects.equals(Cur_Name_Eng, model1.Cur_Name_Eng);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Cur_ID, Date, Cur_Abbreviation, Cur_Scale, Cur_Name, Cur_OfficialRate, currencyName, Cur_Name_Eng);
    }

    @Override
    public String toString() {
        return "Model1{" +
                "Cur_ID=" + Cur_ID +
                ", Date='" + Date + '\'' +
                ", Cur_Abbreviation='" + Cur_Abbreviation + '\'' +
                ", Cur_Scale=" + Cur_Scale +
                ", Cur_Name='" + Cur_Name + '\'' +
                ", Cur_OfficialRate=" + Cur_OfficialRate +
                ", currencyName='" + currencyName + '\'' +
                ", Cur_Name_Eng='" + Cur_Name_Eng + '\'' +
                '}';
    }

    public String toStringCourse () {
        return "\nНаименование валюты:  " + getCur_Name() +
                "\nКурс валюты: " + getCur_OfficialRate();
    }
    public String toStringCourseEnglish () {
        return "\nCurrency name:  " + getCur_Name_Eng() +
                "\nCurrency rate: " + getCur_OfficialRate();
    }
}

