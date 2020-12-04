package com.com.adapter;

/**
 * @Description:
 * @Copyright: Copyright (c) 2020  ALL RIGHTS RESERVED.
 * @Company: 成都旺小宝科技有限公司
 * @Author: jtb
 * @CreateDate: 2020/11/4 18:47
 * @UpdateDate: 2020/11/4 18:47
 * @UpdateRemark: init
 * @Version: 1.0
 * @menu 接口适配器模式
 */
public class InterfaceWrapperTest {

    public static void main(String[] args) {
        InterfaceSourceSub1 sub1 = new InterfaceSourceSub1();
        InterfaceSourceSub2 sub2 = new InterfaceSourceSub2();
        sub1.method1();
        sub1.method2();
        sub2.method1();
        sub2.method2();

    }
}
