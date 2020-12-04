package com.com.test;

/**
 * @Description:
 * @Copyright: Copyright (c) 2020  ALL RIGHTS RESERVED.
 * @Company: 成都旺小宝科技有限公司
 * @Author: jtb
 * @CreateDate: 2020/11/26 9:45
 * @UpdateDate: 2020/11/26 9:45
 * @UpdateRemark: init
 * @Version: 1.0
 * @menu
 */
public class A {

    public A(String id, String name) {
        this.id = id;
        this.name = name;
    }

    private final String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof A){
            if (((A) obj).getId().equals(id)&&((A) obj).getName().equals(name)){
                return true;
            }
        }
        return false;
    }*/
}
