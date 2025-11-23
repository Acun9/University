public class Main {
    public static void main(String[] args){

        // Instance al, yarat, ornek al, ornek yarat, instance ver, object yarat,

        //University istanbulAydinUniversity = new University(1L, "Istanbul Aydin University");
        //university.name = null;
        //University ozyeginUniversity = new University(2L, "Ozyegin University");
        University workintechUniversity = University.getInstance();

        Faculty engineering = new Faculty(1L, "Engineering", workintechUniversity);
        Faculty architecture = new Faculty(2L, "Architecture", workintechUniversity);
        // university.getFaculties().add(faculty);

        //ozyeginUniversity.addFaculty(engineering);

        workintechUniversity.addFaculty(engineering);
        workintechUniversity.addFaculty(architecture);

        System.out.println(workintechUniversity);
        System.out.println("*******************Faculties******************");

        for(Faculty faculty: workintechUniversity.getFaculties()){

            System.out.println("       " + faculty);
        }
        /*try {

            //university.setName(null);
            istanbulAydinUniversity.setEmail("");

            //System.out.println();
        }catch (IllegalArgumentException ex){

            System.out.println(ex.getMessage());
        }catch (FileNotFoundException ex){

        }/*catch (Exception exception){

            System.out.println(exception.getMessage());
        }finally {
            System.out.println("Herzaman calisacak kod blogu");
        }*/

        //System.out.println(university);
        //System.out.println(university.getClass().getSimpleName());

    }
}
/*
Universite Fakülte Sistemi

- Bir üniversite içerisinde birden fazla fakülte ve bu fakültelere bağlı birden fazla departman olabilir.
        - Faculty sınıfı içerisinde(id, name, createdDate, address, dean, (fakülte altında bulunan departmanlar => bu ilişki nasıl kurulmalı)) bilgileri olmalıdır.
        - Departmant sınıfı içerisinde(id, name, departmentHead, (bağlı bulunduğu fakülte => bu ilişki nasıl kurulmalı)
- Bazı departmanlarda departmanlara özel sınıf değişkenleri(instance variable) olabilir.
Örneğin: 'Computer Engineering' departmanı altında 'programmingLanguagesShouldBeTaught' bir liste olmalı ve içerisinde bölümde öğretilecek programlama dilleri yer almalı.
Bu ilişkiyi baz alarak Departmant ve Computer Engineering sınıfları arasındaki ilişkiyi tanımlayınız.
Kendinizde benzer şekillerde birkaç tane departman ekleyin ve o departmana özgü şeyler eklemeye çalışın.(Bu noktada öğrencilere sorulur)

        - Departmant sınıfı içerisinde bir adet 'lessonToLearn' adında metod tanımlanmalıdır. Bu metod içerisinde departmanda öğretilecek olan dersleri tutmaktadır.
Her departman bu metodu farklı şekillerde @Override etmelidir.

- Departmanların altında Dersler tanımlanmalıdır. Bir departmanda pek çok ders okutulabilir. Ancak her ders tek bir departmana ait olmalıdır.

        - entity.concrete.Course isminde bir sınıf tanımlayın içerisinde(id, name, gpa) değerleri olmalıdır. Departman ile ilişkisini tanımlayın.

        - Bu ilişki tanımlandıktan sonra Departman sınıfı extends etmiş sınıflarda 'lessonToLearn' metodunu entity.concrete.Course tipinde objeleri tutacak şekilde güncelleyiniz.

        - entity.Instructor ve entity.concrete.Course ilişkisini tanımlamak için entity.Instructor adında bir sınıf daha oluşturun ve ikisi arasındaki ilişkiyi tanımlayınız. Bir entity.Instructor pek çok ders verebilir.
Bir ders pek çok hoca tarafından verilebilir.
        entity.Instructor sınıfında(id, firstName, lastName, salary, hasMsc, hasPhd) değişkenleri tanımlı olmalıdır.

        - entity.Instructor'lar farklı seviyedeki öğrenci gruplarına ders verebilirler. BsC, MsC ve entity.interfaces.Phd.
entity.interfaces.Bsc programda entity.Instructor'ın 2 görevi vardır. 'presentLesson', 'takeExam'
entity.interfaces.Msc programda entity.Instructor'ın 4 görevi bulunur. 'presentLesson', 'takeExam', 'makeALab', 'teachToWriteAcademicPaper'
entity.interfaces.Phd programda entity.Instructor'ın 6 görevi bulunur. 'presentLesson', 'takeExam', 'makeALab', 'teachToWriteAcademicPaper', 'teachAcademicResearch', 'introduceStudentToAcademicStaff'













Bir entity.Instructor entity.interfaces.Bsc, entity.interfaces.Msc, entity.interfaces.Phd bunların hepsine de ders verebilir, içlerinden sadece bir kısmına da ders verebilir. Bu programlar ile entity.Instructor ilişkisi nasıl olmalı(Öğrencilere dizayn yaptırmaya çalışılmalı)
Minimum kod tekrarı yapmak için nasıl bir yol izlenebilir ?
        - Interfacelere ayırmak mantıklı olabilir.

 */