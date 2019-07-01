package hibernate05.embeddable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity
public class Person {
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	@Embedded
	private Address address;

	public Person() {
	}

	public Person(String firstName, String lastName, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
}
