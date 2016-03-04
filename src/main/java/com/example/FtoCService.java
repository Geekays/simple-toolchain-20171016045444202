package com.example;

import java.io.IOException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.ibm.json.java.JSONObject;



// This class define the RESTful API to fetch the database service information
// <basepath>/api/ctof

@Path("/ftoc/{value}")
public class FtoCService {

	@GET
	@Produces("application/json")
	public String getInformation(@PathParam("value") int value) throws Exception, IOException {
        JSONObject myJSONObj = new JSONObject();
        TempConverter myConverter=new TempConverter();
        int result= myConverter.FtoC(value);
        myJSONObj.put("result", result);
        return myJSONObj.toString();
	}

}