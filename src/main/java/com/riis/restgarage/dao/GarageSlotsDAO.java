package com.riis.restgarage.dao;

import java.util.HashMap;
import java.util.Map;

public class GarageSlotsDAO {
	Map<Integer, String> slots = new HashMap<>(150);
	

	public int filledGarageSlots() {
		
		int filledGarageslots = slots.size();
		System.out.println("The size of Map"+filledGarageslots);
		return filledGarageslots;
	}

}
