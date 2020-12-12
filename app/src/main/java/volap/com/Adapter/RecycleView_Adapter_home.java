package volap.com.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

import volap.com.R;

public class RecycleView_Adapter_home extends RecyclerView.Adapter<RecycleView_Adapter_home.MonAnViewHoder> {
    private List<RecycleView_Sup_Home> listMonan;

    public RecycleView_Adapter_home() {
    }

    public void setData(List<RecycleView_Sup_Home> list) {
        this.listMonan = list;
        notifyDataSetChanged();
    }

    private OnItemClickListener mListMonAn;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListMonAn = listener;
    }

    @NonNull
    @Override
    public MonAnViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_sup_home, parent, false);
        return new MonAnViewHoder(view, mListMonAn);
    }

    @Override
    public void onBindViewHolder(@NonNull MonAnViewHoder holder, int position) {
        RecycleView_Sup_Home user = listMonan.get(position);
        if (user == null) {
            return;
        }
        holder.tvTieuDe_Home.setText(user.getTen());
        holder.tvNoiDung_Home.setText(user.getNoiDung());
        holder.img_home.setImageResource(user.getImg_home());
    }

    @Override
    public int getItemCount() {
        if (listMonan != null) {
            return listMonan.size();
        }
        return 0;
    }

    public class MonAnViewHoder extends RecyclerView.ViewHolder {
        private TextView tvTieuDe_Home;
        private TextView tvNoiDung_Home;
        private ImageView img_home;

        public MonAnViewHoder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            tvTieuDe_Home = itemView.findViewById(R.id.text_tieude);
            tvNoiDung_Home= itemView.findViewById(R.id.text_noidung);
            img_home = itemView.findViewById(R.id.img_home1);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}
