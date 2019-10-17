package com.developer.allef.testcoverage.ui

import com.developer.allef.testcoverage.model.Login

/**
 * @author allef.santos on 2019-10-14
 */
class LoginPresenter :LoginContract.Presenter {

    override lateinit var view: LoginContract.View
    override fun start() {
    }

    override fun validOauth(login: Login) {
        if (login.user == "test" && login.password == "test"){
            view.userSuccess()
        }else{
            view.errorUserAndPassword()
        }
    }

    override fun checkStateElementsView(user: String, password: String) {
        if (user.isEmpty() && password.isEmpty()){
            view.userAndPasswordIsEmpty()
        }else if(user.isEmpty()){
            view.userIsEmpty()
        }else if (password.isEmpty()){
            view.passwordIsEmpty()
        }else{
            val login = Login(user,password)
            validOauth(login)
        }

    }
}