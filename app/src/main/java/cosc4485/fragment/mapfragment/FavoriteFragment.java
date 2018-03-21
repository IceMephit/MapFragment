package cosc4485.fragment.mapfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FavoriteFragment extends Fragment {
    Button mbtn, tbtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.favorite_fragment_layout, container, false);
 /*       tbtn = view.findViewById(R.id.tBtn);
        mbtn = view.findViewById(R.id.mBtn);

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment faveFragment = new FavoriteFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.track_Frame, faveFragment)
                        .commit();
            }
        });

        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment trackFragment = new TrackFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.map_Frame, trackFragment)
                        .commit();
            }
        });*/
        return view;
    }
}