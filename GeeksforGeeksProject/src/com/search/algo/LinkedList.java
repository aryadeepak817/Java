package com.search.algo;

public class LinkedList 
{
	Node head; 
	
	static class Node
	{
		int data; 
		Node next; 
		
		public Node(int data)
		{
			this.data= data;
			next= null; 
		}
	}
	
	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.head= new Node(1);
		Node second = new Node(3);
		Node third = new Node(6); 
		
		//attach all your nodes in Linkedlist using next pointer. 
		list.head.next= second;
		second.next= third; 
		third.next= null; 
		
		list.printData(); 
		}
	
	//printing all the nodes data using printData() function. 
	public void printData()
	{
		Node current= head; 
		while(current!=null)
		{
			System.out.print(current.data+"--->");
			current= current.next;
		}
		/* System.out.print(current.data.concat(current.next)); */
		
		
	}

}
