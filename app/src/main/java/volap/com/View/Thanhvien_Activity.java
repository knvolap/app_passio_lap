package volap.com.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;


import volap.com.Adapter.Adapter_Fragment_ThanhVien;
import volap.com.R;


public class Thanhvien_Activity extends AppCompatActivity {
    ImageView img_backHome_1;
    ViewPager viewPager2;
    TabLayout tabLayout2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanhvien);

        img_backHome_1 = (ImageView)findViewById(R.id.img_back_home_1);
        img_backHome_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Thanhvien_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        overridePendingTransition(R.anim.phai_sang_trai,R.anim.trai_sang_phai);

        viewPager2= findViewById(R.id.view_pager4);
        viewPager2.setAdapter(new Adapter_Fragment_ThanhVien(getSupportFragmentManager()));

        tabLayout2 = findViewById(R.id.tab_layout_thanhvien);
        tabLayout2.setupWithViewPager(viewPager2);

    }
}