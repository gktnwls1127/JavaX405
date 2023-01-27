package day0126;

import dbConn.ConnectionMaker;
import dbConn.MySqlConnectioMaker;
import viewer.StudentViewer;

public class StudentManager03 {
    public static void main(String[] args) {
        ConnectionMaker connectionMaker = new MySqlConnectioMaker();
        StudentViewer studentViewer = new StudentViewer(connectionMaker);
        studentViewer.showMenu();
    }
}
