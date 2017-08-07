package com.example.yu.mysql_php_register_login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Yu on 5/24/2016.
 */
public class Welcome extends Activity {

    private Button log_out;
    @Override
    protected void onCreate(Bundle savedInstancestate) {
        super.onCreate(savedInstancestate);
        setContentView(R.layout.welcome_activity);

        log_out = (Button) findViewById(R.id.button);
        log_out.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
            }
        });
    }
}
