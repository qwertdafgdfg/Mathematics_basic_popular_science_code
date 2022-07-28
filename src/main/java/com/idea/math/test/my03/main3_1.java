package com.idea.math.test.my03;

/**
 * @author: liYuan
 * @Title: main3_1
 * @ProjectName: Mathematics_basic_popular_science_code
 * @Description:
 * @date: 2022/7/20 21:12
 */
public class main3_1 {
    //麦粒的总数；后一格子的容量是前一格子容量的2倍；第一个格子1，第二个格子2，第三个格子4,8,16,32,64,128

    //count传入63，实际上循环体只执行62次，第一次循环体外执行了。
    public static long getSum (int count){
        long sum = 1;   //第一个格子里面的麦粒事先指定了。
        long midCount = 1;//第一个格子里面麦粒的数量。

        for (int i = 1; i < count; i++) {
            midCount = midCount * 2;
            sum = sum+midCount;//累计麦子的总数。
        }


        return sum;
    }


    public static void main(String[] args) {
        long sum = getSum(63);
        System.out.println(sum);
    }
}
