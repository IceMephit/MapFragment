package cosc4485.fragment.mapfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class TrackFragment extends Fragment {
    Button fbtn, mbtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.track_fragment_layout, container, false);
/*        mbtn = view.findViewById(R.id.mBtn);
        fbtn = view.findViewById(R.id.fBtn);

        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment mapFragment = new MapFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.map_Frame, mapFragment)
                        .commit();
            }
        });

        fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment faveFragment = new FavoriteFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fav_Frame, faveFragment)
                        .commit();
            }
        });
*/
        return view;
    }
}