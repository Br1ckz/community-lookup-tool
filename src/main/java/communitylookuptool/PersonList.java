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
public class PersonList {
    private Person person;
    ArrayList<Person> listOfPeople = new ArrayList<>();
    
    public void setListOfPeople(ArrayList<Person> listOfPeople) {
        this.listOfPeople = listOfPeople;
    }
    
    public PersonList() {
          if (listOfPeople.size() == 0) {
              createPeopleList();
          }
    }
    
    private void createPeopleList() {
        for (int i = 0; i < 5; i++) {
            person = new Person("studentFName" + i, "studentLName" + i, "campus" + i);
            listOfPeople.add(person);
        }
        
        for (int i = 0; i < 5; i++) {
            person = new Person("professorFName" + i, "professorLName" + i, "campus" + i);
            listOfPeople.add(person);
        }
    }
    
    public void printListOfPeople() {
        for (Person p : listOfPeople) {
            System.out.println(p);
        }
    }

    public ArrayList<Person> getListOfPeople() {
        return listOfPeople;
    }
    
    public void addPerson(Person person) {
        listOfPeople.add(person);
    }
    
    public void removePerson(Person person) {
        listOfPeople.remove(person);
    }
}