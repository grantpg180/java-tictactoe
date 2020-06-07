public class TicTacToe {
    private String[][] board;
    private static final int rows =3;
    private static final int cols =3;
    private String regex = "\\s{3}";

    public TicTacToe() {
        board =  new String[rows][cols];
    }
    //Initializes the board
    public void initializedBoard() {
        for (int i =0; i< rows;i++){
            for(int j=0;j<cols;j++){
                board[i][j]= "";
            }
        }
    }
    public void setPlay(int i, int j, String player){
        if(this.board[i][j].matches(regex)){
            board[i][j] = " "+player+" ";
        }
    }
    public boolean gameOver(){
        for(int i=0; i<rows;i++){
            if(!board[i][0].matches(regex) && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])){
                return true;
            }
        }
        for(int j=0; j<cols;j++){
            if(!board[0][0].matches(regex) && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])){
                return true;
            }
            if(!board[0][2].matches(regex) && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])){
                return true;
            }
            }
            return false;

        }
    


    //Prints the board
    public String  printBoard(){
        String strBoard = "";
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if(j != cols -1){
                strBoard += board[i][j] + "|";
                }else{
                    strBoard += board[i][j];
                }
                if(i != cols-1){
                    strBoard += "\n---+---+---\n";
                }
            }
        }
        return strBoard;

    }
}