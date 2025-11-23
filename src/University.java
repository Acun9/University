import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Singleton pattern
public class University {

    private static final String NAME = System.getenv("UNIVERSITY_NAME");
    private static final String ADDRESS = System.getenv("UNIVERSITY_ADDRESS");
    private static final String PHONE_NUMBER = System.getenv("UNIVERSITY_PHONE_NUMBER");
    private static final String EMAIL = System.getenv("UNIVERSITY_EMAIL");
    // private static final String;
    private static University instance;

    private List<Faculty> faculties = new ArrayList<>();

    private University(){}

    public static University getInstance(){

        if(instance == null)
            instance = new University();

        return instance;
    }

    public List<Faculty> getFaculties(){

        // new ArrayList(this.faculties);
        return Collections.unmodifiableList(this.faculties); // Defensive Copy
    }

    public void addFaculty(Faculty faculty){

        if(faculty == null)
            throw new IllegalArgumentException("Faculty null olamaz!");

        if(!faculties.contains(faculty))
            this.faculties.add(faculty);
    }

    public void removeFaculty(Faculty faculty){

        this.faculties.remove(faculty);
    }

    public void setFaculties(List<Faculty> faculties){
        this.faculties.clear();
        this.faculties = new ArrayList<>(faculties); // Defensive copy
    }

    @Override
    public String toString(){

        return "University : " + NAME;
    }
}
