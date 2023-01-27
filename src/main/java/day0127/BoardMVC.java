package day0127;

import dbConn.ConnectionMaker;
import dbConn.MySqlConnectioMaker;
import dbViewer.UserViewer;

import java.sql.Connection;

public class BoardMVC {
    public static void main(String[] args) {
        ConnectionMaker connectionMaker = new MySqlConnectioMaker();
        UserViewer userViewer = new UserViewer(connectionMaker);
        userViewer.showIndex();
    }
}
