package com.example.soundboard;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class DefBoard extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.defboard);
		AudioManager audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
		setVolumeControlStream(AudioManager.STREAM_MUSIC);

	}
	MediaPlayer media1loop;
	MediaPlayer media2loop;
	MediaPlayer media3loop;
	MediaPlayer media4loop;
	MediaPlayer media5loop;
	MediaPlayer media6loop;
	MediaPlayer media7loop;
	MediaPlayer media8loop;
	MediaPlayer media9loop;
	MediaPlayer media10loop;
	MediaPlayer media11loop;
	MediaPlayer media12loop;
	MediaPlayer media13loop;
	MediaPlayer media14loop;
	MediaPlayer media15loop;
	
	public void TogOnClick(View v) {
		switch (v.getId()) {
		case R.id.checkBox1:
	    	  if (media1loop==null) {
	    		  media1loop = MediaPlayer.create(this, R.raw.handroll_wav);
	    		  media1loop.setLooping(true);
	    		  media1loop.start();
	    	  }
	    	  else if (media1loop != null) {
	    		  media1loop.setLooping(false);
		    	  media1loop.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media1loop) {
		    		        media1loop.release();
		    		    };
		    		});
	    		  media1loop=null;
	    	  }
	    	  break;
		case R.id.checkBox2:
	    	  if (media2loop==null) {
	    		  media2loop = MediaPlayer.create(this, R.raw.gun_shoot);
	    		  media2loop.setLooping(true);
	    		  media2loop.start();
	    	  }
	    	  else if (media2loop != null) {
	    		  media2loop.setLooping(false);
		    	  media2loop.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media2loop) {
		    		        media2loop.release();
		    		    };
		    		});
	    		  media2loop=null;
	    	  }
	    	  break;
		case R.id.checkBox3:
	    	  if (media3loop==null) {
	    		  media3loop = MediaPlayer.create(this, R.raw.burp);
	    		  media3loop.setLooping(true);
	    		  media3loop.start();
	    	  }
	    	  else if (media3loop != null) {
	    		  media3loop.setLooping(false);
		    	  media3loop.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media3loop) {
		    		        media3loop.release();
		    		    };
		    		});
	    		  media3loop=null;
	    	  }
	    	  break;
		case R.id.checkBox4:
	    	  if (media4loop==null) {
	    		  media4loop = MediaPlayer.create(this, R.raw.laser);
	    		  media4loop.setLooping(true);
	    		  media4loop.start();
	    	  }
	    	  else if (media4loop != null) {
	    		  media4loop.setLooping(false);
		    	  media4loop.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media4loop) {
		    		        media4loop.release();
		    		    };
		    		});
	    		  media4loop=null;
	    	  }
	    	  break;
		case R.id.checkBox5:
	    	  if (media5loop==null) {
	    		  media5loop = MediaPlayer.create(this, R.raw.snare);
	    		  media5loop.setLooping(true);
	    		  media5loop.start();
	    	  }
	    	  else if (media5loop != null) {
	    		  media5loop.setLooping(false);
		    	  media5loop.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media5loop) {
		    		        media5loop.release();
		    		    };
		    		});
	    		  media5loop=null;
	    	  }
	    	  break;
		case R.id.checkBox6:
	    	  if (media6loop==null) {
	    		  media6loop = MediaPlayer.create(this, R.raw.chimp);
	    		  media6loop.setLooping(true);
	    		  media6loop.start();
	    	  }
	    	  else if (media6loop != null) {
	    		  media6loop.setLooping(false);
		    	  media6loop.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media6loop) {
		    		        media6loop.release();
		    		    };
		    		});
	    		  media6loop=null;
	    	  }
	    	  break;
		case R.id.checkBox7:
	    	  if (media7loop==null) {
	    		  media7loop = MediaPlayer.create(this, R.raw.button3);
	    		  media7loop.setLooping(true);
	    		  media7loop.start();
	    	  }
	    	  else if (media7loop != null) {
	    		  media7loop.setLooping(false);
		    	  media7loop.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media7loop) {
		    		        media7loop.release();
		    		    };
		    		});
	    		  media7loop=null;
	    	  }
	    	  break;
		case R.id.checkBox8:
	    	  if (media8loop==null) {
	    		  media8loop = MediaPlayer.create(this, R.raw.sonar);
	    		  media8loop.setLooping(true);
	    		  media8loop.start();
	    	  }
	    	  else if (media8loop != null) {
	    		  media8loop.setLooping(false);
		    	  media8loop.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media8loop) {
		    		        media8loop.release();
		    		    };
		    		});
	    		  media8loop=null;
	    	  }
	    	  break;
		case R.id.checkBox9:
	    	  if (media9loop==null) {
	    		  media9loop = MediaPlayer.create(this, R.raw.tom);
	    		  media9loop.setLooping(true);
	    		  media9loop.start();
	    	  }
	    	  else if (media9loop != null) {
	    		  media9loop.setLooping(false);
		    	  media9loop.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media9loop) {
		    		        media9loop.release();
		    		    };
		    		});
	    		  media9loop=null;
	    	  }
	    	  break;
		case R.id.checkBox10:
	    	  if (media10loop==null) {
	    		  media10loop = MediaPlayer.create(this, R.raw.sonar);
	    		  media10loop.setLooping(true);
	    		  media10loop.start();
	    	  }
	    	  else if (media10loop != null) {
	    		  media10loop.setLooping(false);
		    	  media10loop.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media10loop) {
		    		        media10loop.release();
		    		    };
		    		});
	    		  media10loop=null;
	    	  }
	    	  break;
		case R.id.checkBox11:
	    	  if (media11loop==null) {
	    		  media11loop = MediaPlayer.create(this, R.raw.sonar);
	    		  media11loop.setLooping(true);
	    		  media11loop.start();
	    	  }
	    	  else if (media11loop != null) {
	    		  media11loop.setLooping(false);
		    	  media11loop.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media11loop) {
		    		        media11loop.release();
		    		    };
		    		});
	    		  media11loop=null;
	    	  }
	    	  break;
		case R.id.checkBox12:
	    	  if (media12loop==null) {
	    		  media12loop = MediaPlayer.create(this, R.raw.sonar);
	    		  media12loop.setLooping(true);
	    		  media12loop.start();
	    	  }
	    	  else if (media12loop != null) {
	    		  media12loop.setLooping(false);
		    	  media12loop.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media12loop) {
		    		        media12loop.release();
		    		    };
		    		});
	    		  media12loop=null;
	    	  }
	    	  break;
		case R.id.checkBox13:
	    	  if (media13loop==null) {
	    		  media13loop = MediaPlayer.create(this, R.raw.sonar);
	    		  media13loop.setLooping(true);
	    		  media13loop.start();
	    	  }
	    	  else if (media13loop != null) {
	    		  media13loop.setLooping(false);
		    	  media13loop.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media13loop) {
		    		        media13loop.release();
		    		    };
		    		});
	    		  media13loop=null;
	    	  }
	    	  break;
		case R.id.checkBox14:
	    	  if (media14loop==null) {
	    		  media14loop = MediaPlayer.create(this, R.raw.sonar);
	    		  media14loop.setLooping(true);
	    		  media14loop.start();
	    	  }
	    	  else if (media14loop != null) {
	    		  media14loop.setLooping(false);
		    	  media14loop.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media14loop) {
		    		        media14loop.release();
		    		    };
		    		});
	    		  media14loop=null;
	    	  }
	    	  break;
		case R.id.checkBox15:
	    	  if (media15loop==null) {
	    		  media15loop = MediaPlayer.create(this, R.raw.sonar);
	    		  media15loop.setLooping(true);
	    		  media15loop.start();
	    	  }
	    	  else if (media15loop != null) {
	    		  media15loop.setLooping(false);
		    	  media15loop.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media15loop) {
		    		        media15loop.release();
		    		    };
		    		});
	    		  media15loop=null;
	    	  }
	    	  break;
		}
	}
	
	  public void ButtonOnClick1(View v) {
  
		    	  MediaPlayer media1 = MediaPlayer.create(this, R.raw.handroll_wav);
		    	  media1.start();
		    	  media1.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media1) {
		    		    	media1.release();
		    		    };	
		    		});  
	  }
	  public void ButtonOnClick2(View v) {
		    	  MediaPlayer media2 = MediaPlayer.create(this, R.raw.gun_shoot);
		    	  media2.start();
		    	  media2.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media2) {
		    		        media2.release();
		    		    };
		    		});
	  }
	  public void ButtonOnClick3(View v) {
		    	  MediaPlayer media3 = MediaPlayer.create(this, R.raw.burp);
		    	  media3.start();
		    	  media3.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media3) {
		    		        media3.release();

		    		    };
		    		});
	  }
	  public void ButtonOnClick4(View v) {
		    	  MediaPlayer media4 = MediaPlayer.create(this, R.raw.laser);
		    	  media4.start();
		    	  media4.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media4) {
		    		        media4.release();

		    		    };
		    		});
	  }
	  public void ButtonOnClick5(View v) {

		    	  MediaPlayer media5 = MediaPlayer.create(this, R.raw.snare);
		    	  media5.start();
		    	  media5.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media5) {
		    		        media5.release();

		    		    };
		    		});
	  }
	  public void ButtonOnClick6(View v) {
		    	  MediaPlayer media6 = MediaPlayer.create(this, R.raw.chimp);
		    	  media6.start();
		    	  media6.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media6) {
		    		        media6.release();

		    		    };
		    		});
	  }
	  public void ButtonOnClick7(View v) {
		    	  MediaPlayer media7 = MediaPlayer.create(this, R.raw.button3);
		    	  media7.start();
		    	  media7.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media7) {
		    		        media7.release();

		    		    };
		    		});
	  }
		    	  public void ButtonOnClick8(View v) {
		    	  MediaPlayer media8 = MediaPlayer.create(this, R.raw.sonar);
		    	  media8.start();
		    	  media8.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media8) {
		    		        media8.release();

		    		    };
		    		});
		    	  }
		    	  public void ButtonOnClick9(View v) {
		    	  MediaPlayer media9 = MediaPlayer.create(this, R.raw.tom);
		    	  media9.start();
		    	  media9.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media9) {
		    		        media9.release();

		    		    };
		    		});
		    	  }
		    	  public void ButtonOnClick10(View v) {
		    	  MediaPlayer media10 = MediaPlayer.create(this, R.raw.sonar);
		    	  media10.start();
		    	  media10.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media10) {
		    		        media10.release();

		    		    };
		    		});
		    	  }
		    	  public void ButtonOnClick11(View v) {
		    	  MediaPlayer media11 = MediaPlayer.create(this, R.raw.sonar);
		    	  media11.start();
		    	  media11.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media11) {
		    		        media11.release();

		    		    };
		    		});
		    	  }
		    	  public void ButtonOnClick12(View v) {
		    	  MediaPlayer media12 = MediaPlayer.create(this, R.raw.sonar);
		    	  media12.start();
		    	  media12.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media12) {
		    		        media12.release();

		    		    };
		    		});
		    	  }
		    	  public void ButtonOnClick13(View v) {
		    	  MediaPlayer media13 = MediaPlayer.create(this, R.raw.sonar);
		    	  media13.start();
		    	  media13.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media13) {
		    		        media13.release();

		    		    };
		    		});
		    	  }
		    	  public void ButtonOnClick14(View v) {
		    	  MediaPlayer media14 = MediaPlayer.create(this, R.raw.sonar);
		    	  media14.start();
		    	  media14.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media14) {
		    		        media14.release();

		    		    };
		    		});
		    	  }
		    	  public void ButtonOnClick15(View v) {
		    	  MediaPlayer media15 = MediaPlayer.create(this, R.raw.sonar);
		    	  media15.start();
		    	  media15.setOnCompletionListener(new OnCompletionListener() {
		    		    public void onCompletion(MediaPlayer media15) {
		    		        media15.release();

		    		    };
		    		});
		      }
	  @Override
	  public void onDestroy()
	  {
		  super.onDestroy();
    	  if (media1loop != null) {
    		  media1loop.setLooping(false);
	    	  media1loop.release();
    	  }
    	  if (media2loop != null) {
    		  media2loop.setLooping(false);
	    	  media2loop.release();
    	  }
    	  if (media3loop != null) {
    		  media3loop.setLooping(false);
	    	  media3loop.release();
    	  }
    	  if (media4loop != null) {
    		  media4loop.setLooping(false);
	    	  media4loop.release();
    	  }
    	  if (media5loop != null) {
    		  media5loop.setLooping(false);
	    	  media5loop.release();
    	  }
    	  if (media6loop != null) {
    		  media6loop.setLooping(false);
	    	  media6loop.release();
    	  }
    	  if (media7loop != null) {
    		  media7loop.setLooping(false);
	    	  media7loop.release();
    	  }
    	  if (media8loop != null) {
    		  media8loop.setLooping(false);
	    	  media8loop.release();
    	  }
    	  if (media9loop != null) {
    		  media9loop.setLooping(false);
	    	  media9loop.release();
    	  }
    	  if (media10loop != null) {
    		  media10loop.setLooping(false);
	    	  media10loop.release();
    	  }
    	  if (media11loop != null) {
    		  media11loop.setLooping(false);
	    	  media11loop.release();
    	  }
    	  if (media12loop != null) {
    		  media12loop.setLooping(false);
	    	  media12loop.release();
    	  }
    	  if (media13loop != null) {
    		  media13loop.setLooping(false);
	    	  media13loop.release();
    	  }
    	  if (media14loop != null) {
    		  media14loop.setLooping(false);
	    	  media14loop.release();
    	  }
    	  if (media15loop != null) {
    		  media15loop.setLooping(false);
	    	  media15loop.release();
    	  }
		  
	  }
}


