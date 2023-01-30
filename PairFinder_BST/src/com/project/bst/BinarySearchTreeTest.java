package com.project.bst;
import internal.Log;
public class BinarySearchTreeTest {

	public static void main(String[] args) {

		constructTreeWithLog1();
	//  constructTestWithoutLog2();

	}

	static void constructTreeWithLog1(){

		Log.ENABLE = true;


		@SuppressWarnings("unused")
		BinarySearchTree sampleTree1 = TestDataUtils.sampleBST1();

		Log.ENABLE = false;
	}

	static void constructTestWithoutLog2(){

		Log.ENABLE = false;


		@SuppressWarnings("unused")
		BinarySearchTree sampleTree1 = TestDataUtils.sampleBST1();
	}

}
