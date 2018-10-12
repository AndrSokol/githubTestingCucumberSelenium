package pages;

import org.openqa.selenium.WebElement;

public class ProjectPage extends BasePage{

    public WebElement btnEditDescription = $("//*[@id='repo-meta-edit']//*[.='Edit']");
    public WebElement btnCancelDescription = $("//*[@id='repo-meta-edit']//*[.='Cancel']");

    public void clickEdit(){
        btnEditDescription.click();
    }

    public void clickCancel() {
        btnCancelDescription.click();
    }
}
