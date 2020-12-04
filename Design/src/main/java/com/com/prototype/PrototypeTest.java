package com.com.prototype;

import java.io.IOException;

/**
 * @Description:
 * @Copyright: Copyright (c) 2020  ALL RIGHTS RESERVED.
 * @Company: 成都旺小宝科技有限公司
 * @Author: jtb
 * @CreateDate: 2020/11/4 17:25
 * @UpdateDate: 2020/11/4 17:25
 * @UpdateRemark: init
 * @Version: 1.0
 * @menu 原型模式测试
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Prototype prototype = new Prototype();
        prototype.setObj(new SerializableObject());
        prototype.setString("jtb");
        Prototype prototype1 = (Prototype) prototype.clone();
        Prototype prototype2 = (Prototype) prototype.deepClone();
        System.out.println();
        System.out.println(prototype.getObj()+"\n"+prototype1.getObj()+"\n"+prototype2.getObj());
    }
}
