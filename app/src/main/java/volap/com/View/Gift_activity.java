package volap.com.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import com.google.android.material.tabs.TabLayout;

import volap.com.Adapter.Adapter_Fragment_Gift;
import volap.com.R;

public class Gift_activity extends AppCompatActivity {
    ViewPager viewPager2;
    TabLayout tabLayout2;
    ImageView img_backHome_5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift);
        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);

        img_backHome_5= (ImageView)findViewById(R.id.img_back_home5);
        img_backHome_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gift_activity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        viewPager2 = findViewById(R.id.view_pager2);
        viewPager2.setAdapter(new Adapter_Fragment_Gift(getSupportFragmentManager()));

        tabLayout2 = findViewById(R.id.tab_layout2);
        tabLayout2.setupWithViewPager(viewPager2);

    }
}