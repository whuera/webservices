package client;

import java.sql.SQLException;
import com.connector.data.*;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Visitantes {
    public Visitantes() {
        super();
    }
    IConnector serviceConnector = new ServiceCustomers();
    @WebMethod
    public ArrayList<Customer> getCustomers() throws SQLException, Exception {
    
        
        ArrayList<Customer> listCustomer = new ArrayList<>();
        listCustomer = serviceConnector.getCustomers();
        System.out.println(listCustomer.toString());
        return listCustomer;
    }
    
    @WebMethod
    public int setNewCustomer(Customer customer) throws SQLException, Exception {
        return serviceConnector.setNewCustomer(customer);
    }
}
