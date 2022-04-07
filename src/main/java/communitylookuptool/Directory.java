/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package communitylookuptool;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

/**
 *
 * @author bryce
 */
public class Directory {

	private Date startDate; //The date this queue was started 
	private LinkedList<Person> personDirectory = new LinkedList<Person>();

	public Directory() {
		this.buildDirectory();
	}

	public void buildDirectory() {
		//Add a first order to 'seed' the list
//		this.ordersToShip.add(new Order(12345, startDate, 15));
//		//This loop adds 40 more test orders
//
//		for (int i = 0; i < 40; i++) {
//			Random rand = new Random();
//			this.addOrder(new Order(rand.nextInt(3000), startDate, rand.nextInt(20)));
//		}

		PersonList personList = new PersonList();
		for (int i = 0; i < personList.getListOfPeople().size(); i++) {
			this.addPerson(personList.getListOfPeople().get(i));
		}
	}

	public void addPerson(Person newPerson) {
		boolean personAdded = false;
		boolean insertDecision = false;
		ListIterator<Person> personIterator = personDirectory.listIterator();
		//Loop to determine where to insert the new Order
		while (personIterator.hasNext()) {
			insertDecision = personIterator.next().decideToInsert(newPerson);
			if (insertDecision) {
				personDirectory.add(personIterator.previousIndex(), newPerson);
				personAdded = true;
				break;
			}
		}
		//Order not added in loop - i.e., it belongs at end
		if (personAdded == false) {
			//Add to end of list if not added in loop
			personDirectory.add(newPerson);
		}
	}

	public void printDirectory() {
		ListIterator<Person> personIterator = personDirectory.listIterator();
		while (personIterator.hasNext()) {
			System.out.println(personIterator.next().toString());
		}
	}

}
