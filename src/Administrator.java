import java.util.List;

public class Administrator extends Employee{
    List<Employee> members;

    public Administrator(String name){
        super(name);
    }

    public void addMember(Employee e){
        members.add(e);
    }

    //public void seeDanger(HReporter_IF r, Hazard h){ }

    public void evacuate(){
        for(Employee e: members){
            e.evacuate();
        }
        this.evacuate();
    }
}
