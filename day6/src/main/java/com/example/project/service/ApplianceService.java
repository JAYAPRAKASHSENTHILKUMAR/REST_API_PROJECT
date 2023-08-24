package com.example.project.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.project.model.ApplianceModel;
import com.example.project.repository.ApplianceRepo;
@Service
public class ApplianceService {
	@Autowired
	public ApplianceRepo arepo;
	//post
	public String saveHotel(ApplianceModel sc)
	{
		arepo.save(sc);
		return "Data is saved to database";
	}
	//get
	public List<ApplianceModel> getHotel()
	{
		return arepo.findAll();
	}
	//put
	public ApplianceModel updateHotel(ApplianceModel hm)
	{
		return arepo.saveAndFlush(hm);
	}
	
	
	public boolean deleteApplianceif(int CustomerId)
	{
		if(arepo.existsById(CustomerId))
		{
			arepo.deleteById(CustomerId);
			return true;
		}
		return false;
	}
	
	//delete the data
	
	public boolean deleteHotel(int customer_id)
	{
		System.out.println("Deleted the following customer id successfully");
		arepo.deleteById(customer_id);
		return false;
	}
	
	public Optional<ApplianceModel> getUserId(int userId) {
	    Optional<ApplianceModel> appliance = arepo.findById(userId);
	    if (appliance.isPresent()) {
	        return appliance;
	    } else {
	        return null; // or return null if necessary
	    }
	}
	public ApplianceModel updateAppliance(ApplianceModel ha) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean deleteAppliance(int hid) {
		return false;
		// TODO Auto-generated method stub
		
	}

}
