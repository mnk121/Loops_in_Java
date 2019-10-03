package senger.mayank.loopsinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

int age ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("My Tag", age + "");
/*
        int counter = 1;
        String helloWorldText = "";


        while (counter <=10){

            Log.i("MyTag","Hello World Number :" + counter);

            helloWorldText = helloWorldText +"Hello World Number : " + counter + "\n";
            counter = counter + 1;


        }

        TextView txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHelloWorld.setText(helloWorldText);

 */
        String helloWorldText = "";
        TextView txtHelloWorld = findViewById(R.id.txtHelloWorld);

        for(int counter = 0; counter < 20 ; counter ++)
        {

            Log.i("MyTag", "Hello World Number :" + counter);
            helloWorldText = helloWorldText +"Hello World Number : " + counter + "\n";


        }
        txtHelloWorld.setText(helloWorldText);

    }


}
