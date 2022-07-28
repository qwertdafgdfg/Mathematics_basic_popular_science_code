package com.idea.math.test.my03;

/**
 * @author: liYuan
 * @Title: getsqureRoot3_2
 * @ProjectName: Mathematics_basic_popular_science_code
 * @Description:
 * @date: 2022/7/22 6:48
 */
public class getsqureRoot3_2 {

    /**
     * @Description: 计算大于 1 的正整数之平方根
     * @param n- 待求的数, deltaThreshold- 误差的阈值, maxTry- 二分查找的最大次数
     * @return double- 平方根的解
     *
     * 二分查找迭代。                        二分查找重要的规则，待查找集合是有序的。
     */
    public static double getSqureRoot(int n, double deltaThreshold, int maxTry) {

        if (n <= 1) {
            return -1.0;
        }

        double min = 1.0, max = (double)n;
        for (int i = 0; i < maxTry; i++) {
//        while (true){
            // low+((high-low)>>1)
            double middle = (min + max) / 2;
            double square = middle * middle;
            //abs()方法，返回数值类型的绝对值。正数返回正数，负数返回去掉负号的正数。
            double delta = Math.abs((square / n) - 1);
            //使用了误差占原值的百分比，来控制迭代的结束
            if (delta <= deltaThreshold) {
                //避免过于追求精度，导致的消耗大量时间和计算资源。
                return middle;
            } else {
                if (square > n) {
                    max = middle;
                } else {
                    min = middle;
                }
            }
        }

        return -2.0;

    }

    public static final int number = 1001111;

    public static void main(String[] args) {
        int abs = Math.abs(3);
        System.out.println(abs);
        //int number = 101;
        double squareRoot = getSqureRoot(number, 0.000001, 100000000);
        if (squareRoot == -1.0) {
            System.out.println(" 请输入大于 1 的整数 ");
        } else if (squareRoot == -2.0) {
            System.out.println(" 未能找到解 ");
        } else {
            System.out.println(String.format("%d 的平方根是 %f", number, squareRoot));
        }

        System.out.println("101/2----"+101/2);
        System.out.println("101.0/2.0----"+101.0/2.0);


        //System.out.println(getSqureRootTest100(number,0.0000001,100000000));
    }

    public static double getSqureRootTest100(int n, double deltaThreshold, int maxTry) {
//maxTry避免过于追求精度，导致的消耗大量时间和计算资源。

        if (n <= 1) {
            return -1.0;
        }

        double min = 1.0, max = (double)n;
        for (int i = 0; i < maxTry; i++) {
//        while (true){
            double middle = (min + max) / 2;
            double square = middle * middle;
            System.out.println(i+"------"+square);
            if (square == n){
                return middle;
            }else {
                if (square>n){
                    max = middle;
                }else {
                    min = middle;
                }
            }
        }

        return -2.0;

    }
}
