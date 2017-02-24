/**
 * 
 */
package org.chaitulabs.datastructures.linkedlist;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author cmorredd
 *
 */
public class LinkedListTest {
	
	private LinkedList list=null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		list=new LinkedList();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void insertAtStartTest() {
		System.out.println("insertAtStartTest");
		list.insertAtStart(2);
		list.insertAtStart(4);
		list.insertAtStart(6);
		list.insertAtStart(8);
		list.insertAtStart(10);
		list.display();		
		assertTrue(5==list.getSize());
	}
	
	@Test
	public void insertAtEndTest(){
		System.out.println("insertAtEndTest");
		list.insertAtEnd(0);
		list.insertAtEnd(-2);
		list.insertAtEnd(-4);
		list.insertAtEnd(-6);
		list.insertAtEnd(-8);
		list.display();
		assertTrue(5==list.getSize());
	}
	
	@Test
	public void randomOperationTest(){
		System.out.println("randomOperationTest");
		list.insertAtEnd(0);
		list.insertAtStart(2);
		list.insertAtPos(1, 1);
		list.insertAtEnd(-2);
		list.deleteAtPos(1);
		list.insertAtEnd(-4);
		list.display();
		assertTrue(4==list.getSize());
		
		
	}

}
