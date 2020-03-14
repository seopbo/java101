public class Song {
    public final String name;
    public final Artist artist;
    public final Album album;

    public Song(String name, Artist artist, Album album) {
        this.name = name;
        this.artist = artist;
        this.album = album;
    }

    @Override
    public String toString() {
        String string;
        string = this.name + " - " + this.artist.name + "\n" + this.album.name + "(" + this.album.year + ")";
        return string;
    }
}
