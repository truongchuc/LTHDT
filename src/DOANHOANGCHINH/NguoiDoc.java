package DOANHOANGCHINH;

public class NguoiDoc extends Nguoi {
    private int maNguoiDoc;

    public int getMaNguoiDoc() {
        return maNguoiDoc;
    }

    public void setMaNguoiDoc(int maNguoiDoc) {
        this.maNguoiDoc = maNguoiDoc;
    }

    public NguoiDoc(String hoTen, int tuoi, int maNguoiDoc) {
        super(hoTen, tuoi);
        this.maNguoiDoc = maNguoiDoc;
    }

    public NguoiDoc() {
    }
}
