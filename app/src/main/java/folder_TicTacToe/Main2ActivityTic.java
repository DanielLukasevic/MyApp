package folder_TicTacToe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.DialogInterface;
import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import lt.vcs.myapp.R;

public class Main2ActivityTic extends AppCompatActivity {

    ImageView button1,button2,button3,button4,button5,button6,button7,button8,button9;

        private String startGame = "X";

        int b1 = 5,b2 = 5,b3 = 5,b4 = 5,b5 = 5,b6 = 5,b7 = 5,b8 = 5,b9 = 5;

        int xCount = 0, oCount = 0;

        int i = 0;

        private TextView scorex,scoreo;

        private Button Reset;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            button1 = findViewById(R.id.buttonImage1);
            button2 = findViewById(R.id.buttonImage2);
            button3 = findViewById(R.id.buttonImage3);
            button4 = findViewById(R.id.buttonImage4);
            button5 = findViewById(R.id.buttonImage5);
            button6 = findViewById(R.id.buttonImage6);
            button7 = findViewById(R.id.buttonImage7);
            button8 = findViewById(R.id.buttonImage8);
            button9 = findViewById(R.id.buttonImage9);

            scorex = findViewById(R.id.ScoreX);
            scoreo = findViewById(R.id.ScoreY);

            Reset = findViewById(R.id.Reset);

