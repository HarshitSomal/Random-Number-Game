package com.example.random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Third extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		Button exit=(Button)findViewById(R.id.exit);
		Button play=(Button)findViewById(R.id.pagain);
		TextView score=(TextView)findViewById(R.id.score);
		///passed score
	    score.setText(getIntent().getExtras().getString("mohali"));
	
		
		//Play again button
		play.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent p=new Intent(Third.this,MainActivity.class);
				startActivity(p);
				
				
			}
		});
		
		//Exit button
		exit.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent z = new Intent(Third.this, MainActivity.class);
	            z.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);  
				z.putExtra("EXIT", true);
				startActivity(z);
				return;
				
				
			}
		});
		
		
	}

	
	
}
