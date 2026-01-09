/*
 * Problem 2.3.1 Sell My Pet Food
 */
public class TargetedAd {

  public static void main(String[] args)
  {
    String userTargetList = "";  // first word of each message is the username, later we shouuld have one for cats, and another for dogs instead of only one.
    String currentPost = "";
    String currentTargetWord = "";

    DataCollector d = new DataCollector();      // new datacollector
    d.setData( "socialMediaPostsSmall.txt", "targetWords.txt"); //sets the small file for testing, and uses the target words file.

    for

    //for (int i = 0; i < 10; i++) {
      //currentPost = d.getNextPost(); // d.getNextPost is how you get the lines of the text file
      
      // while loop that compares the target words, until an if statement find that the wor is "NONE"
      // if target word found, then index to the first space, substring out the usernanme, and add it onto the list




          
      //}

        
    //}

    

    /*  
     
     
     * 
     * PROGRAMMING
     * 
     
     * (4) Compare each user's post to each target word. If a user mentions a target word, add their username to 
     *     the String of users. Separate usernames with a space. 
     *         Hint: You can use loops to look through each word. 
     *         Hint2: You can use indexOf to check if a word is in a user post. 
     * (5) Once you have all the users, use your DataCollector's prepareAdvertisement method to prepare a file 
     *     with all users and the advertisement you will send them.
     *         Additional Info: The prepareAdvertisement creates a new file on your computer. Check the posts of
     *         some of the usernames to make sure your algorithm worked.
     * 
     * THE FINAL SOLUTION
     * (6) Your solution should work with the socialMedialPostsSmall.txt. Modify your DataCollector initialization
     *    so you use the socialMediaPosts.txt. You should now have a larger file of users to target.
     * (7). Your solution should also work sufficiently well against the teacher's hidden file of posts (moer detail later...)
     */


    /* your code here */
    
     
  }

}
