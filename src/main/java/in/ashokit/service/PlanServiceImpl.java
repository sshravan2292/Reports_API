package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Customer;
import in.ashokit.repo.PlanRepository;

@Service
public class PlanServiceImpl implements PlanService {
	
	
	@Autowired
	private PlanRepository repo;

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomersByPlan() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomersByStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomerByPlanStartDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomerByPlanEndDate() {
		// TODO Auto-generated method stub
		return null;
	}

}
