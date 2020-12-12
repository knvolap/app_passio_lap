package volap.com.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import volap.com.R;


public class ThongBao_Activity extends AppCompatActivity {
ImageView img_backHome_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongbao);
        img_backHome_2= (ImageView)findViewById(R.id.img_back_home_2);
        img_backHome_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThongBao_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
    }
}