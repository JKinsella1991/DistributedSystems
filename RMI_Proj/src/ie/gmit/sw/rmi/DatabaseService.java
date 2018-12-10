package ie.gmit.sw.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import ie.gmit.sw.Model.Order;

public interface DatabaseService extends Remote {

	List<Order> read() throws RemoteException, SQLException;

	List<Order> write(String input) throws RemoteException, SQLException;

	List<Order> update(String input) throws RemoteException, SQLException;

	List<Order> delete(String input) throws RemoteException, SQLException;

}
