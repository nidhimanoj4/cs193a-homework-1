package com.example.nidhi.nidhisfirstapp;
// Nidhi Manoj
// Guessing Game - This app asks the user to guess a number from 1-10. If they guess the random
// number correctly, then they win!

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.EditText;
        import android.widget.Toast;

        import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        pickNumbers();
    }

    public void checkNum(View view) {
        // runs when submit button is clicked
//        Toast.makeText(this,"You clicked submit", Toast.LENGTH_SHORT).show();
        EditText ed = (EditText) findViewById(R.id.editText);
//        ed.setText(":)");
        String sNum = String.valueOf(ed.getText());

        Random randy = new Random();
        int num1 = randy.nextInt(10);

        String toasttext = "You guessed " + sNum + ". The random number was " + num1 + ".";
//        Toast.makeText(this,"You win! " + toasttext, Toast.LENGTH_SHORT).show();

        Button b = (Button) findViewById(R.id.displayrand);
        String lastran= "The random number was: " + num1;
        b.setText(lastran);

        if(Integer.valueOf(sNum) == Integer.valueOf(num1)){
            Toast.makeText(this,"You win! " + toasttext, Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"You lose! " + toasttext, Toast.LENGTH_SHORT).show();
        }

    }

    public void clear(View view) {
        EditText ed = (EditText) findViewById(R.id.editText);
        ed.setText("");
    }

}