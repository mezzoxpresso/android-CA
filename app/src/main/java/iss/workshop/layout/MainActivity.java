package iss.workshop.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupBtns();
//        chooseFirstImage();
    }

    protected void setupBtns() {
        int[] ids = {R.id.btn1, R.id.btn2, R.id.btn3,
                R.id.btn4, R.id.btn5, R.id.btn6,
                R.id.btn7, R.id.btn8, R.id.btn9,
                R.id.btn10, R.id.btn11, R.id.btn12,};

        for (int i = 0; i < ids.length; i++) {
            ImageButton btn = findViewById(ids[i]);
            if (btn != null) {
                btn.setOnClickListener(this);
            }
        }
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.btn1) {
            ImageButton img = (ImageButton) findViewById(R.id.btn1);
            img.setSelected(!img.isPressed());
            if (img.isPressed()) {
                img.setImageResource(R.drawable.greenapple);
            }
        }

        if (id == R.id.btn2) {
            ImageButton img = (ImageButton) findViewById(R.id.btn2);
            img.setSelected(!img.isPressed());
            if (img.isPressed()) {
                img.setImageResource(R.drawable.greenapple);
            }

        }

        if (id == R.id.btn3) {
            ImageButton img = (ImageButton) findViewById(R.id.btn3);
            img.setSelected(!img.isPressed());
            if (img.isPressed()) {
                img.setImageResource(R.drawable.greenapple);
            }
        }

        if (id == R.id.btn4) {
            ImageButton img = (ImageButton) findViewById(R.id.btn4);
            img.setSelected(!img.isPressed());
            if (img.isPressed()) {
                img.setImageResource(R.drawable.greenapple);
            }

        }

        if (id == R.id.btn5) {
            ImageButton img = (ImageButton) findViewById(R.id.btn5);
            img.setSelected(!img.isPressed());
            if (img.isPressed()) {
                img.setImageResource(R.drawable.greenapple);
            }

        }

        if (id == R.id.btn6) {
            ImageButton img = (ImageButton) findViewById(R.id.btn6);
            img.setSelected(!img.isPressed());
            if (img.isPressed()) {
                img.setImageResource(R.drawable.greenapple);
            }

        }

        if (id == R.id.btn7) {
            ImageButton img = (ImageButton) findViewById(R.id.btn7);
            img.setSelected(!img.isPressed());
            if (img.isPressed()) {
                img.setImageResource(R.drawable.greenapple);
            }

        }

        if (id == R.id.btn8) {
            ImageButton img = (ImageButton) findViewById(R.id.btn8);
            img.setSelected(!img.isPressed());
            if (img.isPressed()) {
                img.setImageResource(R.drawable.greenapple);
            }

        }

        if (id == R.id.btn9) {
            ImageButton img = (ImageButton) findViewById(R.id.btn9);
            img.setSelected(!img.isPressed());
            if (img.isPressed()) {
                img.setImageResource(R.drawable.greenapple);
            }

        }

        if (id == R.id.btn10) {
            ImageButton img = (ImageButton) findViewById(R.id.btn10);
            img.setSelected(!img.isPressed());
            if (img.isPressed()) {
                img.setImageResource(R.drawable.greenapple);
            }

        }

        if (id == R.id.btn11) {
            ImageButton img = (ImageButton) findViewById(R.id.btn11);
            img.setSelected(!img.isPressed());
            if (img.isPressed()) {
                img.setImageResource(R.drawable.greenapple);
            }

        }

        if (id == R.id.btn12) {
            ImageButton img = (ImageButton) findViewById(R.id.btn12);
            img.setSelected(!img.isPressed());
            if (img.isPressed()) {
                img.setImageResource(R.drawable.greenapple);
            }

        }
    }
}
