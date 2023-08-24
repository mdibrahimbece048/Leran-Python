package com.example.learnpython;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class recyclerBasicActivity extends AppCompatActivity {

    Intent iNext;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_basic);

        MobileAds.initialize(this);

        AdRequest adRequest=new AdRequest.Builder().build();

        InterstitialAd.load(this, getString(R.string.interstitial_ad_unit), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                super.onAdLoaded(interstitialAd);
                mInterstitialAd=interstitialAd;
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {


                    @Override
                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();

                        // call the function when ad is dismissed

                    }
                    @Override
                    public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                        super.onAdFailedToShowFullScreenContent(adError);
                    }
                    @Override
                    public void onAdImpression() {
                        super.onAdImpression();
                    }
                    @Override
                    public void onAdShowedFullScreenContent() {
                        super.onAdShowedFullScreenContent();
                        // setting mInterstitialAd=null,because mInterstitial already loaded
                        mInterstitialAd=null;
                    }
                });
            }
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError){
                super.onAdFailedToLoad(loadAdError);
                Log.e("Error",loadAdError.toString());
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (mInterstitialAd!=null)
                    mInterstitialAd.show(recyclerBasicActivity.this);
                else
                    Log.e("AdPending","Ad is not ready yet");
            }
        },10000);


    }


    public void button(View view){

        int id;
        //1
        Button buttonCurrent=(Button) view;
        id=buttonCurrent.getId();
        if (id==R.id.b1b){
            iNext=new Intent(getApplicationContext(), theoryofintroduction.class);
            startActivity(iNext);
        } else if (id==R.id.b2b) {

            iNext=new Intent(getApplicationContext(), firstprogram.class);
            startActivity(iNext);
        } else if (id==R.id.b3b) {
            iNext=new Intent(getApplicationContext(), variables.class);
            startActivity(iNext);

        }
        else if (id==R.id.b4b){
            iNext=new Intent(getApplicationContext(), userInput.class);
            startActivity(iNext);
        } else if (id==R.id.b5b) {
            iNext=new Intent(getApplicationContext(), keyword.class);
            startActivity(iNext);
        } else if (id==R.id.b6b) {
            iNext=new Intent(getApplicationContext(), operators.class);
            startActivity(iNext);
        }
        else if (id==R.id.b7b){
            iNext=new Intent(getApplicationContext(), dataType.class);
            startActivity(iNext);
        } else if (id==R.id.b8b) {
            iNext=new Intent(getApplicationContext(), comments.class);
            startActivity(iNext);

        }
        else if (id==R.id.b9b) {
            iNext=new Intent(getApplicationContext(), If.class);
            startActivity(iNext);

        }
        else if (id==R.id.b10b) {
            iNext=new Intent(getApplicationContext(), If_Else.class);
            startActivity(iNext);

        }
        else if (id==R.id.b11b) {
            iNext=new Intent(getApplicationContext(), If_Else_Ladder.class);
            startActivity(iNext);

        }
        else if (id==R.id.b12b) {
            iNext=new Intent(getApplicationContext(), Nested_If.class);
            startActivity(iNext);

        }
        else if (id==R.id.b13b) {
            iNext=new Intent(getApplicationContext(), For_Loop.class);
            startActivity(iNext);

        }
        else if (id==R.id.b14b) {
            iNext=new Intent(getApplicationContext(), While_Loop.class);
            startActivity(iNext);

        }
        else if (id==R.id.b15b) {
            iNext=new Intent(getApplicationContext(), Jump_statement.class);
            startActivity(iNext);

        } else if (id==R.id.b16b) {
            iNext = new Intent(getApplicationContext(), Lists.class);
            startActivity(iNext);
        }
        else if (id==R.id.b17b) {
            iNext=new Intent(getApplicationContext(), List_Function.class);
            startActivity(iNext);

        }
        else if (id==R.id.b18b) {
            iNext=new Intent(getApplicationContext(), List_Method.class);
            startActivity(iNext);

        }
        else if (id==R.id.b19b) {
            iNext=new Intent(getApplicationContext(), sets.class);
            startActivity(iNext);

        }
        else if (id==R.id.b20b) {
            iNext=new Intent(getApplicationContext(), tuples.class);
            startActivity(iNext);

        }
        else if (id==R.id.b21b) {
            iNext=new Intent(getApplicationContext(), Tuple_Function.class);
            startActivity(iNext);

        }
        else if (id==R.id.b22b) {
            iNext=new Intent(getApplicationContext(), Dicstionaries.class);
            startActivity(iNext);

        }
        else if (id==R.id.b23b) {
            iNext=new Intent(getApplicationContext(), String.class);
            startActivity(iNext);

        }
        else if (id==R.id.b24b) {
            iNext=new Intent(getApplicationContext(), string_method.class);
            startActivity(iNext);

        }
        else if (id==R.id.b25b) {
            iNext=new Intent(getApplicationContext(), function.class);
            startActivity(iNext);

        }
        else if (id==R.id.b26b) {
            iNext=new Intent(getApplicationContext(), math_function.class);
            startActivity(iNext);

        }
        else if (id==R.id.b131b) {
            iNext=new Intent(getApplicationContext(), rangebasic.class);
            startActivity(iNext);

        }
        else {
            iNext=new Intent(getApplicationContext(), DateAndTime.class);
            startActivity(iNext);
        }
    }

    private void showInterstitialAd() {
        if (mInterstitialAd != null) {
            mInterstitialAd.show(this);
        }
    }
}