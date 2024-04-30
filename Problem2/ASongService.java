package Homework7.Problem2;

import java.util.*;

class ASongService implements SongService {
    private Map<Integer, Song> songMap;

    public ASongService() {
        songMap = new HashMap<>();
        songMap.put(1, new Song("Song1", "Artist1", "Album1", 240));
        songMap.put(2, new Song("Song2", "Artist2", "Album2", 200));
        songMap.put(3, new Song("Song3", "Artist3", "Album1", 180));
        songMap.put(4, new Song("Song4", "Artist2", "Album3", 300));
        songMap.put(5, new Song("Song5", "Artist1", "Album2", 220));
    }

    @Override
    public Song searchById(Integer songID) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return songMap.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Song> result = new ArrayList<>();
        for (Song song : songMap.values()) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                result.add(song);
            }
        }
        return result;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Song> result = new ArrayList<>();
        for (Song song : songMap.values()) {
            if (song.getAlbum().equalsIgnoreCase(album)) {
                result.add(song);
            }
        }
        return result;
    }
}