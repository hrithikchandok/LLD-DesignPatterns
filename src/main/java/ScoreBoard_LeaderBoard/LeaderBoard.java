package ScoreBoard_LeaderBoard;
//addScore(playerId, score): Update the leaderboard by adding score to the given player's score. If there is no player with such id in the leaderboard, add him to the leaderboard with the given score.
//top(K): Return the score sum of the top K players.
//reset(playerId): Reset the score of the player with the given id to 0 (in other words erase it from the leaderboard). It is guaranteed that the player was added to the leaderboard before calling this function.
public class LeaderBoard {
//    1st approach -> HashMap
//    top(k)->o(nlogn)
//    reset->o(1)
//    addscore->O(1)

//    2nd  approach -> priority queue for top(k)
//    top(k)->o(nlogk)
//    reset->o(1)   hashmap for reset and addscore
//    addscore->O(1)

//    3 rd approach i want to bring thr tc of top(k) operation
//    Self balanced tree (TreeMap)
//    top(k)->O(k)
//    reset->O(logn)
//    add->O(log n)
    public static void main(String[] args)
    {
       SelfBalancingTree tree = new SelfBalancingTree();
       tree.addScore(1,100);
       tree.addScore(2,200);
       tree.addScore(3,100);
       tree.addScore(4,500);

       tree.addScore(1,100);
       tree.reset(2);

       tree.Deebug();
       System.out.println("top sum of score of"+2+"elements is "+tree.top(3));
       tree.addScore(2,100);
       tree.top(5);
       System.out.println("top sum of score of"+5+"elements is "+tree.top(5));
       tree.Deebug();


    }
}
