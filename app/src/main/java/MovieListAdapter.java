import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Wai on 6/1/2016.
 */
public class MovieListAdapter extends BaseAdapter{

    private final Context context;

    private final ArrayList<Movie> movieList;

    public MovieListAdapter(Context context, ArrayList<Movie> movieList)
    {
        this.context = context;
        this.movieList = movieList;
    }

    @Override
    public int getCount() {
        return movieList.size();
    }

    @Override
    public Object getItem(int position) {
        return movieList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
