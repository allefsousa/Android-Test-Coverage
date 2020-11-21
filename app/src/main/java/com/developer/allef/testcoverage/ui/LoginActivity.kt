package com.developer.allef.testcoverage.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.developer.allef.testcoverage.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class LoginActivity : AppCompatActivity(), LoginContract.View {

    override val presenter: LoginPresenter by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.view = this
        presenter.start()
        btnOk.setOnClickListener {
            presenter.checkStateElementsView(editUser.text.toString(), editPassword.text.toString())
        }
    }

    override fun passwordIsEmpty() {
        textInputPassword.error = getString(R.string.text_error_empty_password)
    }

    override fun userIsEmpty() {
        textInputUser.error = getString(R.string.text_error_empty_user)
    }

    override fun userAndPasswordIsEmpty() {
        userIsEmpty()
        passwordIsEmpty()
    }

    override fun errorUserAndPassword() {
        Toast.makeText(this, getString(R.string.text_error_oauth), Toast.LENGTH_LONG).show()
    }

    override fun userSuccess() {
        Toast.makeText(this, getString(R.string.text_success_oauth), Toast.LENGTH_LONG).show()
    }
}
