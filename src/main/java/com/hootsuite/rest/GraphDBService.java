package com.hootsuite.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hootsuite.model.Shop;
import com.hootsuite.transaction.TransactionBo;

@Component
@Path("/graphdb")
public class GraphDBService {

	@Autowired
	TransactionBo transactionBo;

	@GET
	@Path("/save")
	public Response save() {

		String result = transactionBo.save();

		return Response.status(200).entity(result).build();

	}
	
	@GET
	@Path("/saveas/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Shop saveas(@PathParam("id") String id){
		
		String result = transactionBo.saveas(id);

		Shop shop = new Shop();
		shop.setName(result);
		shop.setStaffName(new String[]{"ABC"});
		
		return shop;
	}
}