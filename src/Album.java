import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();


    }

    public boolean addSong(String title, double duration){
        // Adds song and returns true if added

        if (findSong(title) == null){
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        // returns Song or null
        for (int i = 0; i < songs.size(); i++){
            if (songs.get(i).getTitle() == title){
                return songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        // return true if exists and was added via track number
        int idx = trackNumber - 1;

        if (( idx >= 0) && idx <= this.songs.size()){
            playlist.add(this.songs.get(idx));
            return true;
        }
        System.out.println("Track not found");
        return false;

    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        // return true if exists and was added by name.

        if (findSong(title) != null){
            playlist.add(findSong(title));
            return true;
        }
        return false;
    }

}
