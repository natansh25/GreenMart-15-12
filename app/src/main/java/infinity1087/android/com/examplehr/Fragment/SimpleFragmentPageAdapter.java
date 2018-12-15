package infinity1087.android.com.examplehr.Fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import infinity1087.android.com.examplehr.Fragment.CategoryFragment;
import infinity1087.android.com.examplehr.Fragment.ComboFragment;
import infinity1087.android.com.examplehr.Fragment.SeasonalFragment;
import infinity1087.android.com.examplehr.R;

public class SimpleFragmentPageAdapter  extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPageAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override

    public Fragment getItem(int position) {

        if (position == 0) {
            return new CategoryFragment();
        } else if (position == 1) {
            return new SeasonalFragment();

        } else {
            return new ComboFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_categoryF);
            case 1:
                return mContext.getString(R.string.category_seasonal);
            case 2:
                return mContext.getString(R.string.category_combo);
            default:
                return null;
        }
    }
}