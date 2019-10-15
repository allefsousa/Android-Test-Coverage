package com.developer.allef.testcoverage.ui

import com.developer.allef.testcoverage.base.BasePresenter
import com.developer.allef.testcoverage.base.BaseView

/**
 * @author allef.santos on 2019-10-14
 */
interface LoginContract {
    interface Presenter:BasePresenter<View> {
        
    }
    interface View:BaseView<Presenter>{

    }
}