package volap.com.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import volap.com.R;


public class ChiTiet_activity extends AppCompatActivity {
    ImageView img_backHome_6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitiet);
        img_backHome_6= (ImageView)findViewById(R.id.img_back_home_6);
        img_backHome_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChiTiet_activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
    }
}