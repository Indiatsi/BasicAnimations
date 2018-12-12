package example.android.schatze.com.basicanimations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageMarvel = findViewById(R.id.ivImage);
        ImageView imageSpiderman = findViewById(R.id.ivSpiderman);
        imageMarvel.setTranslationX(-1500f);
    }

    public void fade(View view) {
        ImageView imageMarvel = findViewById(R.id.ivImage);
        // The image fades in 5 secs
        imageMarvel.animate().alpha(0f).setDuration(5000);
        ImageView imageSpiderman = findViewById(R.id.ivImage);
        // This image cross fades with the other one
        imageSpiderman.animate().alpha(1f).setDuration(5000);
    }

    public void translation(View view) {
        ImageView imageMarvel = findViewById(R.id.ivImage);
        // The image moves down in 5 secs
        // translationX moves image left or right
        imageMarvel.animate().translationX(1f).setDuration(5000);
    }
}
