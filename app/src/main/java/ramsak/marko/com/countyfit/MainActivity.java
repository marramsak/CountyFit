package ramsak.marko.com.countyfit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout TopContainer;
    private LinearLayout BottomContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TopContainer = (RelativeLayout) findViewById(R.id.TopContainer);
        BottomContainer = (LinearLayout) findViewById(R.id.BottomContainer);
        //animate(TopContainer);
    }


}
