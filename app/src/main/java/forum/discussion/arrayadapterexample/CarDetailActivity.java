package forum.discussion.arrayadapterexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CarDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_detail);

        TextView carTextView = (TextView)findViewById(R.id.car_name);

        String nameStr = getIntent().getStringExtra("Car Name");

        if(nameStr != null){
            carTextView.setText(nameStr);
        }
    }
}
