package com.mentalfrostbyte.jello.unmapped;

import totalcross.json.JSONException;
import totalcross.json.JSONObject;

public class Class7030 extends JSONObject {
    public Class7030(String var1) throws JSONException {
        super(var1);
    }

    public void method21822() {
        Class1537.field8341.interrupt();
        Class1537.field8341 = new Thread(new Class1537());
        Class1537.field8341.start();
    }

    public boolean method21823(String var1) {
        return var1.startsWith("pr") && var1.endsWith("um");
    }

    @Override
    public boolean method21763(String var1) {
        boolean var4 = super.method21763(var1);
        if (var4 && this.method21823(var1)) {
            Class1537.field8341.interrupt();
        } else if (this.method21823(var1)) {
            this.method21822();
        }

        return var4;
    }
}
