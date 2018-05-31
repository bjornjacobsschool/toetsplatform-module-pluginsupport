package nl.han.toetsplatform.module.shared.storage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface StorageDao {

    void setup(String ddlScript, String[] tables) throws ClassNotFoundException, SQLException;

    ResultSet executeQuery(String sqlStatement) throws SQLException;

    boolean executeUpdate(String sqlStatement) throws SQLException;

    Connection getConnection();
}
