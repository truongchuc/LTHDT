package DOANHOANGCHINH;

import java.io.Serializable;

public class Sach implements Serializable {
    private String maSach;
    private String tenSach;

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public Sach(String maSach, String tenSach) {
        super();
        this.maSach = maSach;
        this.tenSach = tenSach;
    }

    public Sach() {
        super();
    }
}

