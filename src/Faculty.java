import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Faculty {
  //        - Faculty sınıfı içerisinde(id, name, createdDate, address, dean, (fakülte altında bulunan departmanlar => bu ilişki nasıl kurulmalı)) bilgileri olmalıdır.
    private Long id;
    private String name;
    private LocalDateTime createdDate;
    private String address;
    private String dean;

    // Many to One
    // Composition -> // 7-8
    private University university;

    // One Faculty can have multiple departments
    private Set<Deparment> deparments = new HashSet<>();

    public Faculty(Long id, String name, University university){
        this.id = id;
        this.name = name;
        this.university = university;
        //this.university.addFaculty(this);
        this.createdDate = LocalDateTime.now();
    }

    public Faculty(Long id, String name, University university, String address, String dean, LocalDateTime createdDate){
        this(id, name, university);
        this.address = address;
        this.dean = dean;
        this.createdDate = createdDate;
    }

    public University getUniversity(){

        return this.university;
    }

    @Override
    public String toString(){

        return "Faculty : " + name;
    }
}
