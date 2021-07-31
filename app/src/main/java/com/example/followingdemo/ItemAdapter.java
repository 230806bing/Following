package com.example.followingdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    final int First_TYPE = 0;
    final int Second_TYPE = 1;
    private Context context;
    List<DataBean> dataBeans;
    static class FirstViewHolder extends RecyclerView.ViewHolder{
        ImageView img_banner;
        TextView title;
        TextView article;
        ImageView img_portrait;
        TextView tv_name;
        TextView tv_all;
        ImageView img_like;
        TextView tv_likes;
        ImageView img_star;
        TextView tv_stars;
        public FirstViewHolder(View view) {
            super(view);
            img_banner = view.findViewById(R.id.banner);
            title = view.findViewById(R.id.title);
            article = view.findViewById(R.id.article);
            img_portrait = view.findViewById(R.id.img_portrait);
            tv_name = view.findViewById(R.id.tv_name);
            tv_all = view.findViewById(R.id.tv);
            img_like = view.findViewById(R.id.img_like);
            tv_likes = view.findViewById(R.id.num_like);
            img_star = view.findViewById(R.id.img_star);
            tv_stars = view.findViewById(R.id.num_star);
        }
    }

    private class SecondViewHolder extends RecyclerView.ViewHolder {
        ImageView img_banner;
        TextView title;
        TextView article;
        ImageView img_goods;
        TextView goods_name;
        TextView goods_describe;
        TextView goods_price;
        ImageView goods_star;
        ImageView img_portrait;
        TextView tv_name;
        TextView tv_less;
        ImageView img_like;
        TextView tv_likes;
        ImageView img_star;
        TextView tv_stars;
        public SecondViewHolder(View view) {
            super(view);
            img_banner = view.findViewById(R.id.banner);
            title = view.findViewById(R.id.title);
            article = view.findViewById(R.id.article);
            img_goods = view.findViewById(R.id.img_goods);
            goods_name = view.findViewById(R.id.goods_name);
            goods_describe = view.findViewById(R.id.goods_describe);
            goods_price = view.findViewById(R.id.goods_price);
            goods_star = view.findViewById(R.id.goods_star);
            img_portrait = view.findViewById(R.id.img_portrait);
            tv_name = view.findViewById(R.id.tv_name);
            tv_less = view.findViewById(R.id.tv);
            img_like = view.findViewById(R.id.img_like);
            tv_likes = view.findViewById(R.id.num_like);
            img_star = view.findViewById(R.id.img_star);
            tv_stars = view.findViewById(R.id.num_star);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType) {
        View view = null;
        if (viewType == First_TYPE){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.first_item,parent,false);
            return new FirstViewHolder(view);
        }
        else if (viewType == Second_TYPE){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.second_item,parent,false);
            return new SecondViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof FirstViewHolder) {
            DataBean dataBean = dataBeans.get(position);
            ((FirstViewHolder) holder).img_banner.setImageResource(dataBean.getBanner_imageRes());
            ((FirstViewHolder) holder).title.setText(dataBean.getTitle());
            ((FirstViewHolder) holder).article.setText(dataBean.getArticle());
            ((FirstViewHolder) holder).img_portrait.setImageResource(dataBean.getImageRes());
            ((FirstViewHolder) holder).tv_name.setText(dataBean.getKOL_name());
            ((FirstViewHolder) holder).tv_likes.setText(dataBean.getLikes());
            ((FirstViewHolder) holder).tv_stars.setText(dataBean.getStars());
            ((FirstViewHolder) holder).tv_all.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dataBean.setType(1);
                    notifyItemChanged(position,null);
                }
            });
        } else if (holder instanceof SecondViewHolder) {
            DataBean dataBean = dataBeans.get(position);
            ((SecondViewHolder) holder).img_banner.setImageResource(dataBean.getBanner_imageRes());
            ((SecondViewHolder) holder).title.setText(dataBean.getTitle());
            ((SecondViewHolder) holder).article.setText(dataBean.getArticle());
            ((SecondViewHolder) holder).img_portrait.setImageResource(dataBean.getImageRes());
            ((SecondViewHolder) holder).tv_name.setText(dataBean.getKOL_name());
            ((SecondViewHolder) holder).tv_likes.setText(dataBean.getLikes());
            ((SecondViewHolder) holder).tv_stars.setText(dataBean.getStars());
            ((SecondViewHolder) holder).img_goods.setImageResource(dataBean.getGoods_imageRes());
            ((SecondViewHolder) holder).goods_name.setText(dataBean.getGoods_name());
            ((SecondViewHolder) holder).goods_describe.setText(dataBean.getGoods_describe());
            ((SecondViewHolder) holder).goods_price.setText(dataBean.getGoods_price());
            ((SecondViewHolder) holder).goods_star.setImageResource(dataBean.getGoods_starRes());
            ((SecondViewHolder) holder).tv_less.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dataBean.setType(0);
                    notifyItemChanged(position,null);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return dataBeans.size();
    }

    public ItemAdapter(List<DataBean> dataBeans){
        this.dataBeans = dataBeans;
    }
    @Override
    public int getItemViewType(int position) {
        return dataBeans.get(position).getType();
    }

}
