//Name:
//ID:
//Section:
//Email:


// Final Lab Exam


// StackArray.java


package stackarraydemo;

public class StackArray {
	private int[] stack;
	private int maxSize;
	private int top;
	
	// Constructor
	public StackArray (int size) {
		maxSize = size;             // set array size
		stack = new int[maxSize];   // create array for stack
		top = -1;                   // set top to -1 (no items in stack yet)
	}
	
	
	
	//
	// void | changeStack()
	//
	
	public void changeStack() {
		//Write code here to
		//     -Find sum of all elements of the stack
		//     -If sum of all elements is even, then multiply each element of the stack by 2
		//     -If sum of all elements is odd, then multiply each element of the stack by itself
		
		
		
		
		
		
		
		
		
		
		 
	}
	
	
	
	//
	// void | swapSmallestLargest()
	//
	
	public void swapSmallestLargest() {
		//Write code here to
		//     -Find smallest and largest elements of the stack
		//     -Swap these smallest and largest elements in the stack
		
		
		
		
		
		
		
		
		
		
		
		 
	}
	
	
	
	//
	// void | sumEvenOdd()
	//
	
	public void sumEvenOdd() {
		//Write code here to
		//     -Find sum of even elements of the stack
		//     -Find sum of odd elements of the stack
		//	   -If sum of even elements is greater than sum of odd elements, then diplay the top stack element
		//     -Otherwise display the bottom most stack element
		
		
		
		
		
		
		
		
		
		
		 
	}
	
	
	//
	// boolean | isFull()
	//
	public boolean isFull () {
		return (top == maxSize-1);
	}
	
	
	//
	// boolean | isEmpty()
	//
	public boolean isEmpty() {
		return (top == -1);
	}
	
	
	//
	// int | pop()
	//
	public int pop() {
		return stack[top--];
	}
	
	
	//
	// int | peek()
	//
	public int peek() {
		return stack[top];
	}
	
	
	//
	// void | push(int)
	//
	public void push(int value) {
		stack[++top] = value;
	}
	
	
	//
	// boolean | search(int)
	//
	public boolean search(int value) {
		for(int i=0; i<=top; i++) {
			// if the value is found at stack[i], return true
			if (stack[i] == value)
				return true;
		}
		// If we make it till here, the value was not found in the array.
		return false;
	}
	
	
	//
	// void | PrintStack()
	//
	public void PrintStack() {
		for(int i=0; i<=top; i++) {
			System.out.print(stack[i] + ", ");
		}
		// print a newline
		System.out.println();
	}
	
	
}

