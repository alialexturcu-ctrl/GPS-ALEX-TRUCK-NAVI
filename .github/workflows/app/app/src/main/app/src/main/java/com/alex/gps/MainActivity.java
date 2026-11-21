
package com.alex.gps;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(24, 24, 24, 24);
        layout.setBackgroundColor(Color.rgb(20, 24, 30));

        TextView title = new TextView(this);
        title.setText("GPS ALEX TRUCK NAVI");
        title.setTextColor(Color.WHITE);
        title.setTextSize(27);
        title.setGravity(Gravity.CENTER);

        TextView profile = new TextView(this);
        profile.setText(
            "\nPROFIL CAMION\n\n" +
            "TIR: 4,00 m | 2,55 m | 16,50 m | 40 t\n\n" +
            "CAMION RIGID: 3,50 m | 2,55 m | 8,00 m | 18 t\n\n" +
            "HARTĂ GPS: ÎN CURÂND"
        );
        profile.setTextColor(Color.WHITE);
        profile.setTextSize(18);
        profile.setGravity(Gravity.CENTER);

        layout.addView(title);
        layout.addView(profile);

        setContentView(layout);
    }
}
