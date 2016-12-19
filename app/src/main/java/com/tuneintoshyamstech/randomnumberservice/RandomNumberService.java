package com.tuneintoshyamstech.randomnumberservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

import java.util.Random;

/**
 * Created by Shyam Prasad on 12/20/2016.
 */

public class RandomNumberService extends Service {

    public final IBinder mBinder = new MyBinder();
    private final Random mRNG = new Random();

    public final class MyBinder extends Binder{
        RandomNumberService getService(){
            return RandomNumberService.this;
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    public int getRandomNumber(){
        return mRNG.nextInt(250);
    }
}
