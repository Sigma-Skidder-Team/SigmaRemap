package com.mentalfrostbyte.jello.account;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.util.FileUtil;
import com.mojang.authlib.exceptions.AuthenticationException;
import mapped.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class AccountManager {
    public ArrayList<Account> field44312 = new ArrayList<Account>();
    public File field44313 = new File(Client.getInstance().getFile() + "/alts.json");
    private String field44314;
    private final Class8606 field44315 = new Class8606();

    public AccountManager() {
        this.method36777();
    }

    public void method36766() {
        Client.getInstance().getEventManager().register(this);
        Client.getInstance().getEventManager().register(this.field44315);
    }

    @Deprecated
    public void method36767(Account var1) {
        this.field44312.add(var1);
    }

    public void method36768(Account var1) {
        for (int var4 = 0; var4 < this.field44312.size(); var4++) {
            if (this.field44312.get(var4).method34216().equals(var1.method34216())) {
                this.field44312.set(var4, var1);
                return;
            }
        }

        this.field44312.add(var1);
    }

    public void method36769(Account var1) {
        for (int var4 = 0; var4 < this.field44312.size(); var4++) {
            if (this.field44312.get(var4).method34216().equals(var1.method34216())) {
                this.field44312.remove(var4);
                return;
            }
        }
    }

    public boolean method36770(Account var1) {
        for (int var4 = 0; var4 < this.field44312.size(); var4++) {
            if (this.field44312.get(var4).method34216().equals(var1.method34216())) {
                return true;
            }
        }

        return false;
    }

    public Account method36771() {
        for (Account var4 : this.field44312) {
            if (var4.method34216().equals(this.field44314)) {
                return var4;
            }
        }

        return null;
    }

    public boolean method36772(Account var1) {
        try {
            Class806.field4268 = null;
            Class6974 var4 = Minecraft.getInstance().field1293;
            Class6974 var5 = var1.method34231();
            var4.field30184 = var5.method21526();
            var4.field30185 = var5.method21525();
            var4.field30186 = var5.method21527();
            this.field44314 = var1.method34216();
            return true;
        } catch (AuthenticationException var6) {
            return false;
        }
    }

    public boolean method36773(Account var1) {
        try {
            var1.method34231();
            this.field44314 = var1.method34216();
            return true;
        } catch (AuthenticationException var5) {
            return false;
        }
    }

    public void method36774(Account var1) {
        this.field44312.remove(var1);
    }

    public ArrayList<Account> method36775() {
        return this.field44312;
    }

    public void method36776() {
        Class2344 var3 = new Class2344();

        for (Account var5 : this.field44312) {
            var3.method9158(var5.method34232());
        }

        JSONObject var7 = new JSONObject();
        var7.method21806("alts", var3);

        try {
            FileUtil.method18362(var7, new File(Client.getInstance().getFile() + "/alts.json"));
        } catch (IOException | Class2499 var6) {
            Client.getInstance().getLogger().method20358(var6.getMessage());
        }
    }

    private void method36777() {
        try {
            JSONObject var3 = FileUtil.method18363(this.field44313);
            if (!var3.has("alts")) {
                var3.method21806("alts", new Class2344());
            }

            for (Object var5 : var3.method21768("alts")) {
                this.field44312.add(new Account((JSONObject) var5));
            }
        } catch (IOException var6) {
            Client.getInstance().getLogger().method20358(var6.getMessage());
        }
    }

    public String method36778() {
        return this.field44314;
    }

    public boolean method36779(Account var1) {
        return this.method36778() != null
                ? var1.method34216().equals(this.method36778())
                : var1.method34217().equals(Minecraft.getInstance().method1533().method21526());
    }
}
