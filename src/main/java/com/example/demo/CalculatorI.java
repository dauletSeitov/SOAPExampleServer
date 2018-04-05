package com.example.demo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
//@SOAPBinding(style = Style.RPC)
public interface CalculatorI {
	@WebMethod
	int add(int a, int b);

	@WebMethod
	int subtract(int a, int b);

	@WebMethod
	int multiply(int a, int b);

	@WebMethod
	int divide(int a, int b);
}