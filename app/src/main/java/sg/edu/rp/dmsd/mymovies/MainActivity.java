package sg.edu.rp.dmsd.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<movieItem> alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie);

        alMovieList = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2014,10,15);
        Calendar date2 = Calendar.getInstance();
        date2.set(2015,4,15);
        String description1 = "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.";
        String description2 = "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.";
        movieItem item1 = new movieItem("The Avengers","2012","pg13",4,"Action | Sci-Fi",date1,"Golden Village - Bishan",description1);
        movieItem item2 = new movieItem("Planes","2013","pg",2,"Animation | Comedy",date2,"Cathay - AMK Hub",description2);
        alMovieList.add(item1);
        alMovieList.add(item2);

        caMovie = new CustomAdapter(this, R.layout.movie_item, alMovieList);
        lvMovie.setAdapter(caMovie);

        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(lvMovie.getContext(),movieDetailsActivity.class);
                movieItem movie = alMovieList.get(position);
                intent.putExtra("title",movie.message());

                startActivity(intent);
            }
        });
    }
}
