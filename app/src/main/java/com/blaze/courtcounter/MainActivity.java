package com.blaze.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Tracks score of Team A
    int scoreTeamA = 0;

    //Tracks score of Team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    This method increases the score of Team A by 3 points
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /*
    This method increases the score of Team A by 2 points
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /*
    This method increases the score of Team A by 1 point
     */
    public void addOneForTeamA(View v) {
        displayForTeamA(++scoreTeamA);
    }


    /*
    This method increases the score of Team B by 3 points
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /*
    This method increases the score of Team B by 2 points
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /*
    This method increases the score of Team B by 1 point
     */
    public void addOneForTeamB(View v) {
        displayForTeamB(++scoreTeamB);
    }

    /*
        This method resets the score of Team A & B to 0
         */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /*
    This method displays the score of Team A
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /*
    This method displays the score of Team B
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}