package com.javajson.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javajson.model.Employee;

/**
 * @author Vinod.nagulkar
 *
 */
public class JavaToJson 
{
	public static void main(String[] args) {
		Employee employee=new Employee(1, "Vinod", "SSE");
		
		ObjectMapper mapper=new ObjectMapper();
	try {
		String jsonString=mapper.writeValueAsString(employee);
		System.out.println(jsonString);
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
