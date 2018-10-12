package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RepositoriesPage extends BasePage{
    public List<String> getRepositoriesNames() {
        List<String> repositoryNames = extractText($$(By.xpath("//*[@id='user-repositories-list']//li//a")));

        return repositoryNames;
    }

    private List<String> extractText(List<WebElement> elements){
        List<String> textList = new ArrayList<String>();

        for(WebElement element : elements){
            textList.add(element.getText());
        }
        return textList;
    }
}
