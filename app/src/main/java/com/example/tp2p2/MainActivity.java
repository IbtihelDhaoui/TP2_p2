package com.example.tp2p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    Button button;
    EditText editText;
    private EditText mMessageEditText;
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);

        Log.d("Question1:", "Réponse:La deuxième activité est ajoutée en tant que classe Java, le fichier de présentation (layout) XML " +
                "est créé et le fichier AndroidManifest.xml est modifié pour déclarer une deuxième activité.");
        Log.d("Question2:", "Réponse: Le bouton Back (Précédent) ne fonctionne plus dans la deuxième activité pour " +
                "renvoyer l'utilisateur à l'activité principale.");
        Log.d("Question3:", "Réponse: new Intent(Context context, Class<?> class)");
        Log.d("Question4:", "Réponse: Comme extra d'intention (Intent)");
        Log.d("Question5:", "Tout ce qui précède");
    }


    public void countUp(View view) {

        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, Main2Activity.class);
        mShowCount = (TextView) findViewById(R.id.show_count);


        String message = mShowCount.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);


    }
}
