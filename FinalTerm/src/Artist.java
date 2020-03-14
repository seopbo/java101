import java.util.ArrayList;

public class Artist {
    public final String name;
    private final ArrayList<Album> albums = new ArrayList<>();

    public Artist (String name) {
        this.name = name;
    }

    public void addAlbum (Album album) {
        this.albums.add(album);
    }

    public ArrayList<Album> getAlbums () {
        return this.albums;
    }
}
