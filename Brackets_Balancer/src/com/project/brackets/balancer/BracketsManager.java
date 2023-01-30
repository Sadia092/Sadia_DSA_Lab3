package com.project.brackets.balancer;
import java.util.LinkedHashSet;
import java.util.Set;

public class BracketsManager {


	private static Set<Bracket> predefinedBrackets;

	static {

	    predefinedBrackets = new LinkedHashSet<>();


	    predefinedBrackets.add(new Bracket('(', ')'));


	    predefinedBrackets.add(new Bracket('[', ']'));


	    predefinedBrackets.add(new Bracket('{', '}'));


	    predefinedBrackets.add(new Bracket('<', '>'));
	}

	public static Set<Character> getOpenBracketCharsSet(){

	    Set<Character> result = new LinkedHashSet<>();

	    for (Bracket bracket : predefinedBrackets) {

	        result.add(bracket.getOpenChar());
	    }
	    return result;
	}

	public static Set<Character> getCloseBracketCharsSet(){

	    Set<Character> result = new LinkedHashSet<>();

	    for (Bracket bracket : predefinedBrackets) {

	        result.add(bracket.getCloseChar());
	    }
	    return result;
	}

	public static Bracket getBracket(Character closeBracket) {

	    for (Bracket predefinedBracket : predefinedBrackets) {

	        if (predefinedBracket.getCloseChar().equals(closeBracket)) {
	            return predefinedBracket;
	        }
	    }
	    return null;
	}
}
