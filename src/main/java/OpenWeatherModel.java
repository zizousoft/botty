import java.util.Objects;

public class OpenWeatherModel {

    private Integer id = 0;
    private String name;
    private String description;
    private Double temp = 0.0;
    private Integer pressure = 0;
    private Integer humidity = 0;
    private Double windSpeed = 0.0;
    private String token = "74ff57e61b1f73bc3cef0e2260154667";

    public OpenWeatherModel() {
    }

    public OpenWeatherModel(Integer id, String name, String description, Double temp, Integer pressure, Integer humidity, Double windSpeed) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Double getTemp() {
        return this.temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpenWeatherModel that = (OpenWeatherModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(temp, that.temp) &&
                Objects.equals(pressure, that.pressure) &&
                Objects.equals(humidity, that.humidity) &&
                Objects.equals(windSpeed, that.windSpeed) &&
                Objects.equals(token, that.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, temp, pressure, humidity, windSpeed, token);
    }

    @Override
    public String toString() {
        Integer celsium = Math.toIntExact(Math.round(getTemp() - 273));
        return "From open weather site: " + "\n"+
                "City: " + getName() + "\n" +
                "___________________________"+ "\n" +
                "Description: " + getDescription() + "\n" +
                "current temperature: " + celsium + " C "+ "\n" +
                "wind: " + getWindSpeed() + " m/s"+"\n" +
                "pressure: " + getPressure() + "\n" +
                "humidity: " + getHumidity() + "\n" +
                "____________________________"
                ;
    }
}
