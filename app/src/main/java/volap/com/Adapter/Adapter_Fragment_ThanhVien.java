package volap.com.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import volap.com.Fragment.BlankFragment_Gold;
import volap.com.Fragment.BlankFragment_Platium;
import volap.com.Fragment.BlankFragment_Silver;


public class Adapter_Fragment_ThanhVien extends FragmentPagerAdapter {
    public Adapter_Fragment_ThanhVien(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new BlankFragment_Silver();
            case 1:
                return new BlankFragment_Gold();
            case 2:
                return new BlankFragment_Platium();

            default:
                return new BlankFragment_Silver();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "Silver";
        } else if (position == 1) {
            title = "Gold";
        }
        else if (position == 2) {
            title = "Platium";
        }
        return title;
    }
}