package com.com.common;

/**
 * @Description:
 * @Copyright: Copyright (c) 2020  ALL RIGHTS RESERVED.
 * @Company: 成都旺小宝科技有限公司
 * @Author: jtb
 * @CreateDate: 2020/11/4 16:34
 * @UpdateDate: 2020/11/4 16:34
 * @UpdateRemark: init
 * @Version: 1.0
 * @menu 短信发送
 */
public class SmsSender implements Sender{

    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
