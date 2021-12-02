class Main {
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";

  public static void main(String[] args) {
    System.out.println("Testing Words with Review.sentimentVal (Color Coded)");
    System.out.println("Annoyed is " + ANSI_RED + Review.sentimentVal("annoyed") + ANSI_RESET);
    System.out.println("Discreet is " + ANSI_GREEN + Review.sentimentVal("discreet") + ANSI_RESET);
    System.out.println("Jeans is " + ANSI_GREEN + Review.sentimentVal("jeans") + ANSI_RESET);
    System.out.println("Notorious is " + ANSI_RED + Review.sentimentVal("notorious") + ANSI_RESET);
    System.out.println("Obvious is " + ANSI_GREEN + Review.sentimentVal("obvious") + ANSI_RESET);
    System.out.println("Summer is " + ANSI_GREEN + Review.sentimentVal("summer") + ANSI_RESET);
    // seperator for my eyes :)
    System.out.println(
        "\n------------------------------------------------------------- \nThis is testing the entire file with Review.totalSentiment");
    System.out.println(Review.totalSentiment("MyReview.txt"));
    System.out.println(Review.starRating("SimpleReview.txt") + " Stars for SimpleReview.txt");
    System.out.println(Review.starRating("MyReview.txt") + " Stars for MyReview.txt");
    // another seperator sorry :)
    System.out.println(
        "\n-------------------------------------------------------------\n\nThis sentence below shows the asterisked words replaced with another word in cleanSentiment.csv");
    System.out.println(
        Review.fakeReview("SimpleReview.txt") + "\n This is a fake review generated from Review.java - Line 226. \n");
    // yet another break sorry
    System.out.println(
        "\n-------------------------------------------------------------\nThis sentence below shows the asterisked words replaced with another word from cleanSentiment.csv but checks the words sentimentVal and changes it to another word accordingly.");
    System.out.println(Review.fakeReviewStronger("SimpleReview.txt"));

  }

}
