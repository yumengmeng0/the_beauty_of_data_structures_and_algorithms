package ch03;

/**
 * @author: ymm
 * @date: 2021/8/14
 * @version: 1.0.0
 * @description:
 */
public class Demo311 {

    int f1(int n) {
        if (n == 1) return 1;
        return f1(n - 1) + 1;
    }

    // 求n的阶乘的递归代码
    int f2(int n) {
        if (n < 1) return 1;
        return n * f2(n - 1);
    }

    // 求n的阶乘的尾递归代码
    int f(int n, int res) {
        if (n <= 1) return res;
        return f(n - 1, n * res);
    }
}
