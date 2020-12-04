package com.com.java8feature;

/**
 * @Description:
 * @Copyright: Copyright (c) 2020  ALL RIGHTS RESERVED.
 * @Company: 成都旺小宝科技有限公司
 * @Author: jtb
 * @CreateDate: 2020/11/19 9:11
 * @UpdateDate: 2020/11/19 9:11
 * @UpdateRemark: init
 * @Version: 1.0
 * @menu 接口可以添加非抽象类
 */
public interface Formula {
    String calculate(int a);
    /**
     * @Description:    添加非抽象方法
     * @Author:         jtb
     * @UpdateUser:     jtb 
     * @Param: 
     * @Return: 
     * @CreateDate:      
     * @UpdateDate:      
     * @tags:        1.0
     * @status:         done
     */
    default String getName(){
        return "jtb";
    }
}
