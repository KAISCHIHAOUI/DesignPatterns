package com.designpatterns.pwdp.strategy;

public class Context {

	private Strategy straregy;

	public Context(Strategy strategy) {
		this.straregy = strategy;
	}

	public int runStrategy(int a, int b) {
		return straregy.doOperation(a, b);
	}

}
