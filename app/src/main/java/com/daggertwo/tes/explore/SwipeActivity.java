package com.daggertwo.tes.explore;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.daggertwo.tes.R;
import com.daggertwo.tes.adapter.AdapterKriteria;
import com.daggertwo.tes.model.PojoCrit;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import java.util.ArrayList;
import java.util.List;

public class SwipeActivity extends BaseActivity {
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);
        viewPager = findViewById(R.id.viewPager);

//        DemoCollectionPagerAdapter adapter = new DemoCollectionPagerAdapter(getSupportFragmentManager());

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("Yearly", DemoObjectFragment.class)
                .add("Montly", DemoObjectFragment.class)
                .add("Daily", DemoObjectFragment.class)
                .create());

        viewPager.setAdapter(adapter);
//        TabLayout tabLayout = viewPager.findViewById(R.id.tabLayout);
//        tabLayout.setupWithViewPager(viewPager);

        SmartTabLayout viewPagerTab = findViewById(R.id.viewpagertab);
        viewPagerTab.setViewPager(viewPager);

    }
}
// Since this is an object collection, use a FragmentStatePagerAdapter,
// and NOT a FragmentPagerAdapter.
class DemoCollectionPagerAdapter extends FragmentStatePagerAdapter {
    public DemoCollectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new DemoObjectFragment();
        Bundle args = new Bundle();
        // Our object is just an integer :-P
        args.putInt(DemoObjectFragment.ARG_OBJECT, i + 1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return 31;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "OBJECT " + (position + 1);
    }
}

// Instances of this class are fragments representing a single
// object in our collection.
class DemoObjectFragment extends Fragment {
    public static final String ARG_OBJECT = "object";
    private RecyclerView rvDate;
    private List<PojoCrit> contentDaily;
    private AdapterKriteria mKriteria;
    private int lay_height = 0;
    int height = 0;
    private LinearLayout footerbody,footer,bodyContent;
    private ScrollView scroll_main;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        rvDate = view.findViewById(R.id.rvDates);
        footerbody = view.findViewById(R.id.footerbody);
        footer = view.findViewById(R.id.footer);
        bodyContent = view.findViewById(R.id.bodyContent);
        LinearLayoutManager layoutManagerDayVerti
                = new LinearLayoutManager(this.getContext(), LinearLayoutManager.VERTICAL, false);
        rvDate.setLayoutManager(layoutManagerDayVerti);
        contentDaily = getKriteria();
        mKriteria = new AdapterKriteria(this.getContext(), contentDaily);
        rvDate.setAdapter(mKriteria);

        Display display = getActivity().getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        if (getSoftButtonsBarHeight() == 0) {
            height = size.y - getStatusBarHeight() - getSoftButtonsBarHeight() - (int) dipToPixels(getContext(), 104);

        } else {
            height = size.y - getStatusBarHeight() - getSoftButtonsBarHeight() - (int) dipToPixels(getContext(), 56);
        }

        ViewTreeObserver observer = rvDate.getViewTreeObserver();
        observer.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

            @Override
            public void onGlobalLayout() {
                // TODO Auto-generated method stub
                int content_height = rvDate.getHeight()+50;
                int viewport_height = bodyContent.getHeight();

                if(viewport_height<content_height){
                    footer.setVisibility(View.VISIBLE);
                    footerbody.setVisibility(View.GONE);
                }else{
                    footer.setVisibility(View.GONE);
                    footerbody.setVisibility(View.VISIBLE);
                }
            }
        });
    }
    private List<PojoCrit> getKriteria() {
        List<PojoCrit> featuredProducts = new ArrayList<PojoCrit>();
        for (int x=0;x<25;x++){
            featuredProducts.add(new PojoCrit("Swine Flue", (x+1)+"","4","4000"));
        }
        return featuredProducts;
    }

    public int getStatusBarHeight() {
        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    @SuppressLint("NewApi")
    private int getSoftButtonsBarHeight() {
        // getRealMetrics is only available with API 17 and +
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            DisplayMetrics metrics = new DisplayMetrics();
            getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);
            int usableHeight = metrics.heightPixels;
            getActivity().getWindowManager().getDefaultDisplay().getRealMetrics(metrics);
            int realHeight = metrics.heightPixels;
            if (realHeight > usableHeight)
                return realHeight - usableHeight;
            else
                return 0;
        }
        return 0;
    }

    public int pxToDp(int px) {
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        int dp = Math.round(px / (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
        return dp;
    }

    public static float dipToPixels(Context context, float dipValue) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dipValue, metrics);
    }
}
