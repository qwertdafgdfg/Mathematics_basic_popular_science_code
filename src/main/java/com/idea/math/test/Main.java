package com.idea.math.test;

/**
 * @author: liYuan
 * @Title: Main1111111
 * @ProjectName: Mathematics_basic_popular_science_code
 * @Description: 1231111111111111111111111
 * @date: 2022/7/14 10:12liiiiiiiiiiiiiiiiiiiiiiiiiiiiii
 */
public class Main {
    public static void main(String[] args) {
        final long init = 1000001;

        long lastIndex = init % 100000L;     //最后一次不够100000的余数。。

        long index = init / 100000L;//每次插入100000，可以插入多少次？

        System.out.println(lastIndex + "---" + index);

//有冲突的情况下：
        //1、保存

        int abs = Math.abs(-8);
        System.out.println(abs);
    }
}
