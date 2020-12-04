package com.com.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Copyright: Copyright (c) 2020  ALL RIGHTS RESERVED.
 * @Company: 成都旺小宝科技有限公司
 * @Author: jtb
 * @CreateDate: 2020/11/20 13:40
 * @UpdateDate: 2020/11/20 13:40
 * @UpdateRemark: init
 * @Version: 1.0
 * @menu
 */
public class FutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("中兴");
                TimeUnit.SECONDS.sleep(10);
                System.out.println("中兴111");
                return "null";
            }
        };
        FutureTask<String> futureTask = new FutureTask<>(callable);
        //new Thread(futureTask).start();
        System.out.println("就会放大");
        if (futureTask.isDone()){
            System.out.println(futureTask.get());
        }/*else {
            System.out.println("提前结束");
            futureTask.cancel(true);
        }*/
        //System.out.println(futureTask.get());
        TimeUnit.SECONDS.sleep(2);
        System.out.println("结束");
        //TimeUnit.SECONDS.sleep(11);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
