package volap.com.Adapter;

public class GridView_Sup_ChonMon {
    private  int img_mon;
    private String tenMon;
    private String giaTien;

    public GridView_Sup_ChonMon(String tenMon, String giaTien,int anh){
        this.giaTien = giaTien;
        this.tenMon = tenMon;
        this.img_mon = anh;

    }

    public int getImg_mon() {
        return img_mon;
    }

    public void setImg_mon(int img_mon) {
        this.img_mon = img_mon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(String giaTien) {
        this.giaTien = giaTien;
    }
}
