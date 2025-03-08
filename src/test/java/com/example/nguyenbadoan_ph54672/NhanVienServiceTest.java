package com.example.nguyenbadoan_ph54672;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {

    NhanVien nhanVien;
    NhanVienService nhanVienService;

    @BeforeEach
    void setUp() {
        nhanVienService = new NhanVienService();
        nhanVien = new NhanVien("nv001","doan",20,20f,5,"ptpm");
        nhanVienService.getListNv().add(nhanVien);
    }

    @Test
    void updateValid() {
        NhanVien nvMuonUpdate = new NhanVien("nv001","duc",21,20f,5,"ptpm");
        nhanVienService.update(nvMuonUpdate);
        assertEquals(nvMuonUpdate, nhanVienService.getListNv().get(0));
    }

    @Test
    void updateTrongMa() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            NhanVien nvMuonUpdate = new NhanVien("","duc",21,20f,5,"ptpm");
            nhanVienService.update(nvMuonUpdate);
        });
        assertEquals("maNv khong duoc de trong", exception.getMessage());
    }

    @Test
    void updateTrongTen() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            NhanVien nvMuonUpdate = new NhanVien("nv001","",21,20f,5,"ptpm");
            nhanVienService.update(nvMuonUpdate);
        });
        assertEquals("ten nv khong duoc de trong", exception.getMessage());
    }

    @Test
    void updateTrongTuoi() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            NhanVien nvMuonUpdate = new NhanVien("nv001","duc",null,20f,5,"ptpm");
            nhanVienService.update(nvMuonUpdate);
        });
        assertEquals("tuoi khong duoc de trong", exception.getMessage());
    }

    @Test
    void updateTrongSoNamLamViec() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            NhanVien nvMuonUpdate = new NhanVien("nv001","duc",21,20f,null,"ptpm");
            nhanVienService.update(nvMuonUpdate);
        });
        assertEquals("so nam lam viec khong duoc de trong", exception.getMessage());
    }

    @Test
    void updateTrongLuong() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            NhanVien nvMuonUpdate = new NhanVien("nv001","duc",21,null,5,"ptpm");
            nhanVienService.update(nvMuonUpdate);
        });
        assertEquals("luong khong duoc de trong", exception.getMessage());
    }

    @Test
    void updateTrongPhongBan() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            NhanVien nvMuonUpdate = new NhanVien("nv001","duc",21,20f,5,"");
            nhanVienService.update(nvMuonUpdate);
        });
        assertEquals("phong ban khong duoc de trong", exception.getMessage());
    }


    @Test
    void updateNullNhanVien() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            NhanVien nvMuonUpdate = null;
            nhanVienService.update(nvMuonUpdate);
        });
        assertEquals("nhan vien khong duoc de trong", exception.getMessage());
    }





}