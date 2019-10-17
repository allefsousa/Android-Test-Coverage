package com.developer.allef.testcoverage.base

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import junit.framework.AssertionFailedError
import org.hamcrest.CoreMatchers

/**
 * @author allef.santos on 2019-10-15
 */
open class BaseTestRobot {
    fun fillEditText(resId: Int, text: String): ViewInteraction =
        Espresso.onView(ViewMatchers.withId(resId)).perform(ViewActions.replaceText(text), ViewActions.closeSoftKeyboard())

    fun visibibleElement(resId: Int): ViewInteraction = Espresso.onView(ViewMatchers.withId(resId)).check(
        ViewAssertions.matches((ViewMatchers.isDisplayed()))
    )
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