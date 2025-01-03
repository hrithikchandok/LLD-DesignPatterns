package TicTacToe;

import java.sql.SQLOutput;

public class Board {
    int size;
    PlayingPiece playingPieces[][];

    Board(int size)
    {
        this.size = size;
        playingPieces = new PlayingPiece[size][size];
    }

    boolean addPiece(int row,int col,PlayingPiece playingPiece)
    {
        if(playingPieces[row][col] == null)
        {
            playingPieces[row][col] = playingPiece;
            return true;
        }
        else
        {
          System.out.println("Thats Position is already Filled");
          return false;
        }
    }

    public boolean isThereWinner(int row, int column,PlayingPiece playingPiece) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<size;i++) {

            if(playingPieces[row][i] == null ||playingPieces[row][i] != playingPiece) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<size;i++) {

            if(playingPieces[i][column] == null || playingPieces[i][column] != playingPiece) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<size;i++,j++) {
            if (playingPieces[i][j] == null || playingPieces[i][j] != playingPiece) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=size-1; i<size;i++,j--) {
            if (playingPieces[i][j] == null || playingPieces[i][j] != playingPiece) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
    boolean allFilled()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(playingPieces[i][j] == null)
                    return false;
            }
        }
        return true;
    }
    void printBoard()
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                  if(playingPieces[i][j] != null)
                      System.out.print(playingPieces[i][j].getType().name());
                  else
                      System.out.print(" ");
                System.out.print(" | ");
            }
            System.out.println(" ");
        }
    }


}
