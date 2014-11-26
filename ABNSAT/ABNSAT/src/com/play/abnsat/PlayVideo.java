package com.play.abnsat;

import android.app.Activity;
import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Audio;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class PlayVideo extends Activity {

	/** Called when the activity is first created. */

	// Declare variables
    ProgressDialog pDialog;
    VideoView videoview;
    Audio aud;
	Bundle bd;
	ImageView img_back;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.play_video);

		/*bd = getIntent().getExtras();
		String val = bd.getString("play");
		videoview = (VideoView) findViewById(R.id.videoView1);
		videoview.setVideoPath(val);
		videoview.start();*/
		
		
		bd = getIntent().getExtras();
		
		// Get the layout from video_main.xml
        setContentView(R.layout.play_video);
        // Find your VideoView in your video_main.xml layout
        videoview = (VideoView) findViewById(R.id.videoView1);
        // Execute StreamVideo AsyncTask
        img_back = (ImageView)findViewById(R.id.img_back);
        
        // Create a progressbar
        pDialog = new ProgressDialog(PlayVideo.this);
        // Set progressbar title
        String name = bd.getString("name");
        pDialog.setTitle("Loading "+ name+" video stream.");
        // Set progressbar message
        pDialog.setMessage("Buffering...");
        pDialog.setIndeterminate(false);
        pDialog.setCancelable(false);
        // Show progressbar
        pDialog.show();
		Toast.makeText(getApplicationContext(), "Please Wait. Video is getting loaded...", Toast.LENGTH_LONG).show();

        try {
            // Start the MediaController
            MediaController mediacontroller = new MediaController(PlayVideo.this);
            mediacontroller.setAnchorView(videoview);
            // Get the URL from String VideoURL
            Uri video = Uri.parse(bd.getString("play"));
            videoview.setMediaController(mediacontroller);
            videoview.setVideoURI(video);
 
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }
 
        videoview.requestFocus();
        videoview.setOnPreparedListener(new OnPreparedListener() {
            // Close the progress bar and play the video
            public void onPrepared(MediaPlayer mp) {
                pDialog.dismiss();
                videoview.start();
            }
        });
        
        img_back.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				videoview.stopPlayback();
				finish();
			}
		});
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		videoview.stopPlayback();

	}
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		videoview.stopPlayback();

	}
}