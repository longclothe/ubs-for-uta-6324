package uta.advse6324.ubs.ui.main.market;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import uta.advse6324.ubs.R;

public class MarketFragment extends Fragment {

    private MarketViewModel martketViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        martketViewModel =
                new ViewModelProvider(this).get(MarketViewModel.class);
        View root = inflater.inflate(R.layout.fragment_market, container, false);
        final TextView textView = root.findViewById(R.id.text_market);
        martketViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}