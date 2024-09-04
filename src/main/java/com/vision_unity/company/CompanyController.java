package com.vision_unity.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

	@Autowired
	CompanyService service;
	
	@RequestMapping("/company-controller")
	public String workStatus() {
		return "Company Controller is Working :)";
	}
	
	//Company Table Operations
	
	@GetMapping("/company-all-details")
	public List<Company> getAllCompanyDetails(){
		return service.getAllCompanyDetails();
	}
	
	@GetMapping("/company-detail-id/{company_id}")
	public Company getCompanyDetailsById(@PathVariable int company_id) {
		return service.getCompanyDetailsById(company_id);
	}
	
	@GetMapping("/company-detail-name/{company_name}")
	public Company getCompanyDetailsByName(@PathVariable String company_name) {
		return service.getCompanyDetailsByName(company_name);
	}
	
	@PostMapping("/company-add-detail")
	public void addCompanyDetails(@RequestBody Company company) {
		service.addCompanyDetails(company);
	}
	
	
	//CompanyEmp Table Operations
	
	@GetMapping("/company-all-emp-details")
	public List<CompanyEmp> getAllEmpCompanyDetails(){
		return service.getAllEmpCompanyDetails();
	}
	
	@GetMapping("/company-emp-detail-id/{company_id}")
	public CompanyEmp getCompanyEmpDetailsById(@PathVariable int company_id) {
		return service.getCompanyEmpDetailsById(company_id);
	}
	
	@GetMapping("/company-emp-detail-name/{company_name}")
	public CompanyEmp getCompanyEmpDetailsByName(@PathVariable String company_name) {
		return service.getCompanyEmpDetailsByName(company_name);
	}
	
	@PostMapping("/company-emp-detail")
	public void addCompanyEmpDetails(@RequestBody CompanyEmp company_emp) {
		service.addCompanyEmpDetails(company_emp);
	}
	
	
	//CompanyContactPerson Table Operation
	
	
		@GetMapping("/company-cp-details")
		public List<CompanyContactPerson> getAllCompanyCPDetails(){
			return service.getAllCompanyCPDetails();
		}
		
		@GetMapping("/company-cp-detail-id/{company_id}")
		public CompanyContactPerson getCompanyCPDetailsById(@PathVariable int company_id) {
			return service.getCompanyCPDetailsById(company_id);
		}
		
		@GetMapping("/company-cp-detail-name/{company_name}")
		public CompanyContactPerson getCompanyCPDetailsByName(@PathVariable String company_name) {
			return service.getCompanyCPDetailsByName(company_name);
		}
		
		@PostMapping("/company-cp-detail")
		public void addCompanyCPDetails(@RequestBody CompanyContactPerson company_emp) {
			service.addCompanyCPDetails(company_emp);
		}
}
