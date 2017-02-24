/**
 * Linked List implementation
 */
package org.chaitulabs.datastructures.linkedlist;

/**
 * @author cmorredd
 *
 */
public class LinkedList {
	protected Node head;
	protected Node tail;
	protected int size;
	
	public LinkedList(){
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return (size==0);
	}
	
	/**
	 * insert an element at the beginning of the linked list
	 * @param val
	 */
	public void insertAtStart(int value){
		Node node=new Node(value,null);
		size++;
		if(head==null){
			head=node;
			tail=node;			
		}else{
			node.setLink(head);
			head=node;
		}		
    }
	
	/**
	 * inserts element at the end of the linked list.
	 * @param value
	 */
	public void insertAtEnd(int value){
		Node node=new Node(value,null);
		size++;
		if(head==null){
			head=node;
			tail=node;
		}else{
			tail.setLink(node);
			tail=node;
		}
	}
	
	/**
	 * Inserts an element at the given position
	 * @param value
	 * @param position
	 */
	public void insertAtPos(int value, int position){
		Node newNode=new Node(value,null);
		Node node=head;
		int pos=position-1;
		for(int i=1;i<=pos;i++){
			if(i==pos){
				Node tmp=node.getLink();
				node.setLink(newNode);
				newNode.setLink(tmp);
				break;
			}
			node=node.getLink();
		}
		size++;
	}
	
	/**
	 * Delete an element at the specified position
	 * @param position
	 */
	public void deleteAtPos(int position){
		Node node=head;
		int pos=position-1;
		for(int i=1;i<=pos;i++){
			if(i==pos){
				Node tmp=node.getLink();
				node.setLink(tmp.getLink());
				break;
			}
			node=node.getLink();
		}
		size--;
	}
	
	public void display(){
		Node node=head;
		//System.out.println("Size= "+this.getSize());
		System.out.println("****************");
		while(node!=null){
			System.out.print(node.data+"\t");
			node=node.link;
		}
		System.out.println("");
		System.out.println("****************");
	}
}
