import java.util.List;
import java.util.Objects;

// Abstraction
// new Department();
public abstract class Department implements Comparable<Department> {

    private Long id;
    private String name;
    private String departmentHead;

    private Faculty faculty;

    public Department(Long id, String name, Faculty faculty){
        this.id = id;
        this.name = name;
        this.faculty = faculty;
    }

    public Long getId(){

        return id;
    }

    public String getName(){

        return name;
    }

    public String getDepartmentHead(){

        return departmentHead;
    }

    public Faculty getFaculty(){

        return faculty;
    }

    private void setId(Long id){

        this.id = id;
    }

    public void setName(String name){

        this.name = name;
    }

    public void setDepartmentHead(String departmentHead){

        this.departmentHead = departmentHead;
    }

    // Abstract method
    public abstract List<String> lessonToLearn();

    // Polymorphism
    @Override
    public boolean equals(Object object){

        if(this == object)
            return true;

        if(object == null || object.getClass() != getClass())
            return false;

        Department deparment = (Department) object; // Downcast

        return deparment.id.equals(id);
    }

    @Override
    public int hashCode(){

        return Objects.hash(id);
    }


    @Override
    public String toString(){

        return "Department : " + name;
    }

    // Write once use many times
    // Open for extension close for modification -> Polymorpsihm
    @Override
    public int compareTo(Department o) {
        return name.compareTo(o.getName()); // A-Z
    }
}

/*
 Departmant sınıfı içerisinde(id, name, departmentHead, (bağlı bulunduğu fakülte => bu ilişki nasıl kurulmalı)
- Bazı departmanlarda departmanlara özel sınıf değişkenleri(instance variable) olabilir.
Örneğin: 'Computer Engineering' departmanı altında 'programmingLanguagesShouldBeTaught' bir liste olmalı ve içerisinde bölümde öğretilecek programlama dilleri yer almalı.
Bu ilişkiyi baz alarak Departmant ve Computer Engineering sınıfları arasındaki ilişkiyi tanımlayınız.
Kendinizde benzer şekillerde birkaç tane departman ekleyin ve o departmana özgü şeyler eklemeye çalışın.(Bu noktada öğrencilere sorulur)

        - Departmant sınıfı içerisinde bir adet 'lessonToLearn' adında metod tanımlanmalıdır. Bu metod içerisinde departmanda öğretilecek olan dersleri tutmaktadır.
Her departman bu metodu farklı şekillerde @Override etmelidir.

- Departmanların altında Dersler tanımlanmalıdır. Bir departmanda pek çok ders okutulabilir. Ancak her ders tek bir departmana ait olmalıdır.

 */