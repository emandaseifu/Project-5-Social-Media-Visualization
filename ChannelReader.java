package mediavis;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/**
* This class represents the channelReader for the Input class
* @author Arnav Sharma
* @author Shreyas Kunapuraju
* @author Emanda Seifu
* @version 04.21.2023
*/
public class ChannelReader {
    private LinkedList<String> channels;

    public ChannelReader(String filename) {
        channels = new LinkedList<>();
        try {
            readChannelFile(filename);
        } catch (IOException e) {
            System.err.println("Channel file was not readable: " + e.getMessage());
        }
    }
  /**
  * This method reads the specified file and extracts influencer data
  * @param fileName as a String datatype
  */
    public void readChannelFile(String filename) throws IOException {
        List<Influencer> influencers = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] arr = line.split(",");
                String name = arr[0];
                String channel = arr[1];
                String country = arr[2];
                String topic = arr[3];
                int likes = Integer.parseInt(arr[4]);
                int posts = Integer.parseInt(arr[5]);
                int followers = Integer.parseInt(arr[6]);
                int comments = Integer.parseInt(arr[7]);
                int views = Integer.parseInt(arr[8]);

                Statistics[] stats = new Statistics[3];
                stats[0] = new Statistics(Months.JANUARY, comments, followers, likes, posts, views);
                stats[1] = new Statistics(Months.FEBRUARY, comments, followers, likes, posts, views);
                stats[2] = new Statistics(Months.MARCH, comments, followers, likes, posts, views);
                Influencer influencer = new Influencer(stats, name, channel, country, topic);
                influencers.add(influencer);
                channels.add(channel);
            }
        }
    }
    /**
    * This method is a getter that accesses the channel names from the Influencer class
    */
    public LinkedList<String> getChannels() {
        return channels;
    }
}
