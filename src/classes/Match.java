package classes;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import interfaces.IMatch;

public class Match extends UnicastRemoteObject implements IMatch{
    
    public Player playerx;
    public Player player0;
    public Board board;

    public Match() throws RemoteException{
        this.board = new Board();
    }

    public void move(){

    }

    public void playGame() throws RemoteException{

    }

    public void turnPlayer(Player player, BoardCoord coord){

    }

    public boolean canMove(BoardCoord coord){
        if(this.board.board[coord.getCoord1()][coord.getCoord1()] == ' '){
            return true;
        }
        return false;
    }

    public void setPlayerx(Player player){
        this.playerx = player;
    } 

    public void setPlayery(Player player){
        this.player0 = player;
    } 
    

}
