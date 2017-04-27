package com.example.a111.map;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editShyrota;
    private EditText editDolgota;
    private EditText editMessage;
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editShyrota = (EditText) findViewById(R.id.editShyrota);
        editDolgota = (EditText) findViewById(R.id.editDolgota);
        editMessage = (EditText) findViewById(R.id.editMessage);
        buttonSend = (Button) findViewById(R.id.buttonSend);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Complaint message = new Complaint();
                message.setShyrota(Float.parseFloat(editShyrota.getText().toString()));
                message.setDolgota(Float.parseFloat(editDolgota.getText().toString()));
                message.setMessage(editMessage.getText().toString());
                message.setStatus(false);
                save(message);

            }
        });

    }

    private void save(Complaint message) {

    }
}
