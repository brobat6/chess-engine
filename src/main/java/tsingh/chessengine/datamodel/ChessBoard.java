package tsingh.chessengine.datamodel;

import java.util.List;

public interface ChessBoard {
    List<Piece> getPieces();

    List<Piece> getPieces(Color color);

    List<Piece> getPieces(Color color, PieceType pieceType);

    Piece getPiece(int row, int col);

    default Piece getKing(Color color) {
        return getPieces(color, PieceType.KING).getFirst();
    }
}
