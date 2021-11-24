package com.developer.allef.testcoverage.base

/**
 * @author allef.santos on 2019-10-14
 */

interface BaseView<out T : BasePresenter<*>> {

    val presenter: T
}
