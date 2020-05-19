package com;


import java.util.LinkedList;

public class LInkedListPalindrome {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		LInkedListPalindrome llp = new LInkedListPalindrome();
		
		llp.addelement(1);
		llp.addelement(2);
		llp.addelement(3);
		llp.addelement(2);
		llp.addelement(1);
		llp.printlist();
		

	}
	
	public void palindrome(LinkedList<Integer> ll)
	{
		
	}
	public void reverse(){
		Node one  = head;
		Node two = head;
		java.util.Stack<Integer> stack = new java.util.Stack();
		
		while(two != null){
			stack.push(one.data);
			one = one.next;
			two = two.next.next;
		}
		
	}
	
	public void addelement(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	public void printlist()
	{
		Node tNode = head;
		while(tNode!=null)
		{
			System.out.print(tNode.data +" ");
			tNode = tNode.next;
		}
	}
	
	

}
