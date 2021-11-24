package com.developer.allef.testcoverage.ui

import com.developer.allef.testcoverage.model.Login
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import org.junit.Before
import org.junit.Test
import org.mockito.MockitoAnnotations

/**
 * @author allef.santos on 2019-10-15
 */
class LoginPresenterTest {

    private lateinit var presenter: LoginPresenter
    private var view: LoginContract.View = mock()

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun checkStateElementsTest() {
        presenter = LoginPresenter()
        presenter.view = view
        presenter.start()
        presenter.checkStateElementsView("", "")
        verify(view).userAndPasswordIsEmpty()
    }

    @Test
    fun checkStateElementsPasswordIsEmptyTest() {
        presenter = LoginPresenter()
        presenter.view = view
        presenter.start()
        presenter.checkStateElementsView("aa", "")
        verify(view).passwordIsEmpty()
    }
    @Test
    fun checkStateElementsUserIsEmptyTest() {
        presenter = LoginPresenter()
        presenter.view = view
        presenter.start()
        presenter.checkStateElementsView("", "bb")
        verify(view).userIsEmpty()
    }

    @Test
    fun checkStateElementsSuccessTest() {
        presenter = LoginPresenter()
        presenter.view = view
        presenter.start()
        presenter.checkStateElementsView("test", "test")
        verify(view).userSuccess()
    }

    @Test
    fun checkStateElementsSuccessMethodTest() {
        presenter = LoginPresenter()
        presenter.view = view
        presenter.start()
        val login = Login("test", "test")
        presenter.validOauth(login)
        verify(view).userSuccess()
    }

    @Test
    fun checkStateElementsErroMethodTest() {
        presenter = LoginPresenter()
        presenter.view = view
        presenter.start()
        val login = Login("aa", "aa")
        presenter.validOauth(login)
        verify(view).errorUserAndPassword()
    }

    @Test
    fun checkStateElementsErrorPasswordIncorrectTest() {
        presenter = LoginPresenter()
        presenter.view = view
        presenter.start()
        presenter.checkStateElementsView("user", "123")
        verify(view).errorUserAndPassword()
    }
}
