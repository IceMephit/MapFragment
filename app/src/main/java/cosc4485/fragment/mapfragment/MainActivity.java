package cosc4485.fragment.mapfragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapFragment mFrag = new MapFragment();
        FavoriteFragment fFrag = new FavoriteFragment();
        TrackFragment tFrag = new TrackFragment();

        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();

        transaction.add(R.id.map_Frame, mFrag, "map_Fragment_Tag");
        transaction.add(R.id.fav_Frame, fFrag, "favorite_Fragment_Tag");
        transaction.add(R.id.track_Frame, tFrag, "track_Fragment_Tag");

        transaction.commit();
    }
}