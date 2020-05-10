package com.javajson;

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
		
		/*-----------------JAVA TO JSON---------------------------*/	
		Employee employee=new Employee(1, "Vinod", "SSE");
		
		ObjectMapper mapper=new ObjectMapper();
	try {
		String jsonString=mapper.writeValueAsString(employee);
		System.out.println(jsonString);
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		/*-------------------------------------------------------------*/
		/*-----------------JSON TO JAVA---------------------------------*/
	String jsonstr="{\r\n" + 
			"        \"empId\": 11,\r\n" + 
			"        \"empName\": \"Vinod\",\r\n" + 
			"        \"designation\": \"SSE\"\r\n" + 
			"    }";
	
	ObjectMapper mapper2=new ObjectMapper();
	try {
		Employee employee2=mapper2.readValue(jsonstr, Employee.class);
		System.out.println("EmpID:"+employee2.getEmpId()+"\tEmpName:"+employee2.getEmpName()+"\tDesignation:"+employee2.getDesignation());
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	/*-------------------------------------------------------------*/
	
}
