package com.developer.allef.testcoverage.ui

import androidx.test.espresso.Espresso
import androidx.test.filters.LargeTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.developer.allef.testcoverage.base.BaseTestRobot
import com.developer.allef.testcoverage.model.Login
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author allef.santos on 2019-10-15
 */
@LargeTest
@RunWith(AndroidJUnit4ClassRunner::class)
class LoginActivityTest :  BaseTestRobot(){

    @get:Rule
    val mActivityTestRule: ActivityTestRule<LoginActivity> = ActivityTestRule(LoginActivity::class.java)

    @Test
    fun testVisibilityElementsUI(){
        login{
        titleVisible()
            textInputPasswordVisible()
            textInputUserVisible()
            editPasswordVisible()
            editUserVisible()
            entrarButtonVisible()
            googleButtonVisible()
            facebookButtonVisible()
        }

    }

    private fun closeKeyboard() {
        Espresso.closeSoftKeyboard()
    }



}