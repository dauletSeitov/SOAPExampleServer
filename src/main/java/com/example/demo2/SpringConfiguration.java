package com.example.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;


@Configuration
public class SpringConfiguration {

	@Bean
	public SimpleJaxWsServiceExporter jaxWsExporter() {
	SimpleJaxWsServiceExporter exporter =
	new SimpleJaxWsServiceExporter();
	exporter.setBaseAddress("http://localhost:8888/services/");
	return exporter;
	}
}
