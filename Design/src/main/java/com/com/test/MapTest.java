package com.com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Copyright: Copyright (c) 2020  ALL RIGHTS RESERVED.
 * @Company: 成都旺小宝科技有限公司
 * @Author: jtb
 * @CreateDate: 2020/11/26 9:43
 * @UpdateDate: 2020/11/26 9:43
 * @UpdateRemark: init
 * @Version: 1.0
 * @menu 测试map内存泄漏
 */
public class MapTest {
    public static void main(String[] args) {
        Map<A,Integer> hashmap = new HashMap<>();
        A a1 = new A("1", "j");
        A a2 = new A("1", "j");
        int counter = 0;
        while (true) {
            //循环插入新对象
            A p = new A("zhangsan", "12333-suu-1232");
            //A p2 = new A("zhangsan", "12333-suu-1232");
            hashmap.put(p, 1);
           // hashmap.put(p2, 2);
            counter++;
            if (counter % 1000 == 0) {
                System.out.println("map size: " + hashmap.size());
                System.out.println("运行" + counter
                        + "次后，可用内存剩余" + Runtime.getRuntime().freeMemory() + "MB");
            }
        }
       /* hashmap.forEach((key,value)->{
            System.out.println(key+"-"+value);
        });
        System.out.println(
                hashmap.size()
        );*/
    }
}
