import java.util.*;
import java.io.*;
class Main 
{ 
	Node head;
	
	class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) {data = d; next = null; } 
	} 

	public void push(int new_data) 
	{ 
		Node new_node = new Node(new_data); 

		new_node.next = head; 

		head = new_node; 
	} 

	public void insertAfter(Node prev_node, int new_data) 
	{ 
		if (prev_node == null) 
		{ 
			System.out.println("Previous node cannot be null"); 
	} 

		Node new_node = new Node(new_data); 

		new_node.next = prev_node.next; 

		prev_node.next = new_node; 
	} 
	
	public void append(int new_data) 
	{ 
		Node new_node = new Node(new_data); 

		if (head == null) 
		{ 
			head = new Node(new_data); 
			return; 
		} 

		new_node.next = null; 

		Node last = head; 
		while (last.next != null) 
			last = last.next; 
			
		last.next = new_node; 
		return; 
	} 
	public void printList() 
	{ 
		Node tempnode = head; 
		while (tempnode != null) 
		{ 
			System.out.print(tempnode.data+" "); 
			tempnode = tempnode.next; 
		} 
	} 
	public static void main(String[] args) 
	{ 
		Main linkedlist = new Main(); 

		linkedlist.append(6); //6                                                   6

		linkedlist.push(7);   //6 7                                                 7 6 

		linkedlist.push(1);  // 6 7 1                                               1 7 6

		linkedlist.append(4); //4 6 7 1                                             1 7 6 4

		linkedlist.insertAfter(linkedlist.head.next, 8); // 4 6 8 7 1               1 7 8 6 4

		System.out.println("Linked list is: "); 
		linkedlist.printList(); 
	} 
}