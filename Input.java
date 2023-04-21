package mediavis;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.FileReader;

/**
 * The Input class 
 *
 * @author Emanda Seifu
 * @author Shreyas Kunaparaju
 * @author Arnav Sharma
 * @version 04.28.2023
 */
public class Input {
    private String filename;
    public static void main(String[] args) throws Exception {

        if (args.length == 1) {
            ChannelReader reader = new ChannelReader(args[0]);
        }
        ChannelReader reader = new ChannelReader("SampleInput1_2022.csv");

    }
    
    public Reader(String filename) {
        this.filename = filename;
    }
    
    public List<Influencer> read(String filename) throws IOException {
        List<Influencer> influencers = new ArrayList<>();

        try (ChannelReader reader = new ChannelReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
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
                // Create a new influencer object and add it to the list
                Statistics[] stats = new Statistics[3];
                stats[0] = new Statistics(Months.JANUARY, comments, followers, likes, posts, views);
                stats[1] = new Statistics(Months.FEBRUARY, comments, followers, likes, posts, views);
                stats[2] = new Statistics(Months.MARCH, comments, followers, likes, posts, views);
                Influencer influencer = new Influencer(stats, name, channel, country, topic);
                influencers.add(influencer);
            }
        }

        return influencers;
    }
}
