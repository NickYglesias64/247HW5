//Nicholas Yglesias
import java.util.Queue;

public class JukeBox {
    /**
     * Attempted to create a queue called songqueue
     * and a static Jukebox
     */
    private Queue<String> songQueue;
    private static JukeBox jukebox;

    /**
     * Gets an instance of the jukebox
     * @return
     */
    public static JukeBox getInstance() {
        if(jukebox == null) {
            System.out.println("Initializing the JukeBox!!! Let's get Dancing");
            jukebox = new JukeBox(songQueue);
        }
        return jukebox;
    }

    /**
     * Plays the next song in the queue unless it is empty
     */
    public void playNextSong() {
        if(songQueue.isEmpty()) {
            System.out.println("You need to add songs to the list");
        }
        else {
            System.out.println("Let's jam to "+songQueue.remove());
        }
    }

    /**
     * Requests a song to play and tells you how far away it is
     * @param song
     */
    public void requestSong(String song) {
        songQueue.add(song);
        System.out.println(song+" is now number "+songQueue.size()+" on the list");
    }

    /**
     * Tells you if there are more songs in the queue
     * @return
     */
    public boolean hasMoreSongs() {
        if(songQueue.isEmpty()) {
            return false;
        }
        else {
            return true;
        }
    }
}
