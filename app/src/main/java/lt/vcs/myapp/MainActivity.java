package lt.vcs.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {
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
        buttonTic.setOnLongClickListener(this);
        buttonSnake.setOnLongClickListener(this);
        buttonPuzzle.setOnLongClickListener(this);

    }
//@Override
//    public void onLongClickItem(View view) {
//        if(view.getId()==R.id.btn1){
//            txtView.setText("Tic-Tac-Toe Button is clicked");
//        }
//        if(view.getId()==R.id.btn2){
//            txtView.setText("Snake Button is clicked");
//        }
//        if(view.getId()==R.id.btn3){
//            txtView.setText("Puzzle Button is clicked");
//        }
//    }

    @Override
    public boolean onLongClick(View view) {
        if(view.getId()==R.id.btn1){
            txtView.setText("Tic-Tac-Toe Button is clicked");
      }
       if(view.getId()==R.id.btn2){
           txtView.setText("Snake Button is clicked");
       }
       if(view.getId()==R.id.btn3){
           txtView.setText("Puzzle Button is clicked");
       }
       return false;
    }
}