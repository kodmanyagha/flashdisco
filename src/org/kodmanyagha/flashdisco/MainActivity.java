package org.kodmanyagha.flashdisco;

import java.util.ArrayList;
import java.util.List;

import org.kodmanyagha.flashdisco.handlers.FlashButtonHandler;

import android.app.Activity;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

	public static Camera camera;
	
	protected List<Contact> getAllContacts() {
		List<Contact> contacts = new ArrayList<Contact>();
		contacts.add( new Contact("hello", "world") );
		
		return contacts;
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
		if ( MainActivity.camera == null ) {
			MainActivity.camera = Camera.open();
		}
		
        ToggleButton toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleButton1.setOnCheckedChangeListener(new FlashButtonHandler());
    }
}
