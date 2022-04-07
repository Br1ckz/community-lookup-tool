/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.cntl;

import communitylookuptool.Person;
import communitylookuptool.PersonList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import mvc.view.ResultView;

/**
 *
 * @author bzc5373
 */
public class ResultCntl 
//	implements ActionListener 
{
    private NavigationCntl navCntl;
    private ResultView resultView;
    private PersonList personList;
    private int currentPerson;
    
    public ResultCntl(NavigationCntl navCntl, PersonList personList) {
        this.navCntl = navCntl;
        this.personList = personList; 
        resultView = new ResultView(this);
        navCntl.showNavUI(false);
        showResultUI(true);
//        addALButtons();
    }

//    public void addALButtons() {
//        resultView.btnNext.addActionListener(this);
//        resultView.btnPrev.addActionListener(this);
//        resultView.btnAdd.addActionListener(this);
//        resultView.btnDelete.addActionListener(this);
//        resultView.btnUpdate.addActionListener(this);
//        resultView.btnQuit.addActionListener(this);
//    }
    
    public ArrayList<Person> getListOfPeople() {
        return personList.getListOfPeople();
    }
    
    public int getCurrentPerson() {
	  return currentPerson;
    }
    
    public void setCurrentPerson(int newPerson) {
	    currentPerson = newPerson;
    }
    
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        Object objSource = e.getSource();
//        currentPerson = resultView.getCurrentPerson();
//        if (objSource == resultView.btnNext) {
//
//            if (currentPerson == personList.getListOfPeople().size() - 1) {
//                currentPerson = 0;
//            } else {
//                currentPerson++;
//            }
//        } else if (objSource == resultView.btnPrev) {
//            if (currentPerson == 0) {
//                currentPerson = personList.getListOfPeople().size() - 1;
//            } else {
//                currentPerson--;
//            }
//        } else if (objSource == resultView.btnAdd) {
//            Person person = new Person(resultView.getFirstName(), resultView.getLastName(), resultView.getCampus());
//            personList.addPerson(person);
//        } else if(objSource == resultView.btnDelete) {
//            personList.removePerson(personList.getListOfPeople().get(currentPerson));
//        } else if (objSource == resultView.btnUpdate) {
//            String newFName = resultView.getFirstName();
//            String newLName = resultView.getLastName();
//            String newCampus = resultView.getCampus();
//            
//            Person person = personList.getListOfPeople().get(currentPerson);
//            if (!(person.getFirstName().equals(newFName))) {
//                person.setFirstName(newFName);
//            }            
//            
//            if (!(person.getLastName().equals(newLName))) {
//                person.setLastName(newLName);
//            }
//            
//            if (!(person.getCampus().equals(newCampus))) {
//                person.setCampus(newCampus);
//            }
//        } else if (objSource == resultView.btnQuit) {
//            System.exit(0);
//        }
//        
//        resultView.setCurrentPerson(currentPerson);
//        resultView.parsePerson(personList.getListOfPeople().get(currentPerson));
//    }

    public void showResultUI(Boolean bool) {
        resultView.setVisible(bool);
	if (bool == false) {
		resultView.dispose();
	}
    }

    public void moveToNav() {
	    navCntl.showNavUI(true);
	    showResultUI(false);
    }
    
    public PersonList getPersonList() {
	    return personList;
    }
    
    public void setPersonList(PersonList newPersonList) {
	    this.personList = newPersonList;
    }
}