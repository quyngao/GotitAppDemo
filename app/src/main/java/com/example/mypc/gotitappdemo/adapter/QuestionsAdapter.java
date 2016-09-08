package com.example.mypc.gotitappdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mypc.gotitappdemo.R;
import com.example.mypc.gotitappdemo.model.Question;
import com.example.mypc.gotitappdemo.util.Constant;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by MyPC on 06/09/2016.
 */
public class QuestionsAdapter extends RecyclerView.Adapter<QuestionsAdapter.MyViewHolder> {
    private Context mContext;
    private List<Question> questions;

    public QuestionsAdapter(Context mContext, List<Question> questions) {
        this.mContext = mContext;
        this.questions = questions;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_question, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Question question = questions.get(position);
        holder.tvTitle.setText(question.getProcessingData().getName());
        holder.tvTime.setText(Constant.getTime(question.getCreated()));
        if (question.getProcessingStatus().equalsIgnoreCase("5")) {
            holder.tvStatus.setText(Constant.status[0]);
        } else if (question.getProcessingStatus().equalsIgnoreCase("6")) {
            holder.tvStatus.setText(Constant.status[1]);
            holder.tvTime.setText(Constant.getTime(question.getUpdated()));
        }
        Glide.with(mContext).load(question.getProcessingData().getAvatar()).into(holder.imgAvatar);
        Glide.with(mContext).load(question.getAuthor().getAvatar()).into(holder.imgIcon);
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
        notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        return questions.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle, tvTime, tvStatus;
        public ImageView imgAvatar;
        public CircleImageView imgIcon;

        public MyViewHolder(View view) {
            super(view);
            tvTitle = (TextView) view.findViewById(R.id.title);
            tvTime = (TextView) view.findViewById(R.id.time);
            tvStatus = (TextView) view.findViewById(R.id.status);
            imgAvatar = (ImageView) view.findViewById(R.id.avatar);
            imgIcon = (CircleImageView) view.findViewById(R.id.icon);
        }

    }
}
