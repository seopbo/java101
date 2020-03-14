import java.util.ArrayList;

public class Album {
    public final String name;
    public final int year;
    public final Artist artist;
    private final ArrayList<Song> track = new ArrayList<>();

    public Album(String name, int year, Artist artist) {
        this.name = name;
        this.year = year;
        this.artist = artist;
    }

    public void addTrack (Song song) {
        this.track.add(song);
    }
    public Song getTrack (int order) {
        return this.track.get(order - 1);
    }
}