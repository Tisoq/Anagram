package anagrams.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    private EditText anagramInput;
    private EditText anagramFilter;
    private TextView anagramResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anagramInput = findViewById(R.id.input);
        anagramFilter = findViewById(R.id.filter);
        anagramResult = findViewById(R.id.result);

        anagramInput.addTextChangedListener(this);
        anagramFilter.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        String input = anagramInput.getText().toString();
        String filter = anagramFilter.getText().toString();

        anagramResult.setText(Anagram.build(input, filter));
    }

    @Override
    public void afterTextChanged(Editable editable) {
    }
}