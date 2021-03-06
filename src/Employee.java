public abstract class Employee implements HReporter_IF{
    protected String name;
    protected Administrator overseer;

    public Employee(String name){
        this.name = name;
    }

    public void seeDanger(HReporter_IF r, Hazard h){

    }

    public void evacuate(){
        System.out.println("The employee " + this.name + " is evacuating");
    }

    public void setDirectOverseer(HReporter_IF r){
        this.overseer = (Administrator) r;
        ((Administrator) r).addMember(this);
    }

    public HReporter_IF getDirectOverseer(){
        return overseer;
    }
}
