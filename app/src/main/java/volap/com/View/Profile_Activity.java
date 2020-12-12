package volap.com.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



import java.util.ArrayList;

import volap.com.Adapter.GridView_Adapter_Profile;
import volap.com.Adapter.GridView_Sup_Profile;
import volap.com.R;

public class Profile_Activity extends AppCompatActivity {
    GridView gridView;
    ArrayList<GridView_Sup_Profile> arrayList;
    GridView_Adapter_Profile adapter;
    ImageView img_backHome_3;
    TextView txDangXuat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        img_backHome_3= (ImageView)findViewById(R.id.img_back_home_3);
        img_backHome_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        txDangXuat = (TextView) findViewById(R.id.dang_xuat);
        txDangXuat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Profile_Activity.class);
                startActivity(intent);
                Intent startMain = new Intent(Intent.ACTION_MAIN);
                startMain.addCategory(Intent.CATEGORY_HOME);
                startActivity(startMain);
                finish();
            }
        });

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
        gridView =(GridView) findViewById(R.id.grw_profile);
        arrayList=new ArrayList<>();

        arrayList.add(new GridView_Sup_Profile( R.drawable.ic_profile2,"Thông tin cá nhân"));
        arrayList.add(new GridView_Sup_Profile( R.drawable.ic_shipping_address,"Địa chỉ giao hàng"));
        arrayList.add(new GridView_Sup_Profile( R.drawable.ic_coupon,"Coupon của tôi"));
        arrayList.add(new GridView_Sup_Profile( R.drawable.ic_order_history,"Lịch sử đặt hàng"));
        arrayList.add(new GridView_Sup_Profile( R.drawable.ic_about,"Thông tin về chúng tôi"));
        arrayList.add(new GridView_Sup_Profile( R.drawable.ic_telephone_grey,"Liên hệ"));
        arrayList.add(new GridView_Sup_Profile( R.drawable.ic_document,"Điều khoản sử dụng"));
        adapter =new GridView_Adapter_Profile(this,R.layout.activity_sup_profile,arrayList);
        gridView.setAdapter(adapter);

    }
}
