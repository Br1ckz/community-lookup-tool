/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.cntl;

import communitylookuptool.User;
import communitylookuptool.UserList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.view.LoginUI;

/**
 *
 * @author bzc5373
 */
public class LoginCntl {
    private LoginUI loginUI;
    private UserList userList;

    public LoginCntl() {
        loginUI = new LoginUI(this);
        userList = new UserList();
        showUI(true);
    }

    public LoginUI getLoginUI() {
        return loginUI;
    }

    public UserList getUserList() {
        return userList;
    }

    public void setLoginUI(LoginUI loginUI) {
        this.loginUI = loginUI;
    }

    public void setUserList(UserList userList) {
        this.userList = userList;
    }
    
    public void showUI(Boolean bool) {
        loginUI.setVisible(bool);
    }
    
    public void requestAuthentication(User user) {
        if (userList.authenticate(user) == true) {
            System.out.println("Login successful");
            giveControl();
        } else {
            System.out.println("Login credential are invalid");
        }
    }     
    
    public void giveControl() {
        NavigationCntl navCntl = new NavigationCntl(this);   
    }
    
}