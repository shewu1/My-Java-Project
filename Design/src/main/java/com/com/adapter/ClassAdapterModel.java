package com.com.adapter;

/**
 * @Description:
 * @Copyright: Copyright (c) 2020  ALL RIGHTS RESERVED.
 * @Company: 成都旺小宝科技有限公司
 * @Author: jtb
 * @CreateDate: 2020/11/4 17:40
 * @UpdateDate: 2020/11/4 17:40
 * @UpdateRemark: init
 * @Version: 1.0
 * @menu 类的适配器模式
 */
public class ClassAdapterModel extends Source implements Targetable{

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");

    }
}
