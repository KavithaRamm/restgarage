package com.riis.restgarage.dao;

import java.util.HashMap;
import java.util.Map;

public class GarageSlotsDAO {
	Map<Integer, String> slots = new HashMap<>();

	public int filledGarageSlots() {
		int filledGarageslots = slots.size();
		return filledGarageslots;
	}

}
