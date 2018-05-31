// Prajwal Ramamurthy
// JAVA 1 1806
// RamamurthyPrajwal_CE01_MemoryGame

package com.example.prajwalramamurthy.ramamurthyprajwal_ce01_memorygame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String[] numbersArray = {"1","1","2", "2", "3", "3", "4", "4", "5", "5", "6", "6", "7", "7", "8", "8"};
    //ArrayList[[]]
    Random r = new Random();

    ArrayList<String> blah = null;


    private Button button = null;
    private static final String TAG = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blah = new ArrayList<>();

        for (int i = 0; i < numbersArray.length; i ++){
            blah.add(numbersArray[i]);
            //when there is a game reset repopulte the values in here with the hard coded values of the number sarray
        }
//then remove after ading this value to a button

        button = findViewById(R.id.tag0);
        button.setOnClickListener(this);

        int index = r.nextInt(blah.size()-1);

        button.setText(blah.get(index));
        blah.remove(index);

        //repeat


        // Set the onClick to "this" and this will make the code less redundant.
        // instead of having many onClick functions we can just have one.
        button = findViewById(R.id.tag1);
        button.setOnClickListener(this);

        button = findViewById(R.id.tag2);
        button.setOnClickListener(this);

        button = findViewById(R.id.tag3);
        button.setOnClickListener(this);

        button = findViewById(R.id.tag4);
        button.setOnClickListener(this);

        button = findViewById(R.id.tag5);
        button.setOnClickListener(this);

        button = findViewById(R.id.tag6);
        button.setOnClickListener(this);

        button = findViewById(R.id.tag7);
        button.setOnClickListener(this);

        button = findViewById(R.id.tag8);
        button.setOnClickListener(this);

        button = findViewById(R.id.tag9);
        button.setOnClickListener(this);

        button = findViewById(R.id.tag10);

        button.setOnClickListener(this);

        button = findViewById(R.id.tag11);
        button.setOnClickListener(this);

        button = findViewById(R.id.tag12);
        button.setOnClickListener(this);

        button = findViewById(R.id.tag13);
        button.setOnClickListener(this);

        button = findViewById(R.id.tag14);
        button.setOnClickListener(this);

        button = findViewById(R.id.tag15);
        button.setOnClickListener(this);

    }
    private void setViewsValues(View _view){
        // set onclick and text values when you have an instance of the button

        //set the values with blah array
        //set onclick listener,





    }

    @Override
    public void onClick(View v){
        //Log.i(TAG, "onClick: View I clicked on is: " + v.getId());

        switch(v.getId()){
            case R.id.tag0:
                //repeat

                break;

            case R.id.tag1:
                //repeat
                break;
            case R.id.tag2:
                //repeat
                break;
            case R.id.tag3:
                //repeat
                break;
            case R.id.tag4:
                //repeat
                break;
            case R.id.tag5:
                //repeat
                break;
            case R.id.tag6:
                //repeat
                break;
            case R.id.tag7:
                //repeat
                break;
            case R.id.tag8:
                //repeat
                break;
            case R.id.tag9:
                //repeat
                break;
            case R.id.tag10:
                //repeat
                break;
            case R.id.tag11:
                //repeat
                break;
            case R.id.tag12:
                //repeat
                break;
            case R.id.tag13:
                //repeat
                break;
            case R.id.tag14:
                //repeat
                break;
            case R.id.tag15:
                //repeat
                break;


                default:
                    Log.i("OnClick:", "There is no case for your button!");
                    break;
        }

        if(v.getId() == R.id.tag1){
            Log.i(TAG, "read clicked: ");
        }//else if(v.getId() == R.id.btn_write){
            //Log.i(TAG, "write clicked: ");
        //}
        else{
            Log.i(TAG, "something unhandled clicked: ");
        }
    }



//    @Override
//    public void onClick(View v) {
//
//        v.getTag().equals("guer");
//
//        String boxOne = getString(R.string.)
//
//                button.setOnClickListener();
//    }
}
