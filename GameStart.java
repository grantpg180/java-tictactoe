import java.util.Scanner;

public class GameStart {
    
    public static void main(String[] args){
        Scanner move = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        game.initializedBoard();
        String player = "X";
        do{
            System.out.println(game.printBoard());
            System.out.println("Enter coordinates for row: ");
            int rows = move.nextInt();
            System.out.println("Enter coordinates for col: ");
            int cols = move.nextInt();
            game.setPlay(rows, cols, player);
            if(game.gameOver()){
                System.out.println(game.printBoard() + "\n"+player + " wins");
                break;
            }
            if(player == "X"){
                player = "O";
            }else {
                player = "X";
            }
        }while(true);
    }
}