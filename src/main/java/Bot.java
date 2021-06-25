import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Ascii.toLowerCase;


public class Bot extends TelegramLongPollingBot {

    private static final String TOKEN = "1727963112:AAGwHxfPs_k3ZspZw1V1RiznCOaMiKhKIUA";
    private static final String USERNAME = "t.me/mySoftBot_bot";
    public String getBotUsername() {
        return USERNAME;
    }

    public String getBotToken() {
        return TOKEN;
    }


    public void onUpdateReceived(Update update) {





        if(update.getMessage()!=null && update.getMessage().hasText()) {
            SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());

        if(update.getMessage().getText().toLowerCase().equals("next")) {
            sendMessage.setText("how i can help you?");

            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }
        else if (update.getMessage().getText().toLowerCase().equals("hello")){
            try {
                sendMessage.setText("Hello!, how can i help you? ").setReplyMarkup(getKeyboardEnglish());
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        else if (update.getMessage().getText().toLowerCase().equals("привет")){
            try {
                sendMessage.setText("Чем я могу вам помочь?").setReplyMarkup(getKeyboardRussian());
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        else if (update.getMessage().getText().toLowerCase().equals("bonjour")){
            try {
                sendMessage.setText("Comment je peu vous aider?").setReplyMarkup(getKeyboardFrançais());
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        else if (update.getMessage().getText().toLowerCase().equals("курсы валют")){
            Model1 courseDZD = new Model1();
            Model1 courseRUB = new Model1();
            Model1 courseUSD = new Model1();
            Model1 courseEUR = new Model1();
            courseDZD.setCurrencyName("DZD");
            courseRUB.setCurrencyName("RUB");
            courseUSD.setCurrencyName("USD");
            courseEUR.setCurrencyName("EUR");
            NbrbCourse1 nbrbCourse1DZD = new NbrbCourse1();
            NbrbCourse1 nbrbCourseRUB = new NbrbCourse1();
            NbrbCourse1 nbrbCourseUSD = new NbrbCourse1();
            NbrbCourse1 nbrbCourseEUR = new NbrbCourse1();


            try {
                nbrbCourse1DZD.getCourse(courseDZD);
                nbrbCourseRUB.getCourse(courseRUB);
                nbrbCourseUSD.getCourse(courseUSD);
                nbrbCourseEUR.getCourse(courseEUR);
                sendMessage.setText("Хороший курс\n" + courseDZD.toStringCourse()+
                        "\n" + courseEUR.toStringCourse() +
                        "\n" + courseUSD.toStringCourse() +
                        "\n" + courseRUB.toStringCourse());

                execute(sendMessage);
            } catch (TelegramApiException | IOException e) {
                e.printStackTrace();
            }
        }
        else if (update.getMessage().getText().toLowerCase().equals("погода в минске")){
            OpenWeatherModel openWeatherModel = new OpenWeatherModel();
            openWeatherModel.setName("minsk");
            ToOpenWeatherGetRequest toOpenWeatherGetRequest = new ToOpenWeatherGetRequest();
            try {
                toOpenWeatherGetRequest.getWeather(openWeatherModel);
                sendMessage.setText(openWeatherModel.toString());
                execute(sendMessage);
            } catch (TelegramApiException | IOException e) {
                e.printStackTrace();
            }
        }
        else if (update.getMessage().getText().toLowerCase().equals("exchange rates")){
            Model1 courseDZD = new Model1();
            Model1 courseRUB = new Model1();
            Model1 courseUSD = new Model1();
            Model1 courseEUR = new Model1();
            courseDZD.setCurrencyName("DZD");
            courseRUB.setCurrencyName("RUB");
            courseUSD.setCurrencyName("USD");
            courseEUR.setCurrencyName("EUR");
            NbrbCourse1 nbrbCourse1DZD = new NbrbCourse1();
            NbrbCourse1 nbrbCourseRUB = new NbrbCourse1();
            NbrbCourse1 nbrbCourseUSD = new NbrbCourse1();
            NbrbCourse1 nbrbCourseEUR = new NbrbCourse1();
            try {
                nbrbCourse1DZD.getCourse(courseDZD);
                nbrbCourseRUB.getCourse(courseRUB);
                nbrbCourseUSD.getCourse(courseUSD);
                nbrbCourseEUR.getCourse(courseEUR);
                nbrbCourse1DZD.getEnglishName(courseDZD);
                nbrbCourseRUB.getEnglishName(courseRUB);
                nbrbCourseUSD.getEnglishName(courseUSD);
                nbrbCourseEUR.getEnglishName(courseEUR);
                sendMessage.setText("Good exchange\n" + courseDZD.toStringCourseEnglish()+
                        "\n" + courseEUR.toStringCourseEnglish() +
                        "\n" + courseUSD.toStringCourseEnglish() +
                        "\n" + courseRUB.toStringCourseEnglish());
                execute(sendMessage);
            } catch (TelegramApiException | IOException e) {
                e.printStackTrace();
            }
        }
        else if (update.getMessage().getText().toLowerCase().equals("weather in london")){
            OpenWeatherModel openWeatherModel = new OpenWeatherModel();
            openWeatherModel.setName("london");
            ToOpenWeatherGetRequest toOpenWeatherGetRequest = new ToOpenWeatherGetRequest();
            try {
                toOpenWeatherGetRequest.getWeather(openWeatherModel);
                sendMessage.setText(openWeatherModel.toString());
                execute(sendMessage);
            } catch (TelegramApiException | IOException e) {
                e.printStackTrace();
            }
        }
        else if (update.getMessage().getText().toLowerCase().equals("taux  d'echange")){
            Model1 courseDZD = new Model1();
            courseDZD.setCurrencyName("DZD");
            CourseFromWeb courseFromWeb = new CourseFromWeb();
            NbrbCourse1 courseFromWeb1 = new NbrbCourse1();
            NbrbCourse1 nbrbCourse1DZD = new NbrbCourse1();
            Model1 courseRUB = new Model1();
            Model1 courseUSD = new Model1();
            Model1 courseEUR = new Model1();
            courseRUB.setCurrencyName("RUB");
            courseUSD.setCurrencyName("USD");
            courseEUR.setCurrencyName("EUR");
            NbrbCourse1 nbrbCourseRUB = new NbrbCourse1();
            NbrbCourse1 nbrbCourseUSD = new NbrbCourse1();
            NbrbCourse1 nbrbCourseEUR = new NbrbCourse1();
            try {
                nbrbCourse1DZD.getCourse(courseDZD);
                nbrbCourse1DZD.getEnglishName(courseDZD);
                String text = courseDZD.translator.translate("en", "fr", courseDZD.getCur_Name_Eng());
                courseFromWeb1.getCourseFromWeb(courseFromWeb);

                nbrbCourseRUB.getCourse(courseRUB);
                nbrbCourseUSD.getCourse(courseUSD);
                nbrbCourseEUR.getCourse(courseEUR);
                nbrbCourseRUB.getEnglishName(courseRUB);
                nbrbCourseUSD.getEnglishName(courseUSD);
                nbrbCourseEUR.getEnglishName(courseEUR);
                String text1 = courseDZD.translator.translate("en", "fr", courseRUB.getCur_Name_Eng());
                String text2 = courseDZD.translator.translate("en", "fr", courseUSD.getCur_Name_Eng());
                String text3 = courseDZD.translator.translate("en", "fr", courseEUR.getCur_Name_Eng());
                sendMessage.setText(text + ": " + courseDZD.getCur_OfficialRate() + "\n" +
                        text1 + ": " + courseRUB.getCur_OfficialRate() + "\n" +
                        text2 + ": " + courseUSD.getCur_OfficialRate() + "\n" +
                        text3 + ": " + courseEUR.getCur_OfficialRate() + "\n" +
                        "course from web: 100 EUR : " + courseFromWeb.getEurDzd() + " DZD"
                );
                execute(sendMessage);
            } catch (TelegramApiException | IOException e) {
                e.printStackTrace();
            }
        }
        else if (update.getMessage().getText().toLowerCase().equals("meteo a algeria")){
            OpenWeatherModel openWeatherModel = new OpenWeatherModel();
            openWeatherModel.setName("algeria");
            ToOpenWeatherGetRequest toOpenWeatherGetRequest = new ToOpenWeatherGetRequest();
            try {
                toOpenWeatherGetRequest.getWeather(openWeatherModel);
                sendMessage.setText(openWeatherModel.toString()).setReplyMarkup(getKeyboardFrançaisV2());
                execute(sendMessage);
            } catch (TelegramApiException | IOException e) {
                e.printStackTrace();
            }
        }
        else if (update.getMessage().getText().toLowerCase().equals("activer la chaîne de télévision")){

            try {
                sendMessage.setText("lien vers la chaîne en ligne");
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        else if (update.getMessage().getText().toLowerCase().equals("réserver un billet pour l'algérie")){

            try {
                sendMessage.setText("Billet pour l'Algérie réservé pour lundi");
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        else if (update.getMessage().getText().toLowerCase().equals("transférer de l'argent")){

            try {
                sendMessage.setText("virement sur la carte effectué");
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        else if (update.getMessage().getText().toLowerCase().equals("algérie actualités")){

            try {
                sendMessage.setText("https://www.france24.com/en/tag/algeria/");
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        }


    }



    private ReplyKeyboardMarkup getKeyboardRussian() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(new KeyboardButton("Курсы валют"));
        keyboardRow.add(new KeyboardButton("Погода в Минске"));

        keyboardRows.add(keyboardRow);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    private ReplyKeyboardMarkup getKeyboardEnglish() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(new KeyboardButton("Exchange rates"));
        keyboardRow.add(new KeyboardButton("Weather in London"));

        keyboardRows.add(keyboardRow);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    private ReplyKeyboardMarkup getKeyboardFrançais() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(new KeyboardButton("Taux  d'echange"));
        keyboardRow.add(new KeyboardButton("Meteo a Algeria"));

        keyboardRows.add(keyboardRow);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    private ReplyKeyboardMarkup getKeyboardFrançaisV2() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        keyboardFirstRow.add(new KeyboardButton("Activer la chaîne de télévision"));
        keyboardFirstRow.add(new KeyboardButton("Réserver un billet pour l'Algérie"));
        keyboardSecondRow.add(new KeyboardButton("Transférer de l'argent"));
        keyboardSecondRow.add(new KeyboardButton("Algérie Actualités"));
        keyboardSecondRow.add(new KeyboardButton("karta"));


        keyboardRows.add(keyboardFirstRow);
        keyboardRows.add(keyboardSecondRow);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }
}


