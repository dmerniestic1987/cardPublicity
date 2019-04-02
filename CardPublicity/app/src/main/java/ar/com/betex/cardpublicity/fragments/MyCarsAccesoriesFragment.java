package ar.com.betex.cardpublicity.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import ar.com.betex.cardpublicity.R;
import ar.com.betex.cardpublicity.adapters.MyCarAccesoryAdapter;
import ar.com.betex.cardpublicity.beans.Accesory;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnMyCarAccesoriesListener} interface
 * to handle interaction events.
 * Use the {@link MyCarsAccesoriesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyCarsAccesoriesFragment extends Fragment {
    private OnMyCarAccesoriesListener mListener;
    private GridView gridViewAccesories;
    private MyCarAccesoryAdapter adapter;

    public MyCarsAccesoriesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment MyCarsAccesoriesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MyCarsAccesoriesFragment newInstance() {
        MyCarsAccesoriesFragment fragment = new MyCarsAccesoriesFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_cars_accesories, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        gridViewAccesories = getActivity().findViewById(R.id.gridViewAccesories);
        adapter = new MyCarAccesoryAdapter(this.getContext());
        gridViewAccesories.setAdapter(adapter);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onAccesorySelected(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnMyCarAccesoriesListener) {
            mListener = (OnMyCarAccesoriesListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnMyCarAccesoriesListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnMyCarAccesoriesListener {
        // TODO: Update argument type and name
        void onAccesorySelected(Uri uri);
    }
}
