package stu.cn.ua.lab1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        findViewById(R.id.startGameButton).setOnClickListener(v -> {
            Intent intent2 = new Intent ( this, GameActivity.class);
            startActivity(intent2);
        });
        findViewById(R.id.settingsButton).setOnClickListener(v -> {
            Intent intent = new Intent ( this, SettingsActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.exitButton).setOnClickListener(v -> {
            finish();
        });
    }
}
