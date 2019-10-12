package phamtanphat.ptp.khoaphamtraining.fragmentorientation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {


    View view;
    TextView txtChitiet;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_detail, container, false);
        txtChitiet = view.findViewById(R.id.textviewChitiet);

        ListFragment listFragment = (ListFragment) getActivity().getSupportFragmentManager().findFragmentById(R.id.fragmentLandList);
        if (listFragment != null){
            listFragment.setOnListenValue(new OnListenValue() {
                @Override
                public void onChange(String text) {
                    txtChitiet.setText(text);
                }
            });
        }
        return view;
    }

}
