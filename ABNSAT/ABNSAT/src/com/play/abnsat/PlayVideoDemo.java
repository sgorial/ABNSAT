package com.play.abnsat;

import android.app.Activity;
import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Audio;
import android.util.Log;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class PlayVideoDemo extends Activity {

	/** Called when the activity is first created. */

	// Declare variables
    ProgressDialog pDialog;
    VideoView videoview;
    Audio aud;
	Bundle bd;
	MediaController mMediaController;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.play_video);

		/*bd = getIntent().getExtras();
		String val = bd.getString("play");
		videoview = (VideoView) findViewById(R.id.videoView1);
		videoview.setVideoPath(val);
		videoview.start();*/
		
		Toast.makeText(getApplicationContext(), "Please Wait...", Toast.LENGTH_LONG).show();

		bd = getIntent().getExtras();
		  mMediaController = new MediaController(this);
		  videoview = (VideoView)findViewById(R.id.videoView1);
		  videoview.setVideoPath(bd.getString("play"));
		  videoview.setMediaController(mMediaController);
		  videoview.setOnPreparedListener(new OnPreparedListener() {

		        @Override
		        public void onPrepared(MediaPlayer mp) {
		            // TODO Auto-generated method stub
		        	videoview.start();
		        }
		    });
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		videoview.stopPlayback();
	}
}