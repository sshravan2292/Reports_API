package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.Customer;

public interface PlanService {

	
	
	public List<Customer> getAllCustomers();
	public List<Customer> getCustomersByPlan();
	public List<Customer> getCustomersByStatus();
	public List<Customer> getCustomerByPlanStartDate();
	public List<Customer> getCustomerByPlanEndDate();
}
