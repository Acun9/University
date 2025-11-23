import java.util.List;

public class Architecture extends Department{

    public Architecture(Long id, Faculty faculty) {
        super(id, Departments.ARCHITECTURE.getEnglishName(), faculty);
    }

    @Override
    public List<String> lessonToLearn() {
        return List.of();
    }
}
