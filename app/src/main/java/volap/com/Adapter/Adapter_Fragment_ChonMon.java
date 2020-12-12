package volap.com.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import volap.com.Fragment.BlankFragment_chonmon_1;
import volap.com.Fragment.BlankFragment_chonmon_2;
import volap.com.Fragment.BlankFragment_chonmon_3;
import volap.com.Fragment.BlankFragment_chonmon_4;


public class Adapter_Fragment_ChonMon extends FragmentPagerAdapter {
    public Adapter_Fragment_ChonMon(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new BlankFragment_chonmon_1();
            case 1:
                return new BlankFragment_chonmon_2();
            case 2:
                return new BlankFragment_chonmon_3();
            case 3:
                return new BlankFragment_chonmon_4();

            default:
                return new BlankFragment_chonmon_1();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "Gree XMas";
        } else if (position == 1) {
            title = "Ice";
        }
        else if (position == 2) {
            title = "Tea";
        }
        else if (position == 3) {
            title = "Passio";
        }
        return title;
    }
}