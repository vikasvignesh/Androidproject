package com.example.calculator;

import android.R.integer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button b1,b2,b3,b4;
	EditText e1,e2,e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     b1=(Button) findViewById(R.id.button1);
     b2=(Button) findViewById(R.id.button2);
     b3=(Button) findViewById(R.id.button3);
     b4=(Button) findViewById(R.id.button4);
     
     e1=(EditText) findViewById(R.id.editText1);
     e2=(EditText) findViewById(R.id.editText2);
     e3=(EditText) findViewById(R.id.editText3);

     b1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
		int a,b,c;
		a=Integer.parseInt(e1.getText().toString());
		b=Integer.parseInt(e2.getText().toString());
		c=a+b;
		e3.setText(Integer.toString(c));

		}
	});
b2.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	int a,b,c;
	a=Integer.parseInt(e1.getText().toString());
	b=Integer.parseInt(e2.getText().toString());
	c=a-b;
	e3.setText(Integer.toString(c));
	
	}
});
     b3.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			int a,b,c;
			a=Integer.parseInt(e1.getText().toString());
			b=Integer.parseInt(e2.getText().toString());
			c=a*b;
			e3.setText(Integer.toString(c));
		}
	});
     b4.setOnClickListener(new OnClickListener() {
 		
 		@Override
 		public void onClick(View arg0) {
 			// TODO Auto-generated method stub
 		int a,b,c;
 		a=Integer.parseInt(e1.getText().toString());
 		b=Integer.parseInt(e2.getText().toString());
 		c=a/b;
 		e3.setText(Integer.toString(c));

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
