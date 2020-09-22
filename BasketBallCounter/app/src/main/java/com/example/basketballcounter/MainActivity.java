package com.example.basketballcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int countA=0;
    public void scoreUp3(View view)
    {
        countA+=3;
        displayForTeamA(countA);
    }
    public void scoreUp2(View view)
    {
        countA+=2;
        displayForTeamA(countA);
    }
    public void scoreUp1(View view)
    {
        countA+=1;
        displayForTeamA(countA);
    }
    int countB=0;
    public void scoreUp3B(View view)
    {
        countB+=3;
        displayForTeamB(countB);
    }
    public void scoreUp2B(View view)
    {
        countB+=2;
        displayForTeamB(countB);
    }
    public void scoreUp1B(View view)
    {
        countB+=1;
        displayForTeamB(countB);
    }

    public void reset(View view)
    {
        countA=0;
        countB=0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointCounterA);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score)
    {
        TextView scoreViewB=(TextView) findViewById(R.id.pointCounterB);
        scoreViewB.setText(String.valueOf(score));
    }
}