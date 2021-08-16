package ch08;

/**
 * @author: ymm
 * @date: 2021/8/16
 * @version: 1.0.0
 * @description: BF（Brute Force，暴力匹配）算法
 */
public class BF {


    /**
     * Java版
     * @param s1 主串
     * @param s2 子串
     * @return
     */
    public static int bf(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        return bf1(a, n, b, m);
    }


    /**
     * C语言版
     *
     * @param a 主串
     * @param n 主串长度
     * @param b 子串
     * @param m 子串长度
     * @return 第一个匹配得起始下标
     */
    public static int bf1(char[] a, int n, char[] b, int m) {
        for (int i = 0; i < n - m + 1; i++) { // 主串中有 n-m+1 个长度为m的子串
            int j = 0;
            while (j < m) {
                if (a[i + j] != b[j]) {
                    break;
                }
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        String s1 = "hello world"; // 11
        String s2 = "world";      // 5
        int bf1 = bf1(s1.toCharArray(), s1.length(), s2.toCharArray(), s2.length());
        int bf = bf(s1, s2);
        System.out.println("bf = " + bf);
    }
}
