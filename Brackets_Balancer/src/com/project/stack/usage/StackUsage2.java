package com.project.stack.usage;

import  java.util.Random;
import java.util.Stack;
public class StackUsage2 {

public static void main(String[] args) {

		Stack<Integer> numbers = new Stack<>();
		Random random = new Random();

		int noOfElements = 3;


		for (int index = 1; index <= noOfElements; index ++) {

			int element = random.nextInt(100);

			numbers.push(element);
			System.out.println("Element pushed to the stack is " + element);
		}

		for (int index = 1; index <= noOfElements; index ++) {

			int element = numbers.pop();

			System.out.println("Element popped from the stack is " + element);
		}

		boolean stackEmpty = numbers.isEmpty();
		System.out.println("Is Stack Empty ? " + stackEmpty);
	}

}
