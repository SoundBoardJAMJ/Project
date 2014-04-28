package com.example.soundtest;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		//View.OnClickListener myhandler1;
	//	Button mbutton;
		//mbutton = (Button) findViewById(R.id.button1);
		//mbutton.setOnClickListener(myhandler1);

		/*mbutton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v){
				//media.start();
			}
		});*/
			
			
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}
	
	/*8View.OnClickListener myhandler1 = new View.OnClickListener() {
	    public void onClick(View v) {
	      // it was the 1st button
	    }
	  };
	  */

	
	/*final MediaPlayer media3 = MediaPlayer.create(this, R.raw.button3);
	final MediaPlayer media4 = MediaPlayer.create(this, R.raw.button3);
	final MediaPlayer media5 = MediaPlayer.create(this, R.raw.button3);
	final MediaPlayer media6 = MediaPlayer.create(this, R.raw.button3);
	final MediaPlayer media7 = MediaPlayer.create(this, R.raw.button3);
	final MediaPlayer media8 = MediaPlayer.create(this, R.raw.button3);*/
	  public void ButtonOnClick(View v) {
		  AudioManager audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
		  audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, 5, 0);
		    switch (v.getId()) {
		      case R.id.button1:
		    	  MediaPlayer media1 = MediaPlayer.create(this, R.raw.button3);
		    	  media1.start();
		    	  media1.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media1) {
		    		        media1.release();

		    		    };
		    		});
		        break;
		      case R.id.button2:
		    	  MediaPlayer media2 = MediaPlayer.create(this, R.raw.button3);
		    	  media2.start();
		    	  media2.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media2) {
		    		        media2.release();

		    		    };
		    		});
		        break;
		     /* case R.id.button3:
		    	  media3.start();
		        break;
		      case R.id.button4:
		    	  media4.start();
		        break;
		      case R.id.button5:
		    	  media5.start();
		        break;
		      case R.id.button6:
		    	  media6.start();
		        break;
		      case R.id.button7:
		    	  media7.start();
		        break;
		      case R.id.button8:
		    	  media8.start();
		        break;*/
		      }
		  
		    
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

	
	 //A placeholder fragment containing a simple view.
	 
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
