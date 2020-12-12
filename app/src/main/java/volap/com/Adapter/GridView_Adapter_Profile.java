package volap.com.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import volap.com.R;

import java.util.List;


public class GridView_Adapter_Profile extends BaseAdapter {

    private Context context;
    private int layout;
    private List<GridView_Sup_Profile> hinhanhList;

    public GridView_Adapter_Profile(Context context, int layout, List<GridView_Sup_Profile> hinhanhList) {
        this.context = context;
        this.layout = layout;
        this.hinhanhList = hinhanhList;
    }

    public GridView_Adapter_Profile(GridView_Adapter_Profile gridView_adapter_profile, List<GridView_Sup_Profile> image_details) {
    }

    @Override
    public int getCount() {
        return hinhanhList.size();
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
        ImageView imgIcon;
        TextView tenView;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder.imgIcon = (ImageView)convertView.findViewById(R.id.img_icon);
            holder.tenView = (TextView)convertView.findViewById(R.id.title_profile);


            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }
        GridView_Sup_Profile hinhanh = hinhanhList.get(position);
        holder.imgIcon.setImageResource(hinhanh.getIcon());
        holder.tenView.setText(hinhanhList.get(position).getTitle());


        return convertView;
    }
}
