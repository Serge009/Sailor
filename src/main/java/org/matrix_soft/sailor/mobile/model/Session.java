package org.matrix_soft.sailor.mobile.model;

//import android.content.Context;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import com.sezyakot.android.sailorapp.sailor.system.Preferences;

public class Session {
    @Expose
    @SerializedName("session") protected String mSession;

    public Session() {};

    /*public Session(Context c) {
        Preferences preferences = new Preferences(c);
        mSession = preferences.getSessionId();
    };*/


    public String getSession() {
        return mSession;
    }

    public void setSession(String session) {
        this.mSession = session;
    }

   /* protected void setSession(Context c) {
        Preferences preferences = new Preferences(c);
        mSession = preferences.getSessionId();
    }*/
}
