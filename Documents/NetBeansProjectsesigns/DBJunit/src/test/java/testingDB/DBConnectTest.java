package testingDB;

import java.io.FileInputStream;
import org.dbunit.DBTestCase;
import org.dbunit.PropertiesBasedJdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adeleke10

 */
public class DBConnectTest extends DBTestCase{
    
public DBConnectTest(String name) {
    
  super(name);
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_DRIVER_CLASS, "com.mysql.jdbc.Driver");
        
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_CONNECTION_URL,
                "jdbc:mysql://localhost:3306/junit");
         System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_USERNAME, "root");
         System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_PASSWORD, "");

    }

    @Override
    protected IDataSet getDataSet() throws Exception {
        return new FlatXmlDataSetBuilder().build(new FileInputStream("userdata.xml"));
    }

    @Override
    protected DatabaseOperation getTearDownOperation() throws Exception {
       return DatabaseOperation.NONE; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected DatabaseOperation getSetUpOperation() throws Exception {
        return DatabaseOperation.REFRESH; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Test
    public void testDB(){
        int id = 4;
        assertThat(1,is(id));
        
    }
    
    
}

