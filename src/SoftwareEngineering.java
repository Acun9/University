
// Concrete class'lar abstract methodlari override etmek zorundadir!

import java.util.List;

public class SoftwareEngineering extends Department{

    public SoftwareEngineering(Long id, Faculty faculty) {
        super(id, Departments.SOFTWARE_ENGINEERING.getEnglishName(), faculty);
    }

    @Override
    public List<String> lessonToLearn() {
        return List.of();
    }
}
