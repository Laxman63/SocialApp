package com.example.firebase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
private List<Post> postList;
Context context;
    public RecycleAdapter(AppCompatActivity context, List<Post> userList){
        //super(context,0,userList);
        this.context=context;
        this.postList=userList;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
     View view= LayoutInflater.from(context).inflate(R.layout.all_post_layout,viewGroup,false);
     return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
Post post=postList.get(position);
viewHolder.textViewusername.setText(post.getFullname());
viewHolder.textViewtime.setText(post.getTime());
viewHolder.textViewdate.setText(post.getDate());
viewHolder.textViewdescription.setText(post.getAboutpost());
        Picasso.get().load(post.getUrlofimage()).centerCrop().into(viewHolder.imageViewpost);
        Picasso.get().load(post.getUrlprofile()).centerCrop().into(viewHolder.circleImageViewuserpro);
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
TextView textViewdescription,textViewdate,textViewtime,textViewusername;
ImageView imageViewpost;
CircleImageView circleImageViewuserpro;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewdate=itemView.findViewById(R.id.date);
            textViewdescription=itemView.findViewById(R.id.description);
            textViewtime=itemView.findViewById(R.id.timepost);
            textViewusername=itemView.findViewById(R.id.username);
            imageViewpost=itemView.findViewById(R.id.postimage);
            circleImageViewuserpro=itemView.findViewById(R.id.circleimageinallpost);
        }
    }

}
