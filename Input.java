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
            LinkedList<String> channelView = reader.getChannels();
            
        }
        ChannelReader reader = new ChannelReader("SampleInput1_2022.csv");
        LinkedList<String> channelView = reader.getChannels();

    }
    for (String channel: channelView)
    {
        System.out.println(channel);
    }
}
