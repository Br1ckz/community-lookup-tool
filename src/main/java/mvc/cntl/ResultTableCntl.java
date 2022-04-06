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
    private NavigationCntl navCntl;
    
    public ResultTableCntl(NavigationCntl navCntl, PersonList personList) {
	this.navCntl = navCntl;
        this.personList = personList;
        resultTable = new ResultTable(personList.getListOfPeople());
        resultTableUI = new ResultTableView(this);
	resultTableUI.setVisible(true);
    }
            
    public ResultTable getResultTable() {
        return resultTable;
    }
 
    public void showNewPersonUI() {
	resultTableUI.dispose();
        personCntl = new PersonCntl(this,-1);
    }
    
    public void showNewPersonUI(int selectedRow) {
	    resultTableUI.dispose();
	    personCntl = new PersonCntl(this, selectedRow);
    }
    
    public PersonList getPersonList() {
        return personList;
    }
  
    public ResultTableView getResultTableUI() {
        return resultTableUI;
    }
    
    public void moveToNav() {
	    navCntl.showNavUI(true);
	    resultTableUI.setVisible(false);
	    resultTableUI.dispose();
    }
}
