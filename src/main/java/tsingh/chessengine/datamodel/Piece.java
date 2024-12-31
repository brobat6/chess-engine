package tsingh.chessengine.datamodel;

public record Piece(PieceType pieceType, Color color, int row, char column) {
    public static Piece noPiece() {
        return new Piece(PieceType.NONE, Color.NONE, -1, 'i');
    }
}
