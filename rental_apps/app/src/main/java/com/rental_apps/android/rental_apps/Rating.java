package com.rental_apps.android.rental_apps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatRatingBar;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Rating extends AppCompatActivity {
   private TextView ambilrating;
   private Button submit;
   private AppCompatRatingBar Ratingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        ambilrating = findViewById(R.id.rate);
        submit = findViewById(R.id.submit);
        Ratingbar = findViewById(R.id.penilaian);

        Ratingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float nilai, boolean b) {

                ambilrating.setText("Rating : "+nilai);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Rating.this, "Nilai yang anda berikan : "+Ratingbar, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
