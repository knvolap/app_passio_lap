package volap.com.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;


import volap.com.Adapter.GridView_Adapter_ChonMon;
import volap.com.Adapter.GridView_Sup_ChonMon;
import volap.com.R;



public class BlankFragment_chonmon_2 extends Fragment {

    GridView gridView2;
    ArrayList<GridView_Sup_ChonMon> arrayList2;
    GridView_Adapter_ChonMon adapter2;
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank_chonmon_2, container, false);

        gridView2= view.findViewById(R.id.gridview_frgm_2);
        arrayList2= new ArrayList<>();

        homeData();
        context = this.getActivity();
        adapter2= new GridView_Adapter_ChonMon(arrayList2,context);
        gridView2.setAdapter(adapter2);

        adapter2=new GridView_Adapter_ChonMon(getActivity(),R.layout.activity_sup_chonmon,arrayList2);
        gridView2.setAdapter(adapter2);
        return  view;
    }
    public void homeData(){
        arrayList2.add(new GridView_Sup_ChonMon( "Choco XMas","55.000",R.drawable.chgb_1));
        arrayList2.add(new GridView_Sup_ChonMon( "Choco XMas","55.000",R.drawable.chgb_4));
        arrayList2.add(new GridView_Sup_ChonMon( "Choco XMas","55.000",R.drawable.chgb_1));
        arrayList2.add(new GridView_Sup_ChonMon( "Choco XMas","55.000",R.drawable.chgb_4));
        arrayList2.add(new GridView_Sup_ChonMon( "Choco XMas","55.000",R.drawable.chgb_1));
        arrayList2.add(new GridView_Sup_ChonMon( "Choco XMas","55.000",R.drawable.chgb_4));
        arrayList2.add(new GridView_Sup_ChonMon( "Choco XMas","55.000",R.drawable.chgb_1));
        arrayList2.add(new GridView_Sup_ChonMon( "Choco XMas","55.000",R.drawable.chgb_4));
        adapter2=new GridView_Adapter_ChonMon(arrayList2,this.getActivity());
        gridView2.setAdapter(adapter2);
    }

}