package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.EmployeeEntity;
import in.ashokit.repository.EmployeeRepo;

@Service
public class EmployeeService 
{
	private EmployeeRepo emprepo;
	
	@Autowired
	public EmployeeService(EmployeeRepo emprepo)
	{
		
		this.emprepo = emprepo;
	}
	
	public void saveData()
	{
		EmployeeEntity ee=new EmployeeEntity();
		ee.setEid(104);
		ee.setEname("Sujith");
		ee.setEsal(23400.00);
		emprepo.save(ee);
	}
	
	
	
}
