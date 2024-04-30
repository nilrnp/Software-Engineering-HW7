package Homework7.Problem2;

import java.util.*;

class SongServiceProxy implements SongService {
    private SongService songService;
    private Map<Integer, Song> cacheById;
    private Map<String, List<Song>> cacheByTitle;
    private Map<String, List<Song>> cacheByAlbum;

    public SongServiceProxy(SongService songService) {
        this.songService = songService;
        cacheById = new HashMap<>();
        cacheByTitle = new HashMap<>();
        cacheByAlbum = new HashMap<>();
    }

    @Override
    public Song searchById(Integer songID) {
        if (!cacheById.containsKey(songID)) {
            Song song = songService.searchById(songID);
            cacheById.put(songID, song);
        }
        return cacheById.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        if (!cacheByTitle.containsKey(title)) {
            List<Song> songs = songService.searchByTitle(title);
            cacheByTitle.put(title, songs);
        }
        return cacheByTitle.get(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        if (!cacheByAlbum.containsKey(album)) {
            List<Song> songs = songService.searchByAlbum(album);
            cacheByAlbum.put(album, songs);
        }
        return cacheByAlbum.get(album);
    }
}