package ar.com.betex.cardpublicity.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ar.com.betex.cardpublicity.R;
import ar.com.betex.cardpublicity.adapters.RecyclerViewAdapter;
import ar.com.betex.cardpublicity.beans.Car;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnMainFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {
    public static final String TAG = "MainFragment";
    private OnMainFragmentInteractionListener mListener;
    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter adapter;
    private List<Car> data;
    private String insertData;
    private boolean loading;
    private int loadTimes;


    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();
        initView();
    }

    private void initData() {
        data = new ArrayList<>();
        Car car = new Car();
        car.setBrand("Fiat");
        car.setDrawableId(R.drawable.fait_toro_transparente);
        car.setModel("Toro");
        car.setPatent("AVC 654 SS");
        car.setVin("XAA767RX666C8X55");
        car.setYear(2018);
        data.add(car);

        car = new Car();
        car.setBrand("Fiat");
        car.setDrawableId(R.drawable.fiat_uno_blanco);
        car.setModel("UNO");
        car.setPatent("BCE 987 BB");
        car.setVin("BAC257RX787C8X55");
        car.setYear(2019);
        data.add(car);

        car = new Car();
        car.setBrand("BMW");
        car.setDrawableId(R.drawable.bmw_z3);
        car.setModel("Z3");
        car.setPatent("AVC 654 SS");
        car.setVin("ZZZ767RX666C8X55");
        car.setYear(2015);
        data.add(car);

        car = new Car();
        car.setBrand("Volkswagen");
        car.setDrawableId(R.drawable.vwbettle);
        car.setModel("The Beetle");
        car.setPatent("AVC 654 SS");
        car.setVin("XAA767RX666C8X55");
        car.setYear(2019);
        data.add(car);

        car = new Car();
        car.setBrand("Fiat");
        car.setDrawableId(R.drawable.fait_toro_transparente);
        car.setModel("Toro");
        car.setPatent("AVC 654 SS");
        car.setVin("XAA767RX666C8X55");
        car.setYear(2018);
        data.add(car);

        car = new Car();
        car.setBrand("Fiat");
        car.setDrawableId(R.drawable.fiat_uno_blanco);
        car.setModel("UNO");
        car.setPatent("BCE 987 BB");
        car.setVin("BAC257RX787C8X55");
        car.setYear(2019);
        data.add(car);

        insertData = "0";
        loadTimes = 0;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnMainFragmentInteractionListener) {
            mListener = (OnMainFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnMainFragmentInteractionListener");
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
    public interface OnMainFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


    private void initView() {
        mRecyclerView = getActivity().findViewById(R.id.recycler_view_recycler_view);

        if (getScreenWidthDp() >= 1200) {
            final GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
            mRecyclerView.setLayoutManager(gridLayoutManager);
        } else if (getScreenWidthDp() >= 800) {
            final GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            mRecyclerView.setLayoutManager(gridLayoutManager);
        } else {
            final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            mRecyclerView.setLayoutManager(linearLayoutManager);
        }

        adapter = new RecyclerViewAdapter(getContext());
        mRecyclerView.setAdapter(adapter);
        adapter.setItems(data);
    }

    private int getScreenWidthDp() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        return (int) (displayMetrics.widthPixels / displayMetrics.density);
    }
}
