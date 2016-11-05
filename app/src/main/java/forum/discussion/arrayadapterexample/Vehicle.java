package forum.discussion.arrayadapterexample;

/**
 * Created by WSIM on 5/11/2016.
 */

public class Vehicle {
    private String name;
    private String type;
    private boolean isAutomatic;

    public Vehicle(String name, String type, boolean isAutomatic){
        this.name = name;
        this.type = type;
        this.isAutomatic = isAutomatic;

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;


    }
    public boolean getIsAutomatic(){
        return isAutomatic;
    }
}
