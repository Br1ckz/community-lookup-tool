/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.cntl;

import communitylookuptool.PersonList;
import mvc.view.NavigationView;

/**
 *
 * @author bzc5373
 */
public class NavigationCntl{
    private LoginCntl loginCntl;
    private NavigationView navUI;
    private ResultCntl resultCntl;
    private PersonList personList;
    
    public NavigationCntl(LoginCntl loginCntl) {
        this.loginCntl = loginCntl;
        navUI = new NavigationView(this);
        showNavUI(true);
	this.loginCntl.showLoginUI(false);
	personList = new PersonList();
    }
     
    public void showNavUI(Boolean bool) {
        navUI.setVisible(bool);
	if (bool == false) {
		navUI.dispose();
	}
    }
    
//    public NavigationCntl() {
//        navView = new NavigationView(this);
//        navView.setVisible(true);
//    }

    public void moveToResult() {
        ResultCntl resCntl = new ResultCntl(this, personList);
    }
    
    public void moveToResultTable() {
	ResultTableCntl resultTableCntl = new ResultTableCntl(this, personList);    
	showNavUI(false);
    }
    
    public void moveToLogin() {
	    loginCntl.showLoginUI(true);
	    showNavUI(false);
    }
}