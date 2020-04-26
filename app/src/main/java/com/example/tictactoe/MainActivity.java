package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button TopLbutt;
    private Button TopMbutt;
    private Button TopRbutt;
    private Button MidLbutt;
    private Button MidMbutt;
    private Button MidRbutt;
    private Button BotLbutt;
    private Button BotMbutt;
    private Button BotRbutt;
    private Button NewGamebutt;
    private TextView TurnView;
    private boolean Player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TopLbutt = findViewById(R.id.TopLbutt);
        TopMbutt = findViewById(R.id.TopMbutt);
        TopRbutt = findViewById(R.id.TopRbutt);
        MidLbutt = findViewById(R.id.MidLbutt);
        MidMbutt = findViewById(R.id.MidMbutt);
        MidRbutt = findViewById(R.id.MidRbutt);
        BotLbutt = findViewById(R.id.BotLbutt);
        BotMbutt = findViewById(R.id.BotMbutt);
        BotRbutt = findViewById(R.id.BotRbutt);
        NewGamebutt = findViewById(R.id.NewGamebutt);
        TurnView  = findViewById(R.id.TurnView);
        Player = true;
    }

    public void onClick(View v) {
        if (Player) {
            if (v == NewGamebutt) {
                recreate();
            }
            else if (v == TopLbutt & TopLbutt.getText() == "") {
                TopLbutt.setText("X");
                TurnView.setText("Player Os turn");
                Player = false;
            }
            else if (v == TopMbutt & TopMbutt.getText() == "") {
                TopMbutt.setText("X");
                TurnView.setText("Player O's turn");
                Player = false;
            }
            else if (v == TopRbutt & TopRbutt.getText() == "") {
                TopRbutt.setText("X");
                TurnView.setText("Player O's turn");
                Player = false;
            }
            else if (v == MidLbutt & MidLbutt.getText() == "") {
                MidLbutt.setText("X");
                TurnView.setText("Player O's turn");
                Player = false;
            }
            else if (v == MidMbutt & MidMbutt.getText() == "") {
                MidMbutt.setText("X");
                TurnView.setText("Player O's turn");
                Player = false;
            }
            else if (v == MidRbutt & MidRbutt.getText() == "") {
                MidRbutt.setText("X");
                TurnView.setText("Player O's turn");
                Player = false;
            }
            else if (v == BotLbutt & BotLbutt.getText() == "") {
                BotLbutt.setText("X");
                TurnView.setText("Player O's turn");
                Player = false;
            }
            else if (v == BotMbutt & BotMbutt.getText() == "") {
                BotMbutt.setText("X");
                TurnView.setText("Player O's turn");
                Player = false;
            }
            else if (v == BotRbutt & BotRbutt.getText() == "") {
                BotRbutt.setText("X");
                TurnView.setText("Player O's turn");
                Player = false;
            }
        }

        else {
            if (v == NewGamebutt) {
                recreate();
            }
            else if (v == TopLbutt & TopLbutt.getText() == "") {
                TopLbutt.setText("O");
                TurnView.setText("Player X's turn");
                Player = true;
            }
            else if (v == TopMbutt & TopMbutt.getText() == "") {
                TopMbutt.setText("O");
                TurnView.setText("Player X's turn");
                Player = true;
            }
            else if (v == TopRbutt & TopRbutt.getText() == "") {
                TopRbutt.setText("O");
                TurnView.setText("Player X's turn");
                Player = true;
            }
            else if (v == MidLbutt & MidLbutt.getText() == "") {
                MidLbutt.setText("O");
                TurnView.setText("Player X's turn");
                Player = true;
            }
            else if (v == MidMbutt & MidMbutt.getText() == "") {
                MidMbutt.setText("O");
                TurnView.setText("Player X's turn");
                Player = true;
            }
            else if (v == MidRbutt & MidRbutt.getText() == "") {
                MidRbutt.setText("O");
                TurnView.setText("Player X's turn");
                Player = true;
            }
            else if (v == BotLbutt & BotLbutt.getText() == "") {
                BotLbutt.setText("O");
                TurnView.setText("Player X's turn");
                Player = true;
            }
            else if (v == BotMbutt & BotMbutt.getText() == "") {
                BotMbutt.setText("O");
                TurnView.setText("Player X's turn");
                Player = true;
            }
            else if (v == BotRbutt & BotRbutt.getText() == "") {
                BotRbutt.setText("O");
                TurnView.setText("Player X's turn");
                Player = true;
            }
        }
        checkScore();
    }
    public void checkScore() {
        //Check to for 3 symbols in a row
        if (TopLbutt.getText() == TopMbutt.getText()
                & TopLbutt.getText() == TopRbutt.getText()
                & TopLbutt.getText() != "") {
            TurnView.setText(TopLbutt.getText() + " wins!"); //Left to Right Top row
            winner();
        }
        else if (MidLbutt.getText() == MidMbutt.getText()
                & MidLbutt.getText() == MidRbutt.getText()
                & MidLbutt.getText() != "") {
            TurnView.setText(MidLbutt.getText() + " wins!");//Left to Right Mid row
            winner();
        }
        else if (BotLbutt.getText() == BotMbutt.getText()
                & BotLbutt.getText() == BotRbutt.getText()
                & BotLbutt.getText() != "") {
            TurnView.setText(BotLbutt.getText() + " wins!");//Left to Right Bot row
            winner();
        }
        else if (TopLbutt.getText() == MidMbutt.getText()
                & TopLbutt.getText() == BotRbutt.getText()
                & TopLbutt.getText() != "") {
            TurnView.setText(TopLbutt.getText() + " wins!");//Cross from Top Left to Bottom Right
            winner();
        }
        else if (TopRbutt.getText() == MidMbutt.getText()
                & TopRbutt.getText() == BotLbutt.getText()
                & TopRbutt.getText() != "") {
            TurnView.setText(TopRbutt.getText() + " wins!");//Cross from Top Right to Bottom Left
            winner();
        }
        else if (TopLbutt.getText() == MidLbutt.getText()
                & TopLbutt.getText() == BotLbutt.getText()
                & TopLbutt.getText() != "") {
            TurnView.setText(TopLbutt.getText() + " wins!");//Top to Bottom Left row
            winner();
        }
        else if (TopMbutt.getText() == MidMbutt.getText()
                & TopMbutt.getText() == BotMbutt.getText()
                & TopMbutt.getText() != "") {
            TurnView.setText(TopMbutt.getText() + " wins!");//Top to Bottom Mid row
            winner();
        }
        else if (TopRbutt.getText() == MidRbutt.getText()
                & TopRbutt.getText() == BotRbutt.getText()
                & TopRbutt.getText() != "") {
            TurnView.setText(TopRbutt.getText() + " wins!");//Top to Bottom Right row
            winner();
        }
        else if (TopRbutt.getText() != ""
                & TopMbutt.getText()!= ""
                & TopLbutt.getText()!= ""
                & MidRbutt.getText()!= ""
                & MidMbutt.getText()!= ""
                & MidLbutt.getText()!= ""
                & BotRbutt.getText()!= ""
                & BotMbutt.getText()!= ""
                & BotLbutt.getText()!= "") {
            TurnView.setText("That's a tie!");
            winner();
        }
    }

    public void winner() {
        TopRbutt.setEnabled(false);
        TopLbutt.setEnabled(false);
        TopMbutt.setEnabled(false);
        MidRbutt.setEnabled(false);
        MidLbutt.setEnabled(false);
        MidMbutt.setEnabled(false);
        BotRbutt.setEnabled(false);
        BotLbutt.setEnabled(false);
        BotMbutt.setEnabled(false);
    }
}
