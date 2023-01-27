package day0112;

import viewer.BoardViewer;
import viewer.UserViewer;

import java.util.Scanner;

public class Ex03Board02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BoardViewer boardViewer = new BoardViewer(scanner);
        UserViewer userViewer = new UserViewer(scanner);

        userViewer.setBoardViewer(boardViewer);
        // Setter 를 통해서 해당 boardViewer 필드를 주입
        boardViewer.setUserViewer(userViewer);

        userViewer.showIndex();
    }


}
