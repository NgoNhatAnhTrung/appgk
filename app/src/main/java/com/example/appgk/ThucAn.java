package com.example.appgk;

public class ThucAn {
    private String tenThucAn;
    private int img;
    private String moTa;

    public ThucAn(String tenThucAn, int img, String moTa) {
        this.tenThucAn = tenThucAn;
        this.img = img;
        this.moTa = moTa;
    }

    public String getMoTa() {

        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public ThucAn() {
    }

    public String getTenThucAn() {
        return tenThucAn;
    }

    public void setTenThucAn(String tenThucAn) {
        this.tenThucAn = tenThucAn;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "ThucAn{" +
                "tenThucAn='" + tenThucAn + '\'' +
                ", img=" + img +
                '}';
    }
}
