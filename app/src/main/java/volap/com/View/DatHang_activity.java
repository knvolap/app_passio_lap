package volap.com.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import volap.com.R;

public class DatHang_activity  extends AppCompatActivity {
    Button bt_giohang;
    Button btn_gioHang1;
    ImageButton imageButtonTru,imageButtonCong;
    TextView txtSoLuong, txtMaps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dathang);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);

        btn_gioHang1=(Button)findViewById(R.id.bt_themGioHang);
        btn_gioHang1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(DatHang_activity.this, GioHang.class);
                startActivity(Dis2);
            }
        });

        imageButtonTru = findViewById(R.id.imageButtonTru);
        imageButtonCong = findViewById(R.id.imageButtonCong);
        txtSoLuong = findViewById(R.id.txtSoLuong);


        imageButtonTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sl = Integer.parseInt(txtSoLuong.getText().toString());
                if (sl > 1)
                    txtSoLuong.setText(Integer.toString(sl - 1));
            }
        });
        imageButtonCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sl = Integer.parseInt(txtSoLuong.getText().toString());

                txtSoLuong.setText(Integer.toString(sl + 1));
            }
        });


    }
}
