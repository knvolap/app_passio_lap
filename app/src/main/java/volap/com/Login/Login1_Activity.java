package volap.com.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import volap.com.R;


public class Login1_Activity extends AppCompatActivity {
Button next_login1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login1);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
        next_login1=(Button)findViewById(R.id.bt_next1);
        next_login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(Login1_Activity.this, Login2_Activity.class);
                startActivity(Dis2);
            }
        });
    }
}

