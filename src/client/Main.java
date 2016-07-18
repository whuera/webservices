package client;

import java.sql.SQLException;

public class Main {
    public Main() {
        super();
    }
    public static void main(String[] args) {
        Visitantes visitantes = new Visitantes();
        try {
            visitantes.getCustomers();
        } catch (SQLException e) {
            e.getStackTrace();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
