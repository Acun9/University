import java.util.Comparator;

// Util class
public class SortDepartmentsByIdAsc implements Comparator<Department> {

    @Override
    public int compare(Department o1, Department o2) {
        return o1.getId().compareTo(o2.getId());
    }
    // 10 11 20 12
    // 10 11 12 20
    // Ahmet Ali
    //

    // equals hashcode yok
    // tostring'te yok
}
