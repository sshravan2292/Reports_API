package in.ashokit.binding;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name= "PLANS_DETAILS")
public class Plan {

	
	@Id
	@GeneratedValue
	private Integer planId;
	
	private String planName;
	private String planStatus;
	
	private Date planStartDate;
	private Date planEndDate; 
	
}
