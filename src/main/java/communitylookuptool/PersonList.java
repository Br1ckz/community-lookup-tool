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
public class PersonList {

	private Person person;
	private ArrayList<Person> listOfPeople;
	private String listOfPeopleFileName;

	public void setListOfPeople(ArrayList<Person> listOfPeople) {
		this.listOfPeople = listOfPeople;
	}

	public PersonList() {
		this.listOfPeople = new ArrayList<>();
		this.listOfPeopleFileName = "listOfPeople.ser";

		this.readPersonListFile();
		if (listOfPeople.isEmpty() || listOfPeople == null) {
			this.createPeopleList();
			this.writePersonListFile();
			this.readPersonListFile();
		}
		this.printPersonList();
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
		writePersonListFile();
	}

	public void removePerson(Person person) {
		listOfPeople.remove(person);
		writePersonListFile();
	}

	public void readPersonListFile() {
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
			fis = new FileInputStream(listOfPeopleFileName);
			in = new ObjectInputStream(fis);
			listOfPeople = (ArrayList) in.readObject();
			in.close();
			if (!listOfPeople.isEmpty()) {
				System.out.println("There are peopel in the people list");
			}
		} catch (FileNotFoundException fne) {
			System.out.println("File was not found, a new one will be created");
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	public void writePersonListFile() {
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(listOfPeopleFileName);
			out = new ObjectOutputStream(fos);
			out.writeObject(listOfPeople);
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public void printPersonList() {
		System.out.println("The PersonList has these people:");
		for (int i = 0; i < listOfPeople.size(); i++) {
			Person currentPerson = (Person) listOfPeople.get(i);
			System.out.println(currentPerson.getFirstName() + " " + currentPerson.getLastName() + " " + currentPerson.getCampus());
		}
	}
}
