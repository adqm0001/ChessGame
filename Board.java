public class Board {
    int rows = 8;
    int columns = 8;
    int[][] board;
    public Board(){
        this.board = new int[this.rows][this.columns];
        this.board = defaultPosition(board);
    }
    public int[][] defaultPosition(int[][] board){
        board = this.board;
        return board;
    }
}
