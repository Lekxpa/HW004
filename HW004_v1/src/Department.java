import java.util.ArrayList;
public class Department {
    String depName;
    ArrayList<Persona> personaInDept = new ArrayList<>();
    public void setDepName(String depName) {
        this.depName = depName;
    }
    ArrayList<Department> departmentList = new ArrayList<>();
    @Override
    public String toString(){
        for(Department i : departmentList){
            String.format(depName);
        }
        return depName;
    }
}
