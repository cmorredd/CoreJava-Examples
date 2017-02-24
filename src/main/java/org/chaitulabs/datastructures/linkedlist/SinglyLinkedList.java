/**
 * Test Class for Singly Linked List
 */
package org.chaitulabs.datastructures.linkedlist;

/**
 * @author cmorredd
 *
 */
public class SinglyLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Operation: Insert from start :2 4 6 one by one and Display");
		LinkedList list=new LinkedList();
		list.insertAtStart(2);
		list.insertAtStart(4);
		list.insertAtStart(6);
		list.display();
		
		System.out.println("Operation: insert from start : 8 and insert at End: 34");
		list.insertAtStart(8);
		list.insertAtEnd(34);
		list.display();
		
		System.out.println("Operation: insert at position 3 element : 22");
		list.insertAtPos(22, 3);
		list.display();
		System.out.println("Operation: insert at End element : 33");
		list.insertAtEnd(33);
		list.display();
		System.out.println("Operation: delete at position: 3");
		list.deleteAtPos(3);
		list.display();
		System.out.println("Operation: delete at position: 3");
		list.deleteAtPos(3);
		list.display();
		System.out.println("Operation: delete from end");
		list.deleteAtPos(list.getSize());
		list.display();
		System.out.println("Operation: delete from end");
		list.deleteAtPos(list.getSize());
		list.display();
	}
}
