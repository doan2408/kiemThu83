package com.example.nguyenbadoan_ph54672;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumArrayTest {

    SumArray sumArray;

    @BeforeEach
    void setUp() {
        sumArray = new SumArray();
    }
    @Test
    void tinhTongValid() {
        int result = sumArray.tinhTong(new int[] {2,2,8});
        assertEquals(12,result);
    }

    @Test
    void tinhTongMangCacSoLe() {
        int result = sumArray.tinhTong(new int[] {3,5,7});
        assertEquals(0,result);
    }

    @Test
    void tinhTongMangCacSoChiaHetCho6() {
        int result = sumArray.tinhTong(new int[] {6,18,36});
        assertEquals(0,result);
    }

    @Test
    void tinhTongMangRong() {
        int result = sumArray.tinhTong(new int[] {});
        assertEquals(0,result);
    }

    @Test
    void tinhTongMang0() {
        int result = sumArray.tinhTong(new int[] {0,0,0});
        assertEquals(0,result);
    }


    @Test
    void tinhTongMangLaSoAm() {
        int result = sumArray.tinhTong(new int[] {-6,-17,-20});
        assertEquals(-20,result);
    }

    @Test
    void tinhTongMangLaSoCucLon() {
        int result = sumArray.tinhTong(new int[] {99888,9994,9992});
        assertEquals(19986,result);
    }




}