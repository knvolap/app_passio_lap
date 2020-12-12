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


public class BlankFragment_chonmon_4 extends Fragment {
    GridView gridView4;
    ArrayList<GridView_Sup_ChonMon> arrayList4;
    GridView_Adapter_ChonMon adapter4;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank_chonmon_4, container, false);
        gridView4 = view.findViewById(R.id.gridview_frgm_4);
        arrayList4 = new ArrayList<>();

        homeData();
        context = this.getActivity();
        adapter4 = new GridView_Adapter_ChonMon(arrayList4, context);
        gridView4.setAdapter(adapter4);

        adapter4 = new GridView_Adapter_ChonMon(getActivity(), R.layout.activity_sup_chonmon, arrayList4);
        gridView4.setAdapter(adapter4);
        return view;
    }

    public void homeData() {
        arrayList4.add(new GridView_Sup_ChonMon("Choco XMas", "55.000", R.drawable.chgb_1));
        arrayList4.add(new GridView_Sup_ChonMon("Choco XMas", "55.000", R.drawable.chgb_4));
        arrayList4.add(new GridView_Sup_ChonMon("Choco XMas", "55.000", R.drawable.chgb_1));
        arrayList4.add(new GridView_Sup_ChonMon("Choco XMas", "55.000", R.drawable.chgb_4));
        arrayList4.add(new GridView_Sup_ChonMon("Choco XMas", "55.000", R.drawable.chgb_1));
        arrayList4.add(new GridView_Sup_ChonMon("Choco XMas", "55.000", R.drawable.chgb_4));
        arrayList4.add(new GridView_Sup_ChonMon("Choco XMas", "55.000", R.drawable.chgb_1));
        arrayList4.add(new GridView_Sup_ChonMon("Choco XMas", "55.000", R.drawable.chgb_4));
        adapter4 = new GridView_Adapter_ChonMon(arrayList4, this.getActivity());
        gridView4.setAdapter(adapter4);
    }
}