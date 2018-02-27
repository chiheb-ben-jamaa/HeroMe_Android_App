package com.app.chihebapp.herome.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.app.chihebapp.herome.Activities.MainActivity;
import com.app.chihebapp.herome.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MainFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    //add some Button from the wml view :
    Button accedentbtn;
    Button geneticbtn;
    Button bornbtn;
    Button choosebtn;


    private OnFragmentInteractionListener mListener;

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
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //add some code here to get the View :
        View  view =inflater.inflate(R.layout.fragment_main, container, false);
        //get id Button from the view :
        accedentbtn=view.findViewById(R.id.accedentbtn);
        geneticbtn=view.findViewById(R.id.geneticbtn);
        bornbtn=view.findViewById(R.id.bornbtn);
        choosebtn=view.findViewById(R.id.choosebtn);

        //TODO : Add some Animation on clickListnier:
        //add Opacite ligthet Animation :
        //make the btn is disable:
        choosebtn.setEnabled(false);
        //make the Aplpha =Opacite att 125% :
        choosebtn.getBackground().setAlpha(125);




        //TODO : set OnClickListner or easch Button:
        accedentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set the Choosebtn enable & set the ligth again:
            choosebtn.setEnabled(true);
                choosebtn.getBackground().setAlpha(255);
                //TODO: set the drawable (lest,rigth,top,bottom):
                geneticbtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.atomic,0,0,0);
                bornbtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.rocket,0,0,0);

                accedentbtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lightning,0,R.drawable.itemselected,0);
            }
        });

        geneticbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set the Choosebtn enable & set the ligth again:
                choosebtn.setEnabled(true);
                choosebtn.getBackground().setAlpha(255);
                //TODO: set the drawable (lest,rigth,top,bottom):
                accedentbtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lightning,0,0,0);
                bornbtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.rocket,0,0,0);

                geneticbtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.atomic,0,R.drawable.itemselected,0);

            }
        });

        bornbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set the Choosebtn enable & set the ligth again:
                choosebtn.setEnabled(true);
                choosebtn.getBackground().setAlpha(255);
                //TODO: set the drawable (lest,rigth,top,bottom):
                accedentbtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lightning,0,0,0);
                geneticbtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.atomic,0,0,0);

                bornbtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.rocket,0,R.drawable.itemselected,0);
            }
        });



        choosebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //this methode for load new Fragment :
                MainActivity  mainActivity=(MainActivity)getActivity();
                mainActivity.loadPickPowerScreen();


            }
        });





        // Inflate the layout for this fragment
        //and in the last etape is return the Vraible View :
        return view ;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
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
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
