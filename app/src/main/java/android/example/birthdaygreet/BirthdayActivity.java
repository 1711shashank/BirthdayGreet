package android.example.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BirthdayActivity extends AppCompatActivity {

    public static final String NAME_EXTRA = "name_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);

        Intent intent = getIntent();
        String BDname = intent.getStringExtra(NAME_EXTRA);

        TextView textView =  (TextView) findViewById(R.id.birthdayGreeting);
        textView.setText("Name is\n "+ BDname);


    }
}
