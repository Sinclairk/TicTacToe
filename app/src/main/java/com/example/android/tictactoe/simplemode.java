package com.example.android.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.tictactoe.R.id.b00;
import static com.example.android.tictactoe.R.id.b01;
import static com.example.android.tictactoe.R.id.b02;
import static com.example.android.tictactoe.R.id.b10;
import static com.example.android.tictactoe.R.id.b11;
import static com.example.android.tictactoe.R.id.b12;
import static com.example.android.tictactoe.R.id.b20;
import static com.example.android.tictactoe.R.id.b21;
import static com.example.android.tictactoe.R.id.b22;

/*
Alot of the logic in this gama has been burrowed from rajat4914
https://medium.com/wiselteach/tic-tac-toe-tablelayout-android-app-androidmonk-a56b9e1c6a15
 */

public class simplemode extends AppCompatActivity implements View.OnClickListener {

    /*
    DESCRIPTION OF VARIABLES

    TAG ---------> Used for log debugging
    PLAYER_X ----> Variable to identify player turn
    TURN_COUNT --> Variable to keep count of number of turns
    button00 - button22 ---> Button for each 3x3 box
    tvInfo ------> Information regarding game status
    boardStatus -> 2-d array to identify board status
        -1 means, No one has played on that box yet
        0 means, Player 0 has played on that box
        1 means, Player X has played on that box
    */

    /*
    DESCRIPTION OF METHODS

    onClick --------> Called whenever any box or reset button is clicked.
        This method places either X or 0 according to player turn
        and updates other information

    checkWinner ----> This method checks the board status and identifies the winner
        It checks for all the 3 rows, 3 columns and 2 diagonals

    resetBoard -----> This method is called whenever reset button is pressed.
        updates everything to initial values of game

    enableAllBoxes -> This method can either enable or disable all boxes

    setInfo --------> This method updates the string in TextView

    result ---------> This method works whenever a player wins or game draws

    initializeBoardStatus -> Method which set the value of integer array to -1

    */

    private final static String TAG = simplemode.class.getSimpleName();
    boolean PLAYER_X = true;

    int TURN_COUNT = 0;

    Button button00;
    Button button01;
    Button button02;

    Button button10;
    Button button11;
    Button button12;

    Button button20;
    Button button21;
    Button button22;

    Button bReset;

    TextView tvInfo;

    int[][] boardStatus = new int[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simplemode);

        button00 = findViewById(b00);
        button01 = findViewById(b01);
        button02 = findViewById(b02);

        button10 = findViewById(b10);
        button11 = findViewById(b11);
        button12 = findViewById(b12);

        button20 = findViewById(b20);
        button21 = findViewById(b21);
        button22 = findViewById(b22);

        bReset = findViewById(R.id.bReset);
        tvInfo = findViewById(R.id.tvInfo);

        bReset.setOnClickListener(this);

