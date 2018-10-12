package steps;

import cucumber.api.java.en.Then;
import pages.RepositoriesPage;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class ProjectListStepDefs {
    RepositoriesPage repositoriesPage = new RepositoriesPage();

    @Then("^I see on list page projects:$")
    public void i_see_on_list_page_projects(List<String> projectList) throws Throwable {
        List<String> actual = repositoriesPage.getRepositoriesNames();
//        assertThat(actual, hasItems(projectList.toArray(new String[projectList.size()])));
        assertThat(actual).containsExactlyElementsOf(projectList);
    }
}
