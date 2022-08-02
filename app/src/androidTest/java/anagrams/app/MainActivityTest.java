package anagrams.app;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4ClassRunner.class)
@LargeTest


public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activity = new ActivityScenarioRule<>(MainActivity.class);

    /**
     * When EditText (filter) is empty and input typed.
     */
    @Test
    public void input_Is_Displayed_Without_Filter() {
        onView(withId(R.id.input)).perform(typeText("Foxminded cool 24/7"));
        onView(withId(R.id.result)).check(matches(withText("dednimxoF looc 7/42 ")));
    }

    /**
     * When EditText (input) typed and (filter) typed.
     */
    @Test
    public void input_Is_Correctly_Displayed_With_Filter() {
        onView(withId(R.id.input)).perform(typeText("4uzzia is a te44orist sta7e"));
        onView(withId(R.id.filter)).perform(typeText("123456789"));
        onView(withId(R.id.result)).check(matches(withText("4aizzu si a ts44iroet eat7s ")));
    }
}