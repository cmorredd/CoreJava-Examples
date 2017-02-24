/**
 * Node class represents a Node which holds data & link to the next node
 */
package org.chaitulabs.datastructures.linkedlist;

/**
 * @author cmorredd
 *
 */
class Node {
	protected int data;
	protected Node link;
	
	public Node(){
		data=0;
		link=null;
	}
	
	public Node(int data,Node node){
		this.data=data;
		this.link=node;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLink() {
		return link;
	}
	public void setLink(Node link) {
		this.link = link;
	}
}
