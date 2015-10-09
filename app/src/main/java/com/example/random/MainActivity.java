package com.example.random;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends Activity {
	


	Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b=(Button)findViewById(R.id.button1);
		
		//Exit from game
		 if (getIntent().getBooleanExtra("EXIT", false)) {
		        finish();
		        return;
		    }
		    
		 //passing name to center activity
		 
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				Intent i=new Intent(MainActivity.this,Center.class);
			    final EditText usern=(EditText)findViewById(R.id.username);
		     	i.putExtra("mona",usern.getText().toString());
				startActivity(i);
			}
			
			
		});
	}}
	
	
	