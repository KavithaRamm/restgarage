package com.riis.restgarage.service;

import com.riis.restgarage.dao.GarageSlotsDAO;

public class GarageSlotsServiceImpl implements GarageSlotService {
	GarageSlotsDAO garageSlotsDAO = new GarageSlotsDAO();

	@Override
	public int findFilledGarageSlots() {
		int filledGarageslots = garageSlotsDAO.filledGarageSlots();
		return filledGarageslots;
	}

}
