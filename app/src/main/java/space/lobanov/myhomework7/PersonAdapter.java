package space.lobanov.myhomework7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonVieHolder> {
    private List<Person>items;

    public void setData(List <Person> data){
        items.clear();
        items.addAll(data);
        notifyDataSetChanged();
    }

    public PersonAdapter(List<Person> items){
        this.items = items;
    }
    @NonNull
    @Override
    public PersonVieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PersonVieHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_person, parent, false));
    }
        @Override
        public void onBindViewHolder (@NonNull PersonVieHolder holder,int position){
        holder.nameText.setText(items.get(position).getName());
        holder.srnameText.setText(items.get(position).getSrName());
        holder.ageText.setText(String.valueOf(items.get(position).getAge()));
        }
        @Override
        public int getItemCount () {
            return items.size();
        }
    static class PersonVieHolder extends RecyclerView.ViewHolder {
        private TextView nameText;
        private TextView srnameText;
        private TextView ageText;

        public PersonVieHolder(@NonNull View itemView) {
            super(itemView);
            nameText = itemView.findViewById(R.id.text_name);
            srnameText = itemView.findViewById(R.id.text_srname);
            ageText = itemView.findViewById(R.id.text_age);
        }
    }

    public void addNewItem(Person person){
        items.add(person);
    }
}
