
// Inheritance
// Parent - Child iliskisi
// Department - Parent, ComputerEngineering Child

import java.util.List;

public class ComputerEngineering extends Department{

    private List<String> programmingLanguagesShouldBeTaught;

    public ComputerEngineering(Long id, Faculty faculty) {
        super(id, Departments.COMPUTER_ENGINEERING.getEnglishName(), faculty);
        programmingLanguagesShouldBeTaught = List.of("C++", "Java");
    }

    @Override
    public List<String> lessonToLearn() {
        return programmingLanguagesShouldBeTaught;
    }
}
