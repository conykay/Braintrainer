
package com.cornelius.braintrainer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    CountDownTimer countDownTimer;
    TextView timer , results , testValues ,score ;
    Button starter ,button1,button2,button3,button4;
    int roundsgame = 0 ;
    int scorecount =0 ;



    public void onclick(View view ){

        roundsgame +=1;


        int firstNo = new Random().nextInt(20)+1;
        int secondNo = new Random().nextInt(20)+1;

        testValues.setText(firstNo + " + " + secondNo);

        int solution =(firstNo + secondNo);

        List<Integer> solutions = new ArrayList<>();
        solutions.add(new Random().nextInt(20)+1);
        solutions.add(new Random().nextInt(18)+3);
        solutions.add(new Random().nextInt(20)+1);
        solutions.add(firstNo + secondNo);

        Collections.shuffle(solutions);

        button1.setText(Integer.toString(solutions.get(0)));
        button2.setText(Integer.toString(solutions.get(1)));
        button3.setText(Integer.toString(solutions.get(2)));
        button4.setText(Integer.toString(solutions.get(3)));

        switch (view.getId()){

            case R.id.button1:

                if (Integer.parseInt(button1.getText().toString()) == solution ){


                    scorecount +=1;
                    score.setText(scorecount+"/"+roundsgame);
                    results.setText("Wright");

                }else{

                    results.setText("wrong");
                    score.setText(scorecount+"/"+roundsgame);


                }

                break;


            case R.id.button2:

                if (Integer.parseInt(button2.getText().toString()) == solution ){

                    scorecount +=1;
                    score.setText(scorecount+"/"+roundsgame);

                    results.setText("Wright");

                }else{

                    results.setText("wrong");
                    score.setText(scorecount+"/"+roundsgame);


                }

                break;


            case R.id.button3:

                if (Integer.parseInt(button3.getText().toString()) == solution ){


                    scorecount +=1;
                    score.setText(scorecount+"/"+roundsgame);
                    results.setText("Wright");

                }else{

                    results.setText("wrong");
                    score.setText(scorecount+"/"+roundsgame);


                }

                break;

            case R.id.button4:

                if (Integer.parseInt(button4.getText().toString()) == solution ){

                    scorecount +=1;
                    score.setText(scorecount+"/"+roundsgame);

                    results.setText("Wright");

                }else{

                    results.setText("wrong");
                    score.setText(scorecount+"/"+roundsgame);


                }

                break;


        }


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
