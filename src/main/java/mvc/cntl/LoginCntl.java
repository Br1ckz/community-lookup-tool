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
		showLoginUI(true);
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

	public void showLoginUI(Boolean bool) {
		loginUI.setVisible(bool);
		if (bool == false) {
			loginUI.dispose();
		}
	}

	public void requestAuthentication(User user) {
		if (userList.authenticate(user) == true) {
			System.out.println("Login successful");
			moveToNav();
		} else {
			System.out.println("Login credential are invalid");
		}
	}

	public void moveToNav() {
		NavigationCntl navCntl = new NavigationCntl(this);
	}

	public void addUser(User newUser) {
		userList.createUser(newUser);
	}
}
