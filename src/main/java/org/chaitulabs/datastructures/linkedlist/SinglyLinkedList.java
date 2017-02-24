/**
 * Test Class for Singly Linked List
 */
package org.chaitulabs.datastructures.linkedlist;

import java.util.Scanner;

/**
 * @author cmorredd
 *
 */
public class SinglyLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try{
		/* Creating object of class linkedList */
		LinkedList list = new LinkedList();
		System.out.println("Singly Linked List Test\n");
		char ch;
		/* Perform list operations */
		do {
			System.out.println("\nAvailable Operations\n");
			System.out.println("1. insert at begining");
			System.out.println("2. insert at end");
			System.out.println("3. insert at position");
			System.out.println("4. delete at position");
			System.out.println("5. check empty");
			System.out.println("6. get size");
			System.out.println("");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to insert");
				list.insertAtStart(scan.nextInt());
				break;
			case 2:
				System.out.println("Enter integer element to insert");
				list.insertAtEnd(scan.nextInt());
				break;
			case 3:
				System.out.println("Enter integer element to insert");
				int num = scan.nextInt();
				System.out.println("Enter position");
				int pos = scan.nextInt();
				if (pos <= 1 || pos > list.getSize())
					System.out.println("Invalid position\n");
				else
					list.insertAtPos(num, pos);
				break;
			case 4:
				System.out.println("Enter position");
				int p = scan.nextInt();
				if (p < 1 || p > list.getSize())
					System.out.println("Invalid position\n");
				else
					list.deleteAtPos(p);
				break;
			case 5:
				System.out.println("Empty status = " + list.isEmpty());
				break;
			case 6:
				System.out.println("Size = " + list.getSize() + " \n");
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}
			/* Display List */
			list.display();
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		}catch (Exception e) {
			System.out.println("Due to Invalid Input..Program Terminated.");
			//e.printStackTrace(e);
		}finally{
			scan.close();
		}
	}
}
