package ar.com.betex.cardpublicity.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ar.com.betex.cardpublicity.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link NearCarDealers#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NearCarDealers extends Fragment {
    // TODO: Rename parameter arguments, choose names that match

    public NearCarDealers() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment NearCarDealers.
     */
    // TODO: Rename and change types and number of parameters
    public static NearCarDealers newInstance() {
        NearCarDealers fragment = new NearCarDealers();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_near_car_dealers, container, false);
    }



    @Override
    public void onDetach() {
        super.onDetach();
    }

}
