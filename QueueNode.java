package thanq;

/*
 * QueueNode.java
 * This is a Node that belongs in a Queue.
 * It has a letter assigned to it. Preferably a unique one.
 * It has a pointer to the QueueNode in front of it in a Queue.
 * It has a pointer to the QueueNode in back of it in a Queue.
 * 
 */
public class QueueNode {
	
	//The letter on this Node
	char c;
	
	//Pointer to the node in front of it in a Queue
	QueueNode inFront;
	
	//Pointer to the node in back of it in a Queue
	QueueNode inBack;
	
	//Constructor
	//Creates a new QueueNode with a given letter.
	public QueueNode(char c){
		this.c = c;
	}

}
