package hibernate05.secondarytable;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;

@Data
@NoArgsConstructor
//@Entity
//@SecondaryTables(
//		@SecondaryTable(name="Warehouse", pkJoinColumns= {
//				@PrimaryKeyJoinColumn(name="product_id", referencedColumnName="number")
//		})
//)
//@SecondaryTable(name = "Warehouse")
public class Product {
	@Id
	@GeneratedValue
	private Long number;
	private String name;
	private double price;
	@Column(table="warehouse")
	private boolean available;

	public Product(String name, double price, boolean available) {
		this.name = name;
		this.price = price;
		this.available = available;
	}
}
