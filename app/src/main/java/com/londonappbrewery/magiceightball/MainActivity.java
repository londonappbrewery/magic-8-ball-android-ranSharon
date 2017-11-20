package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = (Button) findViewById(R.id.ask_button);

        final ImageView ballImage = (ImageView) findViewById(R.id.ball_image);

        final int[] ballImagesArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        askButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Random randonNuberGen  = new Random();
                int randNum = randonNuberGen.nextInt(5) ;

                ballImage.setImageResource(ballImagesArray[randNum]);


                Log.d("8 ball" , "random number: " + randNum);
            }
        });
    }
}
