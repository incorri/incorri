package com.company;

import com.company.mssql.DBConnection;

import java.sql.SQLException;
import java.sql.Statement;

public class SaveWords {

    public SaveWords(WordImpl word) {
        try {
            Statement stm = new DBConnection().getStatment();
            if (stm == null) return;
            stm.execute("BEGIN TRANSACTION;");
            stm.execute("trancate table wordsStat;");
            stm.execute("INSERT INTO wordsStat VALUES (" + word.getWord() + ", " + word.getCount() +");");
            stm.execute("COMMIT TRANSACTION;");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
