/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.cntl;

import communitylookuptool.Person;
import communitylookuptool.PersonList;
import communitylookuptool.Student;
import mvc.view.PersonView;

/**
 *
 * @author bryce
 */
public class PersonCntl {

	private PersonView personUI;
	private PersonList personList;
	private ResultTableCntl resultTableCntl;
	private int row = 0;

	public PersonCntl(ResultTableCntl resultTableCntl, int row) {
		this.resultTableCntl = resultTableCntl;
		personList = resultTableCntl.getPersonList();
		this.row = row;
		if (row == -1) {
			showNewPersonUI();
		} else {
			personUI = new PersonView(this, row);
			showPersonUI();
		}
	}

	public ResultTableCntl getResultTableCntl() {
		return resultTableCntl;
	}

	public void setResultTableCntl(ResultTableCntl resultTableCntl) {
		this.resultTableCntl = resultTableCntl;
	}

	public void showNewPersonUI() {
		personUI = new PersonView(this);
		personUI.showNewPersonUI();
		personUI.setVisible(true);
	}

	public void showPersonUI(int row) {
		personUI = new PersonView(this, row);
		personUI.setVisible(true);
	}

	public PersonView getPersonUI() {
		return personUI;
	}

	public void addNewStudent(Student student) {
		personList.getListOfPeople().add(student);
	}

	public void setPersonUI(PersonView personUI) {
		this.personUI = personUI;
	}

	public PersonList getPersonList() {
		return personList;
	}

	public void setPersonList(PersonList personList) {
		this.personList = personList;
	}

	public void showPersonUI() {
		personUI.setVisible(true);
	}

	public Person getPerson(int personNum) {
		return personList.getListOfPeople().get(personNum);
	}

	public Person getCurrentPerson() {
		return personList.getListOfPeople().get(row);
	}

	public void setCurentPerson(int num) {
		if (row + num <= personList.getListOfPeople().size() - 1
			&& row + num >= 0) {
			row += num;
		} else if (row + num > personList.getListOfPeople().size() - 1) {
			row = 0;
		} else if (row + num < 0) {
			row = personList.getListOfPeople().size() - 1;
		}
	}

	public void updatePerson(String inFirstName, String inLastName, String inCampus) {
		Person person = new Person(inFirstName, inLastName, inCampus);
		personList.getListOfPeople().add(row, person);
	}

	public void addPerson(String firstName, String lastName, String campus) {
		Person person = new Person(firstName, lastName, campus);
//		personList.getListOfPeople().add(person);
		personList.addPerson(person);
	}
	
	public void deletePerson(Person person) {
		personList.removePerson(person);
	}
}
