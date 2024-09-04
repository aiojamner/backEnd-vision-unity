package com.vision_unity.company;

import java.util.Objects;

import org.springframework.context.annotation.Primary;

public record Company(@Primary int company_id, String company_name, String company_type, String company_location, int company_capacity, long company_contact) {

	@Override
	public int hashCode() {
		return Objects.hash(company_capacity, company_contact, company_id, company_location, company_name,
				company_type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return company_capacity == other.company_capacity && company_contact == other.company_contact
				&& company_id == other.company_id && Objects.equals(company_location, other.company_location)
				&& Objects.equals(company_name, other.company_name) && Objects.equals(company_type, other.company_type);
	}

	
	
}
