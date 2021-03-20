package com.trtjk.ncos.eureka;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @Auther: 51582
 * @Date: 2020/12/30 23:33
 * @Description:
 */
public class FuctureDemo {

    public static void main(String[] args)throws  Exception {
        long start = System.currentTimeMillis();
        Callable ca1 = new Callable(){
            @Override
            public String call() throws Exception {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "凉菜准备完毕";
            }
        };
        FutureTask<String> ft1 = new FutureTask<String>(ca1);
        new Thread(ft1).start();
        System.out.println(ft1.get());
        long end = System.currentTimeMillis();
        System.out.println("准备完毕时间："+(end-start));
    }
}
