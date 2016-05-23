package com.hootsuite.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

}