package volap.com.View;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import volap.com.Adapter.RecycleView_Adapter_home;
import volap.com.Adapter.RecycleView_Sup_Home;
import volap.com.R;

public class MainActivity extends AppCompatActivity {
Button btn1;
    ImageView img_chonmon, img_thanhvien, img_home_prf, img_home_gift, img_home_map, img_home_thongbao;
    private RecyclerView rcv1;
    private Context context;
    private RecycleView_Adapter_home recycleView_adapter;
    FloatingActionButton actionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        overridePendingTransition(R.anim.trai_sang_phai, R.anim.phai_sang_trai);

        img_thanhvien = (ImageView) findViewById(R.id.img_tichdiem);
        img_thanhvien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Thanhvien_Activity.class);
                startActivity(intent);
            }
        });


        img_chonmon = (ImageView) findViewById(R.id.img_chon_mon);
        img_chonmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChiTiet_activity.class);
                startActivity(intent);
            }
        });

        img_home_prf = (ImageView) findViewById(R.id.ic_home_profile);
        img_home_prf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Profile_Activity.class);
                startActivity(intent);
            }
        });
        img_home_gift = (ImageView) findViewById(R.id.ic_home_gift);
        img_home_gift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Gift_activity.class);
                startActivity(intent);
            }
        });
        img_home_map = (ImageView) findViewById(R.id.ic_home_map);
        img_home_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Maps_Activity.class);
                startActivity(intent);
            }
        });
        img_home_thongbao = (ImageView) findViewById(R.id.ic_home_thongbao);
        img_home_thongbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThongBao_Activity.class);
                startActivity(intent);
            }
        });


        actionButton = findViewById(R.id.img_mua_trasua);
        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ChonMon_activity.class));
            }
        });



        rcv1 = findViewById(R.id.RecyclerView_home);
        rcv1.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(context, RecyclerView.VERTICAL, false);
        rcv1.setLayoutManager(linearLayoutManager2);
        recycleView_adapter = new RecycleView_Adapter_home();
        recycleView_adapter.setData(getListMonAn());
        rcv1.setAdapter(recycleView_adapter);

        rcv1.addOnItemTouchListener(new RecyclerItemClickListener(this, rcv1, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(MainActivity.this, ChiTiet_activity.class);
                startActivity(intent);
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));


    }

    private List<RecycleView_Sup_Home> getListMonAn() {
        List<RecycleView_Sup_Home> list_MonAn = new ArrayList<>();
        list_MonAn.add(new RecycleView_Sup_Home("THƯỞNG THỨC KEM GELATO NGON CHUẨN TẠI PASIO VỚI GI Á CHỈ 29.000đ",
                " Đâu cần di Ý để thưởng thức kem Gelato, vì ngay tại Passio 77", R.drawable.img_home_2));
        list_MonAn.add(new RecycleView_Sup_Home("THƯỞNG THỨC KEM GELATO NGON CHUẨN TẠI PASIO VỚI GI Á CHỈ 29.000đ",
                " Đâu cần di Ý để thưởng thức kem Gelato, vì ngay tại Passio 77", R.drawable.img_home_3));
        list_MonAn.add(new RecycleView_Sup_Home("THƯỞNG THỨC KEM GELATO NGON CHUẨN TẠI PASIO VỚI GI Á CHỈ 29.000đ",
                " Đâu cần di Ý để thưởng thức kem Gelato, vì ngay tại Passio 77", R.drawable.img_home_4));
        list_MonAn.add(new RecycleView_Sup_Home("THƯỞNG THỨC KEM GELATO NGON CHUẨN TẠI PASIO VỚI GI Á CHỈ 29.000đ",
                " Đâu cần di Ý để thưởng thức kem Gelato, vì ngay tại Passio 77", R.drawable.img_home_6));
        list_MonAn.add(new RecycleView_Sup_Home("THƯỞNG THỨC KEM GELATO NGON CHUẨN TẠI PASIO VỚI GI Á CHỈ 29.000đ",
                " Đâu cần di Ý để thưởng thức kem Gelato, vì ngay tại Passio 77", R.drawable.img_home_7));

        return list_MonAn;
    }
}

class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);

        public void onLongItemClick(View view, int position);
    }

    GestureDetector mGestureDetector;

    public RecyclerItemClickListener(Context context, final RecyclerView recyclerView, OnItemClickListener listener) {
        mListener = listener;
        mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }

            @Override
            public void onLongPress(MotionEvent e) {
                View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
                if (child != null && mListener != null) {
                    mListener.onLongItemClick(child, recyclerView.getChildAdapterPosition(child));
                }
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView view, MotionEvent e) {
        View childView = view.findChildViewUnder(e.getX(), e.getY());
        if (childView != null && mListener != null && mGestureDetector.onTouchEvent(e)) {
            mListener.onItemClick(childView, view.getChildAdapterPosition(childView));
            return true;
        }
        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView view, MotionEvent motionEvent) {
    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
    }
}

