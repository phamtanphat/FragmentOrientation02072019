package phamtanphat.ptp.khoaphamtraining.fragmentorientation;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SanphamAdapter {

    class SanphamHolder extends RecyclerView.ViewHolder{
        TextView txtDetail;
        public SanphamHolder(@NonNull View itemView) {
            super(itemView);
            txtDetail = itemView.findViewById(R.id.textviewChitiet);
        }
    }
}
