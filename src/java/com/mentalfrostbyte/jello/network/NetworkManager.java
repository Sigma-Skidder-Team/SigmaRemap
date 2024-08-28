package com.mentalfrostbyte.jello.network;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.unmapped.Class8402;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

public class NetworkManager {
    public static boolean premium = true;
    public HttpClient httpClient;
    public Class9507 field38418;
    public Account account;
    public String field38425;
    public Class8402 field38429;

    public NetworkManager() {
        this.httpClient = HttpClients.createDefault();
    }

    public void init() {
        Client.getInstance().getEventManager().register(this);
        this.field38429 = new Class8402(this);
    }

    public String method30447(String var1, String var2, Class9507 var3) {
        String var6 = "Unexpected error";
        NetworkManager.premium = true;
        return null;
    }

    public String method30448(String var1, String var2, String var3, Class9507 var4) {
        String var7 = "Unexpected error";
        return var7;
    }

    public String method30451(String var1, Class9507 var2) {
        String var5 = "Unexpected error";
        return var5;
    }

    public Class9507 method30452() {
        if (this.field38418 != null && this.field38418.method36703()) {
            return this.field38418;
        } else {
            this.field38418 = new Class9507("001", false);
            return this.field38418;
        }
    }

    public Account getNewAccount(String username) {
        return new Account(username, "1", "2");
    }

    public boolean isPremium() {
        return premium;
    }
}
