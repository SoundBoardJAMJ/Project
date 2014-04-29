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
				
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}
	
	  public void ButtonOnClick(View v) {
		  AudioManager audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
		  setVolumeControlStream(AudioManager.STREAM_MUSIC);
		    switch (v.getId()) {
		      case R.id.button1:
		    	  MediaPlayer media1 = MediaPlayer.create(this, R.raw.handroll_wav);
		    	  media1.start();
		    	  media1.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media1) {
		    		        media1.release();

		    		    };
		    		});
		        break;
		      case R.id.button2:
		    	  MediaPlayer media2 = MediaPlayer.create(this, R.raw.gun_shoot);
		    	  media2.start();
		    	  media2.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media2) {
		    		        media2.release();

		    		    };
		    		});
		        break;
		      case R.id.button3:
		    	  MediaPlayer media3 = MediaPlayer.create(this, R.raw.burp);
		    	  media3.start();
		    	  media3.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media3) {
		    		        media3.release();

		    		    };
		    		});
		        break;
		      case R.id.button4:
		    	  MediaPlayer media4 = MediaPlayer.create(this, R.raw.laser);
		    	  media4.start();
		    	  media4.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media4) {
		    		        media4.release();

		    		    };
		    		});
		        break;
		      case R.id.button5:
		    	  MediaPlayer media5 = MediaPlayer.create(this, R.raw.snare);
		    	  media5.start();
		    	  media5.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media5) {
		    		        media5.release();

		    		    };
		    		});
		        break;
		      case R.id.button6:
		    	  MediaPlayer media6 = MediaPlayer.create(this, R.raw.chimp);
		    	  media6.start();
		    	  media6.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media6) {
		    		        media6.release();

		    		    };
		    		});
		        break;
		      case R.id.button7:
		    	  MediaPlayer media7 = MediaPlayer.create(this, R.raw.button3);
		    	  media7.start();
		    	  media7.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media7) {
		    		        media7.release();

		    		    };
		    		});
		        break;
		      case R.id.button8:
		    	  MediaPlayer media8 = MediaPlayer.create(this, R.raw.sonar);
		    	  media8.start();
		    	  media8.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media8) {
		    		        media8.release();

		    		    };
		    		});
		        break;
		      case R.id.button9:
		    	  MediaPlayer media9 = MediaPlayer.create(this, R.raw.tom);
		    	  media9.start();
		    	  media9.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media9) {
		    		        media9.release();

		    		    };
		    		});
		        break;
		      case R.id.button10:
		    	  MediaPlayer media10 = MediaPlayer.create(this, R.raw.sonar);
		    	  media10.start();
		    	  media10.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media10) {
		    		        media10.release();

		    		    };
		    		});
		        break;
		      case R.id.button11:
		    	  MediaPlayer media11 = MediaPlayer.create(this, R.raw.sonar);
		    	  media11.start();
		    	  media11.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media11) {
		    		        media11.release();

		    		    };
		    		});
		        break;
		      case R.id.button12:
		    	  MediaPlayer media12 = MediaPlayer.create(this, R.raw.sonar);
		    	  media12.start();
		    	  media12.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media12) {
		    		        media12.release();

		    		    };
		    		});
		        break;
		      case R.id.button13:
		    	  MediaPlayer media13 = MediaPlayer.create(this, R.raw.sonar);
		    	  media13.start();
		    	  media13.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media13) {
		    		        media13.release();

		    		    };
		    		});
		        break;
		      case R.id.button14:
		    	  MediaPlayer media14 = MediaPlayer.create(this, R.raw.sonar);
		    	  media14.start();
		    	  media14.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media14) {
		    		        media14.release();

		    		    };
		    		});
		        break;
		      case R.id.button15:
		    	  MediaPlayer media15 = MediaPlayer.create(this, R.raw.sonar);
		    	  media15.start();
		    	  media15.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media15) {
		    		        media15.release();

		    		    };
		    		});
		        break;
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
