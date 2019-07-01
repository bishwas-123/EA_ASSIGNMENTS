package inheritance.productType;

import inheritance.Product;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Inheritance(strategy = InheritanceType.JOINED)
public class DVD extends Product {
    private String genre;

    DVD(String genre){
        super();
        this.genre=genre;
    }
}
