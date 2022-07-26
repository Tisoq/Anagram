package anagrams.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    EditText anagramText, anagramFilter;
    TextView anagramResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anagramText = findViewById(R.id.anInput);
        anagramFilter = findViewById(R.id.anFilter);
        anagramResult = findViewById(R.id.anResult);

        anagramText.addTextChangedListener(this);
        anagramFilter.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        String input = anagramText.getText().toString();
        String filter = anagramFilter.getText().toString();

        anagramResult.setText(Anagram.build(input, filter));
    }

    @Override
    public void afterTextChanged(Editable editable) {
    }
}