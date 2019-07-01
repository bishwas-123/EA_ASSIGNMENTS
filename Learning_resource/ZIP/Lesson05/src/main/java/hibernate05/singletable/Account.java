package hibernate05.singletable;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Data
@NoArgsConstructor
//@Entity
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="account_type",
//        discriminatorType=DiscriminatorType.STRING)
public abstract class Account {
    @Id
    @GeneratedValue
    private Integer id;
    private Long number;
    private double balance;

    public Account(Long number, double balance) {
        this.number = number;
        this.balance = balance;
    }
}
