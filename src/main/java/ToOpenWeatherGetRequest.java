import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class ToOpenWeatherGetRequest {
    public void getWeather(OpenWeatherModel openWeatherModel) throws IOException {
        URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q="
                .concat(openWeatherModel.getName()
                        .concat("&appid=")
                        .concat(openWeatherModel.getToken())));

        Scanner in = new Scanner((InputStream) url.getContent());
        String result = "";
        while (in.hasNext()) {
            result +=in.nextLine();
        }
        JSONObject jsonObject = new JSONObject(result);

        openWeatherModel.setName(jsonObject.getString("name"));

        openWeatherModel.setId(jsonObject.getInt("id"));

        JSONArray jsonArrayWeather = jsonObject.getJSONArray("weather");
        JSONObject jsonObjectWeather = jsonArrayWeather.getJSONObject(0);
        openWeatherModel.setDescription(jsonObjectWeather.getString("main"));

        openWeatherModel.setTemp((Double) jsonObject.getJSONObject("main").get("temp"));
        openWeatherModel.setPressure((Integer) jsonObject.getJSONObject("main").get("pressure"));
        openWeatherModel.setHumidity((Integer) jsonObject.getJSONObject("main").get("humidity"));

        openWeatherModel.setWindSpeed((Double) jsonObject.getJSONObject("wind").get("speed"));

    }
}
