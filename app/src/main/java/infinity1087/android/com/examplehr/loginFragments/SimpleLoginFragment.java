package infinity1087.android.com.examplehr.loginFragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import infinity1087.android.com.examplehr.R;

public class SimpleLoginFragment extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleLoginFragment(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override

    public Fragment getItem(int position) {

        if (position == 0) {
            return new SignIn();
        }else {
            return new SignUp();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_signUp);
            case 1:
                return mContext.getString(R.string.category_signIn);
                        default:
                return null;
        }
    }
}
