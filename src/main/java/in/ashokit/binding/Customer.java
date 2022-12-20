package in.ashokit.binding;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CUSTOMER_DETAILS")
public class Customer {
	
	@Id
	@GeneratedValue
	private Integer custId;
	
	private String custName;
	private String custMail;
	private String gender;
	
	private Long custMobNum;
	private Long custSSN;

}
