public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(new VoteItem(13, 0).calculateVotes());
        System.out.println(new VoteItem(2, 33).calculateVotes());
        System.out.println(new VoteItem(132, 132).calculateVotes());
    }
}
