package thanq;

public class Stack {
	
	StackNode top;
	int size = 65536;
	
	public Stack(StackNode top){
		this.top = top;
	}
	
	public void push(StackNode s){
		s.next = this.top;
		this.top = s;
	}
	
	public StackNode peek(){
		return this.top;
	}
	
	public StackNode pop(){
		if(this.top.next == null){
			return this.top;
		}
		else{
			StackNode temp = this.top;
			this.top = this.top.next;
			return temp;	
		}
	}
	
}
