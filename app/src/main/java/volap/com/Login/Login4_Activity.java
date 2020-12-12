package volap.com.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import volap.com.R;
import volap.com.View.MainActivity;


public class Login4_Activity extends AppCompatActivity {
Button btn_luu_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login4);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
        btn_luu_4=(Button)findViewById(R.id.bt_luu_4);
        btn_luu_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(Login4_Activity.this, MainActivity.class);
                startActivity(Dis2);
            }
        });
    }
}
