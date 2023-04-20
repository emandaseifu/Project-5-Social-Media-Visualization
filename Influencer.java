package prj5;
//import bsh.This;

/**
 * The Influencer class holds the 
 * names of influencers and their 
 * social media accounts.
 *
 * @author Emanda Seifu
 * @author 
 * @author 
 * @version 04.28.2023
 * @version 04.28.2023
 * @version 04.28.2023
 */
public class Influencer {

    /**
     * Represents the name
     */
    private String name;

    /**
     * Represents the channel
     */
    private String channel;

    /**
     * Represents the country
     */
    private String country;

    /**
     * Represents the topic
     */
    private String topic;

    /**
     * Represents the months
     */
    private Months months;

    /**
     * Represents the Array of the Statistics
     */
    @SuppressWarnings("rawtypes")
    private Statistics[] myArray;

    /**
     * Creates the Influencer objects
     */
    public Influencer(
        Months months,
        String name,
        String channel,
        String country,
        int li, //likes
        int pt, //posts
        int fw, //followers
        int ct, //comments
        int vw) //views {
        this.name = name;
        this.channel = channel;
        this.country = country;
    }


    /**
     * @return name
     *         retrieves the name
     */
    public String getName() {
        return name;
    }

    /**
     *@return topic returns the topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * @return channel
     *         retrieves the channel
     */
    public String getChannel() {
        return channel;
    }


    /**
     * @return country
     *         retrieves the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @return myArray
     *         retrieves the Statistics
     */
    public Statistics[] getStats() {
        return myArray;
    }


    /**
     * Sorts the name from the file
     * depending on the months
     */
    public void nameSort(Influencer args, Statistics other) {
        Statistics temp;
        for (int j = 0; j < myArray.length; j++) {
            for (int i = j + 1; i < myArray.length; i++) {
                if (myArray[0].compareTo(myArray[1]) < 0) {
                    temp = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temp;

                }
                if (this.name.equals(this.channel)) {
                    myArray[0] = new Statistics(Months.JANUARY, other
                        .getComments(), other.getFollowers(), other.getLikes(),
                        other.getPosts(), other.getViews());
                    myArray[1] = new Statistics(Months.FEBRUARY, other
                        .getComments(), other.getFollowers(), other.getLikes(),
                        other.getPosts(), other.getViews());
                    myArray[2] = new Statistics(Months.MARCH, other
                        .getComments(), other.getFollowers(), other.getLikes(),
                        other.getPosts(), other.getViews());

                }
            }
        }
    }


    /**
     * Sorts the rate of the specific 
     * influencer by calculating their statistics
     */
    public void rateSort(EngagementCalculator calc, Statistics other) {
        Statistics temp;
        for (int j = 0; j < myArray.length; j++) {
            for (int i = j + 1; i < myArray.length; i++) {
                if (myArray[0].compareTo(myArray[1]) < 0) {
                    temp = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temp;

                }
                if (this.name.equals(this.channel)) {
                    if (calc.getEngagementRate() == (calc.rate)) {
                        myArray[0] = new Statistics(Months.JANUARY, other
                            .getComments(), other.getFollowers(), other
                                .getLikes(), other.getPosts(), other
                                    .getViews());
                        myArray[1] = new Statistics(Months.FEBRUARY, other
                            .getComments(), other.getFollowers(), other
                                .getLikes(), other.getPosts(), other
                                    .getViews());
                        myArray[2] = new Statistics(Months.MARCH, other
                            .getComments(), other.getFollowers(), other
                                .getLikes(), other.getPosts(), other
                                    .getViews());

                    }
                }
            }
        }
    }


    /**
     * Sorts the traditional rate of the specific
     * influencer by calculating their statistics
     */
    public void traditionalSort(EngagementCalculator calc, Statistics other) {
        Statistics temp;
        for (int j = 0; j < myArray.length; j++) {
            for (int i = j + 1; i < myArray.length; i++) {
                if (myArray[0].compareTo(myArray[1]) < 0) {
                    temp = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temp;

                }
                if (this.name.equals(this.channel)) {
                    if (calc.getEngagementRate() == (calc.rate)) {
                        myArray[0] = new Statistics(Months.JANUARY, other
                            .getComments(), other.getFollowers(), other
                                .getLikes(), other.getPosts(), other
                                    .getViews());
                        myArray[1] = new Statistics(Months.FEBRUARY, other
                            .getComments(), other.getFollowers(), other
                                .getLikes(), other.getPosts(), other
                                    .getViews());
                        myArray[2] = new Statistics(Months.MARCH, other
                            .getComments(), other.getFollowers(), other
                                .getLikes(), other.getPosts(), other
                                    .getViews());
                    }
                }
            }

        }
    }


    /**
     * Sorts the reach of the specific
     * influencer by calculating their statistics
     */
    public void reachSort(EngagementCalculator calc, Statistics other) {
        Statistics temp;
        for (int j = 0; j < myArray.length; j++) {
            for (int i = j + 1; i < myArray.length; i++) {
                if (myArray[0].compareTo(myArray[1]) < 0) {
                    temp = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temp;

                }
                if (this.name.equals(this.channel)) {
                    if (calc.reach == (calc.getEngagementReach())) {
                        myArray[0] = new Statistics(Months.JANUARY, other
                            .getComments(), other.getFollowers(), other
                                .getLikes(), other.getPosts(), other
                                    .getViews());
                        myArray[1] = new Statistics(Months.FEBRUARY, other
                            .getComments(), other.getFollowers(), other
                                .getLikes(), other.getPosts(), other
                                    .getViews());
                        myArray[2] = new Statistics(Months.MARCH, other
                            .getComments(), other.getFollowers(), other
                                .getLikes(), other.getPosts(), other
                                    .getViews());
                    }
                }
            }
        }
    }


    /**
     * Sorts the statistics of the
     * influencer by January statistics
     */
    public void janSort(Statistics other) {
        Statistics temp;
        for (int j = 0; j < myArray.length; j++) {
            for (int i = j + 1; i < myArray.length; i++) {
                if (myArray[0].compareTo(myArray[1]) < 0) {
                    temp = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temp;

                }
                if ((other.getMonths().equals(Months.JANUARY))) {
                    myArray[0] = new Statistics(Months.JANUARY, other
                        .getComments(), other.getFollowers(), other.getLikes(),
                        other.getPosts(), other.getViews());

                }
            }

        }

    }


    /**
     * Sorts the statistics of the
     * influencer by February statistics
     */
    public void febSort(Statistics other) {
        Statistics temp;
        for (int j = 0; j < myArray.length; j++) {
            for (int i = j + 1; i < myArray.length; i++) {
                if (myArray[0].compareTo(myArray[1]) < 0) {
                    temp = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temp;

                }
                if ((other.getMonths().equals(Months.FEBRUARY))) {
                    myArray[0] = new Statistics(Months.FEBRUARY, other
                        .getComments(), other.getFollowers(), other.getLikes(),
                        other.getPosts(), other.getViews());

                }
            }
        }
    }


    /**
     * Sorts the statistics of the
     * influencer by March statistics
     */
    public void marSort(Statistics other) {
        Statistics temp;
        for (int j = 0; j < myArray.length; j++) {
            for (int i = j + 1; i < myArray.length; i++) {
                if (myArray[0].compareTo(myArray[1]) < 0) {
                    temp = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temp;

                }
                if ((other.getMonths().equals(Months.MARCH))) {
                    myArray[0] = new Statistics(Months.MARCH, other
                        .getComments(), other.getFollowers(), other.getLikes(),
                        other.getPosts(), other.getViews());
                }
            }
        }

    }


    /**
     * Sorts the statistics of the
     * influencer by quarter months statistics
     */
    public void quarterSort(Statistics other) {
        Statistics temp;
        for (int j = 0; j < myArray.length; j++) {
            for (int i = j + 1; i < myArray.length; i++) {
                if (myArray[0].compareTo(myArray[1]) < 0) {
                    temp = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temp;

                }
                if ((other.getMonths().equals(Months.JANUARY)) && (other
                    .getMonths().equals(Months.FEBRUARY)) && (other.getMonths()
                        .equals(Months.MARCH))) {
                    myArray[0] = new Statistics(Months.JANUARY, other
                        .getComments(), other.getFollowers(), other.getLikes(),
                        other.getPosts(), other.getViews());
                    myArray[1] = new Statistics(Months.FEBRUARY, other
                        .getComments(), other.getFollowers(), other.getLikes(),
                        other.getPosts(), other.getViews());
                    myArray[2] = new Statistics(Months.MARCH, other
                        .getComments(), other.getFollowers(), other.getLikes(),
                        other.getPosts(), other.getViews());

                }
            }
        }

    }


    /**
     * tests the methods out
     * to check if they are equal
     * 
     * @return boolean
     * 
     */
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.getClass() == obj.getClass()) {
            return this.getName().equals(((Influencer)obj).getName()) && this
                .getName().equals(((Influencer)obj).getName()) && this
                    .getChannel().equals(((Influencer)obj).getChannel()) && this
                        .getCountry().equals(((Influencer)obj).getCountry())
                && this.getTopic().equals(((Influencer)obj).getTopic()) && this
                    .getStats().equals(((Influencer)obj).getStats());
        }
        else {
            return false;
        }
    }

}
