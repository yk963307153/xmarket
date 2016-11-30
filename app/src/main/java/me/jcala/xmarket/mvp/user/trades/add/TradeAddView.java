package me.jcala.xmarket.mvp.user.trades.add;

public interface TradeAddView {

    void whenAddSuccess();//发布商品成功

    void whenGetTagListSuccess();//获取商品分类列表成功

    void whenFail(String errorMsg);//发生异常

    void whenStartProgress();//显示进度条

    void whenStopProgress();//隐藏进度条

}
