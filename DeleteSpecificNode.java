package com;

import java.util.LinkedList;

public class DeleteSpecificNode {
	
	Node head;
	
	class Node {
		
		int data;
		Node next;
		
		Node(int i)
		{
			data = i;
			next = null;
		}
	}
	
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
//		if(head == null)
//			head = new_node;
		
		new_node.next = head;
		head = new_node;
		
	}
	
	public void addfromlast(int new_data)
	{
		Node new_node = new Node(new_data);
		
		
		if(head==null)
		{
			head = new_node;
			return;
		}
		
		new_node.next = null;
		
		Node temp=head;
		
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		
		temp.next = new_node;
	}
	
	
	void deleteNodefromfront()
	{
		if(head == null)
		{
			System.out.println("Nothing to delete");
			return;
		}
		head = head.next;
	}
	
	void deleteNode(int key)
	{
		if(head==null)return;
		
		if(key==head.data)
		{
			head = head.next;
			return;
		}
		else{
			Node temp = head;
			Node prev = null;
			while(temp.next!=null && temp.data!=key)
			{
				prev = temp;
				temp = temp.next;
				
			}
			
			prev.next = temp.next;
		}
		
	}
	
	public void linkedlistlength()
	{
		Node temp = head;
		int count = 0;
		
	
			while(temp!=null)
			{
				count++;
				temp=temp.next;
			}
		
		
		System.out.println("Length of linked list is "+count);
	}
	
	public void addAfterSpecificNode(Node specified_node,int new_data)
	{
		Node new_node = new Node(new_data);
		
		if(specified_node == null)
		{
			System.out.println("Specified node can not be null");
			return;
		}
		
		new_node.next = specified_node.next;
		specified_node.next = new_node;
	}
	
	public boolean search(int key)
	{
		boolean flag=false;
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==key)
			{
				flag=true;
				temp=temp.next;
				break;
			}
			
			temp=temp.next;
		}
		return flag;
	}
	
	void printlist()
	{
		Node tNode = head;
		while(tNode != null)
		{
			System.out.print(tNode.data+" ");
			tNode = tNode.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteSpecificNode dsn = new DeleteSpecificNode();
		
		dsn.push(2);
		//dsn.push(5);
		//dsn.push(0);
		//dsn.push(7);
		
		//dsn.addfromlast(8);
		//dsn.addfromlast(7);
		//dsn.addAfterSpecificNode(dsn.head.next.next.next, 5);
		//dsn.addfromlast(2);
		//dsn.deleteNode(5);
		dsn.printlist();
		//dsn.linkedlistlength();
		//boolean flag = dsn.search(1);
		//System.out.println(flag);
		
	}

}
