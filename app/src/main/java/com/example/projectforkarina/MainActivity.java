package com.example.projectforkarina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonChangeText = findViewById(R.id.button_change_text);
        Button buttonToast = findViewById(R.id.button_toast);
        final TextView textView = findViewById(R.id.textView);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hi!");
            }
        });

        final ImageView imageView = findViewById(R.id.imageView);
        final boolean[] a = {true};

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a[0]){
                    imageView.setImageResource(R.drawable.second);
                    a[0] = false;
                } else {
                    imageView.setImageResource(R.drawable.first);
                    a[0] = true;
                }
            }
        });

        // Чтобы легко написать setOnClickListener не запоминая и переписывая весь код,
        // тебе нужно написать id кнопки (buttonToast например), поставить точку, написать
        // setOnClickListener, открыт скобку и написать new View.On... и дальше всё само выйдет
        // Жмёшь enter и все пишется за тебя
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Мяу!", Toast.LENGTH_LONG).show();
                // это - тост, аля уведомление. Toast - объект, пишешь после через точку функцию makeText
                // В скобках указываешь контекст (это то где происходит действие), то есть
                // MainActivity.this, после то что нужно вывести, и длинну тоста
                // Toast.LENGTH_LONG или LENGTH_SHORT, после пишешь .show();
            }
        });
    }
}