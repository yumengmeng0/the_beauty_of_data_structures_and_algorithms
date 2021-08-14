package ch01;

/**
 * @author: ymm
 * @date: 2021/8/14
 * @version: 1.0.0
 * @description:
 */
public class Demo123 {

    int n = 100;
    // array和count是类成员变量或全局变量
    int[] array = new int[n];
    int count = 0; // 数组中元素个数

    public void insert(int val) {
        if (count == array.length) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            System.out.println("sum = " + sum);
            count = 0;
        }
        array[count] = val;
        ++count;
    }

    public static void main(String[] args) {

    }
}
