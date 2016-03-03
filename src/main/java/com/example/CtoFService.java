package com.example;

import java.io.IOException;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.ibm.json.java.JSON;
import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;



// This class define the RESTful API to fetch the database service information
// <basepath>/api/ctof

@Path("/ctof/{value}")
public class CtoFService {

	@GET
	@Produces("application/json")
	public String getInformation(@PathParam("value") int value) throws Exception, IOException {
        JSONObject myJSONObj = new JSONObject();
        TempConverter myConverter=new TempConverter();
        int f= myConverter.CtoF(value);
        myJSONObj.put("result", f);
        return myJSONObj.toString();
	}

	
	//This is to test the pipeline
}