package hibernate05.tableperconcrete;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
//@Entity
public class SavingsAccount extends Account {
	private Double APY;

    public SavingsAccount(double balance, Double APY) {
        super(balance);
        this.APY = APY;
    }
}
