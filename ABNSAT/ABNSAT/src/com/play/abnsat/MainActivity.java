package com.play.abnsat;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;

public class MainActivity extends TabActivity implements OnTabChangeListener{
 
    /** Called when the activity is first created. */
      TabHost tabHost;
       
      @Override
      public void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.main_tab);
           
          // Get TabHost Refference
          tabHost = getTabHost();
           
          // Set TabChangeListener called when tab changed
          tabHost.setOnTabChangedListener(this);
       
          TabHost.TabSpec spec;
          Intent intent;
     
           /************* TAB1 ************/
          // Create  Intents to launch an Activity for the tab (to be reused)
          intent = new Intent().setClass(this, Tab1.class);
          spec = tabHost.newTabSpec("First").setIndicator("Watch Live",getResources().getDrawable(R.drawable.one))
                        .setContent(intent);
           
          //Add intent to tab
          tabHost.addTab(spec);
     
          /************* TAB2 ************/
          intent = new Intent().setClass(this, SampleActivity.class);
          spec = tabHost.newTabSpec("Second").setIndicator("Donate",getResources().getDrawable(R.drawable.two))
                        .setContent(intent);  
          tabHost.addTab(spec);
     
          /************* TAB3 ************/
          intent = new Intent().setClass(this, Help.class);
          spec = tabHost.newTabSpec("Third").setIndicator("Contact",getResources().getDrawable(R.drawable.three))
                        .setContent(intent);
          tabHost.addTab(spec);
     
          // Set drawable images to tab
          /*tabHost.getTabWidget().getChildAt(1).setBackgroundResource(R.drawable.heart);
          tabHost.getTabWidget().getChildAt(2).setBackgroundResource(R.drawable.phone);
          tabHost.getTabWidget().getChildAt(0).setBackgroundResource(R.drawable.tv);*/
          tabHost.getTabWidget().setCurrentTab(0);
           
     
       }
 
    @Override
    public void onTabChanged(String tabId) {
    /*     
         
        for(int i=0;i<tabHost.getTabWidget().getChildCount();i++)
        {
            if(i==0)
                tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.tv);
            else if(i==1)
                tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.heart);
            else if(i==2)
                tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.phone);
        }
         
         
        Log.i("tabs", "CurrentTab: "+tabHost.getCurrentTab());
         
    if(tabHost.getCurrentTab()==0)
        tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundResource(R.drawable.tv);
    else if(tabHost.getCurrentTab()==1)
        tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundResource(R.drawable.heart);
    else if(tabHost.getCurrentTab()==2)
        tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundResource(R.drawable.phone);
         
     */
    }
}
/*extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}*/
