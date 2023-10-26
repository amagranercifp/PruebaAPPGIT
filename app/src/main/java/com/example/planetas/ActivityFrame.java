package com.example.planetas;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class ActivityFrame extends AppCompatActivity {

    private VideoView videoView;
    private ImageButton btnPlay,btnPause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        btnPlay = (ImageButton) findViewById(R.id.imageButton);
        btnPause = (ImageButton) findViewById(R.id.imageButtonPause);

        videoView = (VideoView) findViewById(R.id.videoView);

        videoView.setVideoURI(
                Uri.parse("android.resource://"
                        +getPackageName()+"/"+R.raw.paisaje));

    }

    public void btnPlay(View v){

        //Si el video esta en marcha o play
        // lo que haremos es pausarlo
        if(videoView.isPlaying()){
            videoView.resume();
        }
        else{
            videoView.start();
        }

        btnPlay.setVisibility(View.INVISIBLE);

        btnPause.setVisibility(View.VISIBLE);

    }

    public void btnPause(View v){

        if(videoView.isPlaying()){
            videoView.pause();

            btnPlay.setVisibility(View.VISIBLE);

            btnPause.setVisibility(View.INVISIBLE);
        }
        else{

            btnPlay.setVisibility(View.VISIBLE);

            btnPause.setVisibility(View.INVISIBLE);

        }



    }
}