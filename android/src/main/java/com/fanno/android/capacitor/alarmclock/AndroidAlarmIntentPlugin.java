package com.fanno.android.capacitor.alarmclock;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "AndroidAlarmIntent")
public class AndroidAlarmIntentPlugin extends Plugin {

    private AndroidAlarmIntent implementation = new AndroidAlarmIntent();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    @PluginMethod
    public void createAlarm(PluginCall call) {
        Integer hour = call.getInt("hour");
        Integer minute = call.getInt("minute");
        String message = call.getString("message");

        Boolean success = implementation.createAlarm(hour, minute, message, getContext());

        if (success) {
            JSObject ret = new JSObject();
            ret.put("success", true);
            call.resolve(ret);
        } else {
            JSObject ret = new JSObject();
            ret.put("success", false);
            call.reject(ret.toString());
        }
    }

    @PluginMethod
    public void createTimer(PluginCall call) {
        Integer duration = call.getInt("duration");
        String message = call.getString("message");

        Boolean success = implementation.createTimer(duration, message, getContext());

        if (success) {
            JSObject ret = new JSObject();
            ret.put("success", true);
            call.resolve(ret);
        } else {
            JSObject ret = new JSObject();
            ret.put("success", false);
            call.reject(ret.toString());
        }
    }
}
