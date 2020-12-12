package volap.com.Fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import volap.com.Adapter.GridView_Adapter_ChonMon;
import volap.com.Adapter.GridView_Sup_ChonMon;
import volap.com.R;
import volap.com.View.GioHang;


public class BlankFragment_chonmon_1 extends Fragment {
    GridView gridView1;
    ArrayList<GridView_Sup_ChonMon> arrayList1;
    GridView_Adapter_ChonMon adapter1;
    Context context,mContext;
    int Soluong;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank_chonmon_1, container, false);

        gridView1 = view.findViewById(R.id.gridview_frgm_1);
        arrayList1 = new ArrayList<>();

        homeData();
        context = this.getActivity();
        adapter1 = new GridView_Adapter_ChonMon(arrayList1,context);
        gridView1.setAdapter(adapter1);
        adapter1 =new GridView_Adapter_ChonMon(getActivity(),R.layout.activity_sup_chonmon,arrayList1);
        gridView1.setAdapter(adapter1);
        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                DialogLogin();
            }
        });

        return  view;

    }
    public void homeData(){
        arrayList1.add(new GridView_Sup_ChonMon( "Choco XMas","45.000",R.drawable.ts_1));
        arrayList1.add(new GridView_Sup_ChonMon( "Choco XMas","35.000",R.drawable.sp_2));
        arrayList1.add(new GridView_Sup_ChonMon( "Choco XMas","25.000",R.drawable.sp_3));
        arrayList1.add(new GridView_Sup_ChonMon( "Choco XMas","15.000",R.drawable.sp_5));


        adapter1=new GridView_Adapter_ChonMon(arrayList1,this.getActivity());
        gridView1.setAdapter(adapter1);
    }


    private void DialogLogin() {
        Dialog dialog= new Dialog(getActivity());
        dialog.setContentView(R.layout.activity_dathang);
        ImageView imgCong = dialog.findViewById(R.id.imageButtonCong);
        ImageView imgTru = dialog.findViewById(R.id.imageButtonTru);
        final TextView tvSoluong = dialog.findViewById(R.id.txtSoLuong);
        Soluong = Integer.parseInt(tvSoluong.getText().toString());

        imgCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Soluong+=1;
                tvSoluong.setText(String.valueOf(Soluong));
            }
        });

        imgTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Soluong > 1)
                    Soluong -=1;
                tvSoluong.setText(String.valueOf(Soluong));
            }
        });

        Button ThemGioHang=dialog.findViewById((R.id.bt_themGioHang));
        ThemGioHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(getActivity(), GioHang.class);
                startActivity(Dis2);
            }

        });
        dialog.show();
    }


}
