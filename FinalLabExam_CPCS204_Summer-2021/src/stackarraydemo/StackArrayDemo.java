//Name:
//ID:
//Section:
//Email:


// Final Lab Exam


// StackArrayDemo.java  (main class)


package stackarraydemo;

import java.util.Scanner;
import java.util.Random;

public class StackArrayDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int choice;  
		int value;  
		
		
        StackArray myStack = new StackArray(10);
		
		// Do/while loop showing menu, getting user choice, and performing actions
		do {
			
			showMenu();
			choice = input.nextInt();
			
			//Push value into the stack
			if (choice == 1) {
				if (!myStack.isFull()) {
					System.out.print(">    What value do you want to push: ");
					value = input.nextInt();

					
					myStack.push(value);
					System.out.println(">    " + value + " was successfully pushed into the stack.");
					System.out.println();
				}
				else {
					System.out.println(">    ERROR: cannot push (stack is full).");
					System.out.println();
				}
			}
			
			// POP value from stack
			else if (choice == 2) {				
				
				if (myStack.isEmpty()) {
					System.out.println(">    Error: cannot pop stack (stack is empty).");
				}
				
				else {
					int temp = myStack.pop();
					System.out.println(">    " + temp + " has been popped from the stack.");
				}
				System.out.println();
			}
			
			// PEEK (look at) the top value of the stack...but do not actually pop it off
			else if (choice == 3) {
				
				if (myStack.isEmpty()) {
					System.out.println(">    Error: cannot peek at stack (stack is empty).");
				}
				
				else {
					System.out.println(">    " + myStack.peek() + " is the value at the top of the stack.");
				}
				System.out.println();
			}
			
			// Search for an item in the stack
			else if (choice == 4) {
				System.out.print(">    What value do you want to search for: ");
				value = input.nextInt();
				if (myStack.search(value))
					System.out.println(">    " + value + " was found in the stack.");
				else
					System.out.println(">    " + value + " was not found in the stack.");
				System.out.println();
			}
			
			// Print all values in stack
			else if (choice == 5) {
				if (myStack.isEmpty()) {
					System.out.println(">    Error: cannot print nodes (the stack is empty)");
					System.out.println();
				}
				else {
					System.out.println(">    Printing All Nodes:");
					System.out.print(">    ");
					myStack.PrintStack();
					System.out.println();
					System.out.println();
				}
			}
			
			// Changing elements of the stack
			else if (choice == 6) {
				
				//Storing random values in the stack
				int x;
				Random randNum = new Random();
				for (int i = 0; i < 10; i++) {
					 x = randNum.nextInt(100);
					 myStack.push(x);
				}
				
				//Write code here to call apropriate method to change the elements of the stack
				
				
				
					System.out.println();
					System.out.println();
				
			}
			
			// Swap smallest and largest element of the stack
			else if (choice == 7) {
				
				//Storing random values in the stack
				int x;
				Random randNum = new Random();
				for (int i = 0; i < 10; i++) {
					 x = randNum.nextInt(100);
					 myStack.push(x);
				}
				
				//Write code here to call apropriate method to swap smallest and largest elements of the stack
				
				
				
					System.out.println();
					System.out.println();
				
			}
			
			// Finding sum of even and odd elements of the stack
			else if (choice == 8) {
				
				//Storing random values in the stack
				int x;
				Random randNum = new Random();
				for (int i = 0; i < 10; i++) {
					 x = randNum.nextInt(100);
					 myStack.push(x);
				}
				
				//Write code here to call apropriate method to find sum of even and odd elements of the stack
				
				
				
				
					System.out.println();
					System.out.println();
				
			}

			// Quit
			else if (choice == 9) {
				System.out.println(">    Goodbye!");
				System.out.println();
			}
			
			// Wrong choice
			else {
				System.out.println(">    Wrong selection. Try again.");
				System.out.println();
			}
			
		} while (choice != 9);
	}
	
	public static void showMenu() {
		System.out.println("|-----------------------------------------------------|");
		System.out.println("|------------     Stack - Array (Menu)    ------------|");
		System.out.println("|-----------------------------------------------------|");
		System.out.println("|   1. Push an item into the stack                    |");
		System.out.println("|   2. Pop (and print) an item from the stack         |");
		System.out.println("|   3. Peek (look at) the top item in the stack       |");
		System.out.println("|   4. Search for an item in the stack                |");
		System.out.println("|   5. Print all nodes in the stack                   |");
		System.out.println("|   6. Change the elements of the stack               |");  
		System.out.println("|   7. Swap smallest and largest elements of the stack|");
		System.out.println("|   8. Find sum of even and odd elements of stack     |");
		System.out.println("|   9. Quit                                           |");
		System.out.println("|-----------------------------------------------------|");
		System.out.println();
		System.out.print("> Please enter your choice: ");
	}
	
}

