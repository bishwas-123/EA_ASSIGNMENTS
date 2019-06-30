package edu.mum.cs544;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Owner {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;

    public Owner(String name, String address){
        this.name=name;
        this.address=address;
    }
}
