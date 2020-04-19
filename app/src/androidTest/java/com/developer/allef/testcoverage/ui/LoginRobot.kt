package com.developer.allef.testcoverage.ui

import android.app.Activity
import com.developer.allef.testcoverage.R
import com.developer.allef.testcoverage.base.BaseTestRobot

/**
 * @author allef.santos on 2019-10-15
 */

fun login(func: LoginRobot.() -> Unit) = LoginRobot().apply { func() }

class LoginRobot : BaseTestRobot() {

    fun titleVisible() = visibleElement(R.id.textView)
    fun textInputUserVisible() = visibleElement(R.id.textView)
    fun textInputPasswordVisible() = visibleElement(R.id.textView)
    fun editUserVisible() = visibleElement(R.id.textView)
    fun editPasswordVisible() = visibleElement(R.id.textView)
    fun entrarButtonVisible() = visibleElement(R.id.btnOk)
    fun googleButtonVisible() = visibleElement(R.id.btnGoogle)
    fun facebookButtonVisible() = visibleElement(R.id.btnFacebook)
    fun inputPassword(value: String) = fillEditText(R.id.editPassword, value)
    fun inputUser(value: String) = fillEditText(R.id.editUser, value)
    fun loginButtonClick() = clickButton(R.id.btnOk)
    fun assertUserPasswordError(value: Int, activity: Activity) = toastVisible(value, activity)
    fun assertEditTextInpIsEmptyHintError(value: Int, activity: Activity, resIdValue: Int) = textInputHintError(value, activity, resIdValue)
}
