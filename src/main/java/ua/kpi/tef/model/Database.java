package ua.kpi.tef.model;
import java.sql.*;

//import static ua.kpi.tef.view.TextConstant.NAME;

public class Database {
    private Connection connection;
    private Statement statement;

    private static final String URL = "jdbc:mysql://localhost:3306/mobile_company";
    private static final String username = "root";
    private static final String password = "";

    public Database() {
        try {
            connection = DriverManager.getConnection(URL, username, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int users_amount() throws SQLException {
        ResultSet resultSet = this.statement.executeQuery("SELECT  SUM(Users_count) AS Users_amount FROM tariff");
        int users_num = 0;
        while (resultSet.next()) {
            users_num = resultSet.getInt("Users_amount");
            System.out.print("Users: " + users_num + "\n");
        }
        return users_num;
    }



    public String tariffSortedByMonthPrice()throws SQLException  {
        ResultSet resultSet = this.statement.executeQuery("SELECT *  FROM tariff ORDER BY Month_price");
        String current = "";
        current = getTariff(resultSet, current);
        return current;
    }

    public String tariffSortedByFilter()throws SQLException  {
        ResultSet resultSet = this.statement.executeQuery("SELECT * FROM tariff WHERE Month_price BETWEEN 90 AND 105 ORDER BY Month_price;");
        String current = "";
        current = getTariff(resultSet, current);
        return current;
    }

    private String getTariff(ResultSet resultSet, String current) throws SQLException {
        while (resultSet.next()) {
            Tariff tariff = new Tariff();
            tariff.setName(resultSet.getString("Name"));
            tariff.setFreeMinutes( resultSet.getInt("Free_minutes"));
            tariff.setFreeSMS(resultSet.getInt("Free_sms"));
            tariff.setFreeInternet(resultSet.getDouble("Free_internet"));
            tariff.setCallAbroad(resultSet.getDouble("Call_abroad"));
            tariff.setMonthPrice(resultSet.getInt("Month_price"));
            tariff.setUsersCount(resultSet.getLong("Users_count"));

            current = current + tariff.toString() + "<br/>";

        }
        return current;
    }

    public int countRows() throws SQLException {
        ResultSet resultSet = this.statement.executeQuery("SELECT  Count(*) FROM tariff");
        int count = 0;
        if(resultSet.next()) {
            count = resultSet.getInt(1);
        }
        return count;
    }



    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public static String getURL() {
        return URL;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }


}
