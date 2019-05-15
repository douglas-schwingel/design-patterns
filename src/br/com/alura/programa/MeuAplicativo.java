package br.com.alura.programa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MeuAplicativo {
    public static void main(String[] args) throws SQLException {
        Connection c = new ConnectionFactory().getConnection();
        c.prepareStatement("SELECT * FROM tabela");
    }
}
