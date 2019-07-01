package hibernate05.singletable;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
//@Entity
//@DiscriminatorValue("savings")
public class SavingsAccount extends Account {
	private Double APY;

    public SavingsAccount(Long number, double balance, Double APY) {
        super(number, balance);
        this.APY = APY;
    }
}
