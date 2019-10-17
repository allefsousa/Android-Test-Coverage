package com.developer.allef.testcoverage.ui

import com.developer.allef.testcoverage.R
import com.developer.allef.testcoverage.base.BaseTestRobot

/**
 * @author allef.santos on 2019-10-15
 */

fun login(func: LoginRobot.() -> Unit) = LoginRobot().apply { func() }
class LoginRobot :BaseTestRobot(){

    fun titleVisible() = visibibleElement(R.id.textView)
    fun textInputUserVisible() = visibibleElement(R.id.textView)
    fun textInputPasswordVisible() = visibibleElement(R.id.textView)
    fun editUserVisible() = visibibleElement(R.id.textView)
    fun editPasswordVisible() = visibibleElement(R.id.textView)
    fun entrarButtonVisible() = visibibleElement(R.id.btnOk)
    fun googleButtonVisible() = visibibleElement(R.id.btnGoogle)
    fun facebookButtonVisible() = visibibleElement(R.id.btnFacebook)


}
