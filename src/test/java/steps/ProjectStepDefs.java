package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import pages.ProjectPage;

import static org.assertj.core.api.Assertions.assertThat;

public class ProjectStepDefs {
    ProjectPage projectPage = new ProjectPage();

    @When("^I start edit project description by button Edit$")
    public void i_start_edit_project_description_by_button_Edit() throws Throwable {
        projectPage.clickEdit();
    }

    @When("^I cancel editing$")
    public void i_cancel_editing() throws Throwable {
        projectPage.clickCancel();
    }

    @Then("^button Cancel is not visible$")
    public void button_Cancel_is_not_visible() throws Throwable {
        assertThat(projectPage.elementIsVisible(projectPage.btnCancelDescription)).isFalse();
    }

    @Then("^button Edit description is visible$")
    public void button_Edit_description_is_visible() throws Throwable {
        assertThat(projectPage.elementIsVisible(projectPage.btnEditDescription)).isTrue();
    }


}
