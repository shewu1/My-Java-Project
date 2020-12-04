package com.com.adapter;

/**
 * @Description:
 * @Copyright: Copyright (c) 2020  ALL RIGHTS RESERVED.
 * @Company: 成都旺小宝科技有限公司
 * @Author: jtb
 * @CreateDate: 2020/11/4 18:14
 * @UpdateDate: 2020/11/4 18:14
 * @UpdateRemark: init
 * @Version: 1.0
 * @menu 对象适配模式
 */
public class ObjectWrapper implements Targetable {

    private Source source;
    public ObjectWrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
