package a_Introductory;

import static org.junit.Assert.*;

import org.junit.Test;

import a_Introductory.Fibonacci;
/*
* Fibonacci
As the first mini-exercise, we take a look at the Fibonacci class. This class is an attempt at implementing the recursive method fib, which should generate the nth Fibonacci Number.
Notice that in FibonacciTest.java, there is a
* testFib method corresponding to the fib method in the Fibonacci class.
* If you ever wish to create test classes, Eclipse has a wizard which will create these corresponding test methods for you.
In the test class we assert that the first 7 Fibonacci numbers must be equal to 0,1,1,2,3,5,8,13
* by writing the expected value and calling the fib method to generate the number.
* If the fib fails at generating the right number, it will throw an AssertionError with a message showing which number it failed to generate, and the JUnit framework will show the infamous red bar of a failed test.
To read about Fibonacci numbers see http://en.wikipedia.org/wiki/Fibonaccinumber
Running the Test Cases
When you run a test class, JUnit will run each method annotated with
* @Test separately and show a green bar if all of them pass, and a red bar if any of them fail.
* It is important that anything happening in a test method is independent from the other test methods, otherwise you risk getting weird results. But in the case of Fibonacci, we have only one test method.
Do the following:
1. To run the test, select the FibonacciTest.java in the project explorer and choose Run -> Run As -> JUnit Test. Notice the new JUnit window appears and shows a red bar indicating that the test failed. Below the listing of the running test cases you can see a stack of all failed test cases and their messages.
2. Now, find the bug in Fibonacci.java, correct it and run the test again. Note with satisfaction the green bar

* */

public class FibonacciTest {

	@Test
	public void testFib() {
		Fibonacci tester = new Fibonacci();
		assertEquals("0", 0, tester.fib(0));
		assertEquals("1", 1, tester.fib(1));
		assertEquals("2", 1, tester.fib(2));
		assertEquals("3", 2, tester.fib(3));a
		assertEquals("4", 3, tester.fib(4));
		assertEquals("5", 5, tester.fib(5));
		assertEquals("6", 8, tester.fib(6));
		assertEquals("7", 13, tester.fib(7));
	}

}
