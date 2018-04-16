package com.example.android.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class UltraMode extends AppCompatActivity implements View.OnClickListener {


    boolean PLAYER_X = true;
    int Turn_count = 0;
    /**
     buttons that players click on to play
     * Declaring the buttons for the 5*5 matrix and initializing them too
     */


    Button button00;
    Button button01;
    Button button02;
    Button button03;
    Button button04;


    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;


    Button button20;
    Button button21;
    Button button22;
    Button button23;
    Button button24;


    Button button30;
    Button button31;
    Button button32;
    Button button33;
    Button button34;


    Button button40;
    Button button41;
    Button button42;
    Button button43;
    Button button44;



    Button resetBoard;



    TextView statusInfo;



    int[][] playStatus = new int[5][5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ultra_mode);



        button00 = findViewById(R.id.button00);
        button01 = findViewById(R.id.button01);
        button02 = findViewById(R.id.button02);
        button03 = findViewById(R.id.button03);
        button04 = findViewById(R.id.button04);


        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);


        button20 = findViewById(R.id.button20);
        button21 = findViewById(R.id.button21);
        button22 = findViewById(R.id.button22);
        button23 = findViewById(R.id.button23);
        button24 = findViewById(R.id.button24);


        button30 = findViewById(R.id.button30);
        button31 = findViewById(R.id.button31);
        button32 = findViewById(R.id.button32);
        button33 = findViewById(R.id.button33);
        button34 = findViewById(R.id.button34);


        button40 = findViewById(R.id.button40);
        button41 = findViewById(R.id.button41);
        button42 = findViewById(R.id.button42);
        button43 = findViewById(R.id.button43);
        button44 = findViewById(R.id.button44);


        resetBoard = findViewById(R.id.reset);


        statusInfo = findViewById(R.id.info);


        button00.setOnClickListener(this);
        button01.setOnClickListener(this);
        button02.setOnClickListener(this);
        button03.setOnClickListener(this);
        button04.setOnClickListener(this);


        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);

        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button24.setOnClickListener(this);


        button30.setOnClickListener(this);
        button31.setOnClickListener(this);
        button32.setOnClickListener(this);
        button33.setOnClickListener(this);
        button34.setOnClickListener(this);


        button40.setOnClickListener(this);
        button41.setOnClickListener(this);
        button42.setOnClickListener(this);
        button43.setOnClickListener(this);
        button44.setOnClickListener(this);

        resetBoard.setOnClickListener(this);

        startGame();
    }

    /**
     * @param view This Fuctions loops through the buttons checking which box has been clicked and by which player
     *             it's the main method of the game.
     */
    @Override
    public void onClick(View view) {

        boolean resetButtonPressed = false;

        switch (view.getId()) {

            case R.id.button00:
                if (PLAYER_X) {
                    button00.setText("X");
                    playStatus[0][0] = 1;
                } else {
                    button00.setText("0");
                    playStatus[0][0] = 0;
                }
                button00.setEnabled(false);
                break;

            case R.id.button01:
                if (PLAYER_X) {
                    button01.setText("X");
                    playStatus[0][1] = 1;
                } else {
                    button01.setText("0");
                    playStatus[0][1] = 0;
                }
                button01.setEnabled(false);
                break;


            case R.id.button02:
                if (PLAYER_X) {
                    button02.setText("X");
                    playStatus[0][2] = 1;
                } else {
                    button02.setText("0");
                    playStatus[0][2] = 0;
                }
                button02.setEnabled(false);
                break;


            case R.id.button03:
                if (PLAYER_X) {
                    button03.setText("X");
                    playStatus[0][3] = 1;
                } else {
                    button03.setText("0");
                    playStatus[0][3] = 0;
                }
                button03.setEnabled(false);
                break;


            case R.id.button04:
                if (PLAYER_X) {
                    button04.setText("X");
                    playStatus[0][4] = 1;
                } else {
                    button04.setText("0");
                    playStatus[0][4] = 0;
                }
                button04.setEnabled(false);
                break;


            case R.id.button10:
                if (PLAYER_X) {
                    button10.setText("X");
                    playStatus[1][0] = 1;
                } else {
                    button10.setText("0");
                    playStatus[1][0] = 0;
                }
                button10.setEnabled(false);
                break;


            case R.id.button11:
                if (PLAYER_X) {
                    button11.setText("X");
                    playStatus[1][1] = 1;
                } else {
                    button00.setText("0");
                    playStatus[1][1] = 0;
                }
                button11.setEnabled(false);
                break;


            case R.id.button12:
                if (PLAYER_X) {
                    button12.setText("X");
                    playStatus[1][2] = 1;
                } else {
                    button12.setText("0");
                    playStatus[1][2] = 0;
                }
                button12.setEnabled(false);
                break;


            case R.id.button13:
                if (PLAYER_X) {
                    button13.setText("X");
                    playStatus[1][3] = 1;
                } else {
                    button13.setText("0");
                    playStatus[1][3] = 0;
                }
                button13.setEnabled(false);
                break;

            case R.id.button14:
                if (PLAYER_X) {
                    button14.setText("X");
                    playStatus[1][4] = 1;
                } else {
                    button00.setText("0");
                    playStatus[1][4] = 0;
                }
                button14.setEnabled(false);
                break;


            case R.id.button20:
                if (PLAYER_X) {
                    button20.setText("X");
                    playStatus[2][0] = 1;
                } else {
                    button20.setText("0");
                    playStatus[2][0] = 0;
                }
                button20.setEnabled(false);
                break;

            case R.id.button21:
                if (PLAYER_X) {
                    button21.setText("X");
                    playStatus[2][1] = 1;
                } else {
                    button21.setText("0");
                    playStatus[2][1] = 0;
                }
                button21.setEnabled(false);
                break;


            case R.id.button22:
                if (PLAYER_X) {
                    button22.setText("X");
                    playStatus[2][2] = 1;
                } else {
                    button00.setText("0");
                    playStatus[2][2] = 0;
                }
                button22.setEnabled(false);
                break;


            case R.id.button23:
                if (PLAYER_X) {
                    button23.setText("X");
                    playStatus[2][3] = 1;
                } else {
                    button23.setText("0");
                    playStatus[2][3] = 0;
                }
                button23.setEnabled(false);
                break;

            case R.id.button24:
                if (PLAYER_X) {
                    button24.setText("X");
                    playStatus[2][4] = 1;
                } else {
                    button24.setText("0");
                    playStatus[2][4] = 0;
                }
                button24.setEnabled(false);
                break;

            case R.id.button30:
                if (PLAYER_X) {
                    button30.setText("X");
                    playStatus[3][0] = 1;
                } else {
                    button30.setText("0");
                    playStatus[3][0] = 0;
                }
                button30.setEnabled(false);
                break;

            case R.id.button31:
                if (PLAYER_X) {
                    button31.setText("X");
                    playStatus[3][1] = 1;
                } else {
                    button31.setText("0");
                    playStatus[3][1] = 0;
                }
                button31.setEnabled(false);
                break;


            case R.id.button32:
                if (PLAYER_X) {
                    button32.setText("X");
                    playStatus[3][2] = 1;
                } else {
                    button32.setText("0");
                    playStatus[3][2] = 0;
                }
                button32.setEnabled(false);
                break;


            case R.id.button33:
                if (PLAYER_X) {
                    button33.setText("X");
                    playStatus[3][3] = 1;
                } else {
                    button33.setText("0");
                    playStatus[3][3] = 3;
                }
                button33.setEnabled(false);
                break;


            case R.id.button34:
                if (PLAYER_X) {
                    button34.setText("X");
                    playStatus[3][4] = 1;
                } else {
                    button34.setText("0");
                    playStatus[3][4] = 0;
                }
                button34.setEnabled(false);
                break;

            case R.id.button40:
                if (PLAYER_X) {
                    button00.setText("X");
                    playStatus[4][0] = 1;
                } else {
                    button40.setText("0");
                    playStatus[4][0] = 0;
                }
                button40.setEnabled(false);
                break;


            case R.id.button41:
                if (PLAYER_X) {
                    button41.setText("X");
                    playStatus[4][1] = 1;
                } else {
                    button41.setText("0");
                    playStatus[4][1] = 0;
                }
                button41.setEnabled(false);
                break;

            case R.id.button42:
                if (PLAYER_X) {
                    button42.setText("X");
                    playStatus[4][2] = 1;
                } else {
                    button42.setText("0");
                    playStatus[4][2] = 0;
                }
                button42.setEnabled(false);
                break;


            case R.id.button43:
                if (PLAYER_X) {
                    button43.setText("X");
                    playStatus[4][3] = 1;
                } else {
                    button43.setText("0");
                    playStatus[4][3] = 0;
                }
                button43.setEnabled(false);
                break;


            case R.id.button44:
                if (PLAYER_X) {
                    button44.setText("X");
                    playStatus[4][4] = 1;
                } else {
                    button44.setText("0");
                    playStatus[4][4] = 0;
                }
                button44.setEnabled(false);
                break;

            case R.id.reset:
                resetButtonPressed = true;
                break;
            default:
                break;
        }
        if(resetButtonPressed){
            restartBoard();
        }
        else{
            Turn_count++;
            PLAYER_X = !PLAYER_X;

            if(PLAYER_X){
                setInfo("Player One Turn");

            }else {
                setInfo("Player Two Turn");
            }
        }
        if (Turn_count == 25){
            result("Game Draw");
        }
        checkWinner();
    }

    /**
     *  returns the status of the board and on this case
     *                   sets the board to no player has played.
     *                   Equivalent to starting a new game.
     */
    private void startGame() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                playStatus[i][j] = -1;
            }
        }
    }

    /**
     *
     * @param value
     * This method makes all the boxes in the matrix to be clickable
     */

    private void enableAllBoxes(boolean value) {
        button00.setEnabled(value);
        button01.setEnabled(value);
        button02.setEnabled(value);
        button03.setEnabled(value);
        button04.setEnabled(value);

        button10.setEnabled(value);
        button11.setEnabled(value);
        button12.setEnabled(value);
        button13.setEnabled(value);
        button14.setEnabled(value);

        button20.setEnabled(value);
        button21.setEnabled(value);
        button22.setEnabled(value);
        button23.setEnabled(value);
        button24.setEnabled(value);

        button30.setEnabled(value);
        button31.setEnabled(value);
        button32.setEnabled(value);
        button33.setEnabled(value);
        button34.setEnabled(value);

        button40.setEnabled(value);
        button41.setEnabled(value);
        button42.setEnabled(value);
        button43.setEnabled(value);
        button44.setEnabled(value);

    }

    /**
     * This method clears the board of all the text and readys the board for a new game
     * by enabling all the buttons.
     * Methods called within this Method:

     */
    private void restartBoard() {
        button00.setText("");
        button01.setText("");
        button02.setText("");
        button03.setText("");
        button04.setText("");

        button10.setText("");
        button11.setText("");
        button12.setText("");
        button13.setText("");
        button14.setText("");

        button20.setText("");
        button21.setText("");
        button22.setText("");
        button23.setText("");
        button24.setText("");

        button30.setText("");
        button31.setText("");
        button32.setText("");
        button33.setText("");
        button34.setText("");

        button40.setText("");
        button41.setText("");
        button42.setText("");
        button43.setText("");
        button44.setText("");

        enableAllBoxes(true);

        PLAYER_X = true;
      Turn_count = 0;

        startGame();

        setInfo("New Game");

        Toast.makeText(this, "Board Reset", Toast.LENGTH_SHORT).show();

    }

    /**
     * This method passes the message to be displayed to the XML

     */
    private void setInfo(String text){statusInfo.setText(text);

    }

    private void checkWinner(){
        //Horizontal rows
        for (int i = 0; i < 5; i++){
            if(playStatus[i][0] == playStatus[i][1] && playStatus[i][0]==playStatus[i][2]
                    && playStatus[i][0]==playStatus[i][3]&& playStatus[i][0]== playStatus[i][4] ){
                if(playStatus[i][0]== 1){
                    result("Player one Won");
                    break;
                } else if (playStatus[i][0]== 0){

                    result("Player Two Won");

                }

            }
        }

        //Vertical Columns

        for(int i = 0; i<5; i++){
            if(playStatus[0][i] == playStatus[1][i] && playStatus[0][i]==playStatus[2][i]
                    && playStatus[0][i]==playStatus[3][i]&& playStatus[0][i]== playStatus[4][i] ){
                if(playStatus[0][i]== 1){
                    result("Player one Won");
                    break;
                } else if (playStatus[0][i]== 0){

                    result("Player Two Won");

                }

            }
        }

        //First Diagonal
        if(playStatus[0][0]== playStatus[1][1] && playStatus[0][0] == playStatus[2][2] && playStatus[0][0] == playStatus[3][3]
                && playStatus[0][0] == playStatus[4][4]){
            if(playStatus[0][0]== 1){
                result("Player One Won");
            }else if(playStatus[0][0] == 0){
                result("Player Two Won");

            }

        }

        if (playStatus[0][4]== playStatus[1][3] && playStatus[0][4] == playStatus[2][2] && playStatus[0][4] == playStatus[3][1]
                && playStatus[0][4] == playStatus[4][0]){
            if(playStatus[0][0]== 1){
                result("Player One Won");
            }else if(playStatus[0][0] == 0){
                result("Player Two Won");

            }
        }
    }

    /**
     * This method checks the winner and displays them on the display text, it also resets the board for the next
     * game in that set.

     */
    private void result(String winner) {
        setInfo(winner);
        enableAllBoxes(true);


    }

}


