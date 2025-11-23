import java.util.Comparator;

public class SortDepartmentsByIdDesc implements Comparator<Department> {
    @Override
    public int compare(Department o1, Department o2) {
        return o2.getId().compareTo(o1.getId());
    }
}
