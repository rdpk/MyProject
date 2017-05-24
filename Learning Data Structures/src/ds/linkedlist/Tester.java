package ds.linkedlist;

public class Tester {

	public static void main(String[] args) {
		
		//Assign DATA but no link
		Node aNode = new Node();  //aNode (like pointers) is a Variable Pointing to Data Structures 
		aNode.data = 4;
		
		Node bNode = new Node();
		bNode.data = 3;
		
		Node cNode = new Node();
		cNode.data = 2;
		
		Node dNode = new Node();
		dNode.data = 1;
		
		//Link here using Next
		aNode.next = bNode;
		bNode.next = cNode;
		cNode.next = dNode;

		System.out.println("Length of below method is: " + listLength(aNode));
		System.out.println("Length of below method is: " + listLength(bNode));
		System.out.println("Length of below method is: " + listLength(cNode));
		System.out.println("Length of below method is: " + listLength(dNode));
	}
	
	public static int listLength(Node node){
		int length = 0;
		Node currentNode = node;
		while((currentNode != null)){
			length++;
			currentNode = currentNode.next;
		}
		return length;
	}

}
