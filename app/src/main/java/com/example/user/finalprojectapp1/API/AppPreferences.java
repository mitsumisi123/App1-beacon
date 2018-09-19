package com.example.user.finalprojectapp1.API;

import android.content.Context;
import android.content.SharedPreferences;



import com.example.user.finalprojectapp1.Model.SessionModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class AppPreferences {
    private final String APP_NAME = "app_name";
    private final String SESSION = "session";
    private final String DEVICE_NAME = "device_name";


    private static  AppPreferences instance;
    private Context context;
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;


    public AppPreferences(Context context) {
        this.context = context;
        pref = context.getSharedPreferences(APP_NAME, Context.MODE_PRIVATE);
        editor = pref.edit();
    }

    public static AppPreferences getInstance(Context context){
        if(instance == null) instance = new AppPreferences(context);
        return instance;
    }
    // -------------------------------------------------------------------------------------------------


    // get Session from local db for use
    public SessionModel getSession(){
        String get_session = pref.getString(SESSION,"");
        SessionModel sessionModel = new Gson().fromJson(get_session, new TypeToken<SessionModel>(){}.getType()); // model

        return sessionModel;
    }

    // use for save session in local db for use
    public void setSession(SessionModel sessionModel) {
        String session_text = new Gson().toJson(sessionModel);
        editor.putString(SESSION,session_text);//save data to string
        editor.commit();
    }

    public String getDeviceName(){
        String get_device_name = pref.getString(DEVICE_NAME,"");
        return get_device_name;
    }

    // use for save session in local db for use
    public void setDeviceName(String deviceName) {
        editor.putString(DEVICE_NAME,deviceName);//save data to string
        editor.commit();
    }



    ///////////////////////////

    public void clear(){
        editor.remove(SESSION);
        editor.commit();
    }
}
