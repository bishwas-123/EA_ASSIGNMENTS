package inheritance.productType;

import inheritance.Product;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Inheritance(strategy = InheritanceType.JOINED)
public class CD extends Product {
    private String artist;

    CD(String artist){
        super();
        this.artist=artist;
    }
}
