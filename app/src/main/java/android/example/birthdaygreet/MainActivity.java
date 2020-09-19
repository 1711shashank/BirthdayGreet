package android.example.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createBirthdayCard(View view) {

        EditText nameInput = (EditText) findViewById(R.id.nameInput);
        String name = nameInput.getEditableText().toString();

        Intent intent = new Intent(this, BirthdayActivity.class);
        intent.putExtra(BirthdayActivity.NAME_EXTRA,name);
        startActivity(intent);


//        Toast
//        EditText nameInput = (EditText) findViewById(R.id.nameInput);
//        String name = nameInput.getEditableText().toString();
//        Toast.makeText(this,"Name is " + name, Toast.LENGTH_LONG).show();


    }
}
