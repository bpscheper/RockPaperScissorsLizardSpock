package com.example.rockpaperscissorslizardspock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final Button joinGame= (Button)findViewById(R.id.joinGame);
		joinGame.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				
			Intent intent = new Intent(MainActivity.this, JoinGame.class);
			EditText username= (EditText)findViewById(R.id.username);
			String message = username.getText().toString();
			
			intent.putExtra("name",message);
			startActivity(intent); 
			
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
