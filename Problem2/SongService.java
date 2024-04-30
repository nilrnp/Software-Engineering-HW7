package Homework7.Problem2;

import java.util.*;

interface SongService {
    Song searchById(Integer songID);

    List<Song> searchByTitle(String title);

    List<Song> searchByAlbum(String album);
}
