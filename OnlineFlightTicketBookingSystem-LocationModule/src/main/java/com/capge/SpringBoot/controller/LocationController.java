package com.capge.SpringBoot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capge.SpringBoot.dto.LocationDto;
import com.capge.SpringBoot.entity.Location;
import com.capge.SpringBoot.Service.LocationService;


@RequestMapping("/LocationController")
@RestController


public class LocationController {
	@Autowired
	private LocationService locationservice;
	
	//Add user method
	@PostMapping("/addLocation")
	public ResponseEntity<Location> addCustomer(@RequestBody LocationDto customer)
	{
		Location custImpl=locationservice.addCustomer(customer);
		return new ResponseEntity(custImpl,HttpStatus.OK);
	}
	
	//Modify user method
	@PostMapping("/modifyLocation")
	public ResponseEntity<Location> modifyCustomer(@RequestBody LocationDto customer)
	{
		Location custImpl=locationservice.modifyCustomer(customer);
		return new ResponseEntity(custImpl,HttpStatus.OK);
	}
	
	//Deleting an user
	@DeleteMapping("/deleteLocation") 
	public ResponseEntity<Location> removeCustomer(@RequestBody Location customer)
	{
       Location custImpl=locationservice.removeCustomer(customer);
       return new ResponseEntity(custImpl,HttpStatus.OK); 
    }
	
}


