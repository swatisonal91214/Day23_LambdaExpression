package com.bl.mathfunction.demo;

@FunctionalInterface
public interface IMathFunction {
	 int calculate(int a, int b);
	 public static void printResult(int a, int b,String function,IMathFunction fObj) {  //we have taken fObj as object of functional interface IMathFunction
		System.out.println("Result of " + function + " :is " +fObj.calculate(a, b) ); 
	 }
}
