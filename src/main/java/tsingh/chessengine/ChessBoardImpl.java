package tsingh.chessengine;

import tsingh.chessengine.datamodel.ChessBoard;
import tsingh.chessengine.datamodel.Color;
import tsingh.chessengine.datamodel.Piece;
import tsingh.chessengine.datamodel.PieceType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChessBoardImpl implements ChessBoard {
    private final List<Piece> pieces;

    public ChessBoardImpl() {
        pieces = new ArrayList<>();
        pieces.add(Piece.of(Color.WHITE, PieceType.ROOK, 1, 1));
        pieces.add(Piece.of(Color.WHITE, PieceType.KNIGHT, 1, 2));
        pieces.add(Piece.of(Color.WHITE, PieceType.BISHOP, 1, 3));
        pieces.add(Piece.of(Color.WHITE, PieceType.QUEEN, 1, 4));
        pieces.add(Piece.of(Color.WHITE, PieceType.KING, 1, 5));
        pieces.add(Piece.of(Color.WHITE, PieceType.BISHOP, 1, 6));
        pieces.add(Piece.of(Color.WHITE, PieceType.KNIGHT, 1, 7));
        pieces.add(Piece.of(Color.WHITE, PieceType.ROOK, 1, 8));
        for (int i = 1; i <= 8; i++) {
            pieces.add(Piece.of(Color.WHITE, PieceType.PAWN, 2, i));
            pieces.add(Piece.of(Color.BLACK, PieceType.PAWN, 7, i));
        }
        pieces.add(Piece.of(Color.BLACK, PieceType.ROOK, 8, 1));
        pieces.add(Piece.of(Color.BLACK, PieceType.KNIGHT, 8, 2));
        pieces.add(Piece.of(Color.BLACK, PieceType.BISHOP, 8, 3));
        pieces.add(Piece.of(Color.BLACK, PieceType.QUEEN, 8, 4));
        pieces.add(Piece.of(Color.BLACK, PieceType.KING, 8, 5));
        pieces.add(Piece.of(Color.BLACK, PieceType.BISHOP, 8, 6));
        pieces.add(Piece.of(Color.BLACK, PieceType.KNIGHT, 8, 7));
        pieces.add(Piece.of(Color.BLACK, PieceType.ROOK, 8, 8));
    }

    @Override
    public List<Piece> getPieces() {
        return pieces;
    }

    @Override
    public List<Piece> getPieces(Color color) {
        return pieces.stream().filter(piece -> piece.color().equals(color)).toList();
    }

    @Override
    public List<Piece> getPieces(Color color, PieceType pieceType) {
        return pieces.stream()
                .filter(piece ->
                        piece.color().equals(color) && piece.pieceType().equals(pieceType))
                .toList();
    }

    @Override
    public Piece getPiece(int row, int col) {
        Optional<Piece> possiblePiece = pieces.stream()
                .filter(piece -> piece.row() == row && piece.column() == col)
                .findFirst();
        return possiblePiece.orElseGet(Piece::noPiece);
    }
}
