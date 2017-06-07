/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessPieces;

/**
 *
 * @author Rastislav Maděra
 */
public class Bishop extends ChessPiece {

    public Bishop(boolean isLeft) {
        super(4, 3);
        
    }
    
    @Override
    public boolean IsValidMove(int toX, int toY) {
        return toX != x && toY != y && 
                java.lang.Math.abs(toX - x) == java.lang.Math.abs(toY - y);
    }

    @Override
    public String toString() {
        return "Bi";
    }
}