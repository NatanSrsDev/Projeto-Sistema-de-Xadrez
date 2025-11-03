package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            UI.clearScreen();
            UI.printBoard(chessMatch.getPiece());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.ReadChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.ReadChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }


    }
}