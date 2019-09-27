package com.honor.fighting.supereasyrefreshlayout.view;

/**
 * Created by liruibao on 2019-09-27.
 * email:silentlrb@gmail.com
 */
public interface RefreshListener {
    void onShow(); // 初始状态
    void onRecoverPre();
    void onAlert();   // 一定高度后的提醒状态
    void onRefreshing(boolean isRefreshing);   // 刷新状态
    void onHide();    // 收起状态
}
