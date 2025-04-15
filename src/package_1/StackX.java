package package_1;

public class StackX {
	
	public int maxSize;
	public double[] stackArray;
	public int top;
	
	public StackX(int s) {
		maxSize = s;
		stackArray = new double[maxSize];
		top = -1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
	public void push(int number) {
		if(isFull()) {
			System.out.println("Stack is full");
		}
		else {
			stackArray[++top] = number;
		}
	}
	
	public double pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -99;
		}
		else {
			return stackArray[top--];
		}
	}
		
	public double peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -99;
		}
		else {
			return stackArray[top];
		}
	}
		
}
