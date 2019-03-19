package com.hly.base
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.view.ViewGroup

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2019/3/19~~~~~~
 * ~~~~~~更改时间:2019/3/19~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */

abstract class BaseActivity<T : BasePresenter<*, *>, E : BaseModel> : AppCompatActivity(), BaseView {
    /**
     * Presenter
     */
    var mPresenter: T? = null
    /**
     * mModel
     */
    var mModel: E? = null

    protected abstract val layout: Int

    override fun setContentView(@LayoutRes layoutResID: Int) {
        super.setContentView(layoutResID)
    }

    override fun setContentView(view: View, params: ViewGroup.LayoutParams) {
        super.setContentView(view, params)
    }

    override fun setContentView(view: View) {
        super.setContentView(view)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        initPresenter()
        val layId = layout
        if (layId != 0) {
            setContentView(layId)
        }
        findByid()
        initView()
        setListener()
        initData()
    }

    protected abstract fun findByid()

    protected abstract fun setListener()

    protected abstract fun initView() //初始化控件

    protected abstract fun initData() //初始化数据

    //简单页面无需mvp就不用管此方法即可,完美兼容各种实际场景的变通
    abstract fun initPresenter()


    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }


    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun showLoading(title: String) {
        Log.e("hly", title)
        //showdialog
    }

    override fun stopLoading() {
        //hidedialog
    }

    override fun showErrorTip(msg: String) {
        //toast
    }
}
