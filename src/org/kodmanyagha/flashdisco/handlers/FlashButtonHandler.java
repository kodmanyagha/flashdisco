package org.kodmanyagha.flashdisco.handlers;

import org.kodmanyagha.flashdisco.MainActivity;

import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.widget.CompoundButton;

public class FlashButtonHandler implements CompoundButton.OnCheckedChangeListener {

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		try {
			if (isChecked) {
				Parameters p = MainActivity.camera.getParameters();
				p.setFlashMode( Parameters.FLASH_MODE_TORCH );
				MainActivity.camera.setParameters(p);
				MainActivity.camera.startPreview();
			}
			else {
				Parameters p = MainActivity.camera.getParameters();
				p.setFlashMode( Parameters.FLASH_MODE_OFF );
				MainActivity.camera.setParameters(p);
				MainActivity.camera.startPreview();
			}
		}
		catch (Exception ex) {
			System.out.println( ex );
			
		}
	}
}
