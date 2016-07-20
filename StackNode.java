package thanq;

/*
 * StackNode.java
 * This is a Node that belongs in a Stack.
 * It has a letter assigned to it. Preferably a unique one.
 * It has a pointer to the next item in the stack.
 * 
 */
public class StackNode {
	
	//The letter on this Node
	char c;
	
	//Pointer to the next Node in a stack
	StackNode next;
	
	//Constructor
	//Creates a new StackNode with a given letter.
	public StackNode(char c){
		this.c = c;
	}
	
}
