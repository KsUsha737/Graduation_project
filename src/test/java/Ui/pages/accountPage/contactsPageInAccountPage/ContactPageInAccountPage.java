package Ui.pages.accountPage.contactsPageInAccountPage;

import Ui.pages.AppNavBar;

public class ContactPageInAccountPage extends AppNavBar {

    private ContactPageInAccountPageActions contactPageInAccountPageActions;
    private ContactPageInAccountPageInfo contactPageInAccountPageInfo;

    public ContactPageInAccountPage() {
        super();
        contactPageInAccountPageActions = new ContactPageInAccountPageActions();
        contactPageInAccountPageInfo = new ContactPageInAccountPageInfo();
    }

    public ContactPageInAccountPageActions goToContactPageInAccountPageActions() {
        return new ContactPageInAccountPageActions();
    }

}
