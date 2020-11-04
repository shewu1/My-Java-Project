package com.com.build;

import com.com.common.Sender;

/**
 * @Description:
 * @Copyright: Copyright (c) 2020  ALL RIGHTS RESERVED.
 * @Company: 成都旺小宝科技有限公司
 * @Author: jtb
 * @CreateDate: 2020/11/4 16:39
 * @UpdateDate: 2020/11/4 16:39
 * @UpdateRemark: init
 * @Version: 1.0
 * @menu 建造者模式测试
 */
public class BuildTest {

    public static void main(String[] args) {
        BuildModel buildModel = new BuildModel();
        buildModel.produceMailSender(2);
        buildModel.produceSmsSender(2);
        for (Sender sender : buildModel.getSenderList()) {
            sender.send();
        }
    }
}
