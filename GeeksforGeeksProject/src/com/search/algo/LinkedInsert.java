package com.search.algo;

public class LinkedInsert
{
   Node head; 
   
   static class Node 
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
     LinkedInsert list= new LinkedInsert(); 
	 list.push(2);  //adding a new element at the front
	 list.push(5); 
	 
	 list.append(3);   //adding a new element at the end
	 list.insertAfter(list.head.next, 7);  //adding a new element at the middle node
	 //list.append(1);   //adding a new element at the end
	 
	 list.printList(); 
	 } 
	 
	 public void push(int data)
	 { 
	   Node new_node= new Node(data); 
	   new_node.next = head; 
	   head= new_node; 
	   
		/*
		 * if(head==null) { System.out.println("head node should not be null"); return;
		 * }
		 */
	 }
	 public void insertAfter(Node prev_node, int data)
		  {
		     if(prev_node== null)
			 {
			 System.out.println("prev node should not be null"); 
			 return;
			 }
			 
			  Node new_node= new Node(data); 
			  new_node.next= prev_node.next; 
			  prev_node.next= new_node; 
			  
			  }
			  
	public void append(int data)
		{
			    Node new_node= new Node(data); 
				
				Node last= head; 
				while(last.next!=null)
				{
					last= last.next; 
					
					  last.next= new_node; 
					  return;
				}
				  
				  
		}
	
				  
	public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 
	
}
			 
			 
		 
			 
		  