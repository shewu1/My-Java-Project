package com.com.adapter;

/**
 * @Description:
 * @Copyright: Copyright (c) 2020  ALL RIGHTS RESERVED.
 * @Company: 成都旺小宝科技有限公司
 * @Author: jtb
 * @CreateDate: 2020/11/4 18:45
 * @UpdateDate: 2020/11/4 18:45
 * @UpdateRemark: init
 * @Version: 1.0
 * @menu 接口适配器模式
 */
public class InterfaceSourceSub2 extends InterfaceWrapper{

    @Override
    public void method2() {
        System.out.println("the sourceable interface's second Sub2!");
    }
}