            //reset button
            Reset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);

                    //resetValue function
                    resetValues();

                    xCount = 0;
                    oCount = 0;
                    scorex.setText("Score X :- " + String.valueOf(xCount));
                    scoreo.setText("Score Y :- " + String.valueOf(oCount));
                }
            });
            //button 1 first
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(startGame.equals("X")){
                        button1.setImageResource(R.drawable.red);  //?
                        b1 = 1;
                        i++;
                    }else{
                        button1.setImageResource(R.drawable.yellow); //?
                        b1 = 0;
                        i++;
                    }
                    choosePlayer();

                    winningGame();
                }
            });
            //button 2 first
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(startGame.equals("X")){
                        button2.setImageResource(R.drawable.red); //?
                        b2 = 1;
                        i++;
                    }else{
                        button2.setImageResource(R.drawable.yellow); //?
                        b2 = 0;
                        i++;
                    }
                    choosePlayer();

                    winningGame();
                }
            });
            //button 3 first
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(startGame.equals("X")){
                        button3.setImageResource(R.drawable.red); //?
                        b3 = 1;
                        i++;
                    }else{
                        button3.setImageResource(R.drawable.yellow); //?
                        b3 = 0;
                        i++;
                    }
                    choosePlayer();

                    winningGame();
                }
            });
            //button 4 antra eilute
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(startGame.equals("X")){
                        button4.setImageResource(R.drawable.red); //?
                        b4 = 1;
                        i++;
                    }else{
                        button4.setImageResource(R.drawable.yellow); //?
                        b4 = 0;
                        i++;
                    }
                    choosePlayer();

                    winningGame();
                }
            });
            //button 5 antra eilute
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(startGame.equals("X")){
                        button5.setImageResource(R.drawable.red); //?
                        b5 = 1;
                        i++;
                    }else{
                        button5.setImageResource(R.drawable.yellow); //?
                        b5 = 0;
                        i++;
                    }

                    choosePlayer();

                    winningGame();
                }
            });
            //button 6 antra eilute
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(startGame.equals("X")){
                        button6.setImageResource(R.drawable.red); //?
                        b6 = 1;
                        i++;
                    }else{
                        button6.setImageResource(R.drawable.yellow); //?
                        b6 = 0;
                        i++;
                    }

                    choosePlayer();

                    winningGame();
                }
            });
            //button 7 trečioji eilutė
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(startGame.equals("X")){
                        button7.setImageResource(R.drawable.red); //?
                        b7 = 1;
                        i++;
                    }else{
                        button7.setImageResource(R.drawable.yellow); //?
                        b7 = 0;
                        i++;
                    }

                    choosePlayer();

                    winningGame();

                }
            });
            //button 8 third
            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(startGame.equals("X")){
                        button8.setImageResource(R.drawable.red); //?
                        b8 = 1;
                        i++;
                    }else{
                        button8.setImageResource(R.drawable.yellow); //?
                        b8 = 0;
                        i++;
                    }

                    choosePlayer();

                    winningGame();
                }
            });
            //button 9 trečioji eilutė l
            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(startGame.equals("X")){
                        button9.setImageResource(R.drawable.red); //?
                        b9 = 1;
                        i++;
                    }
                    else{
                        button9.setImageResource(R.drawable.yellow); //?
                        b9 = 0;
                        i++;
                    }

                    choosePlayer();

                    winningGame();
                }
            });
        }
        // laimejimo funkcija
        private void winningGame()
        {
            //1 būdas laimėti x žaidėją
            if((b1 == 1) && (b2 == 1) && (b3 == 1))
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);

                        //resetValue function
                        resetValues();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                xCount++;
                scorex.setText("Score X :- " + String.valueOf(xCount));
            }
            // 2 budas laimeti x zaideja
            else if((b4 == 1) && (b5 == 1) && (b6 == 1))
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);

                        //resetValue function
                        resetValues();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                xCount++;
                scorex.setText("Score X :- " + String.valueOf(xCount));
            }
            // 3 budas laimeti x zaideja
            else if((b7 == 1) && (b8 == 1) && (b9 == 1))
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);

                        //resetValue function
                        resetValues();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                xCount++;
                scorex.setText("Score X :- " + String.valueOf(xCount));
            }

            // 4 budas laimeti x zaideja
            else if((b1 == 1) && (b4 == 1) && (b7 == 1))
            {

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);

                        //resetValue function
                        resetValues();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                xCount++;
                scorex.setText("Score X :- " + String.valueOf(xCount));
            }

            // 5 budas laimeti x zaideja
            else if((b2 == 1) && (b5 == 1) && (b8 == 1))
            {

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);

                        //resetValue function
                        resetValues();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                xCount++;
                scorex.setText("Score X :- " + String.valueOf(xCount));
            }

            // 6 budas laimeti x zaideja
            else if((b3 == 1) && (b6 == 1) && (b9 == 1))
            {

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);

                        //resetValue function
                        resetValues();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                xCount++;
                scorex.setText("Score X :- " + String.valueOf(xCount));
            }

            // 7 budas laimeti x zaideja
            else if((b1 == 1) && (b5 == 1) && (b9 == 1))
            {

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);

                        //resetValue function
                        resetValues();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                xCount++;
                scorex.setText("Score X :- " + String.valueOf(xCount));
            }

            // 8 budas laimeti x zaidejui
            else if((b3 == 1) && (b5 == 1) && (b7 == 1))
            {

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);

                        //resetValue function
                        resetValues();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                xCount++;
                scorex.setText("Score X :- " + String.valueOf(xCount));
            }
            // 1 budas laimeti o zaideja
            else if((b1 == 0) && (b2 == 0) && (b3 == 0))
            {

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);

                        //resetValue function
                        resetValues();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                oCount++;
                scoreo.setText("Score Y :- " + String.valueOf(oCount));
            }

            // 2 budas laimeti o zaideja
            else if((b4 == 0) && (b5 == 0) && (b6 == 0))
            {

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);

                        //resetValue function
                        resetValues();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                oCount++;
                scoreo.setText("Score Y :- " + String.valueOf(oCount));
            }

            // 3 budas laimeti o zaideja
            else if((b7 == 0) && (b8 == 0) && (b9 == 0))
            {

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);

                        //resetValue function
                        resetValues();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                oCount++;
                scoreo.setText("Score Y :- " + String.valueOf(oCount));
            }

            // 4 budas laimeti o zaideja
            else if((b1 == 0) && (b4 == 0) && (b7 == 0))
            {

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);

                        //resetValue function
                        resetValues();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                oCount++;
                scoreo.setText("Score Y :- " + String.valueOf(oCount));
            }

            // 5 budas laimeti o zaideja
            else if((b2 == 0) && (b5 == 0) && (b8 == 0))
            {

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);

                        //resetValue function
                        resetValues();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                oCount++;
                scoreo.setText("Score Y :- " + String.valueOf(oCount));
            }

            // 6 budas laimeti o zaideja
            else if((b3 == 0) && (b6 == 0) && (b9 == 0))
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);

                        //resetValue function
                        resetValues();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                oCount++;
                scoreo.setText("Score Y :- " + String.valueOf(oCount));
            }
            // 7 budas laimeti o zaideja
            else if((b1 == 0) && (b5 == 0) && (b9 == 0))
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);

                        //resetValue function
                        resetValues();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                oCount++;
                scoreo.setText("Score Y :- " + String.valueOf(oCount));
            }
            // 8 budas laimeti o zaideja
            else if((b3 == 0) && (b5 == 0) && (b7 == 0))
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);

                        //resetValue function
                        resetValues();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                oCount++;
                scoreo.setText("Score Y :- " + String.valueOf(oCount));
            }
            // kai niekas nelaimi
            else
            {
                if(i == 9){
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage("No One Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            button1.setImageDrawable(null);
                            button2.setImageDrawable(null);
                            button3.setImageDrawable(null);
                            button4.setImageDrawable(null);
                            button5.setImageDrawable(null);
                            button6.setImageDrawable(null);
                            button7.setImageDrawable(null);
                            button8.setImageDrawable(null);
                            button9.setImageDrawable(null);

                            //resetValue function
                            resetValues();
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        }
        // pasirinkti zaidejo funkcija
        private void choosePlayer(){
            if(startGame.equals("X")){
                startGame = "0";
            }
            else
            {
                startGame = "X";
            }
        }
        //resetValue function
        private void resetValues() {
            b1 = 5;
            b2 = 5;
            b3 = 5;
            b4 = 5;
            b5 = 5;
            b6 = 5;
            b7 = 5;
            b8 = 5;
            b9 = 5;
            i = 0;
        }
    }