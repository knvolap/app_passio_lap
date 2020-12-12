package volap.com.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;
import java.util.List;

import volap.com.R;


public class GridView_Adapter_ChonMon extends BaseAdapter {

    private Context context;
    private int layout;
    private List<GridView_Sup_ChonMon> ListMonAn;

    public GridView_Adapter_ChonMon(Context context, int layout, List<GridView_Sup_ChonMon>ListMonAn) {
        this.context = context;
        this.layout = layout;
        this.ListMonAn = ListMonAn;
    }

    public GridView_Adapter_ChonMon(ArrayList<GridView_Sup_ChonMon> mListenerList, Context context) {
        context = context;
        this. ListMonAn = new ArrayList<GridView_Sup_ChonMon>();
        this. ListMonAn =mListenerList;
    }

    public GridView_Adapter_ChonMon(GridView_Adapter_ChonMon gridView_adapter_ChonMon, List<GridView_Sup_ChonMon> image_details) {
    }

    @Override
    public int getCount() {
        return ListMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgAnh;
        TextView tv_tenMon;
        TextView tv_giaTien;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder.tv_tenMon = (TextView)convertView.findViewById(R.id.text_ten_mon);
            holder.tv_giaTien = (TextView)convertView.findViewById(R.id.text_giatien);
            holder.imgAnh = (ImageView)convertView.findViewById(R.id.img_chonmon_1);


            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }
        GridView_Sup_ChonMon hinhanh =  ListMonAn.get(position);
        holder.tv_tenMon.setText( ListMonAn.get(position).getTenMon());
        holder.tv_giaTien.setText( ListMonAn.get(position).getGiaTien());
        holder.imgAnh.setImageResource(hinhanh.getImg_mon());

        return convertView;
    }
}
