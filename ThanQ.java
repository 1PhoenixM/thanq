package thanq;

public class ThanQ {

	public static void main(String[] args){
		Stack s = new Stack(new StackNode('a'));
		Queue q = new Queue(new QueueNode('b'));
		
		//Test stack
		s.push(new StackNode('a'));
		s.push(new StackNode('c'));
		s.push(new StackNode('e'));
		s.push(new StackNode('g'));
		s.push(new StackNode('i'));
		System.out.println("Peek: " + s.peek().c);
		System.out.println("Pop: " + s.pop().c);
		System.out.println("Pop: " + s.pop().c);
		System.out.println("Pop: " + s.pop().c);
		System.out.println("Pop: " + s.pop().c);
		System.out.println("Peek: " + s.peek().c);
		
		//Test queue
		q.enqueue(new QueueNode('d'));
		q.enqueue(new QueueNode('f'));
		q.enqueue(new QueueNode('h'));
		q.enqueue(new QueueNode('j'));
		q.enqueue(new QueueNode('l'));
		System.out.println("Dequeue: " + q.dequeue().c);
		System.out.println("Dequeue: " + q.dequeue().c); 
		System.out.println("Dequeue: " + q.dequeue().c);
		System.out.println("Dequeue: " + q.dequeue().c);
		
	}
	
}
