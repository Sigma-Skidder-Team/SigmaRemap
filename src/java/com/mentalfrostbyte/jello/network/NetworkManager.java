package com.mentalfrostbyte.jello.network;

import club.minnced.discord.rpc.DiscordRPC;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.unmapped.CombatTracker;

public class NetworkManager {
    public static boolean premium = false;
    public Class9507 field38418;
    public Account account;
    public String field38425;
    public CombatTracker field38429;

    public NetworkManager() {

    }

    public void init() {
        Client.getInstance().getEventManager().register(this);
        this.field38429 = new CombatTracker(this);
    }

    public String newAccount(String var1, String var2, Class9507 var3) {
        NetworkManager.premium = false;
        this.account = getNewAccount(var1);
        return null;
    }

    public String method30448(String var1, String var2, String var3, Class9507 var4) {
        return "register #1";
    }

    public String redeemPremium(String var1, Class9507 var2) {
        NetworkManager.premium = true;

        Client.getInstance().getDRPC().smallImageKey = "premium";
        Client.getInstance().getDRPC().smallImageText = "Premium";
        DiscordRPC.INSTANCE.Discord_UpdatePresence(Client.getInstance().getDRPC());
        return "Redeemed premium successfully!";
    }

    public Class9507 method30452() {
        if (this.field38418 != null && this.field38418.method36703()) {
            return this.field38418;
        } else {
            this.field38418 = new Class9507("001"/*, false*/);
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
