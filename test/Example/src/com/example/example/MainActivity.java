package com.example.example;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity implements android.view.View.OnClickListener {

    private Button button1;
	private TextView textV1;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        
        textV1 = (TextView) findViewById(R.id.text1);
        button1 = (Button) findViewById(R.id.button1);
        
        button1.setOnClickListener(this);

        
        
        
    }



	@Override
	public void onClick(View arg0) {
		
	    if (arg0 == button1)
	    {
	    	
	    	textV1.setText("Hello World...this is my Second App!");
	    	
	    }
		
		}
    
    
    
}
