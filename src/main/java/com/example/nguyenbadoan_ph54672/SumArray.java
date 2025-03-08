package com.example.nguyenbadoan_ph54672;

public class SumArray {

    public Integer tinhTong(int[] mang) {
        int sum = 0;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 == 0 && mang[i] % 6 != 0) {
                sum += mang[i];
            }
        }
        return sum;
    }
}
