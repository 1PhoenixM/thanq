package thanq;

/*
 * Stack.java
 * 
 * This is a stack.
 * A stack is a LIFO (last in, first out) data structure.
 * We can push new items onto the stack of items.
 * We can peek at the top of the stack without taking anything off.
 * We can pop the top of the stack off and take the item.
 * 
 */
public class Stack {
	
	//The Node at the top of the stack.
	StackNode top;
	
	//Max size (number of items) of the stack - TBA
	int size = 65536;
	
	//Constructor
	//Creates a new stack with one item.
	public Stack(StackNode top){
		//Sets this lone item to the top of the stack.
		this.top = top;
	}
	
	//Pushes a new item onto the stack.
	public void push(StackNode s){
		//The new item covers the current top of the stack.
		s.next = this.top;
		//The new item is now the top of the stack.
		this.top = s;
	}
	
	//Peeks at the top of the stack.
	public StackNode peek(){
		return this.top;
	}
	
	//Pops the top of the stack, taking the item at the top.
	public StackNode pop(){
		//If one item remaining, return it
		if(this.top.next == null){
			return this.top;
		}
		//If more items remain, set the new top to the item under it.
		//And return the previous top.
		else{
			StackNode temp = this.top;
			this.top = this.top.next;
			return temp;	
		}
	}
	
}
