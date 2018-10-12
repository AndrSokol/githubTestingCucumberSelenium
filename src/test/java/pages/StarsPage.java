package pages;

public class StarsPage extends BasePage{
    public String getMessage() {
        String text = $("//h4").getText();

        return text;
    }
}
