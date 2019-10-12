package phamtanphat.ptp.khoaphamtraining.fragmentorientation;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    View mView;
    RecyclerView mRecyclerView;
    SanphamAdapter mSanphamAdapter;
    ArrayList<Sanpham> mSanphams;
    OnListenValue onListenValue;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_list, container, false);
        mRecyclerView = mView.findViewById(R.id.reyclerview);
        mSanphams = new ArrayList<>();
        mSanphams.add(new Sanpham("May tinh de ban"));
        mSanphams.add(new Sanpham("Loa vi tinh"));
        mSanphams.add(new Sanpham("Dien thoai di dong"));
        mSanphams.add(new Sanpham("Dung cu chua chay"));

        mSanphamAdapter = new SanphamAdapter(mSanphams);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(mSanphamAdapter);
        ((SanphamAdapter)mRecyclerView.getAdapter()).onItemClick(new OnItemClickListener() {
            @Override
            public void onClickItem(View v, int position) {

                DetailFragment detailFragment = (DetailFragment) getActivity().getSupportFragmentManager().findFragmentById(R.id.textviewChitiet);
                if (detailFragment != null){
                    onListenValue.onChange(mSanphams.get(position).getTen());
                }else{
                    Intent intent = new Intent(getActivity(),Main2Activity.class);
                    intent.putExtra("chuoi",mSanphams.get(position).getTen());
                    startActivity(intent);
                }
            }
        });
        return mView;
    }
    public void setOnListenValue(OnListenValue onListenValue){
        this.onListenValue = onListenValue;
    }

}
