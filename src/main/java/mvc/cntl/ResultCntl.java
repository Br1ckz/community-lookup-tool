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
public class ResultCntl implements ActionListener {
    private NavigationCntl navCntl;
    private ResultView resultView;
    private PersonList personList;
    private int currentPerson;
    
    public ResultCntl(NavigationCntl navCntl) {
        this.navCntl = navCntl;
        personList = new PersonList();
        resultView = new ResultView(this);
        navCntl.showUI(false);
        showUI(true);
        addALButtons();
    }

    public void addALButtons() {
        resultView.btnNext.addActionListener(this);
        resultView.btnPrev.addActionListener(this);
        resultView.btnAdd.addActionListener(this);
        resultView.btnDelete.addActionListener(this);
        resultView.btnUpdate.addActionListener(this);
        resultView.btnQuit.addActionListener(this);
    }
    
    public ArrayList<Person> getListOfPeople() {
        return personList.getListOfPeople();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object objSource = e.getSource();
        currentPerson = resultView.getCurrentPerson();
        if (objSource == resultView.btnNext) {

            if (currentPerson == personList.getListOfPeople().size() - 1) {
                currentPerson = 0;
            } else {
                currentPerson++;
            }
        } else if (objSource == resultView.btnPrev) {
            if (currentPerson == 0) {
                currentPerson = personList.getListOfPeople().size() - 1;
            } else {
                currentPerson--;
            }
        } else if (objSource == resultView.btnAdd) {
            Person person = new Person(resultView.getFirstName(), resultView.getLastName(), resultView.getCampus());
            personList.addPerson(person);
        } else if(objSource == resultView.btnDelete) {
            personList.removePerson(personList.getListOfPeople().get(currentPerson));
        } else if (objSource == resultView.btnUpdate) {
            String newFName = resultView.getFirstName();
            String newLName = resultView.getLastName();
            String newCampus = resultView.getCampus();
            
            Person person = personList.getListOfPeople().get(currentPerson);
            if (!(person.getFirstName().equals(newFName))) {
                person.setFirstName(newFName);
            }            
            
            if (!(person.getLastName().equals(newLName))) {
                person.setLastName(newLName);
            }
            
            if (!(person.getCampus().equals(newCampus))) {
                person.setCampus(newCampus);
            }
        } else if (objSource == resultView.btnQuit) {
            System.exit(0);
        }
        
        resultView.setCurrentPerson(currentPerson);
        resultView.parsePerson(personList.getListOfPeople().get(currentPerson));
    }

    public void showUI(Boolean bool) {
        resultView.setVisible(bool);
    }

    public void giveControl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}