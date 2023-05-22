package com.example.javafinalproj;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.Objects;
public class Multigame {
    int turns;
    int checkturn;
    boolean won = false;
    @FXML
    Label turn;
    @FXML
    Label winner;
    @FXML
    Label info;
    @FXML
    Button sq1;
    @FXML
    Button sq2;
    @FXML
    Button sq3;
    @FXML
    Button sq4;
    @FXML
    Button sq5;
    @FXML
    Button sq6;
    @FXML
    Button sq7;
    @FXML
    Button sq8;
    @FXML
    Button sq9;
    public void trackturns() {
        if (turns%2==0&& !won){
            turn.setText("Player X turn");
            checkturn = 0;
        } else if (won||turns==9) {
            turn.setText("");
        }
        else {
            turn.setText("Player O turn");
            checkturn = 1;
        }
    }
    public void setTurns(Button button) {
        if (checkturn == 1&&!won&&turns!=9){
            button.setText("O");
        } else if (checkturn==0&&!won&&turns!=9){
            button.setText("X");
        }
    }
    public void checkIfPlayed(Button button) {
        if (Objects.equals(button.getText(), "X")&&!won&&turns!=9){
            info.setText("Spot taken try again!");
        } else if (Objects.equals(button.getText(), "O")&&!won && turns!=9){
            info.setText("Spot taken try again!");
        } else {
            info.setText("");
            setTurns(button);
            turns++;
            checkWin();
        }
    }
    public void checkWin(){
        String testwin;
        for(int i = 0; i< 8; i++){
            switch (i) {
                case 0 -> {
                    testwin = sq1.getText() + sq2.getText() + sq3.getText();
                    testWin(testwin);
                }
                case 1 -> {
                    testwin = sq4.getText() + sq5.getText() + sq6.getText();
                    testWin(testwin);
                }
                case 2 -> {
                    testwin = sq7.getText() + sq8.getText() + sq9.getText();
                    testWin(testwin);
                }
                case 3 -> {
                    testwin = sq1.getText() + sq4.getText() + sq7.getText();
                    testWin(testwin);
                }
                case 4 -> {
                    testwin = sq2.getText() + sq5.getText() + sq8.getText();
                    testWin(testwin);
                }
                case 5 -> {
                    testwin = sq3.getText() + sq6.getText() + sq9.getText();
                    testWin(testwin);
                }
                case 6 -> {
                    testwin = sq1.getText() + sq5.getText() + sq9.getText();
                    testWin(testwin);
                }
                case 7 -> {
                    testwin = sq3.getText() + sq5.getText() + sq7.getText();
                    testWin(testwin);
                }
            }
        }
    }
    public void testWin(String testwin){
        if(testwin.equals("XXX")&& !Objects.equals(winner.getText(), "Player O wins!")){
            winner.setText("Player X wins!");
            won = true;
        }else if(testwin.equals("OOO")&& !Objects.equals(winner.getText(), "Player X wins!")){
            winner.setText("Player O wins!");
            won = true;
        }else if (turns == 9 && !Objects.equals(winner.getText(), "Player O wins!") && !Objects.equals(winner.getText(), "Player X wins!")){
            winner.setText("This game was a draw!");
        }
    }
    @FXML
    public void square1() {
        checkIfPlayed(sq1);
        trackturns();
    }
    @FXML
    public void square2() {
        checkIfPlayed(sq2);
        trackturns();
    }
    @FXML
    public void square3() {
        checkIfPlayed(sq3);
        trackturns();
    }
    @FXML
    public void square4() {
        checkIfPlayed(sq4);
        trackturns();
    }
    @FXML
    public void square5() {
        checkIfPlayed(sq5);
        trackturns();
    }
    @FXML
    public void square6() {
        checkIfPlayed(sq6);
        trackturns();
    }
    @FXML
    public void square7() {
        checkIfPlayed(sq7);
        trackturns();
    }
    @FXML
    public void square8() {
        checkIfPlayed(sq8);
        trackturns();
    }
    @FXML
    public void square9() {
        checkIfPlayed(sq9);
        trackturns();
    }
}