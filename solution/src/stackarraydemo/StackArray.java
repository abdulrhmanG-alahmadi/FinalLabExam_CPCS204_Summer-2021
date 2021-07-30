//Name: Abdulrhman Alahmadi
//ID: 2036026
//Section: ZA1
//Email: alahmadi1999@gmail.com


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
		
		
                int sum = 0;
                for (int i = 0; i <= top; i++)
                    sum += stack[i];
		
		if (sum % 2 == 0) {
                    for (int i = 0; i <= top; i++)
                        stack[i] *= 2;
                }
                else {
                    for (int i = 0; i <= top; i++)
                        stack[i] *= stack[i];
                }
		
		
	}
	
	
	
	//
	// void | swapSmallestLargest()
	//
	
	public void swapSmallestLargest() {
		//Write code here to
		//     -Find smallest and largest elements of the stack
		//     -Swap these smallest and largest elements in the stack
		
		
		int maxValue = stack[0];
		int minValue = stack[0];
		int maxIndex = 0;
                int minIndex = 0;
		
		for (int i = 0; i <= top; i++) {
                    if (stack[i] < minValue) {
                        minValue = stack[i];
                        minIndex = i;
                    }
                    if (stack[i] > maxValue) {
                        maxValue = stack[i];
                        maxIndex = i;
                    }
                }
		
		
		int temp = minValue;
                stack[minIndex] = maxValue;
                stack[maxIndex] = temp;
		
		 
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
		
		
		
		int sumEven = 0;
		int sumOdd = 0;
		
		for (int i = 0; i <= top; i++) {
                    if (stack[i] % 2 == 0)
                        sumEven += stack[i];
                    else
                        sumOdd += stack[i];
                }
		
                
		if (sumEven > sumOdd) {
                    System.out.println("The top stack element is " + stack[top]);
                }
                else {
                    System.out.println("The bottom-most stack element is " + stack[0]);
                }
		
		 
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
            if (!isEmpty())
		return stack[top--];
            return -1;
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
            if (!isFull())
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

