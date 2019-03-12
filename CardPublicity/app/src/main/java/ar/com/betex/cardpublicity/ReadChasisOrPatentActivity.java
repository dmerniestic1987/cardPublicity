package ar.com.betex.cardpublicity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ReadChasisOrPatentActivity extends AppCompatActivity {
    public static final String ARG_READING_TYPE = "ARG_READING_KIND";
    public static final Integer CHASIS_TIPYE = 0;
    public static final Integer PATENT_TYPE = 1;
    private Integer type = CHASIS_TIPYE;
    private EditText inputText;
    FloatingActionButton fab;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_chasis_or_patent);
        context = this;
        Intent intent = getIntent();
        if (intent.getExtras() != null){
            type = intent.getIntExtra(ARG_READING_TYPE, CHASIS_TIPYE);
        }

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });

        inputText = this.findViewById(R.id.inputText);
        if (PATENT_TYPE == this.type){
            String textoPatente = "Necesitamos el número de patente para conectar su auto a la App.";
            String ejemploPatente = "AB 123 CD";
            TextView textView2 = this.findViewById(R.id.textView2);
            textView2.setText(textoPatente);
            inputText.setHint(ejemploPatente);
        }


        inputText = this.findViewById(R.id.inputText);

    }

}
