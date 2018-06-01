// Prajwal Ramamurthy
// JAVA 1 1806
// RamamurthyPrajwal_CE01_MemoryGame

package com.example.prajwalramamurthy.ramamurthyprajwal_ce01_memorygame;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Stored properties which we will use later
    // array to hold all letters
    String[] numbersArray = {"A","C","E", "B", "F", "G", "A", "F", "H", "D", "H", "B", "G", "E", "D", "C"};
    // will make it random
    Random r = new Random();
    // will hold items after its sorted
    ArrayList<String> sortedArray = null;
    private Button button = null;

    // start of our function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // this will make the reset button invisible at the start of our program
        Button reset = findViewById(R.id.resetButton);
        reset.setVisibility(View.INVISIBLE);

        // set the on click listener as its our event
        findViewById(R.id.tag0).setOnClickListener(this);
        findViewById(R.id.tag1).setOnClickListener(this);
        findViewById(R.id.tag2).setOnClickListener(this);
        findViewById(R.id.tag3).setOnClickListener(this);
        findViewById(R.id.tag4).setOnClickListener(this);
        findViewById(R.id.tag5).setOnClickListener(this);
        findViewById(R.id.tag6).setOnClickListener(this);
        findViewById(R.id.tag7).setOnClickListener(this);
        findViewById(R.id.tag8).setOnClickListener(this);
        findViewById(R.id.tag9).setOnClickListener(this);
        findViewById(R.id.tag10).setOnClickListener(this);
        findViewById(R.id.tag11).setOnClickListener(this);
        findViewById(R.id.tag12).setOnClickListener(this);
        findViewById(R.id.tag13).setOnClickListener(this);
        findViewById(R.id.tag14).setOnClickListener(this);
        findViewById(R.id.tag15).setOnClickListener(this);


        // call our function that will populate the buttons
        setViewsValues();

        // timer function will delay it for 5 seconds before its flipped
        timer();


    }

    // custom function to set values to the buttons
    private void setViewsValues(){

        guesses = 0;
        cards = 8;
        sortedArray = new ArrayList<>();

        // for loop will take us through the array and sort it out
        for (int i = 0; i < numbersArray.length; i ++){
            sortedArray.add(numbersArray[i]);
            //when there is a game reset repopulate the values in here with the hard coded values of the numbers array
        }

        // for each button we will ge the id and assign it and then sort it and remove it from that array and make sure its visible when it originally runs
        int index = r.nextInt(sortedArray.size()-1);
        button = findViewById(R.id.tag0);
        button.setOnClickListener(this);
        button.setText(sortedArray.get(index));
        sortedArray.remove(index);
        button.setVisibility(View.VISIBLE);


        index = r.nextInt(sortedArray.size()-1);
        button = findViewById(R.id.tag1);
        button.setOnClickListener(this);
        button.setText(sortedArray.get(index));
        sortedArray.remove(index);
        button.setVisibility(View.VISIBLE);

        index = r.nextInt(sortedArray.size()-1);
        button = findViewById(R.id.tag2);
        button.setOnClickListener(this);
        button.setText(sortedArray.get(index));
        sortedArray.remove(index);
        button.setVisibility(View.VISIBLE);

        index = r.nextInt(sortedArray.size()-1);
        button = findViewById(R.id.tag3);
        button.setOnClickListener(this);
        button.setText(sortedArray.get(index));
        sortedArray.remove(index);
        button.setVisibility(View.VISIBLE);

        index = r.nextInt(sortedArray.size()-1);
        button = findViewById(R.id.tag4);
        button.setOnClickListener(this);
        button.setText(sortedArray.get(index));
        sortedArray.remove(index);
        button.setVisibility(View.VISIBLE);

        index = r.nextInt(sortedArray.size()-1);
        button = findViewById(R.id.tag5);
        button.setOnClickListener(this);
        button.setText(sortedArray.get(index));
        sortedArray.remove(index);
        button.setVisibility(View.VISIBLE);

        index = r.nextInt(sortedArray.size()-1);
        button = findViewById(R.id.tag6);
        button.setOnClickListener(this);
        button.setText(sortedArray.get(index));
        sortedArray.remove(index);
        button.setVisibility(View.VISIBLE);


        index = r.nextInt(sortedArray.size()-1);
        button = findViewById(R.id.tag7);
        button.setOnClickListener(this);
        button.setText(sortedArray.get(index));
        sortedArray.remove(index);
        button.setVisibility(View.VISIBLE);

        index = r.nextInt(sortedArray.size()-1);
        button = findViewById(R.id.tag8);
        button.setOnClickListener(this);
        button.setText(sortedArray.get(index));
        sortedArray.remove(index);
        button.setVisibility(View.VISIBLE);

        index = r.nextInt(sortedArray.size()-1);
        button = findViewById(R.id.tag9);
        button.setOnClickListener(this);
        button.setText(sortedArray.get(index));
        sortedArray.remove(index);
        button.setVisibility(View.VISIBLE);


        index = r.nextInt(sortedArray.size()-1);
        button = findViewById(R.id.tag10);
        button.setOnClickListener(this);
        button.setText(sortedArray.get(index));
        sortedArray.remove(index);
        button.setVisibility(View.VISIBLE);


        index = r.nextInt(sortedArray.size()-1);
        button = findViewById(R.id.tag11);
        button.setOnClickListener(this);
        button.setText(sortedArray.get(index));
        sortedArray.remove(index);
        button.setVisibility(View.VISIBLE);

        index = r.nextInt(sortedArray.size()-1);
        button = findViewById(R.id.tag12);
        button.setOnClickListener(this);
        button.setText(sortedArray.get(index));
        sortedArray.remove(index);
        button.setVisibility(View.VISIBLE);

        index = r.nextInt(sortedArray.size()-1);
        button = findViewById(R.id.tag13);
        button.setOnClickListener(this);
        button.setText(sortedArray.get(index));
        sortedArray.remove(index);
        button.setVisibility(View.VISIBLE);

        index = r.nextInt(sortedArray.size()-1);
        button = findViewById(R.id.tag14);
        button.setOnClickListener(this);
        button.setText(sortedArray.get(index));
        sortedArray.remove(index);
        button.setVisibility(View.VISIBLE);

        index = r.nextInt(sortedArray.size());
        button = findViewById(R.id.tag15);
        button.setOnClickListener(this);
        button.setText(sortedArray.get(index));
        sortedArray.remove(index);
        button.setVisibility(View.VISIBLE);


    }



    // will remove the text in the buttons displayed
    // i do this by changing the size of the text
    public void buttonRemove(){
        for (int i = 0; i <= numbersArray.length; i++) {
            button = findViewById(getResources().getIdentifier("tag" + i, "id",
                    this.getPackageName()));

            if (button != null){
                button.setTextSize(1);
            }else{
                Log.i("test", "buttonShow: button is null");
            }

        }
    }

    // timer function will show the user the game board for 5 seconds
    public void timer(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){

                buttonRemove();
            }
        }, 5000);
    }

    // timer delay is delay when buttons are clicked
    public void timerDelay(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
               openCards[0].setTextSize(1);
                openCards[1].setTextSize(1);
                openCards[0] = null;
                openCards[1] = null;
                numOpenCards = 0;
                if (! gameOver){
                    guesses ++;
                    TextView guessCount = findViewById(R.id.text_view2);
                    guessCount.setText(Integer.toString(guesses));
                }else{
                    gameOver = false;
                }

            }
        }, 500);
    }

    // will match the buttons if they are the same and when its over it will call the neccesary methods
    public void matchButtons(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                openCards[0].setVisibility(View.INVISIBLE);
            openCards[1].setVisibility(View.INVISIBLE);
            if (-- cards == 0){
                // show game over
                Button reset = findViewById(R.id.resetButton);
                reset.setVisibility(View.VISIBLE);

                gameOver = true;
                setViewsValues();
                TextView guessCount = findViewById(R.id.text_view2);
                guessCount.setText(Integer.toString(0));
                timer();

                }
            }
        }, 500);
    }

    int cards = 8;
    int guesses = 0;
    Boolean gameOver = false;

    Button[] openCards = new Button[2];
    int numOpenCards = 0;

    // when the button click happens
    @Override
    public void onClick(View v){
        //Log.i(TAG, "onClick: View I clicked on is: " + v.getId());

        // first make sure only 2 cards are open
        if (numOpenCards == 2){
            return;
        }
        switch(v.getId()){
            case R.id.tag0:

                // text has to be visible when clicked
                button = (Button) v;
                button.setTextSize(15);

                // do both the checks see if open
                if (numOpenCards == 0 || openCards[0] != button) {

                    // add one to the open ones and set it equal to the button
                    openCards[numOpenCards++] = button;
                    if (numOpenCards == 2) {
                        if (openCards[0].getText().equals(openCards[1].getText())) {
                            // Add Points
                            matchButtons();
                        }
                        // call my delay timer function
                        timerDelay();

                    }
                }
                break;

            case R.id.tag1:
                button = (Button) v;
                button.setTextSize(15);

                if (numOpenCards == 0 || openCards[0] != button) {

                    openCards[numOpenCards++] = button;
                    if (numOpenCards == 2) {
                        if (openCards[0].getText().equals(openCards[1].getText())) {
                            // Add Points
                            matchButtons();
                        }

                        timerDelay();

                    }
                }

                break;
            case R.id.tag2:
                button = (Button) v;
                button.setTextSize(15);

                if (numOpenCards == 0 || openCards[0] != button) {

                    openCards[numOpenCards++] = button;
                    if (numOpenCards == 2) {
                        if (openCards[0].getText().equals(openCards[1].getText())) {
                            // Add Points
                            matchButtons();
                        }

                        timerDelay();

                    }
                }

                break;
            case R.id.tag3:
                button = (Button) v;
                button.setTextSize(15);

                if (numOpenCards == 0 || openCards[0] != button) {

                    openCards[numOpenCards++] = button;
                    if (numOpenCards == 2) {
                        if (openCards[0].getText().equals(openCards[1].getText())) {
                            // Add Points
                            matchButtons();
                        }

                        timerDelay();

                    }

                }
                break;
            case R.id.tag4:
                button = (Button) v;
                button.setTextSize(15);

                if (numOpenCards == 0 || openCards[0] != button) {

                    openCards[numOpenCards++] = button;
                    if (numOpenCards == 2) {
                        if (openCards[0].getText().equals(openCards[1].getText())) {
                            // Add Points
                            matchButtons();
                        }
                        timerDelay();

                    }
                }

                break;
            case R.id.tag5:
                button = (Button) v;
                button.setTextSize(15);

                if (numOpenCards == 0 || openCards[0] != button) {

                    openCards[numOpenCards++] = button;
                    if (numOpenCards == 2) {
                        if (openCards[0].getText().equals(openCards[1].getText())) {
                            // Add Points
                            matchButtons();
                        }

                        timerDelay();

                    }
                }

                break;
            case R.id.tag6:
                button = (Button) v;
                button.setTextSize(15);

                if (numOpenCards == 0 || openCards[0] != button) {

                    openCards[numOpenCards++] = button;
                    if (numOpenCards == 2) {
                        if (openCards[0].getText().equals(openCards[1].getText())) {
                            // Add Points
                            matchButtons();
                        }

                        timerDelay();

                    }
                }

                break;
            case R.id.tag7:
                button = (Button) v;
                button.setTextSize(15);


                if (numOpenCards == 0 || openCards[0] != button) {

                    openCards[numOpenCards++] = button;
                    if (numOpenCards == 2) {
                        if (openCards[0].getText().equals(openCards[1].getText())) {
                            // Add Points
                            matchButtons();
                        }
                        timerDelay();

                    }
                }

                break;
            case R.id.tag8:
                button = (Button) v;
                button.setTextSize(15);

                if (numOpenCards == 0 || openCards[0] != button) {

                    openCards[numOpenCards++] = button;
                    if (numOpenCards == 2) {
                        if (openCards[0].getText().equals(openCards[1].getText())) {
                            // Add Points
                            matchButtons();
                        }

                        timerDelay();

                    }
                }

                break;
            case R.id.tag9:
                button = (Button) v;
                button.setTextSize(15);

                if (numOpenCards == 0 || openCards[0] != button) {

                    openCards[numOpenCards++] = button;
                    if (numOpenCards == 2) {
                        if (openCards[0].getText().equals(openCards[1].getText())) {
                            // Add Points
                            matchButtons();
                        }

                        timerDelay();

                    }
                }

                break;
            case R.id.tag10:
                button = (Button) v;
                button.setTextSize(15);

                if (numOpenCards == 0 || openCards[0] != button) {

                    openCards[numOpenCards++] = button;
                    if (numOpenCards == 2) {
                        if (openCards[0].getText().equals(openCards[1].getText())) {
                            // Add Points
                            matchButtons();
                        }

                        timerDelay();

                    }
                }


                break;
            case R.id.tag11:
                button = (Button) v;
                button.setTextSize(15);

                if (numOpenCards == 0 || openCards[0] != button) {


                    openCards[numOpenCards++] = button;
                    if (numOpenCards == 2) {
                        if (openCards[0].getText().equals(openCards[1].getText())) {
                            // Add Points
                            matchButtons();
                        }
                        timerDelay();

                    }
                }


                break;
            case R.id.tag12:
                button = (Button) v;
                button.setTextSize(15);


                if (numOpenCards == 0 || openCards[0] != button) {

                    openCards[numOpenCards++] = button;
                    if (numOpenCards == 2) {
                        if (openCards[0].getText().equals(openCards[1].getText())) {
                            // Add Points
                            matchButtons();
                        }

                        timerDelay();

                    }

                }
                break;
            case R.id.tag13:
                button = (Button) v;
                button.setTextSize(15);

                if (numOpenCards == 0 || openCards[0] != button) {

                    openCards[numOpenCards++] = button;
                    if (numOpenCards == 2) {
                        if (openCards[0].getText().equals(openCards[1].getText())) {
                            // Add Points
                            matchButtons();
                        }
                        timerDelay();

                    }

                }
                break;
            case R.id.tag14:
                button = (Button) v;
                button.setTextSize(15);

                if (numOpenCards == 0 || openCards[0] != button) {

                    openCards[numOpenCards++] = button;
                    if (numOpenCards == 2) {
                        if (openCards[0].getText().equals(openCards[1].getText())) {
                            // Add Points
                            matchButtons();
                        }
                        timerDelay();


                    }
                }

                break;
            case R.id.tag15:
                button = (Button) v;
                button.setTextSize(15);


                if (numOpenCards == 0 || openCards[0] != button) {

                    openCards[numOpenCards++] = button;
                    if (numOpenCards == 2) {
                        if (openCards[0].getText().equals(openCards[1].getText())) {
                            // Add Points
                            matchButtons();
                        }

                        timerDelay();

                    }
                }


                break;


                default:
                    Log.i("OnClick:", "There is no case for your button!");
                    break;
        }

    }

}
