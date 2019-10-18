package com.developer.allef.testcoverage.ui

import androidx.test.espresso.Espresso
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.developer.allef.testcoverage.R
import com.developer.allef.testcoverage.base.BaseTestRobot
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author allef.santos on 2019-10-15
 */
@LargeTest
@RunWith(AndroidJUnit4::class)
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
    @Test
    fun userPasswordSuccess(){
        login{
            inputPassword("test")
            inputUser("test")
            closeKeyboard()
            loginButtonClick()
            assertUserPasswordError(R.string.text_success_oauth,mActivityTestRule.activity)
        }

    }

    @Test
    fun userPasswordError(){
        login{
            inputPassword("user")
            inputUser("user")
            closeKeyboard()
            loginButtonClick()
            assertUserPasswordError(R.string.text_error_oauth,mActivityTestRule.activity)
        }

    }
    @Test
    fun userPasswordIsEmpty(){
        login{
            inputPassword("")
            inputUser("")
            closeKeyboard()
            loginButtonClick()
            assertEditTextInpIsEmptyHintError(R.id.textInputUser,mActivityTestRule.activity,R.string.text_error_empty_user)
            assertEditTextInpIsEmptyHintError(R.id.textInputPassword,mActivityTestRule.activity,R.string.text_error_empty_password)
        }

    }
    @Test
    fun passwordIsEmpty(){
        login{
            inputPassword("")
            inputUser("aaa")
            closeKeyboard()
            loginButtonClick()
            assertEditTextInpIsEmptyHintError(R.id.textInputPassword,mActivityTestRule.activity,R.string.text_error_empty_password)
        }

    }
    @Test
    fun userIsEmpty(){
        login{
            inputPassword("aaa")
            inputUser("")
            closeKeyboard()
            loginButtonClick()
            assertEditTextInpIsEmptyHintError(R.id.textInputUser,mActivityTestRule.activity,R.string.text_error_empty_user)
        }

    }

    private fun closeKeyboard() {
        Espresso.closeSoftKeyboard()
    }



}