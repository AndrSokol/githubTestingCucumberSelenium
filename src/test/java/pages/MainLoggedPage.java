package pages;

public class MainLoggedPage extends BasePage{

    public ProjectPage openProject(String projectName){
        $("//*[@data-filterable-for='dashboard-repos-filter']//*[.='"+ projectName + "']").click();
        return new ProjectPage();
    }
}
