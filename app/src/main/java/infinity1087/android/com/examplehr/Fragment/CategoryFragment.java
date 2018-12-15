package infinity1087.android.com.examplehr.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.squareup.picasso.Picasso;

import infinity1087.android.com.examplehr.R;
import infinity1087.android.com.examplehr.RoundedTransformation;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {

    ImageButton img_btn_veggie,img_btn_milk,img_button_fruits,img_btn_waffers;





    public CategoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);

    /*    img_btn_veggie=view.findViewById(R.id.img_veggie);
        Picasso.get().load(R.drawable.veg).transform(new RoundedTransformation(20,0)).into(img_btn_veggie);*/


        return view;

    }

}
