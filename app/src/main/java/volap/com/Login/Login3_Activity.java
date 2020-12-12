package volap.com.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import volap.com.R;


public class Login3_Activity extends AppCompatActivity {
    Button next_login3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
        next_login3=(Button)findViewById(R.id.bt_next3);
        next_login3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(Login3_Activity.this, Login4_Activity.class);
                startActivity(Dis2);
            }
        });
    }
}
