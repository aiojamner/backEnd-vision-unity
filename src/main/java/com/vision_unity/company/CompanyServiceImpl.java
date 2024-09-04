package com.vision_unity.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService{

	
	//Company Table Operations
	
	
	List<Company> companies = new ArrayList<>(Arrays.asList(
							  new Company(101, "SBI BANK", "Bank", "Jalgaon", 11, 324753),
							  new Company(102, "ICICI Bank", "Bank", "Jalgaon", 10, 54374)));

	@Override
	public List<Company> getAllCompanyDetails() {

		return companies;
	}

	@Override
	public Company getCompanyDetailsById(int company_id) {
		return companies.stream()
				.filter(c -> c.company_id() == company_id)
				.findFirst().orElse(new Company(0, "No Company Found", "No Type", "", 0, 0));
	}

	@Override
	public void addCompanyDetails(Company company) {
		companies.add(company);
	}

	@Override
	public Company getCompanyDetailsByName(String company_name) {
		return companies.stream()
				.filter(c -> c.company_name().equals(company_name))
				.findFirst().orElse(new Company(0, "No Company Found", "No Type", "", 0, 0));
	}
	
	
	//CompanyEmp Table Operations
	
	List<CompanyEmp> companiesEmp = new ArrayList<>(Arrays.asList(
					new CompanyEmp(101 , new String[] {"B.com", "B.A.", "B.Pharm"}, 21, 11, "Intership"),
					new CompanyEmp(102 , new String[] {"B.com", "M.com"}, 10, 20, "Full Time")));

	@Override
	public List<CompanyEmp> getAllEmpCompanyDetails() {

		return companiesEmp;
	}

	@Override
	public CompanyEmp getCompanyEmpDetailsById(int company_id) {
		return companiesEmp.stream()
				.filter(c -> c.company_id() == company_id)
				.findFirst().orElse(new CompanyEmp(0, new String[] {"No Company Found"}, 0, 0, ""));
	}

	@Override
	public CompanyEmp getCompanyEmpDetailsByName(String company_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCompanyEmpDetails(CompanyEmp company_emp) {
		companiesEmp.add(company_emp);
	}

	
	//CompanyContactPerson Table Operations
	
	List<CompanyContactPerson> companiesCP = new ArrayList<>(Arrays.asList(
			new CompanyContactPerson(101, "Rahul Naik", 76846, "Worker", "Jalgaon"),
			new CompanyContactPerson(102, "Pavan Chavhan", 49766, "Process Engineer", "Pune")));
	
	
	@Override
	public List<CompanyContactPerson> getAllCompanyCPDetails() {
		return companiesCP;
	}

	@Override
	public CompanyContactPerson getCompanyCPDetailsById(int company_id) {
		return companiesCP.stream()
				.filter(c -> c.company_id() == company_id)
				.findFirst().orElse(new CompanyContactPerson(0, "No Company Found", 0, "", ""));
	}

	@Override
	public CompanyContactPerson getCompanyCPDetailsByName(String person_name) {
		return companiesCP.stream()
				.filter(c -> c.person_name().equals(person_name))
				.findFirst().orElse(new CompanyContactPerson(0, "No Company Found", 0, "", ""));
	}

	@Override
	public void addCompanyCPDetails(CompanyContactPerson company_CP) {
		companiesCP.add(company_CP);
	}
	
	
}
