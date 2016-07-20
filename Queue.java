package thanq;

public class Queue {
	
	QueueNode front;
	QueueNode back;
	
	public Queue(QueueNode front){
		this.front = front;
		this.back = front;
	}
	
	public void enqueue(QueueNode q){
		if(this.back != null){
			q.inFront = this.back;
			this.back.inBack = q;
		}
		this.back = q;
	}
	
	public QueueNode dequeue(){
		QueueNode temp = this.front;
		if(this.front != null){
			this.front = this.front.inBack;
		}
		return temp;
	}

}
