package com.phoenix.rest.hello;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/helloparam")
public class HelloServicePathParam {
	
	@GET
	@Path("/{nm}")
	@Produces("text/plain")
	public String greetUser(@PathParam("nm")String name)
	{
		return "Hello : " + name;
	}
	
	@GET
	@Path("/user/{nm}")
	@Produces("text/html")
	public Response greetUserWithRespomse(@PathParam("nm")String name)
	{
		return Response.status(200).entity("<html><body><h1>Hello user "+ name + "</h1></body></html>").build();
	}
	
	@GET
	@Path("/date/{dd}/{mm}/{yy}")
	@Produces("text/html")
	public Response getDate(@PathParam("dd")int date,@PathParam("mm")int month,@PathParam("yy")int year)
	{
		return Response.status(200).entity("<html><body><h1>Date :"+date+"/"+month+"/"+year+ "</h1></body></html>").build();
	}



}
