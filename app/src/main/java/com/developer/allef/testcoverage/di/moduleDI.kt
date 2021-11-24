package com.developer.allef.testcoverage.di

import com.developer.allef.testcoverage.ui.LoginPresenter
import org.koin.dsl.module

/**
 * @author allef.santos on 2019-10-15
 */

val appModule = module {

    factory { LoginPresenter() }
}
