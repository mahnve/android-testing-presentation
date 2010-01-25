package se.mahnve.dice;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Dice extends Activity implements OnClickListener, SensorEventListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        SensorManager sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(SensorManager.SENSOR_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
    }


	@Override
	public void onClick(View v) {
		int result = rollDice();
		TextView textView = (TextView) findViewById(R.id.result);
		textView.setText(String.valueOf(result));
	}


	private int rollDice() {
		return new DiceThrower().rollDice();
	}



	public void onSensorChanged(SensorEvent event) {
		float yAxis = event.values[SensorManager.DATA_Y];                    
		float xAxis = event.values[SensorManager.DATA_X];
		if(yAxis>10 ||xAxis>10){
			rollDice();
		}
	}
	
	public void onAccuracyChanged(Sensor sensor, int accuracy)
		{                }




	
    
}