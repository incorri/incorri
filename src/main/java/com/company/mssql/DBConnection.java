package com.company.mssql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    Connection connection = null;

    public DBConnection() {
        loadDriver();
    }

    public Connection getConnection() {
        return connection;
    }

    private void loadDriver() {
        try {
            String connectionUrl =
                    "jdbc:sqlserver://yourserver.database.windows.net:1433;"
                            + "database=AdventureWorks;"
                            + "user=yourusername@yourserver;"
                            + "password=yourpassword;"
                            + "encrypt=true;"
                            + "trustServerCertificate=false;"
                            + "loginTimeout=30;";
            connection = DriverManager.getConnection(connectionUrl);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public Statement getStatment(){
        try {
            return getConnection().createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
