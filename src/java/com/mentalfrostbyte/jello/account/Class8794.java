package com.mentalfrostbyte.jello.account;

import mapped.Class7730;
import mapped.Class7970;
import mapped.JSONObject;
import mapped.Minecraft;

import java.util.Calendar;
import java.util.Date;

public class Class8794 {
    private final String field39610;
    private final Date field39611;

    public Class8794(String var1, Date var2) {
        this.field39610 = var1;
        this.field39611 = var2;
    }

    public Class8794(JSONObject var1) {
        Calendar var4 = Calendar.getInstance();
        long var5 = 0L;
        if (!(var1.method21761("until") instanceof Integer)) {
            var5 = (Long) var1.method21761("until");
        } else {
            var5 = ((Integer) var1.method21761("until")).longValue();
        }

        if (var5 == 1L) {
            var5 = 9223372036854775806L;
        }

        var4.setTimeInMillis(var5);
        this.field39610 = var1.method21773("server");
        this.field39611 = var4.getTime();
    }

    public JSONObject method31733() {
        JSONObject var3 = new JSONObject();
        var3.method21806("server", this.field39610);
        var3.method21804("until", this.field39611.getTime());
        return var3;
    }

    public String method31734() {
        return this.field39610;
    }

    public Date method31735() {
        return this.field39611;
    }

    public Class7730 method31736() {
        Class7970 var3 = new Class7970(Minecraft.getInstance());
        var3.method27094();
        int var4 = var3.method27099();

        for (int var5 = 0; var5 < var4; var5++) {
            Class7730 var6 = var3.method27096(var5);
            if (var6.field33189.equals(this.field39610)) {
                return var6;
            }
        }

        return null;
    }
}
