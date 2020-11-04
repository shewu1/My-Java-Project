package com.com.build;

import com.com.common.MailSender;
import com.com.common.Sender;
import com.com.common.SmsSender;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Copyright: Copyright (c) 2020  ALL RIGHTS RESERVED.
 * @Company: 成都旺小宝科技有限公司
 * @Author: jtb
 * @CreateDate: 2020/11/4 16:37
 * @UpdateDate: 2020/11/4 16:37
 * @UpdateRemark: init
 * @Version: 1.0
 * @menu 建造者模式
 */
public class BuildModel {


    private List<Sender> senderList = new ArrayList<>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            senderList.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            senderList.add(new SmsSender());
        }

    }

    public List<Sender> getSenderList() {
        return senderList;
    }
}
