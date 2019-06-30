package course;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @ManyToMany(mappedBy = "courses")
    private List<Student> students=new ArrayList<Student>();
    public Course(String title){
        this.title=title;
        this.students=students;
    }
    void setStudents(Student student){
     students.add(student);
    }


}
