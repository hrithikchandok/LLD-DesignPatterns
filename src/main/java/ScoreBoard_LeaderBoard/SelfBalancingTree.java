package ScoreBoard_LeaderBoard;

import java.util.*;

public class SelfBalancingTree
{
    // store player id -> score
   HashMap<Integer, Integer> db=new HashMap<>();
   // store score -> count
   TreeMap<Integer,Integer> tree=new TreeMap<>(Collections.reverseOrder());

   public void addScore(int playerid,int score)
   {
      int newscore=score+db.getOrDefault(playerid,0);
      db.put(playerid,newscore);
      if(newscore!=score)
      {
          int oldscore= newscore-score;
          tree.put(oldscore,tree.getOrDefault(oldscore,0)-1);

      }
      tree.put(newscore,tree.getOrDefault(newscore,0)+1);
   }
   public int top(int k)
   {
       int ans=0;
       for(Map.Entry<Integer,Integer> entry:tree.entrySet())
       {
           int score=entry.getKey();
           int count=entry.getValue();
           while( k>0 && count>0)
           {
               ans+=score;
               count--;
               k--;
           }
           if(k<=0)break;
       }
       return ans;
   }
   public void reset(int playerid)
   {
      int score=db.get(playerid);
      db.put(playerid,0);
      tree.put(score,tree.get(score)-1);
   }
   public void Deebug(){
       System.out.println("Tree Map ");
       for(Map.Entry<Integer,Integer> entry:tree.entrySet())
       {
           System.out.println(entry.getKey()+" "+entry.getValue());
       }
       System.out.println("-----------------");
       System.out.println("Db");
       for(Map.Entry<Integer,Integer> entry: db.entrySet())
       {
          System.out.println(entry.getKey()+" "+entry.getValue());
       }
   }



}
