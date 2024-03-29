package com.example.prm392_finalproject.Activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.prm392_finalproject.R;
import com.example.prm392_finalproject.Session.UserDataManager;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
@RequiresApi(api = Build.VERSION_CODES.O)
public class AccountActivity extends AppCompatActivity {

    private TextView tvName, tvPhone;
    private Button btnChangeAddress, btnChangePassword, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        tvName = findViewById(R.id.tv_name);
        tvPhone = findViewById(R.id.tv_username);
        btnChangeAddress = findViewById(R.id.btn_change_address);
        btnChangePassword = findViewById(R.id.btn_change_password);
        btnLogout = findViewById(R.id.btn_logout);

        tvName.setText(UserDataManager.getUserPreference().getName());
        tvPhone.setText(UserDataManager.getUserPreference().getPhone());

        btnChangeAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ChangeAddressActivity.class);
                startActivity(intent);
            }
        });

        btnChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ChangePasswordActivity.class);
                startActivity(intent);
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserDataManager.setUserJsonString(null);
                Toast.makeText(AccountActivity.this, "Đăng xuất thành công", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Cau hinh bottom navigation
        BottomNavigationView mBottomNavigationView = findViewById(R.id.bottom_navigation);
        mBottomNavigationView.setSelectedItemId(R.id.bottom_account);
        mBottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.bottom_home) {
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id == R.id.bottom_cart) {
                    Intent intent = new Intent(getApplicationContext(),CartActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id == R.id.bottom_order) {
                    Intent intent = new Intent(getApplicationContext(),OrderActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id == R.id.bottom_chat) {
                    Intent intent = new Intent(getApplicationContext(),ChatActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id == R.id.bottom_account) {
                }
                return true;
            }
        });
    }
}