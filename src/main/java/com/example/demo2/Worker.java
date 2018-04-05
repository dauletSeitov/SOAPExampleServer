package com.example.demo2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;

@Component
@WebService(serviceName = "SpitterService")
public class Worker implements WeatherService{

	com.example.demo2.WeatherService sdf;
	
	@WebMethod
	@Override
	public List<String> getTemperatures(String city, List<Date> dates) {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		
		return list;
	}

}

interface WeatherService {

	public List<String> getTemperatures(String city, List<Date> dates);

}
