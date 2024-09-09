package module6;

import java.util.LinkedList;
import java.util.ListIterator;

public class MusicPlayList {
    private LinkedList<String> playlist;

    public MusicPlayList() {
        playlist = new LinkedList<>();
    }

    // Add a song to the playlist
    public void addSong(String song) {
        playlist.add(song);
        System.out.println("Added: " + song);
    }

    // Remove a song by name
    public void removeSong(String song) {
        if (playlist.remove(song)) {
            System.out.println("Removed: " + song);
        } else {
            System.out.println("Song not found: " + song);
        }
    }

    // Move a song to a different position in the playlist
    public void moveSong(String song, int newPosition) {
        if (!playlist.contains(song)) {
            System.out.println("Song not found: " + song);
            return;
        }

        if (newPosition < 0 || newPosition >= playlist.size()) {
            System.out.println("Invalid position: " + newPosition);
            return;
        }

        playlist.remove(song);
        playlist.add(newPosition, song);
        System.out.println("Moved " + song + " to position " + (newPosition + 1));
    }

    // Display the playlist
    public void displayPlaylist() {
        System.out.println("Current Playlist:");
        ListIterator<String> iterator = playlist.listIterator();
        int index = 1;
        while (iterator.hasNext()) {
            System.out.println(index + ". " + iterator.next());
            index++;
        }
    }

    public static void main(String[] args) {
        MusicPlayList myPlaylist = new MusicPlayList();

        // Adding songs to the playlist
        myPlaylist.addSong("Song A");
        myPlaylist.addSong("Song B");
        myPlaylist.addSong("Song C");
        myPlaylist.addSong("Song D");

        // Displaying the playlist
        myPlaylist.displayPlaylist();

        // Moving "Song C" to the first position
        myPlaylist.moveSong("Song C", 0);
        myPlaylist.displayPlaylist();

        // Removing "Song B"
        myPlaylist.removeSong("Song B");
        myPlaylist.displayPlaylist();

        // Attempting to remove a song not in the playlist
        myPlaylist.removeSong("Song X");
        myPlaylist.displayPlaylist();
    }
}
