package volap.com.Adapter;


public class RecycleView_Sup_Home {
    private String Ten;
    private String NoiDung;
    private int img_home;
    public RecycleView_Sup_Home(String Ten, String NoiDung, int img){
        this.Ten=Ten;
        this.NoiDung=NoiDung;
        this.img_home=img;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String noiDung) {
        NoiDung = noiDung;
    }

    public int getImg_home() {
        return img_home;
    }

    public void setImg_home(int img_home) {
        this.img_home = img_home;
    }
}
