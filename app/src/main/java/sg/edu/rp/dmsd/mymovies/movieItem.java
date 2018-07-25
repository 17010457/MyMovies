package sg.edu.rp.dmsd.mymovies;

import java.util.Calendar;

/**
 * Created by 17010457 on 7/25/2018.
 */

public class movieItem {
    private String title;
    private String year;
    private String rated;
    private int stars;
    private String genre;
    private Calendar watched_on;
    private String in_theatre;
    private String description;


    public movieItem(String title, String year, String rated,int stars, String genre, Calendar watched_on, String in_theatre, String description) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.stars = stars;
        this.genre = genre;
        this.watched_on = watched_on;
        this.in_theatre = in_theatre;
        this.description = description;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }
    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Calendar getWatched_on() {
        return watched_on;
    }
    public String getWatchedString() {
        String str = watched_on.get(Calendar.DAY_OF_MONTH)+"/"+watched_on.get(Calendar.MONTH)+"/"+watched_on.get(Calendar.YEAR);
        return str;
    }
    public void setWatched_on(Calendar watched_on) {
        this.watched_on = watched_on;
    }

    public String getIn_theatre() {
        return in_theatre;
    }

    public void setIn_theatre(String in_theatre) {
        this.in_theatre = in_theatre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "movieItem{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", rated='" + rated + '\'' +
                ", stars=" + stars +
                ", genre='" + genre + '\'' +
                ", watched_on=" + watched_on +
                ", in_theatre='" + in_theatre + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    public String message() {
        String str = getTitle() + "\n" + getYear() + " - " + getGenre() + "\n" + "\n" +
                getDescription() + "\n" + "Watch on: " + getWatchedString() + "\n" +
                "In theatre: " + getIn_theatre();
        return str;
    }
}
