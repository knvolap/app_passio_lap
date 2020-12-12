package volap.com.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import volap.com.R;


public class Login2_Activity extends AppCompatActivity {
    Button next_login2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
        next_login2=(Button)findViewById(R.id.bt_next2);
        next_login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(Login2_Activity.this, Login3_Activity.class);
                startActivity(Dis2);
            }
        });
    }
}
