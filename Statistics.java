package mediavis;

/**
 * The Statistics class 
 *
 * @author Emanda Seifu
 * @author 
 * @author 
 * @version 04.28.2023
 */

public class Statistics implements Comparable<Statistics> {

    
    private int likes;
    private int posts;
    private int followers;
    private int comments;
    private int views;
    private Months months;

    public Statistics(Months mon, int li, int pt, int fw, int ct, int vw) {

        likes = li;
        posts = pt;
        followers = fw;
        comments = ct;
        views = vw;
        months = mon;

    }
    

    public int getLikes() {
        return likes;
    }


    public int getPosts() {
        return posts;
    }


    public int getFollowers() {
        return followers;
    }


    public int getComments() {
        return comments;
    }


    public int getViews() {
        return views;
    }
    
    public Months getMonths() {
        return months;
    }


    public boolean isLessThanOrEqualTo(Statistics other) {
        if ((this.likes <= other.likes) && (this.posts <= other.posts)
            && (this.followers <= other.followers)
            && (this.comments <= other.comments)
            && (this.views <= other.views)) {
            return true;
        }
        else {
            return false;
        }
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() == obj.getClass()) {
            Statistics stats = (Statistics)obj;
            return this.likes == stats.likes && this.posts == stats.posts
                && this.followers == stats.followers
                && this.comments == stats.comments && this.views == stats.views;
        }
        else {
            return false;
        }
    }


    @Override
    public int compareTo(Statistics stats) {
        if (stats == null) {
            throw new IllegalArgumentException();
        }
        int otherTotal = 0;
        int total = 0;
        
        if (this.likes < stats.likes) {
            return -1;
        }
        if (this.likes > stats.likes) {
            return 1;
        }
        if (this.posts < stats.posts) {
            return -1;
        }
        if (this.posts > stats.posts) {
            return 1;
        }
        if (this.followers < stats.followers) {
            return -1;
        }
        if (this.followers > stats.followers) {
            return 1;
        }
        if (this.comments < stats.comments) {
            return -1;
        }
        if (this.comments > stats.comments) {
            return 1;
        }
        if (this.views < stats.views) {
            return -1;
        }
        if (this.views > stats.views) {
            return 1;
        }

        
        return 0;

    }

}
