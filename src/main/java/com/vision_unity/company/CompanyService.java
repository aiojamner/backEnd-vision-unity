package com.vision_unity.company;

import java.util.List;

public interface CompanyService {

	List<Company> getAllCompanyDetails();

	Company getCompanyDetailsById(int company_id);

	void addCompanyDetails(Company company);

	Company getCompanyDetailsByName(String company_name);

	List<CompanyEmp> getAllEmpCompanyDetails();

	CompanyEmp getCompanyEmpDetailsById(int company_id);

	CompanyEmp getCompanyEmpDetailsByName(String company_name);

	void addCompanyEmpDetails(CompanyEmp company_emp);

	List<CompanyContactPerson> getAllCompanyCPDetails();

	CompanyContactPerson getCompanyCPDetailsById(int company_id);

	CompanyContactPerson getCompanyCPDetailsByName(String company_name);

	void addCompanyCPDetails(CompanyContactPerson company_emp);

	

}
