package infinity1087.android.com.examplehr.loginFragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Password;
import com.mobsandgeeks.saripaar.annotation.Pattern;

import java.util.List;

import infinity1087.android.com.examplehr.MainActivity;
import infinity1087.android.com.examplehr.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignUp extends Fragment implements Validator.ValidationListener {
    Button signUp;
    protected Validator validator;
    protected boolean validated;


    @NotEmpty(message = "Field should not be left blank !!")
    EditText edt_fname;
    @NotEmpty(message = "Field should not be left blank !!")
    EditText edt_lname;
    @NotEmpty(message = "Field should not be left blank !!")
    @Password(scheme = Password.Scheme.ALPHA_NUMERIC, message = "Please enter an ALPHA_NUMERIC password for better security !!")
    @Length(min = 7, message = "Password should be minimum of 7 characters !!")
    EditText edt_password;
    @NotEmpty(message = "Field should not be left blank !!")
    @Length(max = 10, min = 10, message = "Input must be between 0 to 10")
    @Pattern(regex = "[0-9]+", message = "Can contain only digits from 0 to 9 !!")
    EditText edt_phone;


    public SignUp() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_up, container, false);
        validator = new Validator(this);
        validator.setValidationListener(this);


        initViews(view);


        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent(getActivity(), MainActivity.class);
//                startActivity(i);
                validator.validate();
            }
        });


        return view;
    }

    protected boolean validate() {
        if (validator != null)
            validator.validate();
        return validated;           // would be set in one of the callbacks below
    }


    private void addValidationToViews(View view) {

    }

    private void initViews(View view) {

        edt_fname = view.findViewById(R.id.edt_fname);
        edt_lname = view.findViewById(R.id.edt_lname);
        edt_phone = view.findViewById(R.id.edt_phone);
        edt_password = view.findViewById(R.id.edt_signUp_password);


        signUp = view.findViewById(R.id.btn_signUp);

        addValidationToViews(view);
    }


    @Override
    public void onValidationSucceeded() {

        validated = true;

        Intent i = new Intent(getActivity(), MainActivity.class);
        startActivity(i);


    }

    @Override
    public void onValidationFailed(List<ValidationError> errors) {

        validated = false;


        for (ValidationError error : errors) {
        View view = error.getView();
        String message = error.getCollatedErrorMessage(getActivity());


        // Display error messages
        if (view instanceof EditText) {
            edt_fname = (EditText) view;
            edt_fname.setError(message);
        }
        if (view instanceof EditText) {
            edt_lname = (EditText) view;
            edt_lname.setError(message);
        }
        if (view instanceof EditText) {
            edt_phone = (EditText) view;
            edt_phone.setError(message);
        }
        if (view instanceof EditText) {
            edt_password = (EditText) view;
            edt_password.setError(message);
        }

            /*if (view instanceof TextView) {
                TextView et = (TextView) view;
                et.setError(message);
            }*/
    }
}


}

