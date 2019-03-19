package com.hly.base;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2019/3/18~~~~~~
 * ~~~~~~更改时间:2019/3/18~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */
public interface BaseView{
    /*******内嵌加载*******/
    void showLoading(String title);

    void stopLoading();

    void showErrorTip(String msg);
}
