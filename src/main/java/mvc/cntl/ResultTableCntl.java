/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.cntl;

import communitylookuptool.Person;
import communitylookuptool.ResultTable;
import java.util.ArrayList;
import mvc.view.PersonView;
import mvc.view.ResultTableView;

/**
 *
 * @author bzc5373
 */
public class ResultTableCntl {
    private ArrayList<Person> personList;
    private ResultTable resultTable;
    private ResultTableView resultTableUI; // refactor to resultTableUI
    private PersonView personUI; // refactor to personUI

    public ResultTableCntl(ArrayList<Person> personList) {
        this.personList = personList;
        resultTable = new ResultTable(personList);
        resultTableUI = new ResultTableView(this);
        showResultTableUI();
    }
            
    public ResultTable getResultTable() {
        return resultTable;
    }
 
    public void showPersonUI() {
        personUI = new PersonView(this);
        resultTableUI.setVisible(false);
        personUI.setVisible(true);
    }
    
    public void showPersonUI(int selectedRow){
        personUI = new PersonView(this, selectedRow);
        resultTableUI.setVisible(false);
        personUI.setVisible(true);
    }   
    
    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public Person getPerson(int personNum) {
        return personList.get(personNum);
    }
    
    public void showResultTableUI() {
        if (personUI != null) {
            personUI.setVisible(false);
            personUI.dispose();
        }
        resultTableUI.setVisible(true);
    }
}