public class Hazard {
    private String type;
    private String desp;
    private int hazard_level;

    public Hazard(String type, int hazard_level){
        this.type = type;
        this.hazard_level = hazard_level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }

    public void setHazard_level(int hazard_level) {
        this.hazard_level = hazard_level;
    }

    public int getHazard_level() {
        return hazard_level;
    }
}
