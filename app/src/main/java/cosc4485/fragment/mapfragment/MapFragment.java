package cosc4485.fragment.mapfragment;

import android.os.Bundle;
        import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MapFragment extends Fragment{
    Button fbtn, tbtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.map_fragment_layout, container, false);
/*        fbtn = view.findViewById(R.id.fBtn);
        tbtn = view.findViewById(R.id.tBtn);

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

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment trackFragment = new TrackFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.track_Frame, trackFragment)
                        .commit();
            }
        });*/
        return view;
    }
}