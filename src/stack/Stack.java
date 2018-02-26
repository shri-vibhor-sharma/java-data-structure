package stack;

public class Stack {
	private char[] stack;
	private int top=-1;
	private int maxsize; 
	
	public Stack(int size) {
		this.maxsize=size;
		this.stack = new char[size];
		
	}
	public boolean isFull(){
		if(maxsize-1	==	top){
			return true;
		}
		else return false;
	}

	public boolean isEmpty(){
		if(top<0){
		return true;
		}
		else return false;
	}
	
	public void push(char value) {
		top++;
		stack[top]=value;
		System.out.println("item pushed");
			}
	
	public char pop() {
		
		if(isEmpty() == false){
			int old_top= top;
		top--;
		System.out.println("item popped");
		return stack[old_top];
		}
		else System.out.println("Stack is already empty");
		return '0';
	}
	
	public char peek(){
		return stack[top];
	}
	
}
