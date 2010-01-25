package se.mahnve.dice.test;

import se.mahnve.dice.Dice;
import se.mahnve.dice.R;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ActivityUnitTestCase;
import android.test.UiThreadTest;
import android.widget.Button;
import android.widget.TextView;

public class DiceUnitTest extends ActivityInstrumentationTestCase2<Dice> {

	public DiceUnitTest() {
		super("se.mahnve.dice", Dice.class);
	}
	
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
	}


	@UiThreadTest
	public void testSomething() throws Exception {
		assertNotNull(getActivity());
		Button button = (Button) getActivity().findViewById(R.id.button);
		button.performClick();
		TextView textView = (TextView) getActivity().findViewById(R.id.result);
		assert(Integer.parseInt((String) textView.getText()) > 0);
		assert(Integer.parseInt((String) textView.getText()) < 7);
	}

}
