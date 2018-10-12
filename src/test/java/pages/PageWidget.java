package pages;

public class PageWidget extends BasePage{
    public PageWidget open() {
        $("//summary[@aria-label='View profile and more']").click();
        return this;
    }

    public void clickItem(String option) {
        $("//details-menu//a[.='" + option + "']").click();
    }
}
