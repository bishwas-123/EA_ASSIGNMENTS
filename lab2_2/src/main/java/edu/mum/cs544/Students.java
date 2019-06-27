package edu.mum.cs544;

import java.sql.*;
import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity(name = "edu.mum.cs544.Students")
@Table(name = "students")
public class Students {

  @Id
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"name\"", nullable = true)
  private String name;
  @Column(name = "\"email\"", nullable = true)
  private String email;
  @Column(name = "\"password\"", nullable = true)
  private String password;

  Students(int id,String name, String email, String password){
    this.id=id;
    this.name=name;
    this.email=email;
    this.password=password;
  }
}