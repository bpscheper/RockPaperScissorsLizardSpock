package com.example.rockpaperscissorslizardspock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class JoinGame extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_join_game);
		
		final Button join= (Button)findViewById(R.id.join);
		join.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				
			Intent intent = new Intent(JoinGame.this, Game.class);
			EditText host= (EditText)findViewById(R.id.host);
			EditText port= (EditText)findViewById(R.id.port);
			String message1= port.getText().toString();
			String message2= host.getText().toString();
			intent.putExtra(message1, message2);
 			startActivity(intent);
			
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.join_game, menu);
		return true;
	}

}
