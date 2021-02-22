package com.search.algo;

class LinkedDelete2
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data= data;
			next= null;
		}
	}
	
	public static void main(String []args)
	{
		LinkedDelete2 list= new LinkedDelete2();
	list.push(4);  list.push(3);   list.push(8);  list.push(2);  list.push(6);  list.push(12);  
	System.out.println("created linked list is: ");
	list.printList();
	
	list.deleteNode(4);
	System.out.println("\nmodified linked list is: ");
	list.printList();
	}
	
	public void push(int data)
	{
		Node new_node= new Node(data);
		new_node.next= head;
		head= new_node;
	}
	
	public void printList()
	{
		Node current= head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current= current.next; 
			
		}
		
	}
	//delete function to delete a node from given index position.
	public void deleteNode(int index)
	{
		
		Node tnode= head;
		if(index==0)
		{
			head= tnode.next;
			return;
		}
		
		for(int i=0; tnode!=null && i<index-1; i++)
		{
			tnode= tnode.next; 
		}
		
		Node next= tnode.next.next; 
		tnode.next= next; 
	}
}
		
			
		
		
	
	
	
