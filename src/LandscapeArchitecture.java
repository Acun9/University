import java.util.List;

public class LandscapeArchitecture extends Department{

    public LandscapeArchitecture(Long id, Faculty faculty) {
        super(id, Departments.LANDSCAPE_ARCHITECTURE.getEnglishName(), faculty);
    }

    @Override
    public List<String> lessonToLearn() {
        return List.of();
    }
}
