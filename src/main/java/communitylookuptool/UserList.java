/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communitylookuptool;

import java.util.ArrayList;

/**
 *
 * @author bzc5373
 */
public class UserList {
    private ArrayList<User> listOfUsers = new ArrayList<>();

    public UserList() {
        User u1 = new User("Rand", "Person", "rperson", "password");
        User u2 = new User("test", "test", "testUser", "12345");
        User u3 = new User("Alice", "Solo", "alices", "54321");
        listOfUsers.add(u1);
        listOfUsers.add(u2);
        listOfUsers.add(u3);
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
    
}
