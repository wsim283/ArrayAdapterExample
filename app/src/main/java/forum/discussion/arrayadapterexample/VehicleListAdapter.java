package forum.discussion.arrayadapterexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by WSIM on 5/11/2016.
 */

public class VehicleListAdapter extends ArrayAdapter {

    ArrayList<Vehicle> vehicles;
    Context context;
    int resource;

    public VehicleListAdapter(Context context, int resource, ArrayList<Vehicle> vehicles){
        super(context,resource); //this the constructor from our super class (ArrayAdapter), itr is required.
        this.vehicles = vehicles;
        this.context = context;
        this.resource = resource;
    }


    /**
     *
     * @return the size of our array so the ListView knows how many items we have
     */
    @Override
    public int getCount() {
        return vehicles.size();
    }


    /**
     * This method is called for each item in the list. This method is important as
     * it determines how each item would look like. This method is called by ListView.
     * see official documentation if you want to learn more :
     * https://developer.android.com/reference/android/widget/ArrayAdapter.html#getView(int, android.view.View, android.view.ViewGroup)
     * @param position the position of the item that we are currently in
     * @param convertView the view that we need create. This can be re-used, which means if it was created already there is no need to re-create it again
     *                    and if this is the case then we just simply return the convertView
     * @param parent   the container of the item
     * @return convertView
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //If convertView is null that means we haven't created the item yet
        //otherwise it has already been created and if this is the case we do not need to re-create it
        if(convertView == null){
            //we are going to inflate list_item.xml, this is given in MainActivity.java when we initialise the adapter
            convertView = LayoutInflater.from(context).inflate(resource,parent,false);
            //These textviews are in list_item.xml. since the layout has been inflated to convertView, we can use it to find
            //its id
            TextView nameTextView = (TextView)convertView.findViewById(R.id.vehicle_name_textview);
            TextView typeTextView = (TextView)convertView.findViewById(R.id.vehicle_type_textview);

            //setting the names of our cars and type to the corresponding textviews
            nameTextView.setText(vehicles.get(position).getName());
            typeTextView.setText(vehicles.get(position).getType());
        }
        return convertView;
    }
}
