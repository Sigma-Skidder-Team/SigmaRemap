package com.mentalfrostbyte.jello.account;

import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerList;
import totalcross.json.JSONException;
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

    public Ban(JSONObject var1) throws JSONException {
        Calendar var4 = Calendar.getInstance();
        long var5 = 0L;
        if (!(var1.get("until") instanceof Integer)) {
            var5 = (Long) var1.get("until");
        } else {
            var5 = ((Integer) var1.get("until")).longValue();
        }

        if (var5 == 1L) {
            var5 = 9223372036854775806L;
        }

        var4.setTimeInMillis(var5);
        this.serverIP = var1.getString("server");
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
        ServerList var3 = new ServerList(Minecraft.getInstance());
        var3.loadServerList();
        int var4 = var3.countServers();

        for (int var5 = 0; var5 < var4; var5++) {
            ServerData var6 = var3.getServerData(var5);
            if (var6.serverIP.equals(this.serverIP)) {
                return var6;
            }
        }

        return null;
    }
}
