package com.amvijay.java.lambda; 

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * How Lambda implementation is handled in Java Compilation (bytecode).
 * @author - Vijayaraaghavan Manoharan (am.vijay@gmail.com)
 */
public class LambdaImplementation{

	public static void main(String[] args){
		
		List<String> inputList = new ArrayList<String>();
		inputList.add("test1");
		inputList.add("test2");
		inputList.add("test3");
		
		// This line will be converted into java.util.function.Consumer implementation as 
		// Consumer<String> element = elementValue -> System.out.println("Element Value" + element);
		inputList.forEach( element -> {System.out.println("Element Value" + element);});
		
		//Consumer<String> element = elementValue -> System.out.println("Element Value" + elementValue);
		//inputList.forEach( a-> element.accept(a));
		
		//for(String element: inputList){
		//	System.out.println("element value " + element);
		//}
		
	}
}