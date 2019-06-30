package publisher;

import publisher.Publisher;

import javax.persistence.*;
//@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @ManyToOne(optional = false)
    @JoinColumn(name="publisher_id")
    private Publisher publisher;

    public Book(String name, Publisher publisher){
        this.name=name;
        this.publisher=publisher;
    }


}
