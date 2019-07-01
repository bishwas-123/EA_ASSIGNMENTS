package hibernate05.tableperconcrete;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
//@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public abstract class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long number;
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }
}
