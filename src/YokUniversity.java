import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

// Concrete class
public class YokUniversity {
    // Fields/Instance variable
    private Long id;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;

    // List, Set, Map
    // One university has many faculties
    private List<Faculty> faculties = new ArrayList<>();

    // University university = new University("Istanbul Aydin University");
    public YokUniversity(Long id, String name){
        //this.name = name;
        //this.id = id;
        this.setId(id);
        this.setName(name);
        //this.faculties = new ArrayList<>();
    }

     // const enisObj = {};

    public YokUniversity(Long id, String name, String email, String phoneNumber, String address){
        this(id, name);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Encapsulation
    public Long getId(){

        return id;
    }

    public String getName(){

        return this.name; // name
    }

    public String getAddress(){

        return address;
    }

    public String getEmail(){

        return email;
    }

    public String getPhoneNumber(){

        return phoneNumber;
    }

    public List<Faculty> getFaculties(){

        return Collections.unmodifiableList(this.faculties); // read-only
        //return this.faculties;
    }

    // University university = new University();
    // university.name = null;

    private void setId(Long id){

        if(id < 0 )
            throw new IllegalArgumentException("Id 0'dan kucuk olamaz!");

        this.id = id;
    }

    public void setName(String name){

        if(name == null)
            throw new IllegalArgumentException("Name parametresi null olamaz");

        this.name = name;
    }

    public void setEmail(String email) throws FileNotFoundException {

        if(true)
            throw new FileNotFoundException("Test");

        this.email = email;
    }

    public void setAddress(String address){

        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber){

        this.phoneNumber = phoneNumber;
    }

    public void addFaculty(Faculty faculty){

        if(faculty == null)
            throw new IllegalArgumentException("Faculty null olama!");

        if(!faculties.contains(faculty) && faculty.getUniversity().equals(this))
            this.faculties.add(faculty);
    }

    public void removeFaculty(Faculty faculty){

        this.faculties.remove(faculty);
    }

    // Object-> Atamiz, Upcast
    @Override
    public boolean equals(Object obj){ // Polymorphism

        // University university = new University();
        // university.equals(university);
        if(this == obj) // this-> benim referansim,
            return true;

        // obj == null, university.equals(null);,
        // Faculty faculty = new Faculty();
        // university.equals(faculty);
        if(obj == null || obj.getClass() != this.getClass())
            return false;

        YokUniversity university = (YokUniversity) obj; // Downcast

        return university.id.equals(id);
    }
    // equals
    // hashCode
    @Override
    public int hashCode(){

        return Objects.hash(id);
    }
    // toString
    @Override
    public String toString(){

        return "University : " + name;
    }
}
