/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.cntl;

import java.awt.event.ActionEvent;
import mvc.view.NavigationView;

/**
 *
 * @author bzc5373
 */
public class NavigationCntl{
    private LoginCntl loginCntl;
    private NavigationView navView;
    private ResultCntl resultCntl;
    
    public NavigationCntl(LoginCntl loginCntl) {
        this.loginCntl = loginCntl;
        loginCntl.showUI(false);
        navView = new NavigationView(this);
        showUI(true);
    }
     
    public void showUI(Boolean bool) {
        navView.setVisible(bool);
    }
    
    public NavigationCntl() {
        navView = new NavigationView(this);
        navView.setVisible(true);
    }

    public void giveControl() {
        ResultCntl resCntl = new ResultCntl(this);
    }
}