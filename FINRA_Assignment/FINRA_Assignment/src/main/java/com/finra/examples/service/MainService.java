package com.finra.examples.service;

import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*
 * 
 * @author yli
 *
 */

@Path("/")
@RestController 
public class MainService {
	public static String DataArray[] = {"", "", "ABC", "DEF", "GHI", "JKL","MNO", "PQRS", "TUV", "WXYZ"};
	
	public static List<Object> list = new ArrayList<Object>();	
		
	public static int id = 0;
	//recursion to print all possible 
	public static void Recursion(char[] string, int current_length, char output[], int string_length)
	{
	    int i;
	    
	    PhoneNumber pn = new PhoneNumber(0, null);

	    if (current_length == string_length)
	    {
	       	String str = String.valueOf(output);
	    	id ++;

	    	pn.setId(id);
	    	pn.setNumber(str);
	    	list.add(pn);
	    	
	    	return;
	    }
	    
	    //loop for all characters according to given digits
	    int num = Character.getNumericValue(string[current_length]);
   
	    if (num == 0 || num == 1){
	    	output[current_length] = string[current_length];
	    	Recursion(string, current_length+1, output, string_length);
	    } 
	    
	    String index = DataArray[num];	    
	    
	    for (i=0; i<index.length(); i++)
	    {	    	
	        output[current_length] = index.charAt(i);
	        Recursion(string, current_length+1, output, string_length);
	        //If 0 or 1 comes return from there
	        if(string[current_length] == 0 || string[current_length] == 1)
	        {
	            return;
	        }
	    }
	    return;
	}
	
    @RequestMapping(value = "/PrintStrings",
            method = RequestMethod.GET,
            produces = { MediaType.APPLICATION_JSON,
                    MediaType.APPLICATION_JSON})
    @ResponseBody
    public List<Object> PrintStrings(String phoneNumber) {
       	int length = phoneNumber.length();	   
	    char[] output = new char[length];
	    char[] number = phoneNumber.toCharArray();
	    id = 0;
	    list.clear();

	    Recursion(number, 0, output, length);

    	return list;
	}
	
}	
