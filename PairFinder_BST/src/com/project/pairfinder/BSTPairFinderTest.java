package com.project.pairfinder;

import com.project.bst.BinarySearchTree;
import com.project.bst.TestDataUtils;

import internal.Log;
public class BSTPairFinderTest {

	public static void main(String[] args) {

		test(120);
		test(60);
		test(190);
		test(500);   //check for invalid data
	}

	private static void test(int sum) {




		BinarySearchTree tree = TestDataUtils.sampleBST1();

		// if Log true then all logs are shown if false just result  are displayed.

		Log.ENABLE = true;

		BSTPairFinder finder = new BSTPairFinder(tree);

		finder.findPair(sum);

		System.out.println("-----------------------");

		Log.ENABLE = false;

	}

}
