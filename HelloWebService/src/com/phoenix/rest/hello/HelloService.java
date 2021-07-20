package com.phoenix.rest.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello()
	{
		return "Hello world plain";
	}
	
	@GET
	@Path("/html")
	@Produces("text/html")
	public String sayHtmlHello()
	{
		return "<html><body><h2>Hello World HTML"+
			   "</h2></body></html>";
	}
	
	@GET
	@Path("/xml")
	@Produces(MediaType.APPLICATION_XML)
	public String sayXmlHello()
	{
		return "<?xml version=\"1.0\"?>" +
			   "<myhello>Hello World XML" + "</myhello>";
	}

}
