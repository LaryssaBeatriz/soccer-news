package com.example.soccernews.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.soccernews.databinding.NewsItemBinding;
import com.example.soccernews.domain.news;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.viewHolder> {

    private List<news> news;

    public NewsAdapter(List<news> news){
        this.news = news;
    }

    @NonNull
    @Override
    public NewsAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater LayoutInflater = android.view.LayoutInflater.from(parent.getContext());
        NewsItemBinding binding = NewsItemBinding.inflate(LayoutInflater, parent, false );
        return new viewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        news News = this.news.get(position);
        holder.binding.tvTitle.setText(News.getTitle());
        holder.binding.tvDescription.setText(News.getDescription());
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{

        private final NewsItemBinding binding;
        //construtor do viewholder que chama uma view binding
        public viewHolder(NewsItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }
}
