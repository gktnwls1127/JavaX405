package day0113;

import dbConn.ConnectionMaker;
import dbConn.MySqlConnectioMaker;

import java.sql.Connection;

public class Ex02Controller {
    public static void main(String[] args) {
        ConnectionMaker maker = new MySqlConnectioMaker();
        // ConnectionMaker maker = new OracleConnectionMaker(); 만 바꿔주면 가능
        Connection connection = maker.makeConnection();

    }
}
