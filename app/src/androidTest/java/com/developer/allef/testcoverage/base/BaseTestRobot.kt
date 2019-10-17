package com.developer.allef.testcoverage.base

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import junit.framework.AssertionFailedError
import org.hamcrest.CoreMatchers
import androidx.test.espresso.matcher.RootMatchers.withDecorView
import android.R
import android.app.Activity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.not


/**
 * @author allef.santos on 2019-10-15
 */
open class BaseTestRobot {
    fun fillEditText(resId: Int, text: String): ViewInteraction =
        Espresso.onView(ViewMatchers.withId(resId)).perform(ViewActions.replaceText(text), ViewActions.closeSoftKeyboard())

    fun visibleElement(resId: Int): ViewInteraction = Espresso.onView(ViewMatchers.withId(resId)).check(
        ViewAssertions.matches((ViewMatchers.isDisplayed()))
    )
    fun textInputHintError(resId: Int,activity: Activity,resIdValue: Int) =  onView(withId(resId)).check(matches(
        hasTextInputLayoutHintText(activity.getString(resIdValue))))

    fun toastVisible (resId: Int,activity:Activity):ViewInteraction =
        onView(withText(resId)).inRoot(withDecorView(not(`is`(activity.window.decorView)))).check(
            matches(isDisplayed())
        );

    fun notVisibibleElement(resId: Int): ViewInteraction = Espresso.onView(ViewMatchers.withId(resId)).check((ViewAssertions.matches(
        CoreMatchers.not(ViewMatchers.isDisplayed())
    )))

    fun clickButton(resId: Int): ViewInteraction = Espresso.onView((ViewMatchers.withId(resId))).perform(
        ViewActions.click())
    fun clickView(resId: Int): ViewInteraction = Espresso.onView((ViewMatchers.withId(resId))).perform(
        ViewActions.click())

    fun textView(resId: Int): ViewInteraction = Espresso.onView(ViewMatchers.withId(resId))

    fun matchText(viewInteraction: ViewInteraction, text: String): ViewInteraction = viewInteraction
        .check(ViewAssertions.matches(ViewMatchers.withText(text)))

    fun matchText(resId: Int, text: String): ViewInteraction = matchText(textView(resId), text)

    fun clickListItem(listRes: Int, position: Int) {
        Espresso.onData(CoreMatchers.anything())
            .inAdapterView(CoreMatchers.allOf(ViewMatchers.withId(listRes)))
            .atPosition(position).perform(ViewActions.click())
    }
    fun sleep() = apply {
        Thread.sleep(15000)
    }

    fun ViewInteraction.isDisplayed(): Boolean {
        return try {
            check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            true
        } catch (e: AssertionFailedError) {
            false
        }
    }


}