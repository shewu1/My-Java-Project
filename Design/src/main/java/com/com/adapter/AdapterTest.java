package com.com.adapter;

/**
 * @Description:
 * @Copyright: Copyright (c) 2020  ALL RIGHTS RESERVED.
 * @Company: 成都旺小宝科技有限公司
 * @Author: jtb
 * @CreateDate: 2020/11/4 17:51
 * @UpdateDate: 2020/11/4 17:51
 * @UpdateRemark: init
 * @Version: 1.0
 * @menu 类适配器模式测试
 */
public class AdapterTest {

    public static void main(String[] args) {
        //类适配器模式
        ClassAdapterModel adapterModel = new ClassAdapterModel();
        adapterModel.method1();
        adapterModel.method2();

        //对象适配器模式
        Source source = new Source();
        ObjectWrapper wrapper = new ObjectWrapper(source);
        wrapper.method1();
        wrapper.method2();
    }
}
