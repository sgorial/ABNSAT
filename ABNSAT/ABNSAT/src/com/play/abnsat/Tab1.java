package com.play.abnsat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.VideoView;

public class Tab1 extends Activity {

	/** Called when the activity is first created. */

	VideoView videoView1;

	ImageView one, three, five;
	ImageView two, four, six;

	ImageView seven, eight, nine;
	ImageView ten, eleven, twelve;

	MediaPlayer media1 = new MediaPlayer(); 
	MediaPlayer media3 = new MediaPlayer();
	MediaPlayer media5 = new MediaPlayer();
	MediaPlayer media7 = new MediaPlayer();
	MediaPlayer media9 = new MediaPlayer(); 
	MediaPlayer media11 = new MediaPlayer();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab1);

		one = (ImageView) findViewById(R.id.imageView1);
		two = (ImageView) findViewById(R.id.imageView2);
		three = (ImageView) findViewById(R.id.imageView3);
		four = (ImageView) findViewById(R.id.imageView4);
		five = (ImageView) findViewById(R.id.imageView5);
		six = (ImageView) findViewById(R.id.imageView6);
		seven = (ImageView) findViewById(R.id.imageView7);
		eight = (ImageView) findViewById(R.id.imageView8);
		nine = (ImageView) findViewById(R.id.imageView9);
		ten = (ImageView) findViewById(R.id.imageView10);
		eleven = (ImageView) findViewById(R.id.imageView11);
		twelve = (ImageView) findViewById(R.id.imageView12);

		one.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					//media1 = new MediaPlayer();
					if (isConnectingToInternet()) {
						if(media1.isPlaying())
							media1.stop();
						media1.setAudioStreamType(AudioManager.USE_DEFAULT_STREAM_TYPE);
						media1.setDataSource("http://live.abnsat.com/arabic.m3u8");
						media1.prepare();
						media1.start();
						Toast.makeText(getApplicationContext(), "Playing...",
								Toast.LENGTH_LONG).show();
					} else {
						Toast.makeText(getApplicationContext(),
								"Please check your Internet Connection.",
								Toast.LENGTH_SHORT).show();
					}
				} catch (Exception e) {
				}
			}
		});

		three.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					//media3 = new MediaPlayer();

					if (isConnectingToInternet()) {
						if(media3.isPlaying())
							media3.stop();
						media3.setAudioStreamType(AudioManager.USE_DEFAULT_STREAM_TYPE);
						media3.setDataSource("http://live.abnsat.com/trinity.m3u8");
						media3.prepare();
						media3.start();
						Toast.makeText(getApplicationContext(), "Playing...",
								Toast.LENGTH_LONG).show();
					} else {
						Toast.makeText(getApplicationContext(),
								"Please check your Internet Connection.",
								Toast.LENGTH_SHORT).show();
					}
				} catch (Exception e) {
				}
			}
		});

		five.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					//media5 = new MediaPlayer();

					if (isConnectingToInternet()) {
						if(media5.isPlaying())
							media5.stop();
						media5.stop();
						media5.setAudioStreamType(AudioManager.USE_DEFAULT_STREAM_TYPE);
						media5.setDataSource("http://live.abnsat.com/worship.m3u8");
						media5.prepare();
						media5.start();
						Toast.makeText(getApplicationContext(), "Playing...",
								Toast.LENGTH_LONG).show();
					} else {
						Toast.makeText(getApplicationContext(),
								"Please check your Internet Connection.",
								Toast.LENGTH_SHORT).show();
					}
				} catch (Exception e) {
				}
			}
		});

		seven.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					//media7 = new MediaPlayer();

					if (isConnectingToInternet()) {
						if(media7.isPlaying())
							media7.stop();
						media7.setAudioStreamType(AudioManager.USE_DEFAULT_STREAM_TYPE);
						media7.setDataSource("http://live.abnsat.com/surath.m3u8");
						media7.prepare();
						media7.start();
						Toast.makeText(getApplicationContext(), "Playing...",
								Toast.LENGTH_LONG).show();
					} else {
						Toast.makeText(getApplicationContext(),
								"Please check your Internet Connection.",
								Toast.LENGTH_SHORT).show();
					}
				} catch (Exception e) {
					Log.e("aaa", "a"+e);
				}
			}
		});

		nine.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					//media9 = new MediaPlayer();

					if (isConnectingToInternet()) {
						if(media9.isPlaying())
							media9.stop();
						media9.setAudioStreamType(AudioManager.USE_DEFAULT_STREAM_TYPE);
						media9.setDataSource("http://live.abnsat.com/kurdish.m3u8");
						media9.prepare();
						media9.start();
						Toast.makeText(getApplicationContext(), "Playing...",
								Toast.LENGTH_LONG).show();
					} else {
						Toast.makeText(getApplicationContext(),
								"Please check your Internet Connection.",
								Toast.LENGTH_SHORT).show();
					}
				} catch (Exception e) {
					Log.e("aaa", "a"+e);

				}
			}
		});

		eleven.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					//media11 = new MediaPlayer();

					if (isConnectingToInternet()) {
						if(media11.isPlaying())
							media11.stop();
						media11.setAudioStreamType(AudioManager.USE_DEFAULT_STREAM_TYPE);
						media11.setDataSource("http://live.abnsat.com/alquddoos.m3u8");
						media11.prepare();
						media11.start();
						Toast.makeText(getApplicationContext(), "Playing...",
								Toast.LENGTH_LONG).show();
					} else {
						Toast.makeText(getApplicationContext(),
								"Please check your Internet Connection.",
								Toast.LENGTH_SHORT).show();
					}
				} catch (Exception e) {
				}
			}
		});

		two.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (isConnectingToInternet()) {
					Intent inte = new Intent(getApplicationContext(),
							PlayVideoDemo.class);
					inte.putExtra(
							"play",
							"http://live.abnsat.com/arabic.m3u8");
					inte.putExtra(
							"name",
							"Arabic Stream");
					startActivity(inte);
				} else {
					Toast.makeText(getApplicationContext(),
							"Please check your Internet Connection.",
							Toast.LENGTH_SHORT).show();
				}

			}
		});

		four.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				if (isConnectingToInternet()) {
					Intent inte = new Intent(getApplicationContext(),
							PlayVideo.class);
					inte.putExtra(
							"play",
							"http://live.abnsat.com/trinity.m3u8");
					inte.putExtra(
							"name",
							"English Stream");
					startActivity(inte);
				} else {
					Toast.makeText(getApplicationContext(),
							"Please check your Internet Connection.",
							Toast.LENGTH_SHORT).show();
				}
			}
		});

		six.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (isConnectingToInternet()) {
					Intent inte = new Intent(getApplicationContext(),
							PlayVideo.class);
					inte.putExtra(
							"play",
							"http://live.abnsat.com/worship.m3u8");
					inte.putExtra(
							"name",
							"Worship Stream");
					startActivity(inte);
				} else {
					Toast.makeText(getApplicationContext(),
							"Please check your Internet Connection.",
							Toast.LENGTH_SHORT).show();
				}
			}
		});
		eight.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (isConnectingToInternet()) {
					Intent inte = new Intent(getApplicationContext(),
							PlayVideo.class);
					inte.putExtra("play",
							"http://live.abnsat.com/surath.m3u8");
					inte.putExtra(
							"name",
							"Surath Stream");
					startActivity(inte);
				} else {
					Toast.makeText(getApplicationContext(),
							"Please check your Internet Connection.",
							Toast.LENGTH_SHORT).show();
				}

			}
		});

		ten.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (isConnectingToInternet()) {
					Intent inte = new Intent(getApplicationContext(),
							PlayVideo.class);
					inte.putExtra("play",
							"http://live.abnsat.com/kurdish.m3u8");
					inte.putExtra(
							"name",
							"Kurdish Stream");
					startActivity(inte);
				} else {
					Toast.makeText(getApplicationContext(),
							"Please check your Internet Connection.",
							Toast.LENGTH_SHORT).show();
				}
			}
		});

		twelve.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (isConnectingToInternet()) {
					Intent inte = new Intent(getApplicationContext(),
							PlayVideo.class);
					inte.putExtra("play",
							"http://live.abnsat.com/alquddoos.m3u8");
					inte.putExtra("name",
							"Al Quddoos Stream");
					startActivity(inte);
				} else {
					Toast.makeText(getApplicationContext(),
							"Please check your Internet Connection.",
							Toast.LENGTH_SHORT).show();
				}
			}
		});

		/*
		 * videoView1 = (VideoView)findViewById(R.id.videoView1);
		 * videoView1.setVideoPath("http://surath.abnsat.com/surath/live.m3u8");
		 * videoView1.start();
		 */

		// mPreview = (SurfaceView) findViewById(R.id.videoView1);
	}

	public boolean isConnectingToInternet() {
		ConnectivityManager connectivity = (ConnectivityManager) Tab1.this
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		if (connectivity != null) {
			NetworkInfo[] info = connectivity.getAllNetworkInfo();
			if (info != null)
				for (int i = 0; i < info.length; i++)
					if (info[i].getState() == NetworkInfo.State.CONNECTED) {
						return true;
					}
		}
		return false;
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		if(media1.isPlaying())
			media1.stop();
		if(media3.isPlaying())
			media3.stop();
		if(media5.isPlaying())
			media5.stop();
		if(media7.isPlaying())
			media7.stop();
		if(media9.isPlaying())
			media9.stop();
		if(media11.isPlaying())
			media11.stop();
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		if(media1.isPlaying())
			media1.stop();
		if(media3.isPlaying())
			media3.stop();
		if(media5.isPlaying())
			media5.stop();
		if(media7.isPlaying())
			media7.stop();
		if(media9.isPlaying())
			media9.stop();
		if(media11.isPlaying())
			media11.stop();
	}
}

/*
 * Sorry for the delay. Here are the HLS streaming URLs which are in order as
 * they appear on the iOS app. They contain both audio and video.
 * 
 * As far as PayPal, I can't provide you much info as that violates company
 * privacy, so just use a dummy account and I can switch accounts later.
 * 
 * Let me know if you need anything else as well as what progress you've made so
 * far.
 * 
 * Audio first 2
 * http://abnarabic-live.hls.adaptive.level3.net/hls-live/abnarabic
 * -live/_definst_/live.m3u8
 * 
 * http://abnenglish-live.hls.adaptive.level3.net/hls-live/abnenglish-live/_definst_
 * /live.m3u8
 * 
 * http://abnworshipchannel-live.hls.adaptive.level3.net/hls-live/abnworshipchannel
 * -live/_definst_/live.m3u8
 * 
 * http://surath.abnsat.com/surath/live.m3u8
 * 
 * http://kurdish.abnsat.com/kurdish/live.m3u8
 * 
 * http://alquddoos.abnsat.com/alquddoos/live.m3u8
 */
