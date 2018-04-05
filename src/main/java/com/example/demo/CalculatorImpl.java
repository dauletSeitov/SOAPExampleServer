package com.example.demo;

import javax.jws.WebService;

import org.springframework.stereotype.Component;
@Component
@WebService(serviceName = "CalculatorService", endpointInterface = "com.example.demo.CalculatorI")
public class CalculatorImpl implements CalculatorI {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	@Override
	public int divide(int a, int b) {
		return a / b;
	}

}