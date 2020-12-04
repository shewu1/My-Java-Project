package com.com.adapter;

/**
 * @Description:
 * @Copyright: Copyright (c) 2020  ALL RIGHTS RESERVED.
 * @Company: 成都旺小宝科技有限公司
 * @Author: jtb
 * @CreateDate: 2020/11/4 18:43
 * @UpdateDate: 2020/11/4 18:43
 * @UpdateRemark: init
 * @Version: 1.0
 * @menu 接口适配器模式
 */
public class InterfaceSourceSub1 extends InterfaceWrapper{

    @Override
    public void method1() {
        System.out.println("the sourceable interface's first Sub1!");
    }
}
