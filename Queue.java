package thanq;

/*
 * Queue.java
 * 
 * This is a queue.
 * A queue is a FIFO (first in, first out) data structure. Like a line of people queueing somewhere.
 * We can "get on line" by enqueuing.
 * We can be dequeued, meaning that we have reached the front of the queue.
 * 
 */
public class Queue {
	
	//The Node at the front of the queue.
	QueueNode front;
	
	//The Node at the back of the queue.
	QueueNode back;
	
	//Constructor
	//Creates a new queue with one item.
	public Queue(QueueNode front){
		//The lone item is now both the front, AND the back of the queue.
		this.front = front;
		this.back = front;
	}
	
	//Adds a new item to the back of the queue.
	public void enqueue(QueueNode q){
		//The current back of the queue is now in front of the new item.
		q.inFront = this.back;
		//The new item is now in the back of the previous back.
		this.back.inBack = q;
		//The new item is now in back.
		this.back = q;
	}
	
	//Removes the front of the queue.
	public QueueNode dequeue(){
		//If there are items remaining, set the new front of the queue: to the item in back of the current front.
		//In other words, first in line gets served, and second in line becomes first in line.
		//Also, return the previous front of the line.
		QueueNode temp = this.front;
		if(this.front != null){
			this.front = this.front.inBack;
		}
		return temp;
	}

}
