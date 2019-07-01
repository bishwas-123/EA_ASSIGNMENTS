package hibernate05.embeddable;

import javax.persistence.*;

//@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int id;
    private String firstname;
    private String lastname;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "ship_street")),
            @AttributeOverride(name = "city", column = @Column(name = "ship_city")),
            @AttributeOverride(name = "state", column = @Column(name = "ship_state")),
            @AttributeOverride(name = "zip", column = @Column(name = "ship_zip"))
    })
    private Address shipping;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "bill_street")),
            @AttributeOverride(name = "city", column = @Column(name = "bill_city")),
            @AttributeOverride(name = "state", column = @Column(name = "bill_state")),
            @AttributeOverride(name = "zip", column = @Column(name = "bill_zip"))
    })
    private Address billing;


    public Customer() {
    }

    public Customer(String firstname, String lastname, Address shipping, Address billing) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.shipping = shipping;
        this.billing = billing;
    }
}