        button00.setOnClickListener(this);
        button01.setOnClickListener(this);
        button02.setOnClickListener(this);

        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);

        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);

        initializeBoardStatus();

    }


    @Override
    public void onClick(View view) {
        Log.d(TAG, "Inside onClick");

        boolean resetButtonPressed = false;

        switch (view.getId()) {
            case b00:
                if (PLAYER_X) {
                    button00.setText("X");
                    boardStatus[0][0] = 1;
                } else {
                    button00.setText("0");
                    boardStatus[0][0] = 0;
                }
                button00.setEnabled(false);
                break;

            case b01:
                if (PLAYER_X) {
                    button01.setText("X");
                    boardStatus[0][1] = 1;
                } else {
                    button01.setText("0");
                    boardStatus[0][1] = 0;
                }
                button01.setEnabled(false);
                break;

            case b02:
                if (PLAYER_X) {
                    button02.setText("X");
                    boardStatus[0][2] = 1;
                } else {
                    button02.setText("0");
                    boardStatus[0][2] = 0;
                }
                button02.setEnabled(false);
                break;

            case b10:
                if (PLAYER_X) {
                    button10.setText("X");
                    boardStatus[1][0] = 1;
                } else {
                    button10.setText("0");
                    boardStatus[1][0] = 0;
                }
                button10.setEnabled(false);
                break;

            case b11:
                if (PLAYER_X) {
                    button11.setText("X");
                    boardStatus[1][1] = 1;
                } else {
                    button11.setText("0");
                    boardStatus[1][1] = 0;
                }
                button11.setEnabled(false);
                break;

            case b12:
                if (PLAYER_X) {
                    button12.setText("X");
                    boardStatus[1][2] = 1;
                } else {
                    button12.setText("0");
                    boardStatus[1][2] = 0;
                }
                button12.setEnabled(false);
                break;

            case b20:
                if (PLAYER_X) {
                    button20.setText("X");
                    boardStatus[2][0] = 1;
                } else {
                    button20.setText("0");
                    boardStatus[2][0] = 0;
                }
                button20.setEnabled(false);
                break;

            case b21:
                if (PLAYER_X) {
                    button21.setText("X");
                    boardStatus[2][1] = 1;
                } else {
                    button21.setText("0");
                    boardStatus[2][1] = 0;
                }
                button21.setEnabled(false);
                break;

            case b22:
                if (PLAYER_X) {
                    button22.setText("X");
                    boardStatus[2][2] = 1;
                } else {
                    button22.setText("0");
                    boardStatus[2][2] = 0;
                }
                button22.setEnabled(false);
                break;

            case R.id.bReset:
                resetButtonPressed = true;
                break;

            default:
                break;

        }

        if (resetButtonPressed) {
            resetBoard();
        } else {
            TURN_COUNT++;
            PLAYER_X = !PLAYER_X;

            if (PLAYER_X) {
                setInfo("Player One turn");
            } else {
                setInfo("Player Two turn");
            }

            if (TURN_COUNT == 9) {
                result("Game Draw");
            }

            checkWinner();
        }
    }

    private void checkWinner() {

        Log.d(TAG, "Inside checkWinner");

        //Horizontal --- rows
        for (int i = 0; i < 3; i++) {
            if (boardStatus[i][0] == boardStatus[i][1] && boardStatus[i][0] == boardStatus[i][2]) {
                if (boardStatus[i][0] == 1) {
                    result("Player One Won" );
                    break;
                } else if (boardStatus[i][0] == 0) {
                    result("Player Two WOn\n" + (i + 1) + " row");
                    break;
                }
            }
        }

        //Vertical --- columns
        for (int i = 0; i < 3; i++) {
            if (boardStatus[0][i] == boardStatus[1][i] && boardStatus[0][i] == boardStatus[2][i]) {
                if (boardStatus[0][i] == 1) {
                    result("Player One Won");
                    break;
                } else if (boardStatus[0][i] == 0) {
                    result("Player Two Won");
                    break;
                }
            }
        }

        //First diagonal
        if (boardStatus[0][0] == boardStatus[1][1] && boardStatus[0][0] == boardStatus[2][2]) {
            if (boardStatus[0][0] == 1) {
                result("Player One Won");
            } else if (boardStatus[0][0] == 0) {
                result("Player Two Won");
            }
        }

        //Second diagonal
        if (boardStatus[0][2] == boardStatus[1][1] && boardStatus[0][2] == boardStatus[2][0]) {
            if (boardStatus[0][2] == 1) {
                result("Player One Won");
            } else if (boardStatus[0][2] == 0) {
                result("Player Two Won");
            }
        }
    }

    private void enableAllBoxes(boolean value) {
        Log.d(TAG, "Inside enableAllBoxes");
        button00.setEnabled(value);
        button01.setEnabled(value);
        button02.setEnabled(value);

        button10.setEnabled(value);
        button11.setEnabled(value);
        button12.setEnabled(value);

        button20.setEnabled(value);
        button21.setEnabled(value);
        button22.setEnabled(value);
    }

    private void result(String winner) {
        Log.d(TAG, "Inside result");

        setInfo(winner);
        enableAllBoxes(false);
    }

    private void resetBoard() {
        Log.d(TAG, "Inside resetBoard");
        button00.setText("");
        button01.setText("");
        button02.setText("");

        button10.setText("");
        button11.setText("");
        button12.setText("");

        button20.setText("");
        button21.setText("");
        button22.setText("");

        enableAllBoxes(true);

        PLAYER_X = true;
        TURN_COUNT = 0;

        initializeBoardStatus();

        setInfo("New Game");

        Toast.makeText(this, "Board Reset", Toast.LENGTH_SHORT).show();
    }

    private void setInfo(String text) {
        tvInfo.setText(text);
    }

    private void initializeBoardStatus() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardStatus[i][j] = -1;
            }
        }

    }


}