package umn.ac.id.moh.rizkizidane;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView textView1 = findViewById(R.id.textView1);
        textView1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView2 = findViewById(R.id.textView4);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView3 = findViewById(R.id.textView5);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView4 = findViewById(R.id.textView6);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView5 = findViewById(R.id.textView7);
        textView5.setMovementMethod(LinkMovementMethod.getInstance());
    }


}