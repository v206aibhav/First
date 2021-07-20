package com.phoenix.rest.hello;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/profile")
public class ProfileService {
	
	@POST
	@Path("/add")
	@Produces("text/html")
	public Response addProfile(@FormParam("pname")String name,@FormParam("page")String age,@FormParam("city")String city)
	{
		return Response.status(200)
				.entity("<html><body><h1>User Profile has created <br>"+"<h3>Name : "+ name +"<br> Age : "+age +"<br>City : "+city+"</h3>"+ "</h1></body></html>")
				.build();
	}

}
