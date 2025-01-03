package TicTacToe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TicTacToeGame
{
    Deque<Player> playerList;
    Board board;
    Scanner sc = new Scanner(System.in);

    void intialize(){

        playerList = new ArrayDeque<>();
        System.out.println("🕹️ Get Ready For 1V1 🚀️🎮");
        System.out.println("Player 1 Enter Your name");
        String playerName = sc.nextLine();
        Player player1=new Player(playerName,new PlayingPieceX(PieceType.X));

        System.out.println("Player 2 Enter Your name");
        String playerName2 = sc.nextLine();
        Player player2=new Player(playerName2,new PlayingPieceX(PieceType.O));
        playerList.addLast(player1);
        playerList.addLast(player2);

         board= new Board(3);
        startGame();


    }
    void startGame(){
        boolean noWinner = true;

        while(noWinner)
        {
          board.printBoard();
          System.out.println("please Enter the Row and Column comma sep ex->(1,2)");
          String temp=sc.nextLine();
          String arr12[]=temp.split(",");
          int row=Integer.parseInt(arr12[0]);
          int col=Integer.parseInt(arr12[1]);

            Player curr_player = playerList.removeFirst();

            boolean add = board.addPiece(row ,col,curr_player.getPlayingPiece());
            if(add==false)
            {
                playerList.addFirst(curr_player);
                noWinner=true;
                continue;
            }
            else
            {
                boolean thereWinner = board.isThereWinner(row, col, curr_player.getPlayingPiece());
                if(thereWinner==false)
                {
                    playerList.addLast(curr_player);
                    if(board.allFilled())
                    {
                        System.out.println("Its a Tie");
                        break;
                    }
                }
                else
                {
                    board.printBoard();
                    System.out.println(curr_player.getName()+"is the Winner Thank you !");
                    noWinner=false;
                }
            }


        }
    }


}
