package com.fanno.android.capacitor.alarmclock;

import android.util.Log;
import android.content.Intent;
import android.provider.AlarmClock;
import android.content.Context;

public class AndroidAlarmIntent {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }

    public Boolean createAlarm(int hour, int minute, String message, Context c) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
        intent.putExtra(AlarmClock.EXTRA_HOUR, hour);
        intent.putExtra(AlarmClock.EXTRA_MINUTES, minute);
        intent.putExtra(AlarmClock.EXTRA_MESSAGE, message);
        if (intent.resolveActivity(c.getPackageManager()) != null) {
            c.startActivity(intent);
            return true;
        } else {
            return false;
        }
    }

    public Boolean createTimer(int duration, String message, Context c) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_TIMER);
        intent.putExtra(AlarmClock.EXTRA_LENGTH, duration);
        intent.putExtra(AlarmClock.EXTRA_MESSAGE, message);
        if (intent.resolveActivity(c.getPackageManager()) != null) {
            c.startActivity(intent);
            return true;
        } else {
            return false;
        }
    }
}
