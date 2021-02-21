package com.search.algo;

public class LinkedListEx1 
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data= data; 
			next=null; 
		}
	}
	public static void main(String[] args) 
	{
		LinkedListEx1 list= new LinkedListEx1(); 
		list.push(5);
		list.push(1); 
        list.push(3); 
        list.push(9); 
        list.push(2); 
        list.push(8);	
        
        
        System.out.println("printing length of linked list: "+list.getlength());
	}
	
	public void push(int data)
	{
		Node new_node= new Node(data);
		new_node.next=head; 
		head= new_node; 
		
	}
	public int getlength()
	{
		int count=0; 
		Node current=head;  
		
		while(current!=null)
		{
			current= current.next;
			count= count+1;
		}
		return count; 
	}

}
