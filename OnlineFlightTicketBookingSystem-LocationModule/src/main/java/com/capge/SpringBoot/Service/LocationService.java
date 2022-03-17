package com.capge.SpringBoot.Service;

import com.capge.SpringBoot.dto.LocationDto;
import com.capge.SpringBoot.entity.Location;

public interface LocationService {

	Location addCustomer(LocationDto customer);

	Location modifyCustomer(LocationDto customer);

	Location removeCustomer(Location customer);

}
