package com.hly.ui.login.activity

import com.hly.R
import com.hly.base.BaseActivity
import com.hly.ui.login.model.LoginModel
import com.hly.ui.login.presenter.LoginPresenter
import com.hly.ui.login.view.LoginView

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2019/3/19~~~~~~
 * ~~~~~~更改时间:2019/3/19~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */

class LoginActivity : BaseActivity<LoginPresenter, LoginModel>(), LoginView {
    override val layout: Int
        get() = R.layout.login_activity_layout

    override fun findByid() {}
    override fun setListener() {}
    override fun initView() {
        mPresenter!!.getLoign("111", "222") //请求

    }

    override fun initData() {

    }

    override fun initPresenter() {
        mPresenter = LoginPresenter()
        mModel = LoginModel()
        mPresenter!!.setVM(this, mModel!!)
    }

    override fun setLogin(s: String) {}

}

