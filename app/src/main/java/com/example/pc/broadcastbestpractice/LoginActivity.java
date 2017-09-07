package com.example.pc.broadcastbestpractice;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by pc on 2017/9/7.
 */

public class LoginActivity extends BaseActivity {
    private EditText accountEdit;
    private EditText passwordEdit;
    private Button login;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        accountEdit= (EditText) findViewById(R.id.account);
        passwordEdit= (EditText) findViewById(R.id.password);
        login= (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account=accountEdit.getText().toString();
            }
        });

    }
}
