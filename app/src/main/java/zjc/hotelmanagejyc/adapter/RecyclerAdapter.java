package zjc.hotelmanagejyc.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import zjc.hotelmanagejyc.R;
import zjc.hotelmanagejyc.beans.HotelKindList;

public class RecyclerAdapter extends RecyclerView.Adapter {
    private HotelKindList hotelKindList=new HotelKindList();
    private OnItemClickListener onItemClickListener;

    public OnItemClickListener getOnItemClickListener() {
        return onItemClickListener;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public RecyclerAdapter(HotelKindList hotelKindList){
        this.hotelKindList=hotelKindList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public interface OnItemClickListener{
        void onItemClick(int hotelclassID);
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder{
        private LinearLayout linearLayout;
        private ImageView imageView;
        private TextView textView;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
