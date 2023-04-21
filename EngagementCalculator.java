package mediavis;

/**
 * The Engagement Calculator class 
 *
 * @author Emanda Seifu
 * @author Shreyas Kunaparaju
 * @author Arnav Sharma
 * @version 04.28.2023
 */

import java.text.DecimalFormat;
import list.AList;
import mediavis.Influencer;
import mediavis.Statistics;

public class EngagementCalculator {
    public static final int RATING;
    
    double rate = 0;
    double reach = 0;
    double sum = 0;
    int totalEng = 0;
    int totalFol = 0;
    Statistics stats;
    
    public static final int RATE = 3;        
    
    public EngagementCalculator(Statistics comments) throws IllegalException {
        this.RATING = RATING;
        
    }
    
    public double getEngagementRate() {
        rate = (totalEng/ totalFol) * (0.1);
        return rate;
    }
    
    public double getEngagementReach() {
        reach = (totalEng/ reach) * (0.1);
        return reach;
    }
    
    public double getEngagement(Statistics other) {
        sum = other.getComments() + other.getLikes();
        return sum;
    }
    
    public int getFollowers(Statistics other) {
        return other.getFollowers() ;
    }
    
    public int getReach(Statistics other) {
        return other.getViews();
    }
 
}
