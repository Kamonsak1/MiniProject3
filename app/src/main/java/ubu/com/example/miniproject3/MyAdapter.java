package ubu.com.example.miniproject3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Friend> valuse;
    private Context context;

    public MyAdapter(List<Friend> valuse,Context context){
        this.valuse = valuse;
        this.context = context;
    }
    public  class  ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView;
        public View layout;

        public ViewHolder(View v){
            super(v);
            layout = v;
            imageView = v.findViewById(R.id.imageView);
            textView = v.findViewById(R.id.textView);
        }
    }
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.row_layout,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final Friend friend = valuse.get(position);
        holder.textView.setText(friend.getFriend_name());
        Glide.with(context)
                .load(friend.getFriend_immage())
                .into(holder.imageView);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(context,
                        friend.getFriend_name(),
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
    @Override
    public int getItemCount(){
        return valuse.size();
    }

}
