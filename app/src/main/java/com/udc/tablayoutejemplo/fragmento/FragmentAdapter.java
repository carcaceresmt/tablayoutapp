package com.udc.tablayoutejemplo.fragmento;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.udc.tablayoutejemplo.InfoFragment;
import com.udc.tablayoutejemplo.LoginFragment;
import com.udc.tablayoutejemplo.RegistarFragment;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position){

            case 1:
                return new RegistarFragment();
            case 2:
                return new InfoFragment();

        }


       return new LoginFragment();

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
