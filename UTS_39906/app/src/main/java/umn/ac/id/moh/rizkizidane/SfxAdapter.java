package umn.ac.id.moh.rizkizidane;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SfxAdapter extends RecyclerView.Adapter<SfxAdapter.listHolder> {

    private Context context;
    private final List<String> list;
    private View view;

    public SfxAdapter (Context context, List<String> list){
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public listHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        view = LayoutInflater.from(context).inflate(R.layout.list_sfx, parent, false);
        return new listHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull listHolder holder, int position) {
        String nsfx = list.get(position);
        holder.namasfx.setText(nsfx);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, nsfx, Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class listHolder extends RecyclerView.ViewHolder {
        TextView namasfx;

        public listHolder(@NonNull View itemView) {
            super(itemView);
            namasfx = itemView.findViewById(R.id.nama_sfx);
        }
    }
}
