package com.capge.SpringBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capge.SpringBoot.entity.Location;
import com.capge.SpringBoot.exceptions.LocationNotFoundException;
import com.capge.SpringBoot.entity.Location;
import com.capge.SpringBoot.repository.LocationRepository;

@Service
@Transactional
public class LocationServiceImplementation implements LocationRepository
{
	@Autowired
	private LocationRepository locationRepository;
	
	//Add Location
	@Override
	public Location addLocation(Location add) {
		
		return LocationRepository.save(add);
		
	}
	//Modify Location
		@Override
		public Location updateLocation(Location add) {
			LocationRepository.save(add);
			return add;
		}
		
		//Delete Location
		@Override
		public Location viewLocationBy(String id) throws LocationNotFoundException {
			Location add=LocationRepository.findLOcationById(id);
	            if(add==null)
	            	throw new LocationNotFoundException("Location Not Found ");
	        return add;
		}
		public Location save(Location add) {
			// TODO Auto-generated method stub
			return null;
		}
}
