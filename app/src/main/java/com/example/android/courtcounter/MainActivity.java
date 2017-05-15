package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int scoreA = 0;
    public int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void AddThreeA(View view) {
        scoreA = scoreA + 3;
        displayA(scoreA);
    }

    public void AddTwoA(View view) {
        scoreA = scoreA + 2;
        displayA(scoreA);
    }

    public void AddOneA(View view) {
        scoreA = scoreA + 1;
        displayA(scoreA);
    }

    public void AddThreeB(View view) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }

    public void AddTwoB(View view) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }

    public void AddOneB(View view) {
        scoreB = scoreB + 1;
        displayB(scoreB);
    }

    public void ResetAll(View view) {
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }
}
