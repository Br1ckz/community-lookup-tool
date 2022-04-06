/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communitylookuptool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author bzc5373
 */
public class UserList {
    private ArrayList<User> listOfUsers = new ArrayList<>();
    private String listOfUsersFileName;
    
    public UserList() {
	this.listOfUsers = new ArrayList<>();
        this.listOfUsersFileName = "listOfUsers.ser";
//        User u1 = new User("Rand", "Person", "rperson", "password");
//        User u2 = new User("test", "test", "testUser", "12345");
//        User u3 = new User("Alice", "Solo", "alices", "54321");
//        listOfUsers.add(u1);
//        listOfUsers.add(u2);
//        listOfUsers.add(u3);
	
	this.readUserListFile();
	    if(listOfUsers.isEmpty() || listOfUsers == null){
		this.createTestUserList();
		this.writeUserListFile();
		this.readUserListFile();
	    }
	this.printUserList();
    }

    public ArrayList<User> getListOfUsers() {
        return listOfUsers;
    }

    public void setListOfUsers(ArrayList<User> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }
    
    public boolean authenticate(User user) {
        for (User u : listOfUsers) {
            if (user.getUserName().equals(u.getUserName()) 
                    && user.getPassword().equals(u.getPassword())) {
                return true;
            }
        }
        return false;
    }
    
    public void readUserListFile() {
    FileInputStream fis = null;
    ObjectInputStream in = null;
    try {
        fis = new FileInputStream(listOfUsersFileName);
        in = new ObjectInputStream(fis);
        listOfUsers = (ArrayList) in.readObject();
        in.close();
        if (!listOfUsers.isEmpty()) {
            System.out.println("There are users in the user list");
        }
    } catch (FileNotFoundException fne) {
        System.out.println("File was not found, a new one will be created");
    } catch (IOException ex) {
        ex.printStackTrace();
    } catch (ClassNotFoundException ex) {
        ex.printStackTrace();
    }
}
    public void writeUserListFile() {
    FileOutputStream fos = null;
    ObjectOutputStream out = null;
    try {
        fos = new FileOutputStream(listOfUsersFileName);
        out = new ObjectOutputStream(fos);
        out.writeObject(listOfUsers);
        out.close();
    } catch (IOException ex) {
        ex.printStackTrace();
    }
	}
    
    public void createTestUserList() {
    for (int i = 0; i < 20; i++) {
        listOfUsers.add(new User("Test User" + i, "password"));
    }
    System.out.println("Test UserList created");
    System.out.println("The UserList is: " + listOfUsers);
}
    
    public void printUserList() {
    System.out.println("The UserList has these users:");
    for (int i = 0; i < listOfUsers.size(); i++) {
        User currentUser = (User) listOfUsers.get(i);
        System.out.println(currentUser.getUserName());
    }
}
    
}
