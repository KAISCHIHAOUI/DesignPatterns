package com.designpatterns.pwdp.strategy;

public class StrategyPatternRun {

	public static void main(String[] args) {
	
		
		Context first = new Context(new FirstOpertion());
		Context second = new Context(new SecondOperation());
		
		System.out.println("result  : "+ first.runStrategy(2, 5));
		System.out.println("result :  "+second.runStrategy(12, 8));
	}

}
