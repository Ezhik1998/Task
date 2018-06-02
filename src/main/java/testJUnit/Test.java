package testJUnit;


import org.junit.Assert;
import ua.kpi.tef.model.Database;

import java.sql.SQLException;

public class Test {
    @org.junit.Test
    public void testCount() throws SQLException {
        Database db = new Database();
        long user_count = db.users_amount();
        if(user_count != 26530)Assert.fail();
    }
    @org.junit.Test
    public void testRows() throws SQLException{
        Database db = new Database();
        int count = db.countRows();
        if(count != 5)Assert.fail();
    }

}