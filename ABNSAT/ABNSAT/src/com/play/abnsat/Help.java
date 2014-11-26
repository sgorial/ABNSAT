package com.play.abnsat;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TableRow;
 
 
public class Help extends Activity {
 
    /** Called when the activity is first created. */
       
		LinearLayout fb,tw;
		
      @Override
      public void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.tab3);
          
          fb = (LinearLayout)findViewById(R.id.ll_fb);
          tw = (LinearLayout)findViewById(R.id.ll_tw);
          
          fb.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent viewIntent =new Intent("android.intent.action.VIEW",
				            Uri.parse("http://www.facebook.com/"));
				          startActivity(viewIntent);				
			}
		});
          
          tw.setOnClickListener(new OnClickListener() {
  			@Override
  			public void onClick(View v) {
  				Intent viewIntent =new Intent("android.intent.action.VIEW",
  				            Uri.parse("http://www.twitter.com/"));
  				          startActivity(viewIntent);				
  			}
  		});
          
        }
}