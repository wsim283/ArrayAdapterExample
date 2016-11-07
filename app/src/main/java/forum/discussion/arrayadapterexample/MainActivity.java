package forum.discussion.arrayadapterexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView vehicleListView = (ListView)findViewById(R.id.vehicles_listview);

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        //Creating each vehicle objects here
        vehicles.add(new Vehicle("Honda Jazz","Hatchback",true));
        vehicles.add(new Vehicle("Toyota Prius","Hatchback",false));
        vehicles.add(new Vehicle("Toyota Camry","Sedan", true));


        //Creating the adapter, notice the last two paremeters, list_item.xml is the layout we want to use for each item
        //the last one is the array that we have created above
        VehicleListAdapter vehicleListAdapter = new VehicleListAdapter(this,R.layout.list_item,vehicles);
        //need to attach the adapter to the ListView
        vehicleListView.setAdapter(vehicleListAdapter);

    }
}
