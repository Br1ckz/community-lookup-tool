/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.cntl;

import communitylookuptool.Person;
import communitylookuptool.PersonList;
import communitylookuptool.ResultTable;
import java.util.ArrayList;
import mvc.view.PersonView;
import mvc.view.ResultTableView;

/**
 *
 * @author bzc5373
 */
public class ResultTableCntl {
    private PersonList personList;
    private ResultTable resultTable;
    private ResultTableView resultTableUI; 
    private PersonView personUI; 
    private int currentPerson;
    private PersonCntl personCntl;
    
    public ResultTableCntl(PersonList personList) {
        this.personList = personList;
        resultTable = new ResultTable(personList.getListOfPeople());
        resultTableUI = new ResultTableView(this);
//        showResultTableUI();
	resultTableUI.setVisible(true);
    }
            
    public ResultTable getResultTable() {
        return resultTable;
    }
 
    public void showNewPersonUI() {
	resultTableUI.dispose();
        personCntl = new PersonCntl(this,-1);
    }
    
//    public void showPersonUI(int selectedRow){
//	if (personUI == null) {
//		personUI = new PersonView(this, selectedRow);
//	}
//	resultTableUI.setVisible(false);
//        personUI.setVisible(true);
//    }   
    
    public void showNewPersonUI(int selectedRow) {
	    resultTableUI.dispose();
	    personCntl = new PersonCntl(this, selectedRow);
    }
    
    public PersonList getPersonList() {
        return personList;
    }
    
//    public Person getPerson(int personNum) {
//        return personList.getListOfPeople().get(personNum);
//    }
    
//    public void showResultTableUI() {
//        if (personUI != null) {
//            personUI.setVisible(false);
//            personUI.dispose();
//        }
//        resultTableUI.setVisible(true);
//    }
//	
//    public void setCurentPerson(int num) {
//	if (currentPerson + num <= personList.getListOfPeople().size() - 1 
//		&& currentPerson + num >= 0) {    
//		currentPerson += num;
//	} else if (currentPerson + num > personList.getListOfPeople().size() - 1){
//		currentPerson = 0;
//	} else if (currentPerson + num < 0) {
//		currentPerson = personList.getListOfPeople().size() - 1;
//	}
//    }
    
//    public Person getCurrentPerson() {
//	return personList.getListOfPeople().get(currentPerson);
//    }
//    
//    public void updatePerson(String inFirstName, String inLastName, String inCampus) {
//	    Person person = new Person(inFirstName, inLastName, inCampus);
//	    personList.getListOfPeople().add(currentPerson, person);
//    }
//    
//    public void addPerson(String firstName, String lastName, String campus) {
//	    Person person = new Person(firstName, lastName, campus);
//	    personList.getListOfPeople().add(person);
//    }
    
    public ResultTableView getResultTableUI() {
        return resultTableUI;
    }
}
