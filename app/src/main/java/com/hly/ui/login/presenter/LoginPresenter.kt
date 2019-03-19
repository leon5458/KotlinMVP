package com.hly.ui.login.presenter

import com.hly.base.BasePresenter
import com.hly.base.PresentCallBack
import com.hly.ui.login.model.LoginModel
import com.hly.ui.login.view.LoginView

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2019/3/19~~~~~~
 * ~~~~~~更改时间:2019/3/19~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */

class LoginPresenter : BasePresenter<LoginView, LoginModel>() {

    fun getLoign(account: String, pwd: String) {
        mModel?.getLogin(account, pwd, object : PresentCallBack<String> {
            override fun onBack(s: String?) {
                if (mView != null && s != null) {
                    mView?.setLogin(s)
                }
            }

            override fun onError(error: String) {
                if (mView != null) {
                    mView?.showErrorTip(error)
                }
            }

            override fun onFinish() {
                if (mView != null) {
                    mView?.stopLoading()
                }
            }
        })
    }

}