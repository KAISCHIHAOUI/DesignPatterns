package com.designpatterns.pwdp.strategy;

public class FirstOpertion implements Strategy {
	@Override
	public int doOperation(int x, int y) {
		
		return x+y;
	}
}
