package ie.gmit.sw.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ie.gmit.sw.Model.Order;

public class DatabaseServiceImpl extends UnicastRemoteObject implements DatabaseService {

	private static final long serialVersionUID = 1L;
	private Connection conn;
	private Statement stmt;

	protected DatabaseServiceImpl() throws RemoteException, SQLException, NotBoundException {
		super();
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carService?useSSL=false", "root", "");
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Order> read() throws RemoteException, SQLException {
		System.out.println("In read");

		stmt = conn.createStatement();

		List<Order> List = new ArrayList<Order>();
		String strSelect = "select * from orders";

		ResultSet rset = stmt.executeQuery(strSelect);

		while (rset.next()) {
			int OrderID = rset.getInt("orderID");
			Date Date = rset.getDate("date");
			String custFName = rset.getString("custFName");
			String custSName = rset.getString("custSName");
			int custID = rset.getInt("custID");
			String carReg = rset.getString("carReg");
			String dateFrom = rset.getString("dateFrom");
			String dateTo = rset.getString("dateTo");

			Order or = new Order();

			or.setOrderID(OrderID);
			or.setDate(Date);
			or.setCustFName(custFName);
			or.setCustSName(custSName);
			or.setCustID(custID);
			or.setCarReg(carReg);
			or.setDateFrom(dateFrom);
			or.setDateTo(dateTo);

			List.add(or);
		}
		return List;
	}

	@Override
	public List<Order> write(String input) throws RemoteException, SQLException {

		stmt = conn.createStatement();
		
		
		input = input.replace("orderID=", "");
		input = input.replace("date=", "");
		input = input.replace("custFName=", "");
		input = input.replace("custSName=", "");
		input = input.replace("custID=", "");
		input = input.replace("carReg=", "");
		input = input.replace("dateFrom=", "");
		input = input.replace("dateTo=", "");
		
		String[] userInput = input.split("&");
		
		for (int j = 0; j < userInput.length; j++) {
			System.out.println("->> " + userInput[j]);
		}

		List<Order> List = new ArrayList<Order>();

		String strInsert = "INSERT INTO orders (orderID, date, custFName, custSName, custID, carReg, dateFrom, dateTo) VALUES " +
		"(NULL, '" + userInput[0] + "', '" +userInput[1] + "','" +userInput[2] + "','" +userInput[3] + "','" +userInput[4] + "','" +userInput[5] + "','" +userInput[6] + "');";

		stmt.executeUpdate(strInsert);

		String strSelect = "select * from orders";

		ResultSet rset = stmt.executeQuery(strSelect);

		while (rset.next()) {
			int OrderID = rset.getInt("orderID");
			Date Date = rset.getDate("date");
			String custFName = rset.getString("custFName");
			String custSName = rset.getString("custSName");
			int custID = rset.getInt("custID");
			String carReg = rset.getString("carReg");
			String dateFrom = rset.getString("dateFrom");
			String dateTo = rset.getString("dateTo");

			Order or = new Order();

			or.setOrderID(OrderID);
			or.setDate(Date);
			or.setCustFName(custFName);
			or.setCustSName(custSName);
			or.setCustID(custID);
			or.setCarReg(carReg);
			or.setDateFrom(dateFrom);
			or.setDateTo(dateTo);

			List.add(or);
			
			System.out.println("Write In");
		}
		return List;
	}

	@Override
	public List<Order> update(String input) throws RemoteException, SQLException {

		stmt = conn.createStatement();

		List<Order> List = new ArrayList<Order>();

		System.out.println("Update in");

		String strUpdate = "UPDATE orders SET custID = 55 WHERE orderID = 2;";

		stmt.executeUpdate(strUpdate);

		String strSelect = "select * from orders";

		ResultSet rset = stmt.executeQuery(strSelect);

		while (rset.next()) {
			int OrderID = rset.getInt("orderID");
			Date Date = rset.getDate("date");
			String custFName = rset.getString("custFName");
			String custSName = rset.getString("custSName");
			int custID = rset.getInt("custID");
			String carReg = rset.getString("carReg");
			String dateFrom = rset.getString("dateFrom");
			String dateTo = rset.getString("dateTo");

			Order or = new Order();

			or.setOrderID(OrderID);
			or.setDate(Date);
			or.setCustFName(custFName);
			or.setCustSName(custSName);
			or.setCustID(custID);
			or.setCarReg(carReg);
			or.setDateFrom(dateFrom);
			or.setDateTo(dateTo);

			List.add(or);
		}
		return List;
	}

	@Override
	public List<Order> delete(String input) throws RemoteException, SQLException {

		stmt = conn.createStatement();

		List<Order> List = new ArrayList<Order>();

		System.out.println("Delete in");

		String strDelete = "delete from orders where orderID = 21;";

		stmt.executeUpdate(strDelete);

		String strSelect = "select * from orders";

		ResultSet rset = stmt.executeQuery(strSelect);

		while (rset.next()) {
			int OrderID = rset.getInt("orderID");
			Date Date = rset.getDate("date");
			String custFName = rset.getString("custFName");
			String custSName = rset.getString("custSName");
			int custID = rset.getInt("custID");
			String carReg = rset.getString("carReg");
			String dateFrom = rset.getString("dateFrom");
			String dateTo = rset.getString("dateTo");

			Order or = new Order();

			or.setOrderID(OrderID);
			or.setDate(Date);
			or.setCustFName(custFName);
			or.setCustSName(custSName);
			or.setCustID(custID);
			or.setCarReg(carReg);
			or.setDateFrom(dateFrom);
			or.setDateTo(dateTo);

			List.add(or);

		}
		return List;
	}
}
