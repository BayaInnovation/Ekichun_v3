package com.ethiopiankids.puzzel;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.SoundPool;
import android.view.View;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.DialogFragment;


public class Level20Activity extends  Activity { 
	
	private Timer _timer = new Timer();
	
	private double err = 0;
	private double corr = 0;
	private double ran = 0;
	private String val = "";
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private LinearLayout linear22;
	private LinearLayout linear4;
	private LinearLayout linear20;
	private LinearLayout linear3;
	private TextView textview3;
	private ImageView imageview1;
	private LinearLayout linear17;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear5;
	private TextView textview1;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private Button o1;
	private LinearLayout linear11;
	private Button o2;
	private Button o3;
	private LinearLayout linear12;
	private Button o4;
	
	private Intent i = new Intent();
	private TimerTask time;
	private AlertDialog.Builder d;
	private SoundPool sound;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.level20);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		textview3 = (TextView) findViewById(R.id.textview3);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		o1 = (Button) findViewById(R.id.o1);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		o2 = (Button) findViewById(R.id.o2);
		o3 = (Button) findViewById(R.id.o3);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		o4 = (Button) findViewById(R.id.o4);
		d = new AlertDialog.Builder(this);
		
		o1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_er();
				imageview1.setRotation((float)(15));
				time = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								imageview1.setRotation((float)(0));
							}
						});
					}
				};
				_timer.schedule(time, (int)(300));
			}
		});
		
		o2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_er();
				imageview1.setRotation((float)(15));
				time = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								imageview1.setRotation((float)(0));
							}
						});
					}
				};
				_timer.schedule(time, (int)(300));
			}
		});
		
		o3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_cor();
				imageview1.setImageResource(R.drawable.image_search_1678045056574_4);
				time = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_first();
							}
						});
					}
				};
				_timer.schedule(time, (int)(300));
			}
		});
		
		o4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_er();
				imageview1.setRotation((float)(15));
				time = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								imageview1.setRotation((float)(0));
							}
						});
					}
				};
				_timer.schedule(time, (int)(300));
			}
		});
	}
	
	private void initializeLogic() {
		sound = new SoundPool((int)(1), AudioManager.STREAM_MUSIC, 0);
		sound = new SoundPool((int)(2), AudioManager.STREAM_MUSIC, 0);
		err = sound.load(getApplicationContext(), R.raw.fail, 1);
		corr = sound.load(getApplicationContext(), R.raw.correct, 1);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		d.setTitle("ማስጠንቀቅያ");
		d.setMessage("ጨዋታውን መዝጋት ይፈልጋሉ?");
		d.setPositiveButton("አዎ", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				finish();
			}
		});
		d.setNegativeButton("ይቅር", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		d.setCancelable(false);
		d.create().show();
	}
	
	@Override
	public void onResume() {
		super.onResume();
		imageview1.setImageResource(R.drawable.reward2);
		o1.setEnabled(true);
		o2.setEnabled(true);
		o3.setEnabled(true);
		o4.setEnabled(true);
	}
	public void _first () {
		final AlertDialog dialog1 = new AlertDialog.Builder(Level20Activity.this).create();
		View inflate = getLayoutInflater().inflate(R.layout.dialog2,null); 
		dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
		dialog1.setView(inflate);
		
		TextView b1 = (TextView) inflate.findViewById(R.id.b1);
		
		TextView b2 = (TextView) inflate.findViewById(R.id.b2);
		
		TextView close = (TextView) inflate.findViewById(R.id.close);
		
		
		LinearLayout bg = (LinearLayout) inflate.findViewById(R.id.bg);
		b1.setText("ቀዳማይ");
		b2.setText("ቀጣይ");
		b1.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				//action one
				_prev();
				dialog1.dismiss();
				dialog1.dismiss();
			}
		});
		b2.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				dialog1.dismiss();
			}
		});
		b2.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				_cont();
				dialog1.dismiss();
			}
		});
		dialog1.setCancelable(false);
		dialog1.show();
	}
	
	
	public void _prev () {
		i.setClass(getApplicationContext(), Level19Activity.class);
		startActivity(i);
		finish();
	}
	
	
	public void _next () {
		i.setClass(getApplicationContext(), Level21Activity.class);
		startActivity(i);
		finish();
	}
	
	
	public void _er () {
		err = sound.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
	}
	
	
	public void _cor () {
		corr = sound.play((int)(2), 1.0f, 1.0f, 1, (int)(0), 1.0f);
	}
	
	
	public void _passworddialog () {
		final AlertDialog dialog1 = new AlertDialog.Builder(Level20Activity.this).create();
		View inflate = getLayoutInflater().inflate(R.layout.password,null); 
		dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
		dialog1.setView(inflate);
		
		TextView pw = (TextView) inflate.findViewById(R.id.pw);
		
		TextView close = (TextView) inflate.findViewById(R.id.close);
		
		final TextView pw1 = (TextView) inflate.findViewById(R.id.pw1);
		
		final TextView pw2 = (TextView) inflate.findViewById(R.id.pw2);
		
		final TextView pw3 = (TextView) inflate.findViewById(R.id.pw3);
		
		final TextView pw4 = (TextView) inflate.findViewById(R.id.pw4);
		
		
		
		
		
		final TextView one = (TextView) inflate.findViewById(R.id.one);
		
		final TextView two = (TextView) inflate.findViewById(R.id.two);
		
		final TextView three = (TextView) inflate.findViewById(R.id.three);
		
		final TextView four = (TextView) inflate.findViewById(R.id.four);
		
		final TextView five = (TextView) inflate.findViewById(R.id.five);
		
		final TextView six = (TextView) inflate.findViewById(R.id.six);
		
		final TextView seven = (TextView) inflate.findViewById(R.id.seven);
		
		final TextView eight = (TextView) inflate.findViewById(R.id.eight);
		
		final TextView nine = (TextView) inflate.findViewById(R.id.nine);
		
		final TextView zero = (TextView) inflate.findViewById(R.id.zero);
		
		
		
		
		
		
		
		final TextView del = (TextView) inflate.findViewById(R.id.del);
		
		
		
		
		LinearLayout holder = (LinearLayout) inflate.findViewById(R.id.holder);
		
		
		_Shadow(20, 20, "#fcab1c", holder);
		_Edittext(pw1);
		_Edittext(pw2);
		_Edittext(pw3);
		_Edittext(pw4);
		ran = SketchwareUtil.getRandom((int)(1000), (int)(9999));
		val = String.valueOf((long)(ran));
		pw.setText(val);
		one.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				//action one
				if (pw1.getText().toString().equals("_")) {
					pw1.setText("1");
				}
				else {
					if (pw2.getText().toString().equals("_")) {
						pw2.setText("1");
					}
					else {
						if (pw3.getText().toString().equals("_")) {
							pw3.setText("1");
						}
						else {
							if (pw4.getText().toString().equals("_")) {
								pw4.setText("1");
							}
							else {
								
							}
						}
					}
				}
			}
		});
		two.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				//action one
				if (pw1.getText().toString().equals("_")) {
					pw1.setText("2");
				}
				else {
					if (pw2.getText().toString().equals("_")) {
						pw2.setText("2");
					}
					else {
						if (pw3.getText().toString().equals("_")) {
							pw3.setText("2");
						}
						else {
							if (pw4.getText().toString().equals("_")) {
								pw4.setText("2");
							}
							else {
								
							}
						}
					}
				}
			}
		});
		three.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				//action one
				if (pw1.getText().toString().equals("_")) {
					pw1.setText("3");
				}
				else {
					if (pw2.getText().toString().equals("_")) {
						pw2.setText("3");
					}
					else {
						if (pw3.getText().toString().equals("_")) {
							pw3.setText("3");
						}
						else {
							if (pw4.getText().toString().equals("_")) {
								pw4.setText("3");
							}
							else {
								
							}
						}
					}
				}
			}
		});
		four.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				//action one
				if (pw1.getText().toString().equals("_")) {
					pw1.setText("4");
				}
				else {
					if (pw2.getText().toString().equals("_")) {
						pw2.setText("4");
					}
					else {
						if (pw3.getText().toString().equals("_")) {
							pw3.setText("4");
						}
						else {
							if (pw4.getText().toString().equals("_")) {
								pw4.setText("4");
							}
							else {
								
							}
						}
					}
				}
			}
		});
		five.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				//action one
				if (pw1.getText().toString().equals("_")) {
					pw1.setText("5");
				}
				else {
					if (pw2.getText().toString().equals("_")) {
						pw2.setText("5");
					}
					else {
						if (pw3.getText().toString().equals("_")) {
							pw3.setText("5");
						}
						else {
							if (pw4.getText().toString().equals("_")) {
								pw4.setText("5");
							}
							else {
								
							}
						}
					}
				}
			}
		});
		six.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				//action one
				if (pw1.getText().toString().equals("_")) {
					pw1.setText("6");
				}
				else {
					if (pw2.getText().toString().equals("_")) {
						pw2.setText("6");
					}
					else {
						if (pw3.getText().toString().equals("_")) {
							pw3.setText("6");
						}
						else {
							if (pw4.getText().toString().equals("_")) {
								pw4.setText("6");
							}
							else {
								
							}
						}
					}
				}
			}
		});
		seven.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				//action one
				if (pw1.getText().toString().equals("_")) {
					pw1.setText("7");
				}
				else {
					if (pw2.getText().toString().equals("_")) {
						pw2.setText("7");
					}
					else {
						if (pw3.getText().toString().equals("_")) {
							pw3.setText("7");
						}
						else {
							if (pw4.getText().toString().equals("_")) {
								pw4.setText("7");
							}
							else {
								
							}
						}
					}
				}
			}
		});
		eight.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				//action one
				if (pw1.getText().toString().equals("_")) {
					pw1.setText("8");
				}
				else {
					if (pw2.getText().toString().equals("_")) {
						pw2.setText("8");
					}
					else {
						if (pw3.getText().toString().equals("_")) {
							pw3.setText("8");
						}
						else {
							if (pw4.getText().toString().equals("_")) {
								pw4.setText("8");
							}
							else {
								
							}
						}
					}
				}
			}
		});
		nine.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				//action one
				if (pw1.getText().toString().equals("_")) {
					pw1.setText("9");
				}
				else {
					if (pw2.getText().toString().equals("_")) {
						pw2.setText("9");
					}
					else {
						if (pw3.getText().toString().equals("_")) {
							pw3.setText("9");
						}
						else {
							if (pw4.getText().toString().equals("_")) {
								pw4.setText("9");
							}
							else {
								
							}
						}
					}
				}
			}
		});
		zero.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				//action one
				if (pw1.getText().toString().equals("_")) {
					pw1.setText("0");
				}
				else {
					if (pw2.getText().toString().equals("_")) {
						pw2.setText("0");
					}
					else {
						if (pw3.getText().toString().equals("_")) {
							pw3.setText("0");
						}
						else {
							if (pw4.getText().toString().equals("_")) {
								pw4.setText("0");
							}
							else {
								
							}
						}
					}
				}
			}
		});
		close.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				dialog1.dismiss();
			}
		});
		del.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				//action one
				if (!pw4.getText().toString().equals("_")) {
					pw4.setText("_");
				}
				else {
					if (!pw3.getText().toString().equals("_")) {
						pw3.setText("_");
					}
					else {
						if (!pw2.getText().toString().equals("_")) {
							pw2.setText("_");
						}
						else {
							if (!pw1.getText().toString().equals("_")) {
								pw1.setText("_");
							}
							else {
								
							}
						}
					}
				}
			}
		});
		pw4.addTextChangedListener(new TextWatcher() { 
			   @Override 
			   public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) { 
				    final String _charSeq = _param1.toString(); 
				    
				
				     
				if (pw1.getText().toString().concat(pw2.getText().toString().concat(pw3.getText().toString().concat(pw4.getText().toString()))).equals(String.valueOf((long)(ran)))) {
					_next();
				}
				else {
					
				}
				   } 
			    
			   @Override 
			   public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) { 
				     
				   } 
			    
			   @Override 
			   public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		
		
		
		dialog1.setCancelable(false);
		dialog1.show();
	}
	
	
	public void _cont () {
		_passworddialog();
	}
	
	
	public void _Edittext (final View _view) {
		android.graphics.drawable.GradientDrawable CRNSO = new android.graphics.drawable.GradientDrawable();
		CRNSO.setColor(Color.parseColor("#ffffff"));
		CRNSO.setCornerRadii(new float[]{ (float) 14,(float) 14,(float) 14,(float) 14,(float) 14,(float) 14,(float) 14,(float) 14 });
		CRNSO.setStroke((int) 2, Color.parseColor("#0014ff"));
		_view.setElevation((float) 10);
		_view.setBackground(CRNSO);
	}
	
	
	public void _Shadow (final double _sadw, final double _cru, final String _wc, final View _widgets) {
		android.graphics.drawable.GradientDrawable wd = new android.graphics.drawable.GradientDrawable();
		wd.setColor(Color.parseColor(_wc));
		wd.setCornerRadius((int)_cru);
		_widgets.setElevation((int)_sadw);
		_widgets.setBackground(wd);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}