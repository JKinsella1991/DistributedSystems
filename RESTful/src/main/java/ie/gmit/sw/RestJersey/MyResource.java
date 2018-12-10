package ie.gmit.sw.RestJersey;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ie.gmit.sw.Model.Order;
import ie.gmit.sw.rmi.DatabaseService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     * @throws Exception 
     * @throws RemoteException 
     * @throws MalformedURLException 
     */
	@GET
	@Path("read")
	@Produces(MediaType.APPLICATION_XML)
    public List<Order> getIt() throws MalformedURLException, RemoteException, Exception, NotBoundException {
    	
    	DatabaseService ds;
    	ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");

    	//ds.read();
        return ds.read();
    }
	
	
    @Produces(MediaType.APPLICATION_XML)
    @Path("/write")
	@POST
    public List<Order> writeIt(String input) throws MalformedURLException, RemoteException, Exception{
    	
    	DatabaseService ds;
    	ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
    	    	
        return ds.write(input);
    }
	
	
    @Produces(MediaType.APPLICATION_XML)
    @Path("/update")
	@POST
    public List<Order> updateIt(String input) throws MalformedURLException, RemoteException, Exception{
    	
    	DatabaseService ds;
    	ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
    	    	
        return ds.update(input);
    }
	
	
    @Produces(MediaType.APPLICATION_XML)
    @Path("/delete")
	@POST
    public List<Order> deleteIt(String input) throws MalformedURLException, RemoteException, Exception{
    	
    	DatabaseService ds;
    	ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
    	    	
        return ds.delete(input);
    }
}
