package space.lobanov.myhomework7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    EditText nameEdit;
    EditText srnameEdit;
    EditText ageEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViews();
    }

    private void findViews() {
        nameEdit = findViewById(R.id.name_edit_id);
        srnameEdit = findViewById(R.id.text_srname_editid);
        ageEdit = findViewById(R.id.text_age_editid);
    }

    public void button_click_back(View view) {
        if (TextUtils.isEmpty(ageEdit.getText())){
            Toast.makeText(this," Enter age ",Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(nameEdit.getText())){
            Toast.makeText(this," Enter name ",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        if ( TextUtils.isEmpty(srnameEdit.getText())){
            Toast.makeText(this, " Enter srName ",Toast.LENGTH_SHORT).show();
            return;
        }

        int ageInt = Integer.parseInt(ageEdit.getText().toString());
        Person person = new Person(
                nameEdit.getText().toString(),
                srnameEdit.getText().toString(),
                ageInt);

        Intent intent = new Intent();
        intent.putExtra("KeyPerson",person);
        setResult(RESULT_OK,intent);
        finish();

    }

}