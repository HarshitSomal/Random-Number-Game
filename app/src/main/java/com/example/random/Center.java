package com.example.random;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Center extends ActionBarActivity {

	int count=0;
	int chance=5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_center);
	
	
	     
	        TextView display=(TextView)findViewById(R.id.passname);
	        //passed name from Main activity
	        display.setText(getIntent().getExtras().getString("mona"));
	     
	       
	       
	         final TextView score=(TextView)findViewById(R.id.scoree);
		     final TextView chances=(TextView)findViewById(R.id.textView7); 
		     final TextView randomno=(TextView)findViewById(R.id.textView5);
		     final EditText number=(EditText)findViewById(R.id.editText1);   		
			 
			   
			   
		      
			// EXIT button-passing score to third activity
	       Button exit=(Button)findViewById(R.id.button1);
	       exit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent i=new Intent(Center.this,Third.class);  
	     	i.putExtra("mohali",score.getText().toString());
			startActivity(i);
			} 
	       
		});
	       
	       
	       // submit Button
	       Button sub=(Button)findViewById(R.id.button2);
	       sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
						
			       //random no generates
				
				    String rando="";
			     	Random r=new Random();
			        int SN =r.nextInt(20)+1;
			        rando=Integer.toString(SN);
				    randomno.setText(rando);
			
		            int GN=Integer.parseInt(number.getText().toString());
				
				
					if(GN==SN)
				{
				        
						count++;
					score.setText("Score=="+count);
					Toast.makeText(Center.this,"Congratulations",Toast.LENGTH_LONG).show();
				}
				else 
					{
					
						
						if(chance>0)
						{
							chance--;
							}
						
						    chances.setText("Chances Left="+chance);	 
				}
				
					
			}
			
	       });
	
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.center, menu);
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_center,
					container, false);
			return rootView;
		}
	}

}
