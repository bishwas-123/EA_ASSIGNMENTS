package course;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int roll;
    @ManyToMany
    private List<Course> courses=new ArrayList<Course>();

    public Student(String name, int roll){
        this.name=name;
        this.roll=roll;
    }

    void setCourses(Course course){
        courses.add(course);
    }
}
