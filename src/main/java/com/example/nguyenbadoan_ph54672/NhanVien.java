package com.example.nguyenbadoan_ph54672;

public class NhanVien {
    private String maNV;
    private String ten;
    private Integer tuoi;
    private Float luong;
    private Integer soNamLamViec;
    private String phongBan;

    public NhanVien(String maNV, String ten, Integer tuoi, Float luong, Integer soNamLamViec, String phongBan) {
        setMaNV(maNV);
        setTen(ten);
        setTuoi(tuoi);
        setLuong(luong);
        setSoNamLamViec(soNamLamViec);
        setPhongBan(phongBan);
    }

    public NhanVien() {
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        if (maNV.isBlank() || maNV == null) {
            throw new IllegalArgumentException("maNv khong duoc de trong");
        }
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten.isBlank() || ten == null) {
            throw new IllegalArgumentException("ten nv khong duoc de trong");
        }
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        if (tuoi == null) {
            throw new IllegalArgumentException("tuoi khong duoc de trong");
        }
        this.tuoi = tuoi;
    }

    public Float getLuong() {
        return luong;
    }

    public void setLuong(Float luong) {
        if (luong == null) {
            throw new IllegalArgumentException("luong khong duoc de trong");
        }
        this.luong = luong;
    }

    public Integer getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(Integer soNamLamViec) {
        if (soNamLamViec == null) {
            throw new IllegalArgumentException("so nam lam viec khong duoc de trong");
        }
        this.soNamLamViec = soNamLamViec;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        if (phongBan.isBlank() || phongBan == null) {
            throw new IllegalArgumentException("phong ban khong duoc de trong");
        }
        this.phongBan = phongBan;
    }
}
