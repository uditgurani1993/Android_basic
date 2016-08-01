package uditgurani.com.listview_customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UDIT GURANI on 7/24/2016.
 */
public class MovieAdapter extends ArrayAdapter {

    List list=new ArrayList();

    public MovieAdapter(Context context, int resource) {
        super(context, resource);
    }

    static class DataHandler
    {
        ImageView poster;
        TextView title;
        TextView rating;
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row=convertView;
        DataHandler handler;
        if(convertView==null)
        {
            LayoutInflater layoutInflater=(LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=layoutInflater.inflate(R.layout.movie_layout,parent,false);
            handler=new DataHandler();
            handler.poster=(ImageView) row.findViewById(R.id.image);
            handler.title=(TextView) row.findViewById(R.id.movie_name);
            handler.rating=(TextView)row.findViewById(R.id.movie_rating);
            row.setTag(handler);
        }
        else {
            handler=(DataHandler)row.getTag();
        }
        MovieDataProvider dataProvider;
        dataProvider=(MovieDataProvider) this.getItem(position);
        handler.poster.setImageResource(dataProvider.getMovie_poster_resource());
        handler.title.setText(dataProvider.getMovie_title());
        handler.rating.setText(dataProvider.getMovie_rating());

        return row;
    }
}
