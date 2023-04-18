package classes;

import interfaces.Consts;

public class Board implements Consts{
    
    public char[][] board;

    public Board(){
       this.board = new char[HASH_GAME_DIMENSION][HASH_GAME_DIMENSION];
       this.fillBoard();
    }

    private void fillBoard(){
        for (int i = 0; i < HASH_GAME_DIMENSION; i++) {
            for (int j = 0; j < HASH_GAME_DIMENSION; j++) {
                this.board[i][j] = ' ';
            }
        }
    }

    public boolean canMove(BoardCoord coord){
        if(this.board[coord.getCoord1()][coord.getCoord1()] == ' '){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < HASH_GAME_DIMENSION; i++) {
            for (int j = 0; j < HASH_GAME_DIMENSION; j++) {
                str += "["+this.board[i][j]+"] ";
            }
            str+= "\n";
        }
        return str;
    }
}
