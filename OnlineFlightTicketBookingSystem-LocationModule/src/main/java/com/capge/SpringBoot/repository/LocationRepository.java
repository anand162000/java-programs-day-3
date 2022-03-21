package com.capge.SpringBoot.repository;

import com.capge.SpringBoot.entity.Location;
import com.capge.SpringBoot.exceptions.LocationNotFoundException;

public interface LocationRepository {

	public static  Location save(Location add) {
		// TODO Auto-generated method stub
		return null;
	}

	Location addLocation(Location add);

	Location viewLocationBy(String id) throws LocationNotFoundException;

	Location updateLocation(Location add);
	public static Location findLOcationById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
