package volap.com.Adapter;

public class GridView_Sup_Profile {
    private  int icon;
    private String title;

    public GridView_Sup_Profile( int icon, String title){
        this.icon = icon;
        this.title = title;

    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
