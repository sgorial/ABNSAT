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

	ImageView arabicPlayIcon, englishPlayIcon, worshipPlayIcon;
	ImageView surathPlayIcon, kurdishPlayIcon, alquddoosPlayIcon;
	ImageView prayerPlayIcon, europePlayIcon;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab1);

		arabicPlayIcon = (ImageView) findViewById(R.id.arabicPlayIcon);
		englishPlayIcon = (ImageView) findViewById(R.id.englishPlayIcon);
		worshipPlayIcon = (ImageView) findViewById(R.id.worshipPlayIcon);
		surathPlayIcon = (ImageView) findViewById(R.id.surathPlayIcon);
		kurdishPlayIcon = (ImageView) findViewById(R.id.kurdishPlayIcon);
		alquddoosPlayIcon = (ImageView) findViewById(R.id.alquddoosPlayIcon);
		prayerPlayIcon = (ImageView) findViewById(R.id.prayerPlayIcon);
		europePlayIcon = (ImageView) findViewById(R.id.europePlayIcon);

		arabicPlayIcon.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				playVideo("http://rtmp-arabic.abnsat.com/live/arabic/playlist.m3u8", "Arabic");
			}
		});

		englishPlayIcon.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				playVideo("http://rtmp-trinity.abnsat.com/live/trinity/playlist.m3u8", "English");
			}
		});

		worshipPlayIcon.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				playVideo("http://rtmp-worship.abnsat.com/live/worship/playlist.m3u8", "Worship");
			}
		});
		
		surathPlayIcon.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				playVideo("http://rtmp-surath.abnsat.com/live/surath/playlist.m3u8", "Surath");
			}
		});

		kurdishPlayIcon.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				playVideo("http://rtmp-kurdish.abnsat.com/live/kurdish/playlist.m3u8", "Kurdish");
			}
		});

		alquddoosPlayIcon.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				playVideo("http://rtmp-alquddoos.abnsat.com/live/alquddoos/playlist.m3u8", "Al Quddoos");
			}
		});
		
		prayerPlayIcon.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				playVideo("http://rtmp-prayer.abnsat.com/live/prayer/playlist.m3u8", "Prayer");
			}
		});

		europePlayIcon.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				playVideo("http://rtmp-abnhotbird.abnsat.com/live/abnhotbird/playlist.m3u8", "Europe & Middle East");
			}
		});
		
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
	
	
	
	protected void playVideo(String url, String title) {
		try {
			if (isConnectingToInternet()) {
				Intent inte = new Intent(getApplicationContext(), PlayVideo.class);
				inte.putExtra("play", url);
				inte.putExtra("name", title);
				startActivity(inte);
			} else {
				Toast.makeText(getApplicationContext(), "Please check your Internet Connection.",
						Toast.LENGTH_SHORT).show();
			}
		} catch (Exception e) {
			Toast.makeText(getApplicationContext(), "Error playing video: " + e.getMessage(),
					Toast.LENGTH_SHORT).show();
		}
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
