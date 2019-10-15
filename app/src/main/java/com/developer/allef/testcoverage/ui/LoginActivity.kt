package com.developer.allef.testcoverage.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.developer.allef.testcoverage.R
import com.developer.allef.testcoverage.di.appModule
import org.koin.android.ext.android.inject
import org.koin.core.context.startKoin

class LoginActivity : AppCompatActivity(),LoginContract.View {
    override val presenter: LoginPresenter by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.view = this
        presenter.start()
    }
}
