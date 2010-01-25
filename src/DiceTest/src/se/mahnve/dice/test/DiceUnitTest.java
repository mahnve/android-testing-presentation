package se.mahnve.dice.test;

import se.mahnve.dice.Dice;
import se.mahnve.dice.R;
import android.hardware.SensorEvent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static android.test.ViewAsserts.*;
import static android.test.TouchUtils.*;

public class DiceUnitTest extends ActivityInstrumentationTestCase2<Dice> {

	private Button button;
	private TextView result;

	public DiceUnitTest() {
		super("se.mahnve.dice", Dice.class);
	}
	
	public void setUp() {
		result = (TextView) getActivity().findViewById(R.id.result);
		button = (Button) getActivity().findViewById(R.id.button);		
	}
	
	public void testClickButtonShouldRollDice() throws Exception {
		clickView(this, button);
		assertValidThrow(result);
	}

	
	public void testResultShouldBeBelowButton() throws Exception {
		assertLeftAligned(button, result);
	}

	private void assertValidThrow(TextView textView) {
		assertTrue("Should not be larger than 6", Integer.parseInt(textView.getText().toString()) < 7);
		assertTrue("Should not be smaller than 1", Integer.parseInt(textView.getText().toString()) > 0);
	}
	

}
