package prj5;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.io.File;

public class Input {

    public static void main(String[] args) throws Exception {

        if (args.length == 1) {
            ChannelReader reader = new ChannelReader(args[0]);
        }
        ChannelReader reader = new ChannelReader("SampleInput1_2022.csv");

    }
}
