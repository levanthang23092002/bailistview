package com.example.listview;

public class monan {
    private String tenmonan;
    private String mota;
    private int hinh ,tru,add;


    public monan(String tenmonan, String mota, int hinh, int tru, int add) {
        this.tenmonan = tenmonan;
        this.mota = mota;
        this.hinh = hinh;
        this.tru = tru;
        this.add = add;
    }

    public String getTenmonan() {
        return tenmonan;
    }

    public void setTenmonan(String tenmonan) {
        this.tenmonan = tenmonan;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public int getTru() {
        return tru;
    }

    public void setTru(int tru) {
        this.tru = tru;
    }

    public int getAdd() {
        return add;
    }

    public void setAdd(int add) {
        this.add = add;
    }
}
