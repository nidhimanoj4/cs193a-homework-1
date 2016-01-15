package com.example.nidhi.nidhisfirstapp;

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
//        String gettext = ed.getText();

    }

    public void clear(View view) {
        EditText ed = (EditText) findViewById(R.id.editText);
        ed.setText("");
    }

//    public void pickNumbers() {
//        Button lbutton = (Button) findViewById(R.id.leftButton);
//        Button rbutton = (Button) findViewById(R.id.rightButton);
//        Random randy = new Random();
//        num1 = 0;
//        num2 = 0;
//        while (num1 == num2) {
//            num1 = randy.nextInt(10);
//            num2 = randy.nextInt(10);
//        }
//        lbutton.setText(String.valueOf(num1));
//        rbutton.setText(String.valueOf(num2));
//    }
//
//    public void leftButtonClick(View view) {
//        // runs when the left button gets clicked
//        if (num1 > num2) {
//            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
//            points++;
//        } else {
//            Toast.makeText(this, "You are STUPID!!!", Toast.LENGTH_SHORT).show();
//            points--;
//        }
//        TextView pointsView = (TextView) findViewById(R.id.pointsView);
//        pointsView.setText("Points: " + points);
//
//        pickNumbers();
//    }
//
//    public void rightButtonClick(View view) {
//        // runs when the right button gets clicked
//        if (num2 > num1) {
//            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
//            points++;
//        } else {
//            Toast.makeText(this, "You are STUPID!!!", Toast.LENGTH_SHORT).show();
//            points--;
//        }
//        TextView pointsView = (TextView) findViewById(R.id.pointsView);
//        pointsView.setText("Points: " + points);
//
//        pickNumbers();
//    }
}