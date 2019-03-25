import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

class Logic {
    private Label cmd[][];
    private Label label;
    private int i, winsOf1, winsOf2, ties;
    private boolean nextGame, hasWon;
    private Stage window;
    private String one, two, tie, X, O;

    Logic(Label cmd[][], Label label, Stage window) {
        this.cmd = cmd;
        this.label = label;
        this.window = window;
        i=0;
        nextGame=false;
        hasWon=false;
        one = "Player 1[X] has won!";
        two = "Player 2[O] has won!";
        tie = "It is a Tie!";
        X="X";
        O="O";
    }

    void onClicks() {
        cmd[0][0].setOnMouseClicked(event -> {
            if(i%2==0) {
                xPlays(cmd[0][0]);
            }
            else {
                oPlays(cmd[0][0]);
            }
        });

        cmd[0][1].setOnMouseClicked(event -> {
            if(i%2==0) {
                xPlays(cmd[0][1]);
            }
            else {
                oPlays(cmd[0][1]);
            }
        });

        cmd[0][2].setOnMouseClicked(event -> {
            if(i%2==0) {
                xPlays(cmd[0][2]);
            }
            else {
                oPlays(cmd[0][2]);
            }
        });

        cmd[1][0].setOnMouseClicked(event -> {
            if(i%2==0) {
                xPlays(cmd[1][0]);
            }
            else {
                oPlays(cmd[1][0]);
            }
        });

        cmd[1][1].setOnMouseClicked(event -> {
            if(i%2==0) {
                xPlays(cmd[1][1]);
            }
            else {
                oPlays(cmd[1][1]);
            }
        });

        cmd[1][2].setOnMouseClicked(event -> {
            if(i%2==0) {
                xPlays(cmd[1][2]);
            }
            else {
                oPlays(cmd[1][2]);
            }
        });

        cmd[2][0].setOnMouseClicked(event -> {
            if(i%2==0) {
                xPlays(cmd[2][0]);
            }
            else {
                oPlays(cmd[2][0]);
            }
        });

        cmd[2][1].setOnMouseClicked(event -> {
            if(i%2==0) {
                xPlays(cmd[2][1]);
            }
            else {
                oPlays(cmd[2][1]);
            }
        });

        cmd[2][2].setOnMouseClicked(event -> {
            if(i%2==0) {
                xPlays(cmd[2][2]);
            }
            else {
                oPlays(cmd[2][2]);
            }
        });
    }

    private void checkXHasWon() {
        String ch1 = cmd[0][0].getText();
        String ch2 = cmd[0][1].getText();
        String ch3 = cmd[0][2].getText();
        String ch4 = cmd[1][0].getText();
        String ch5 = cmd[1][1].getText();
        String ch6 = cmd[1][2].getText();
        String ch7 = cmd[2][0].getText();
        String ch8 = cmd[2][1].getText();
        String ch9 = cmd[2][2].getText();

        if(ch1.equals(X) && ch2.equals(X) && ch3.equals(X)) {
            xWins();
        }
        if(ch4.equals(X) && ch5.equals(X) && ch6.equals(X)) {
            xWins();
        }
        if(ch7.equals(X) && ch8.equals(X) && ch9.equals(X)) {
            xWins();
        }
        if(ch1.equals(X) && ch4.equals(X) && ch7.equals(X)) {
            xWins();
        }
        if(ch2.equals(X) && ch5.equals(X) && ch8.equals(X)) {
            xWins();
        }
        if(ch3.equals(X) && ch6.equals(X) && ch9.equals(X)) {
            xWins();
        }
        if(ch1.equals(X) && ch5.equals(X) && ch9.equals(X)) {
            xWins();
        }
        if(ch3.equals(X) && ch5.equals(X) && ch7.equals(X)) {
            xWins();
        }
    }

    private void checkOHasWon() {
        String ch1 = cmd[0][0].getText();
        String ch2 = cmd[0][1].getText();
        String ch3 = cmd[0][2].getText();
        String ch4 = cmd[1][0].getText();
        String ch5 = cmd[1][1].getText();
        String ch6 = cmd[1][2].getText();
        String ch7 = cmd[2][0].getText();
        String ch8 = cmd[2][1].getText();
        String ch9 = cmd[2][2].getText();

        if(ch1.equals(O) && ch2.equals(O) && ch3.equals(O)) {
            oWins();
        }
        if(ch4.equals(O) && ch5.equals(O) && ch6.equals(O)) {
            oWins();
        }
        if(ch7.equals(O) && ch8.equals(O) && ch9.equals(O)) {
            oWins();
        }
        if(ch1.equals(O) && ch4.equals(O) && ch7.equals(O)) {
            oWins();
        }
        if(ch2.equals(O) && ch5.equals(O) && ch8.equals(O)) {
            oWins();
        }
        if(ch3.equals(O) && ch6.equals(O) && ch9.equals(O)) {
            oWins();
        }
        if(ch1.equals(O) && ch5.equals(O) && ch9.equals(O)) {
            oWins();
        }
        if(ch3.equals(O) && ch5.equals(O) && ch7.equals(O)) {
            oWins();
        }
    }

    private void oPlays(Label label) {
        label.setTextFill(Color.BLUE);
        label.setText(O);
        label.setDisable(true);
        this.label.setText("Player 1[X] to move.");
        i++;
        checkOHasWon();
        if((i==9) && !(hasWon)) {
            noWins();
        }
    }

    private void xPlays(Label label) {
        label.setTextFill(Color.RED);
        label.setText(X);
        label.setDisable(true);
        this.label.setText("Player 2[O] to move.");
        i++;
        checkXHasWon();
        if((i==9) && !(hasWon)) {
            noWins();
        }
    }
    private void reset() {
        cmd[0][0].setText("");
        cmd[0][1].setText("");
        cmd[0][2].setText("");
        cmd[1][0].setText("");
        cmd[1][1].setText("");
        cmd[1][2].setText("");
        cmd[2][0].setText("");
        cmd[2][1].setText("");
        cmd[2][2].setText("");

        cmd[0][0].setDisable(false);
        cmd[0][1].setDisable(false);
        cmd[0][2].setDisable(false);
        cmd[1][0].setDisable(false);
        cmd[1][1].setDisable(false);
        cmd[1][2].setDisable(false);
        cmd[2][0].setDisable(false);
        cmd[2][1].setDisable(false);
        cmd[2][2].setDisable(false);

        i=0;
        label.setText("Player 1[X] to move.");
        nextGame=false;
        hasWon=false;
    }
    
    private void xWins() {
        winsOf1++;
        hasWon=true;
        Result result = new Result();
        nextGame = result.display(one, winsOf1, winsOf2, ties);
        if(nextGame) {
            reset();
        }
        else {
            window.close();
        }

    }
    
    private void oWins() {
        winsOf2++;
        hasWon=true;
        Result result = new Result();
        nextGame = result.display(two, winsOf1, winsOf2, ties);
        if(nextGame) {
            reset();
        }
        else {
            window.close();
        }
    }
    
    private void noWins() {
        ties++;
        hasWon=false;
        Result result = new Result();
        nextGame = result.display(tie, winsOf1,winsOf2,ties);
        if(nextGame) {
            reset();
        }
        else {
            window.close();
        }
    }
}