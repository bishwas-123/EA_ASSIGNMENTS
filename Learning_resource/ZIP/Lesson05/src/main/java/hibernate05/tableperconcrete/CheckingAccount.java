package hibernate05.tableperconcrete;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
//@Entity
public class CheckingAccount extends Account {
	private double overdraftLimit;

	public CheckingAccount(double balance, Double overdraftLimit) {
		super(balance);
		this.overdraftLimit = overdraftLimit;
	}
}
