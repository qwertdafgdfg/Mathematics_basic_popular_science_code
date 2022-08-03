package com.idea.math.test;

/**
 * @author: liYuan
 * @Title: Main1111111
 * @ProjectName: Mathematics_basic_popular_science_code
 * @Description:
 * @date: 2022/7/14 10:12
 */
public class Main {
    public static void main(String[] args) {
        final long init = 1000001;

        long lastIndex = init % 100000L;     //最后一次不够100000的余数。。

        long index = init / 100000L;//每次插入100000，可以插入多少次？

        System.out.println(lastIndex + "---" + index);



        int abs = Math.abs(-8);
        System.out.println(abs);
    }
}
