public class VoteItem {
    //It is okay for both of these to be public because they are final.
    public final int upvotes;
    public final int downvotes;

    public VoteItem(int upvotes, int downvotes) {
        if(upvotes < 0 || downvotes < 0){
            throw new IllegalStateException("Upvotes and downvotes cannot be negative!");
        }
        this.upvotes = upvotes;
        this.downvotes = downvotes;
    }
}
