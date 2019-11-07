package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int scoreFirstTeam = 0;
    int scoreSecondTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void winForFirstTeam(View v) {
        scoreFirstTeam = scoreFirstTeam + 1;
        displayForFirstTeam(scoreFirstTeam);
    }

    public void foulFirstTeam(View v) {
        scoreFirstTeam = scoreFirstTeam - 1;
        displayForFirstTeam(scoreFirstTeam);
    }

    public void winForSecondTeam(View v) {
        scoreSecondTeam = scoreSecondTeam + 1;
        displayForSecondTeam(scoreSecondTeam);
    }

    public void foulSecondTeam(View v) {
        scoreSecondTeam = scoreSecondTeam - 1;
        displayForSecondTeam(scoreSecondTeam);
    }

    /**
     * Displays the given score for first team A.
     */

    public void displayForFirstTeam(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for second team.
     */
    public void displayForSecondTeam(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScores(View v) {
        scoreFirstTeam = 0;
        scoreSecondTeam = 0;
        displayForFirstTeam(scoreFirstTeam);
        displayForSecondTeam(scoreSecondTeam);
    }

}
