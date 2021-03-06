import java.util.ArrayList;
import java.util.List;

public class Manager extends Administrator{
    private List<Decision> ManagerSuggestions = new ArrayList<Decision>();

    public Manager(String name) {
        super(name);
    }

    public void addMember(DirectAdministrator direct){
        members.add(direct);
    }

    //create decisions here
    public List<Decision> suggestDecisions(Hazard h){ //problem here he gave us list to return
        Decision as = new Decision(this,5, h);
        ManagerSuggestions.add(as);
        return ManagerSuggestions;
    }

    public void seeDanger(HReporter_IF r, Hazard h){
        Boolean reportToCEO = true;
        System.out.println("Manager "+this.name+" sees Danger");
        for(Employee e: members){
            DirectAdministrator d = (DirectAdministrator)e;
            if(d.getFeedback(h) == false)
                reportToCEO = false;
        }
        if(reportToCEO && this.overseer != null){
            (this.overseer).seeDanger(this, h);
        }
    }
}
