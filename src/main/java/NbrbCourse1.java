
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class NbrbCourse1 {
    public void getCourse(Model1 model1) throws IOException {
        URL url = new URL("https://www.nbrb.by/api/exrates/rates/".concat(model1.getCurrencyName().concat("?parammode=2")));


        Scanner in = new Scanner((InputStream) url.getContent());
        String result = "";
        while (in.hasNext()) {
            result +=in.nextLine();
        }
        JSONObject jsonObject = new JSONObject(result);
        model1.setCur_ID(jsonObject.getInt("Cur_ID"));
        model1.setDate(jsonObject.getString("Date"));
        model1.setCur_Abbreviation(jsonObject.getString("Cur_Abbreviation"));
        model1.setCur_Scale(jsonObject.getInt("Cur_Scale"));
        model1.setCur_Name(jsonObject.getString("Cur_Name"));
        model1.setCur_OfficialRate(jsonObject.getDouble("Cur_OfficialRate"));

    }
    public void getCourseFromWeb(CourseFromWeb courseFromWeb) throws IOException {
        URL url = new URL("https://free.currconv.com/api/v7/convert?q=EUR_DZD&compact=ultra&apiKey=78afa82c668285c1656d");


        Scanner in = new Scanner((InputStream) url.getContent());
        String result = "";
        while (in.hasNext()) {
            result +=in.nextLine();
        }
        JSONObject jsonObject = new JSONObject(result);
        courseFromWeb.setEurDzd(jsonObject.getInt("EUR_DZD")*100);
    }

    public void getEnglishName(Model1 model1) throws IOException {
        URL url = new URL("https://www.nbrb.by/api/exrates/currencies/"+ model1.getCur_ID());


        Scanner in = new Scanner((InputStream) url.getContent());
        String result = "";
        while (in.hasNext()) {
            result +=in.nextLine();
        }
        JSONObject jsonObject = new JSONObject(result);
        model1.setCur_Name_Eng(jsonObject.getString("Cur_Name_Eng"));

    }
}
