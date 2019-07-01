package hibernate05.singletable;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
//@Entity
//@DiscriminatorValue("checking")
public class CheckingAccount extends Account {
	private Double overdraftLimit;

	public CheckingAccount(Long number, double balance, Double overdraftLimit) {
		super(number, balance);
		this.overdraftLimit = overdraftLimit;
	}
}
