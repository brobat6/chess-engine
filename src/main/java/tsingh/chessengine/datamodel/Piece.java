package tsingh.chessengine.datamodel;

public record Piece(PieceType pieceType, Color color, int row, int column) {
    public static Piece noPiece() {
        return new Piece(PieceType.NONE, Color.NONE, -1, -1);
    }

    public static Piece of(PieceType pieceType, Color color, int row, int column) {
        return new Piece(pieceType, color, row, column);
    }

    public static Piece of(Color color, PieceType pieceType, int row, int column) {
        return new Piece(pieceType, color, row, column);
    }
}
