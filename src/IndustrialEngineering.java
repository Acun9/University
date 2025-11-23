import java.util.List;

public class IndustrialEngineering extends Department{

    public IndustrialEngineering(Long id, Faculty faculty) {
        super(id, Departments.INDUSTRIAL_ENGINEERING.getEnglishName(), faculty);
    }

    @Override
    public List<String> lessonToLearn() {
        return List.of();
    }
}
