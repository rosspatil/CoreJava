package com.socket;

public class PlainMathService implements MathService{

	@Override
	public double add(double firstValue, double secondValue) {
		return firstValue+secondValue;
	}

	@Override
	public double sub(double firstValue, double secondValue) {
		return firstValue-secondValue;
	}

	@Override
	public double div(double firstValue, double secondValue) {
		return firstValue/secondValue;
	}

	@Override
	public double mul(double firstValue, double secondValue) {
		return firstValue*secondValue;
	}

}
