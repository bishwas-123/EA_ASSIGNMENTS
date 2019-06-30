package edu.mum.cs544;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@ToString
@Entity
public class Car {
	@Id
	@GeneratedValue
	private long id;
	private String brand;
	private Date year;
	private double price;
	@ManyToOne(cascade=CascadeType.PERSIST)
    private Owner owner;

	public Car() {
	}
	public Car(String brand, Date year, double price,Owner owner) {
		this.brand = brand;
		this.year = year;
		this.price = price;
		this.owner=owner;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public Date getYear() {
		return year;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

}
