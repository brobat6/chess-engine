package tsingh.chessengine;

import tsingh.chessengine.datamodel.ChessBoard;
import tsingh.chessengine.datamodel.Color;
import tsingh.chessengine.datamodel.Piece;
import tsingh.chessengine.datamodel.PieceType;

import java.util.List;

public class ChessBoardImpl implements ChessBoard {
    @Override
    public List<Piece> getPieces() {
        return List.of();
    }

    @Override
    public List<Piece> getPieces(Color color) {
        return List.of();
    }

    @Override
    public List<Piece> getPieces(Color color, PieceType pieceType) {
        return List.of();
    }

    @Override
    public Piece getPiece(int row, char col) {
        return null;
    }
}
