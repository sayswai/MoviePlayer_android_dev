import android.database.Cursor;
import android.provider.MediaStore;

/**
 * Created by Wai on 6/1/2016.
 */
public class Movie {

    private final String title;
    private final String movieDir;
    private final String mimeType;
    private final long duration;
    private final String thumbnailDir;

    public Movie(Cursor mediaCursor, Cursor thumbnailCursor)
    {
        title = mediaCursor.getString(mediaCursor.getColumnIndexOrThrow(MediaStore.Video.Media.TITLE));
        movieDir = mediaCursor.getString(mediaCursor.getColumnIndex(MediaStore.Video.Media.DATA));
        mimeType = mediaCursor.getString(mediaCursor.getColumnIndex(MediaStore.Video.Media.MIME_TYPE));
        duration = mediaCursor.getLong(mediaCursor.getColumnIndex(MediaStore.Video.Media.DURATION));
        if((thumbnailCursor != null) && thumbnailCursor.moveToFirst())
        {
            thumbnailDir = thumbnailCursor.getString(thumbnailCursor.getColumnIndex(MediaStore.Video.Thumbnails.DATA));
        }else{
            thumbnailDir = null;
        }

    }

    public String getTitle() {
        return title;
    }

    public String getMovieDir() {
        return movieDir;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", movieDir='" + movieDir + '\'' +
                ", mimeType='" + mimeType + '\'' +
                ", duration=" + duration +
                ", thumbnailDir='" + thumbnailDir + '\'' +
                '}';
    }

    public String getMimeType() {
        return mimeType;
    }

    public long getDuration() {
        return duration;
    }

    public String getThumbnailDir() {
        return thumbnailDir;
    }
}
