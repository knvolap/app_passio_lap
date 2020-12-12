package volap.com.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import com.google.android.material.tabs.TabLayout;

import volap.com.Adapter.Adapter_Fragment_ChonMon;
import volap.com.R;

public class ChonMon_activity extends AppCompatActivity {

    ImageView img_backHome_7;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chon_mon);

        img_backHome_7 = (ImageView) findViewById(R.id.img_back_home_7);
        img_backHome_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChonMon_activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new Adapter_Fragment_ChonMon(getSupportFragmentManager()));

        tabLayout = findViewById(R.id.tab_layout_chonmon);
        tabLayout.setupWithViewPager(viewPager);
    }
}
