package ch04;

/**
 * @author: ymm
 * @date: 2021/8/15
 * @version: 1.0.0
 * @description: 位图
 */
public class BitMap {
    // char类型占16bit=2Byte
    private char[] bytes; // 存数据的数组
    private int nbits; // 需要存多少位数据

    public BitMap(int nbits) {
        this.nbits = nbits;
        this.bytes = new char[nbits / 16 + 1];
    }

    public void set(int k) {
        if (k > nbits) return;
        int byteIndex = k / 16;
        int bitIndex = k % 16;
        bytes[byteIndex] |= (1 << bitIndex);
    }

    public boolean get(int k) {
        if (k > nbits) return false;
        int byteIndex = k / 16;
        int bitIndex = k % 16;
        return (bytes[bitIndex] & (1 << bitIndex)) != 0;
    }

}
