public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(calculateVotes(new VoteItem(13, 0)));
        System.out.println(calculateVotes(new VoteItem(2, 33)));
        System.out.println(calculateVotes(new VoteItem(132, 132)));
    }

    public static int calculateVotes(VoteItem item){
        return item.upvotes - item.downvotes;
    }
}
