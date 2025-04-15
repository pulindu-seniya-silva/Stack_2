package package_1;

public class StackApp {
	public static void main(String[] args) {
		
		StackX theStack = new StackX(10);
		
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		
		for(int i = theStack.top; i > -1; i--) {
			System.out.println(theStack.stackArray[i]);
		}
		
	}
}
