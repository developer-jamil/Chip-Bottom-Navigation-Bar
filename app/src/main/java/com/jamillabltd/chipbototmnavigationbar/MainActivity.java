package com.jamillabltd.chipbototmnavigationbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jamillabltd.chipbototmnavigationbar.bottom_bar_fragments.HomeFragment;
import com.jamillabltd.chipbototmnavigationbar.bottom_bar_fragments.MessageFragment;
import com.jamillabltd.chipbototmnavigationbar.bottom_bar_fragments.ProfileFragment;
import com.jamillabltd.chipbototmnavigationbar.bottom_bar_fragments.SettingFragment;

public class MainActivity extends AppCompatActivity {
    private int selectedTab = 1;
    LinearLayout homeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeLayout = findViewById(R.id.homeLayout);
        final LinearLayout messageLayout = findViewById(R.id.messageLayout);
        final LinearLayout profileLayout = findViewById(R.id.profileLayout);
        final LinearLayout settingLayout = findViewById(R.id.settingLayout);

        final ImageView homeImage = findViewById(R.id.homeImage);
        final ImageView messageImage = findViewById(R.id.messageImage);
        final ImageView profileImage = findViewById(R.id.profileImage);
        final ImageView settingImage = findViewById(R.id.settingImage);

        final TextView homeText = findViewById(R.id.homeText);
        final TextView messageText = findViewById(R.id.messageText);
        final TextView profileText = findViewById(R.id.profileText);
        final TextView settingText = findViewById(R.id.settingText);

        //set home as a default fragment
        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragmentContainerId, HomeFragment.class, null)
                .commit();


        //onClick to home icon
        homeLayout.setOnClickListener(v -> {

            //set home fragment
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainerId, HomeFragment.class, null)
                    .commit();

            // check if home is already selected or not.
            if (selectedTab != 1) {
                //unselected the other tabs expect home tab
                messageText.setVisibility(View.GONE);
                profileText.setVisibility(View.GONE);
                settingText.setVisibility(View.GONE);
                //set icons
                messageImage.setImageResource(R.drawable.baseline_message_24);
                profileImage.setImageResource(R.drawable.baseline_person_24);
                settingImage.setImageResource(R.drawable.baseline_settings_24);
                //set bg color
                int transparentColor = ContextCompat.getColor(MainActivity.this, android.R.color.transparent);
                messageLayout.setBackgroundColor(transparentColor);
                profileLayout.setBackgroundColor(transparentColor);
                settingLayout.setBackgroundColor(transparentColor);
                //selected home tab
                homeText.setVisibility(View.VISIBLE);
                homeImage.setImageResource(R.drawable.baseline_home_24_selected);
                homeLayout.setBackgroundResource(R.drawable.round_home_100);
                //create animation
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                scaleAnimation.setDuration(200);
                scaleAnimation.setFillAfter(true);
                homeLayout.startAnimation(scaleAnimation);

                // set 1st tab as selected tab
                selectedTab = 1;

            }

        });
        //onClick to message icon
        messageLayout.setOnClickListener(v -> {

            //set message fragment
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainerId, MessageFragment.class, null)
                    .commit();

            // check if message is already selected or not.
            if (selectedTab != 2) {
                //unselected the other tabs expect home tab
                settingText.setVisibility(View.GONE);
                profileText.setVisibility(View.GONE);
                homeText.setVisibility(View.GONE);
                //set icons
                settingImage.setImageResource(R.drawable.baseline_settings_24);
                profileImage.setImageResource(R.drawable.baseline_person_24);
                homeImage.setImageResource(R.drawable.baseline_home_24);
                //set bg color
                int transparentColor = ContextCompat.getColor(MainActivity.this, android.R.color.transparent);
                homeLayout.setBackgroundColor(transparentColor);
                profileLayout.setBackgroundColor(transparentColor);
                settingLayout.setBackgroundColor(transparentColor);
                //selected home tab
                messageText.setVisibility(View.VISIBLE);
                messageImage.setImageResource(R.drawable.baseline_message_24_selected);
                messageLayout.setBackgroundResource(R.drawable.round_message_100);
                //create animation
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1f, Animation.RELATIVE_TO_SELF, 0.0f);
                scaleAnimation.setDuration(200);
                scaleAnimation.setFillAfter(true);
                messageLayout.startAnimation(scaleAnimation);

                // set 1st tab as selected tab
                selectedTab = 2;

            }

        });
        //onClick to profile icon
        profileLayout.setOnClickListener(v -> {

            //set profile fragment
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainerId, ProfileFragment.class, null)
                    .commit();

            // check if home is already selected or not.
            if (selectedTab != 3) {
                //unselected the other tabs expect home tab
                messageText.setVisibility(View.GONE);
                homeText.setVisibility(View.GONE);
                settingText.setVisibility(View.GONE);
                //set icons
                messageImage.setImageResource(R.drawable.baseline_message_24);
                homeImage.setImageResource(R.drawable.baseline_home_24);
                settingImage.setImageResource(R.drawable.baseline_settings_24);
                //set bg color
                int transparentColor = ContextCompat.getColor(MainActivity.this, android.R.color.transparent);
                messageLayout.setBackgroundColor(transparentColor);
                homeLayout.setBackgroundColor(transparentColor);
                settingLayout.setBackgroundColor(transparentColor);
                //selected home tab
                profileText.setVisibility(View.VISIBLE);
                profileImage.setImageResource(R.drawable.baseline_person_24_selected);
                profileLayout.setBackgroundResource(R.drawable.round_profile_100);
                //create animation
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1f, Animation.RELATIVE_TO_SELF, 0.0f);
                scaleAnimation.setDuration(200);
                scaleAnimation.setFillAfter(true);
                profileLayout.startAnimation(scaleAnimation);

                // set 1st tab as selected tab
                selectedTab = 3;

            }

        });
        //onClick to setting icon
        settingLayout.setOnClickListener(v -> {

            //set setting fragment
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainerId, SettingFragment.class, null)
                    .commit();

            // check if home is already selected or not.
            if (selectedTab != 4) {
                //unselected the other tabs expect home tab
                messageText.setVisibility(View.GONE);
                profileText.setVisibility(View.GONE);
                homeText.setVisibility(View.GONE);
                //set icons
                messageImage.setImageResource(R.drawable.baseline_message_24);
                profileImage.setImageResource(R.drawable.baseline_person_24);
                homeImage.setImageResource(R.drawable.baseline_home_24);
                //set bg color
                int transparentColor = ContextCompat.getColor(MainActivity.this, android.R.color.transparent);
                messageLayout.setBackgroundColor(transparentColor);
                profileLayout.setBackgroundColor(transparentColor);
                homeLayout.setBackgroundColor(transparentColor);
                //selected home tab
                settingText.setVisibility(View.VISIBLE);
                settingImage.setImageResource(R.drawable.baseline_settings_24_selected);
                settingLayout.setBackgroundResource(R.drawable.round_setting_100);
                //create animation
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1f, Animation.RELATIVE_TO_SELF, 0.0f);
                scaleAnimation.setDuration(200);
                scaleAnimation.setFillAfter(true);
                settingLayout.startAnimation(scaleAnimation);

                // set 1st tab as selected tab
                selectedTab = 4;

            }

        });
    }

    @Override
    public void onBackPressed() {
        // Check if the current fragment is the home fragment
        if (selectedTab == 1) {
            super.onBackPressed(); // Exit the app directly
        } else {
            // Navigate back to the home fragment
            homeLayout.performClick();
        }
    }
}