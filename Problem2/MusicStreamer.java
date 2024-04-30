package Homework7.Problem2;

public class MusicStreamer {
    public static void main(String[] args) {
        ASongService realSongService = new ASongService();
        SongService songServiceProxy = new SongServiceProxy(realSongService);

        System.out.println("Search by ID:");
        System.out.println(songServiceProxy.searchById(1));
        System.out.println(songServiceProxy.searchById(2));
        System.out.println(songServiceProxy.searchById(3));

        System.out.println("\nSearch by Title:");
        System.out.println(songServiceProxy.searchByTitle("Song1"));
        System.out.println(songServiceProxy.searchByTitle("Song2"));
        System.out.println(songServiceProxy.searchByTitle("Song5"));

        System.out.println("\nSearch by Album:");
        System.out.println(songServiceProxy.searchByAlbum("Album1"));
        System.out.println(songServiceProxy.searchByAlbum("Album2"));
        System.out.println(songServiceProxy.searchByAlbum("Album3"));
    }
}