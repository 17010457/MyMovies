package sg.edu.rp.dmsd.mymovies;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class movieDetailsActivity extends AppCompatActivity {
    ImageView ivRated;
    TextView tvTitle;
    TextView tvDate;
    TextView tvDescription;
    RatingBar rbRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ivRated= findViewById(R.id.ivRated);
        tvTitle = findViewById(R.id.tvTitle);
        tvDate = findViewById(R.id.tvDate);
        tvDescription = findViewById(R.id.tvDescription);
        rbRating = findViewById(R.id.rbRating);

        Intent intentReceived = getIntent();
        String title = intentReceived.getStringExtra("title");
        String date = intentReceived.getStringExtra("date");
        String rated = intentReceived.getStringExtra("rated");
        int stars = intentReceived.getIntExtra("stars",0);
        String genre = intentReceived.getStringExtra("genre");
        String description = intentReceived.getStringExtra("description");
        String watchon = intentReceived.getStringExtra("watch");
        String intheatre = intentReceived.getStringExtra("theatre");

        tvTitle.setText(title);
        if ("pg13".equals(rated)) {
            ivRated.setImageResource(R.drawable.rating_pg13);
        }
        else if ("pg".equals(rated)){
            ivRated.setImageResource(R.drawable.rating_pg);
        }
        else if ("r21".equals(rated)){
            ivRated.setImageResource(R.drawable.rating_r21);
        }
        else if ("nc16".equals(rated)){
            ivRated.setImageResource(R.drawable.rating_nc16);
        }
        else if ("m18".equals(rated)){
            ivRated.setImageResource(R.drawable.rating_m18);
        }
        else {
            ivRated.setImageResource(R.drawable.rating_g);
        }

        rbRating.setRating(stars);
    }
}