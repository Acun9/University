import java.util.Comparator;

public class SortDepartmentsByHead implements Comparator<Department> {

    @Override
    public int compare(Department o1, Department o2) {
        return o1.getDepartmentHead().compareTo(o2.getDepartmentHead());
    }
}
