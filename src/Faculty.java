import java.time.LocalDateTime;
import java.util.*;

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

    // List, Set veya Map
    // One Faculty can have multiple departments
    private SortedSet<Department> deparments = new TreeSet<>(new SortDepartmentsByIdAsc());

    public Faculty(Long id, String name, University university){
        this.setId(id);
        //this.id = id;
        // this.id = Objects.requireNonNull(id);
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

    public Long getId(){

        return this.id;
    }

    //Faculty faculty = new Faculty();
    // faculty.getName();
    public String getName(){

        return this.name;
    }

    public String getAddress(){

        return this.address;
    }

    public String getDean(){

        return this.dean;
    }

    public University getUniversity(){

        return this.university;
    }

    // View
    public SortedSet<Department> getDepartments(){

        return Collections.unmodifiableSortedSet(this.deparments);
    }

    // Snapshot
    public Set<Department> getDepartmentsSnapshot(){

        return Set.copyOf(this.deparments);
    }

    // Snapshot
    public Set<Department> getDepartmentsSnapshotView(){

        return Collections.unmodifiableSet(new HashSet<>(this.deparments));
    }


    public SortedSet<Department> getDepartmentsSortedViaId(){

        SortedSet<Department> sortedViaId = new TreeSet<>(new SortDepartmentsByIdAsc()); // Ascending
        sortedViaId.addAll(this.deparments);

        return Collections.unmodifiableSortedSet(sortedViaId);
    }

    public SortedSet<Department> getDepartmentsSortedViaHead(){

        SortedSet<Department> sortedViaId = new TreeSet<>(new SortDepartmentsByHead());
        sortedViaId.addAll(this.deparments);

        return Collections.unmodifiableSortedSet(sortedViaId);
    }
    /*
    public Set<Department> getDepartments(){

        return Collections.unmodifiableSet(this.deparments); // read-only
    }
    */
    private void setId(Long id){

        // not null
        //Objects.requireNonNull(id);
        ValidationUtil.requireNonNull(id, "Fakulte id null olamaz");

        this.id = id;
    }

    public void setName(String name){

        ValidationUtil.requireNonNull(name, "Fakulte ismi null olamaz!");
        ValidationUtil.requireNonEmpty(name, "Fakulte ismi bos olamaz!");

        this.name = name;
    }

    public void setAddress(String address){

        this.address = address;
    }

    public void setDean(String dean){

        this.dean = dean;
    }


    // Polymorphism
    public void addDepartment(Department deparment){


        this.deparments.add(deparment);
    }

    public void removeDepartment(Department deparment){

        this.deparments.remove(deparment);
    }

    @Override
    public boolean equals(Object object){

        // faculty.equals(faculty);
        if(this == object)
            return true;

        // faculty.equals(null);
        // faculty.equals(university);
        if(object == null || object.getClass() != getClass())
            return false;

        Faculty faculty = (Faculty) object;

        // faculty.equals(faculty1);
        return faculty.id.equals(id);
    }

    @Override
    public int hashCode(){

        return Objects.hash(id);
    }

    @Override
    public String toString(){

        return "Faculty : " + name;
    }
}
