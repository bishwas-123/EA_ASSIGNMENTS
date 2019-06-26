import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
@AllArgsConstructor
@ToString
@Entity
public class Book {
    @Id
    @GeneratedValue
    private Integer id;

    private String title;
    private String ISBN;
    private String author;
    private double price;
    private java.util.Date publish_date;
    public Book(String title,String ISBN, String author, double price,java.util.Date publish_date){
        this.title=title;
        this.ISBN=ISBN;
        this.author=author;
        this.price=price;
        this.publish_date=publish_date;
    }

}
