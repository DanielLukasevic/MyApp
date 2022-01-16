package lt.vcs.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonTic;
    Button buttonSnake;
    Button buttonPuzzle;
TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonTic = (Button) findViewById(R.id.btn1);
        buttonSnake = (Button) findViewById(R.id.btn2);
        buttonPuzzle = (Button) findViewById(R.id.btn3);
        txtView = (TextView) findViewById(R.id.txt);
        buttonTic.setOnClickListener(this);
        buttonSnake.setOnClickListener(this);
        buttonPuzzle.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btn1){
            txtView.setText("FirstButton is clicked");
        }
        if(view.getId()==R.id.btn2){
            txtView.setText("SecondButton is clicked");
        }
        if(view.getId()==R.id.btn3){
            txtView.setText("ThirdButton is clicked");
        }
    }
}