package space.lobanov.myhomework7;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
     private List <Person> personList = new ArrayList<>();
    private PersonAdapter recAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView listrecycler = findViewById(R.id.list_person);
        listrecycler.setLayoutManager(new LinearLayoutManager(this));
        recAdapter = new PersonAdapter(personList);
        listrecycler.setAdapter(recAdapter);
    }

    public void button_click(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivityForResult(intent,1);

    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (resultCode == RESULT_OK ){
            if (requestCode == 1){
                if (intent == null){
                    return;
                }
                Person person = (Person) intent.getSerializableExtra("KeyPerson");
                if (person != null){
                    recAdapter.addNewItem(person);
                    recAdapter.notifyDataSetChanged();
                }
            }
        }

    }
}

