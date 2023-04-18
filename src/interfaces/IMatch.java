package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMatch extends Remote{
    void playGame() throws RemoteException;
}
