package phamtanphat.ptp.khoaphamtraining.fragmentorientation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    View mView;
    RecyclerView mRecyclerView;
    SanphamAdapter mSanphamAdapter;
    ArrayList<Sanpham> mSanphams;
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
        return mView;
    }

}
