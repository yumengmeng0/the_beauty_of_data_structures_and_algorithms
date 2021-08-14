package ch03;

/**
 * @author: ymm
 * @date: 2021/8/14
 * @version: 1.0.0
 * @description:
 */
public class Sort {

    /**
     * 冒泡排序
     *
     * @param a
     * @param n 数组长度
     */
    public void bubbleSort(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            boolean flag = false; // 提前退出冒泡循环的标志位
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) { // 交换相邻的两个元素
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true; // 表示有数据交换
                }
            }
            if (!flag) break; // 没有数据交换，提前退出
        }
    }


    /**
     * 插入排序
     *
     * @param a
     * @param n
     */
    public void insertionSort(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 1; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) { // 查找插入位置
                if (a[j] > value) {
                    a[j + 1] = a[j]; // 数据移动
                } else {
                    break;
                }
            }
            a[j + 1] = value; // 插入数据
        }
    }

    /**
     * 选择排序
     * 非稳定排序
     *
     * @param a
     * @param n
     */
    public void selectionSort(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i; j < n; j++) {
                if (a[j] < a[minPos]) {
                    minPos = j;
                }
            }
            // 交换元素
            int tmp = a[i];
            a[i] = a[minPos];
            a[minPos] = tmp;
        }
    }


}
