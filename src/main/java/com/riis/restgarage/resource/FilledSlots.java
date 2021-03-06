package com.riis.restgarage.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.riis.restgarage.service.GarageSlotsServiceImpl;

@Path("/rest-garage-sample/")
@Produces(MediaType.APPLICATION_JSON)
public class FilledSlots {
	GarageSlotsServiceImpl garageSlotServiceImpl = new GarageSlotsServiceImpl();

	@GET
	@Path("garage")
	public Response getFilledGarageSlots() {
		int filledGarageslots = garageSlotServiceImpl.findFilledGarageSlots();
		return Response.ok(filledGarageslots).build();
	}
}
