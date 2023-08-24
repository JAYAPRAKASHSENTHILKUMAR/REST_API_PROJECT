package com.example.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.ApplianceModel;
import com.example.project.service.ApplianceService;

@RestController
public class ApplianceController {
	@Autowired
	public ApplianceService aserv;
	
	@PostMapping("/postApplianceid")
	private String postHotel(@RequestBody ApplianceModel hr)
	{
		aserv.saveHotel(hr);
		return "appliance id of the customer data is saved";
	}
	
	@GetMapping("/getApplianceid")
	public List<ApplianceModel>getApplianceInfo()
	{
		return aserv.getHotel();
	}
	
	@PutMapping("/updateApplianceid")
	public ApplianceModel updateApplianceInfo(@RequestBody ApplianceModel ha)
	{
		return aserv .updateAppliance(ha);
	}
	@DeleteMapping("/deleteApplianceid/{id}")
	public String deleteAppliance(@PathVariable("id") int hid)
	{
		aserv.deleteAppliance(hid);
		return "The appliance id belong to the customer id "+hid+" is deleted";
	}
	
	//delete mapping using 
	
	

	@DeleteMapping("/byReqParm")
	public String removeByRequestParam(@RequestParam("id") int id)
	{
		aserv.deleteAppliance(id);
		return "Appliance with customer id "+id+" is deleted";
	}
	
	@DeleteMapping("/deleteAppliancdif/{id}")
	public ResponseEntity<String>deleteApplianceInfo(@PathVariable int id){
		boolean deleted = aserv.deleteAppliance(id);
		
		if(deleted) {
			return ResponseEntity.ok("Appliance with customer id  "+id+" is Deleted successfully");
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Appliance with customer id"+id+"is not found");
		}
	}
	
	//Delete Mapping using path variable
	
		@DeleteMapping("/DeleteAppliance/{id}")
		public String removeHotel(@PathVariable("id") int hid)
		{
			aserv.deleteAppliance(hid);
			return "Appliance with customer id "+hid+" is deleted";
		}
		
		//delete mapping using request
		

		@DeleteMapping("/deletedAppliance/{id}")
		public String deleteAppliance1(@PathVariable("id") int id)
		{
			aserv.deleteHotel(id);
			return "Appliance with customer id"+id+" is deleted";
		}
		//get user by id
				@GetMapping("/users/{userId}")
		public ResponseEntity<?>getUserById(@PathVariable int userId){
			Optional<ApplianceModel>appliance=aserv.getUserId(userId);
			
			if(appliance!=null) {
				return ResponseEntity.ok(appliance);
				
			}
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not available with this customerid");

			

		}
				
				
				
				

				
}
