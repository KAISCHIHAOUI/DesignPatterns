package com.designpatterns.pwdp.strategy;

public class SecondOperation implements Strategy {

@Override
public int doOperation(int x, int y) {
	
	return x-y;
}
}
