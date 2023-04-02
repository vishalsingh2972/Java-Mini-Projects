import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {

        char[][] board = new char[3][3]; //3 by 3 tictactoe board //2D matrix
        int count = 0;

        //Initializing an empty board
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                board[row][col] = ' ';
            }
        }
//        System.out.println(Arrays.deepToString(board));

        char player = 'X'; // let's say initially first player stats with X, i.e first element filling in the empty matrix is X
        boolean gameOver = false; //initially gameOver will be set as false, as my game is not over now lol XD
        Scanner scanner = new Scanner(System.in); // for taking input from the user

        while(!gameOver){ //while game is not over till then keep running this loop

            printBoard(board); //for each move we want to first of all print the board so that the user can look at the board and fill his each move accordingly

//if all cells filled without anyone winning // DRAW condition
            if(count == board.length * board[0].length){ // if all cells filled without any winning it will enter this //i.e when game draw condition
                System.out.println("Draw ho gaya bhai");
                break; //all cells filled, so game is over, so it exits while(!gameOver) loop and reaches "Chalo start new game"
            }

            System.out.print("Player " + player + " enter: "); //ask the user for the row and column of the cell where he is going to enter his input
            int row = scanner.nextInt(); //take input for coordinate of row of the cell where he is going to enter the input //row input taken first
            int col = scanner.nextInt(); //take input for coordinate of col of the cell where he is going to enter the input //col input taken second

//Now check whether the cell is empty or already occupied, if cell is empty you can enter your input but if it is not empty / FULL /already occupied then display Invalid message and tell user to try entering the input in some other cell i.e try entering the input in some other row and col combination
            if(board[row][col] == ' '){
                board[row][col] = player; //if cell is empty place the element
                count++;

                gameOver = haveWon(board, player); //if in this board the player has won i.e if haveWon method returns "true" then gameOver becomes true and then game is over as one of the players has won
                if(gameOver){ //if gameOver is true, we print so and so player has won the game
                    System.out.println("Player " + player + " has won"); //it reaches this only when gameOver becomes true, so now as gameOver = true it will exit the while(!gameOver) loop
//                    break; //can put this also to directly exit while(!gameOver) loop and reach "Chalo start new game"
                }
                else { //if gameOver is false or game is still on then my current player will switch so that next player can make hs move and the game continues till we reach gameOver as true...basically till game is over and one person has won

                    if(player == 'X'){ //if X is currently playing switch player to O
                        player = 'O';
                    }
                    else { //if player == 'O' case //i.e if O is currently playing switch player to X
                        player = 'X';
                    }
                    //or can directly write in a short manner
//                    player = player == 'X' ? 'O' : 'X';  //OR can also write it as player = player == 'O' ? 'X' : 'O';
                }
            }
            else {
                System.out.println("Invalid move : Yeh bhara hua hain bhai already kahi aur dal input");
            }
        }

        System.out.println("Chalo start new game"); //if game becomes draw it will reach this OR even if one of X/O have won it will reach this in the end
//        System.out.printf(String.valueOf(gameOver)); //gameOver will give true if anyone of either X or O wins, and gameOver will give false in case game is draw with all cells filling and without anyone winning
    }

    public static boolean haveWon(char[][] board, char player) { //haveWon will return true in 3 cases i.e either when one row is fully filled or when one col is fully filled or when one diagonal is fully filled
        //check the rows
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) { //board[row][0] == board[row][1] == board[row][2] == player == X/O // checking if all the elements of a particular row are equal or not, one row at a time...if all elements of any particular row are all same i.e all elements = player i.e = X or O, gameOver becomes true as one person has won, i.e in such case here gameOver method will return true
                printBoard(board); //print board output if won
                return true;
            }
        }

        //similarly check the cols
        for (int col = 0; col < board[0].length; col++) { //board[0].length = array length of 1st row of the 2D matrix = number of columns present in the 1st row of the 2D matrix //here we are considering all the rows have same number of cols i.e board[0].length == board[1].length == board[2].length, so per convention we write col < board[0].length, SIMPLE!
            //board[0] = 1st row, board[1] = 2nd row, board[2] = 3rd row
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) { //board[row][0] == board[row][1] == board[row][2] == player == X/O // checking if all the elements of a particular col are equal or not, one col at a time
                printBoard(board); //print board output if won
                return true;
            }
        }

        //also check the 2 diagonals
            if (board[0][0] == player && board[1][1] == player && board[2][2] == player) { //diagonal 1
                printBoard(board); //print board output if won
                    return true;
            }

            if (board[0][2] == player && board[1][1] == player && board[2][0] == player) { //diagonal 2
                printBoard(board); //print board output if won
                    return true;
            }

        return false; //if none of the above conditions satisfy or give true then return false
    }

    public static void printBoard(char[][] board){

        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                System.out.print(board[row][col] + " | " );
            }
            System.out.println();
        }
    }
}
