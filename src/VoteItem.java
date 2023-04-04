public class VoteItem {
    //It is okay for both of these to be public because they are final.
    private final int upvotes;
    private final int downvotes;

    public VoteItem(int upvotes, int downvotes) {
        if(upvotes < 0 || downvotes < 0){
            throw new IllegalStateException("Upvotes and downvotes cannot be negative!");
        }
        this.upvotes = upvotes;
        this.downvotes = downvotes;
    }

    public int getUpvotes() { return upvotes; }
    public int getDownvotes() { return downvotes; }

    public int calculateVotes(){
        return upvotes - downvotes;
    }
}
