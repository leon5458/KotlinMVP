package com.hly.base

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2019/3/19~~~~~~
 * ~~~~~~更改时间:2019/3/19~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */

abstract class BasePresenter<T, E> {
    var mModel: E? = null
    var mView: T? = null

    fun setVM(v: T, m: E) {
        this.mView = v
        this.mModel = m
    }

    fun onDestroy() {
        mModel = null
        mView = null
    }
}