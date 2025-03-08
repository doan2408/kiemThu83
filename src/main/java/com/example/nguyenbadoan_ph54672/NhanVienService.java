package com.example.nguyenbadoan_ph54672;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {

    public List<NhanVien> listNv = new ArrayList<>();
    NhanVien nhanVien = new NhanVien();

    public List<NhanVien> getListNv() {
        return listNv;
    }

    public void update(NhanVien nhanVien) {
        if(nhanVien ==null) {
            throw new IllegalArgumentException("nhan vien khong duoc de trong");
        }
        for (int i = 0; i < listNv.size(); i++) {
            if (listNv.get(i).getMaNV().equalsIgnoreCase(nhanVien.getMaNV())) {
                listNv.set(i, nhanVien);
            }
        }
    }
}
