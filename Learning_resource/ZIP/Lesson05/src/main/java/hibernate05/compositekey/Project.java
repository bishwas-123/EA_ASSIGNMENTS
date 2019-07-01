package hibernate05.compositekey;

import javax.persistence.*;

@Entity
public class Project {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@ManyToOne
	@JoinColumns({ 
		@JoinColumn(name = "Emp_firstname", referencedColumnName = "firstname"),
		@JoinColumn(name = "Emp_lastname", referencedColumnName = "lastname") 
	})
	private Employee owner;
}
