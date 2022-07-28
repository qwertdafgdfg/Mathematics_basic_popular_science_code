package com.idea.math.test.my03;

import java.util.Arrays;

/**
 * @author: liYuan
 * @Title: SearchDictionary
 * @ProjectName: Mathematics_basic_popular_science_code
 * @Description:
 * @date: 2022/7/27 21:14
 */
public class SearchDictionary {
    /**
     * @param dictionary- 排序后的字典, wordToFind- 待查的单词
     * @return boolean- 是否发现待查的单词
     * @Description: 查找某个单词是否在字典里出现
     */
    public static boolean search(String[] dictionary, String wordToFind) {

        if (dictionary == null) {
            return false;
        }

        if (dictionary.length == 0) {
            return false;
        }

        int left = 0, right = dictionary.length - 1;
        while (left <= right) {//循环终止条件
            //因为相比除法运算来说，计算机处理位运算要快得多。(left + right) / 2--------right+((left-right)>>1)
            int middle = (left + right) >> 1;
            if (dictionary[middle].equals(wordToFind)) {
                return true;
            } else {
                if (dictionary[middle].compareTo(wordToFind) > 0) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }

        return false;

    }

    public static void main(String[] args) {


        String[] dictionary = {"i", "am", "one", "of", "the", "authors", "in", "geekbang"};

        Arrays.sort(dictionary);

        for (String s1 : dictionary) {
            System.out.println(s1);
        }

        String wordToFind = "i";

        boolean found = SearchDictionary.search(dictionary, wordToFind);
        if (found) {
            System.out.println(String.format(" 找到了单词 %s", wordToFind));
        } else {
            System.out.println(String.format(" 未能找到单词 %s", wordToFind));
        }


        boolean b = SearchDictionary.serachWorld(dictionary, "i");
        System.out.println("------是否被找到了-----"+b);
    }

    public static boolean serachWorld(String[] direction, String World) {

        int left = 1, right = direction.length;
        while (right >= left) {
            int mid = (left + right) >> 1;

            if (direction[mid - 1].equals(World)) {
                return true;
            }else {

                if(right == left && !direction[mid - 1].equals(World)){return false;}

                if (direction[mid-1].compareTo(World) > 0){
                    right = mid;
                }else {
                    left = mid;
                }
            }
        }

        return false;//否则就是没有搜索到。
    }
}
