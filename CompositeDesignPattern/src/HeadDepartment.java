import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department{
    private Integer id;
    private String name;
    private List<Department> childDepartment;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartment = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        childDepartment.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department){
        childDepartment.add(department);
    }

    public void removeDepartment(Department department){
        childDepartment.remove(department);
    }
}
