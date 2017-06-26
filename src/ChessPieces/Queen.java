/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessPieces;

import Enums.PieceIndex;
import Application.Square;
import Enums.Color;

/**
 *
 * @author Rastislav Maděra
 */
public class Queen extends ChessPiece {

    public Queen(Color color) {
        super(PieceIndex.QUEEN.getIndex(), color);
    }
    
    @Override
    public boolean IsValidMove(Square square) {
        return !square.isTherePiece() || color != square.getPiece().getColor() && 
                square.getX() != x && square.getY() != y &&
                java.lang.Math.abs(square.getX() - x) == 
                java.lang.Math.abs(square.getY() - y);
    }

    @Override
    public String toString() {
        return "Qu";
    }
}
