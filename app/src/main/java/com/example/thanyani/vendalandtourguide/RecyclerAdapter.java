package com.example.thanyani.vendalandtourguide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by THANYANI on 2017/08/17.
 */


public class RecyclerAdapter  extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    Context context;
    List<VendaTour> vendaTours;

    public RecyclerAdapter(Context context, List<VendaTour> vendaTours) {
        this.context = context;
        this.vendaTours = vendaTours;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list,parent,false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {

        final VendaTour vtour=  vendaTours.get(position);
        holder.topic.setText(vtour.getTopic());
        holder.imageView.setImageResource(vtour.getImage());
        holder.descrip.setText(vtour.getText());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Main3Activity.class);
                intent.putExtra("daki",vtour);

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return vendaTours.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView topic;
        ImageView imageView;
        TextView descrip;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            topic = (TextView) itemView.findViewById(R.id.topic);
            imageView = (ImageView) itemView.findViewById(R.id.images);
            descrip = (TextView) itemView.findViewById(R.id.description);
            cardView = (CardView) itemView.findViewById(R.id.card);
        }
    }
}
