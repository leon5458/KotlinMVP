package com.hly.ui.login.model

import android.support.v4.util.ArrayMap
import com.hly.base.BaseModel
import com.hly.base.PresentCallBack

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2019/3/19~~~~~~
 * ~~~~~~更改时间:2019/3/19~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */
class LoginModel : BaseModel {
    fun getLogin(account: String, pwd: String, callBack: PresentCallBack<String>) {
        val map = ArrayMap<String, String>()
        map["account"] = account
        map["pwd"] = pwd

    }
}