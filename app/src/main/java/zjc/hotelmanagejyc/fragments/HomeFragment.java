package zjc.hotelmanagejyc.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import zjc.hotelmanagejyc.MainActivity;
import zjc.hotelmanagejyc.R;
import zjc.hotelmanagejyc.beans.HotelKindList;

public class HomeFragment extends Fragment {

    private View fragment_homeView;
    private Banner banner;

    private  void initBanner(){
        List images = new ArrayList();
        images.add(R.drawable.bannerimg1);
        images.add(R.drawable.bannerimg2);
        images.add(R.drawable.bannerimg3);
        images.add(R.drawable.bannerimg4);
        images.add(R.drawable.bannerimg5);
        // 在fragment_homeView中利用findViewById函数获得Banner对象
        banner = fragment_homeView.findViewById(R.id.home_banner);
        banner.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                // 利用Glide加载图片
                Glide.with(getContext()).load(path).into(imageView);
            }
        });
        banner.setImages(images);
        banner.start();
    }

    public void showAllHotelKindCallback(final HotelKindList hotelKindListFromJson){

    }

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragment_homeView = inflater.inflate(R.layout.fragment_home, container, false);
        initBanner();
        return fragment_homeView;
    }
}