package Ui.pages;

import Ui.pages.base.BasePage;

public class NavBarPage extends BasePage {
    protected AppNavBar navBar;
    public NavBarPage(){
        navBar=new AppNavBar();
    }

    public AppNavBar getNavBar(){
        return navBar;
    }

}
