package phamtanphat.ptp.khoaphamtraining.fragmentorientation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SanphamAdapter extends  RecyclerView.Adapter<SanphamAdapter.SanphamHolder>{

    private ArrayList<Sanpham> mSanphams;
    private OnItemClickListener mOnItemClickListener;

    public void onItemClick(OnItemClickListener mOnItemClickListener){
        this.mOnItemClickListener = mOnItemClickListener;
    }
    public SanphamAdapter(ArrayList<Sanpham> mSanphams) {
        this.mSanphams = mSanphams;
    }

    @NonNull
    @Override
    public SanphamHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_sanpham,null);
        return new SanphamHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SanphamHolder holder, int position) {
        Sanpham sanpham = mSanphams.get(position);
        holder.txtDetail.setText(sanpham.getTen());


    }

    @Override
    public int getItemCount() {
        return mSanphams != null ? mSanphams.size() : 0 ;
    }

    class SanphamHolder extends RecyclerView.ViewHolder{
        TextView txtDetail;
        public SanphamHolder(@NonNull final View itemView) {
            super(itemView);
            txtDetail = itemView.findViewById(R.id.textviewItemsanpham);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mOnItemClickListener.onClickItem(itemView,getLayoutPosition());
                }
            });
        }

    }
}
