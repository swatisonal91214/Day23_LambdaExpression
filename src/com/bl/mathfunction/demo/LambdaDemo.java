package com.bl.mathfunction.demo;

public class LambdaDemo {
	
	public static void main(String[] args) {
		//Functional Interface helps in creating Lambda Expression
		IMathFunction add = (x,y) -> x+y;
		//System.out.println(add.calculate(5, 6));
		
		IMathFunction multiply = (x, y) -> x*y;
		//System.out.println(multiply.calculate(5,6));
		
		IMathFunction division = (x, y) -> x/y;
		//System.out.println(division.calculate(50, 10));
		
		IMathFunction diffmultipleline =(x,y)-> { // This is using a block to define Lambda expression
			return x-y;                       //If multiple lines are there	
		};										//return is compulsory, ";" is compulsory, parameters pass in start only
		//System.out.println(diffmultipleline.calculate(15, 5));
		
		IMathFunction.printResult(10, 5, "Addition", add);
		IMathFunction.printResult(5, 6, "Multiply", multiply);
		IMathFunction.printResult(100, 5, "Division", division);
		IMathFunction.printResult(60, 18, "Substraction", diffmultipleline);
	}
	
}
