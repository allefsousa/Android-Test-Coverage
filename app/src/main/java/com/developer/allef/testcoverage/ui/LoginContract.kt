package com.developer.allef.testcoverage.ui

import com.developer.allef.testcoverage.base.BasePresenter
import com.developer.allef.testcoverage.base.BaseView
import com.developer.allef.testcoverage.model.Login

/**
 * @author allef.santos on 2019-10-14
 */
interface LoginContract {
    interface Presenter:BasePresenter<View> {
         fun checkStateElementsView(user: String, password: String)
         fun validOauth(login: Login)

    }
    interface View:BaseView<Presenter>{
        fun passwordIsEmpty()
        fun userIsEmpty()
        fun userAndPasswordIsEmpty()
        fun errorUserAndPassword()
        fun userSuccess()

    }
}