package com.mentalfrostbyte.jello.account;

import mapped.ServerData;
import mapped.Class7970;
import totalcross.json.JSONObject;
import net.minecraft.client.Minecraft;

import java.util.Calendar;
import java.util.Date;

public class Ban {
    private final String serverIP;
    private final Date field39611;

    public Ban(String var1, Date var2) {
        this.serverIP = var1;
        this.field39611 = var2;
    }

    public Ban(JSONObject var1) {
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
        this.serverIP = var1.method21773("server");
        this.field39611 = var4.getTime();
    }

    public JSONObject asJSONObject() {
        JSONObject var3 = new JSONObject();
        var3.put("server", this.serverIP);
        var3.put("until", this.field39611.getTime());
        return var3;
    }

    public String getServerIP() {
        return this.serverIP;
    }

    public Date method31735() {
        return this.field39611;
    }

    public ServerData method31736() {
        Class7970 var3 = new Class7970(Minecraft.getInstance());
        var3.method27094();
        int var4 = var3.method27099();

        for (int var5 = 0; var5 < var4; var5++) {
            ServerData var6 = var3.method27096(var5);
            if (var6.field33189.equals(this.serverIP)) {
                return var6;
            }
        }

        return null;
    }
}
