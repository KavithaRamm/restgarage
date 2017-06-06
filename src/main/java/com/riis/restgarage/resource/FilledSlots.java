package com.riis.restgarage.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.riis.restgarage.service.GarageSlotService;

@Path("/garage")
@Produces(MediaType.APPLICATION_JSON)
public class FilledSlots {
	GarageSlotService garageSlotService;

	@GET
	@Path("/")
	public Response getFilledGarageSlots() {
		int filledGarageslots = garageSlotService.findFilledGarageSlots();
		return Response.ok(filledGarageslots).build();
	}
}
