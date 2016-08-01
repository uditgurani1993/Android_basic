package uditgurani.com.listview_customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    int[] movie_poster_resource={R.drawable.ic_launcher,R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher};
    String[] movie_titles;
    String[] movie_rating;
    MovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.list_view);
        movie_titles=getResources().getStringArray(R.array.movie_title);
        movie_rating=getResources().getStringArray(R.array.movie_rating);
        int i=0;
        adapter=new MovieAdapter(getApplicationContext(),R.layout.movie_layout);
        listView.setAdapter(adapter);
        for (String titles: movie_titles)
        {
            MovieDataProvider dataProvider=new MovieDataProvider(movie_poster_resource[i],movie_titles[i],movie_rating[i]);
            adapter.add(dataProvider);
            i++;
        }
    }
}
