package ar.com.betex.cardpublicity.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import ar.com.betex.cardpublicity.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button facebookButton;
    private Button googleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.facebookButton = this.findViewById(R.id.facebookButton);
        this.facebookButton.setOnClickListener(this);
        this.googleButton = this.findViewById(R.id.googleButton);
        this.googleButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, WellcomeChasisActivity.class);
        startActivity(intent);
    }
}
