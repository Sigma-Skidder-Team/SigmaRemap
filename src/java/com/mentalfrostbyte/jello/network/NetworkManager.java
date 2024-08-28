package com.mentalfrostbyte.jello.network;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.unmapped.Class1550;
import com.mentalfrostbyte.jello.unmapped.Class7030;
import com.mentalfrostbyte.jello.unmapped.Class8402;
import mapped.JSONObject;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.UUID;

public class NetworkManager {
    public static boolean premium = true;
    public static boolean field38428 = false;
    public HttpClient field38417;
    public Class9507 field38418;
    public Class8248 field38419;
    public String baseUrl = "https://jelloprg.sigmaclient.info/";
    public String field38421 = this.baseUrl + "/login";
    public String field38422 = this.baseUrl + "/register";
    public String field38423 = this.baseUrl + "/claim_premium";
    public String field38424 = this.baseUrl + "/challenge";
    public String field38425;
    public String field38426 = UUID.randomUUID().toString().replaceAll("-", "");
    public Class8402 field38429;

    public NetworkManager() {
        this.field38417 = HttpClients.createDefault();
        if (!premium) {
        }
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
        if (var3 == null) {
            var3 = "";
        }

        String var7 = "Unexpected error";

        try {
            HttpPost var8 = new HttpPost(this.field38422);
            ArrayList var9 = new ArrayList();
            var9.add(new BasicNameValuePair("username", var1));
            var9.add(new BasicNameValuePair("password", var2));
            var9.add(new BasicNameValuePair("email", var3));
            var9.add(new BasicNameValuePair("challengeUid", var4.method36707()));
            var9.add(new BasicNameValuePair("challengeAnswer", var4.method36705()));
            var9.add(new BasicNameValuePair("token", this.field38426));
            var4.method36704(false);
            var8.setEntity(new UrlEncodedFormEntity(var9, "UTF-8"));
            HttpResponse var10 = this.field38417.execute(var8);
            HttpEntity var11 = var10.getEntity();
            if (var11 != null) {
                String var16;
                try (InputStream var12 = var11.getContent()) {
                    String var14 = IOUtils.toString(var12, "UTF-8");
                    Class7030 var15 = new Class7030(var14);
                    if (var15.method21763("success")) {
                        this.method30453(var15);
                        return null;
                    }

                    if (var15.has("error")) {
                        var7 = var15.method21773("error");
                    }

                    var16 = var7;
                }

                return var16;
            }
        } catch (IOException var29) {
            var7 = var29.getMessage();
            var29.printStackTrace();
        }

        return var7;
    }

    public String method30449() {
        String var3 = "Unexpected error";

        try {
            HttpPost var4 = new HttpPost(this.field38421);
            ArrayList var5 = new ArrayList();
            var5.add(new BasicNameValuePair("auth_token", this.field38419.field35441));
            var5.add(new BasicNameValuePair("token", this.field38426));
            var4.setEntity(new UrlEncodedFormEntity(var5, "UTF-8"));
            HttpResponse var6 = this.field38417.execute(var4);
            HttpEntity var7 = var6.getEntity();
            if (var7 != null) {
                String var12;
                try (InputStream var8 = var7.getContent()) {
                    String var10 = IOUtils.toString(var8, "UTF-8");
                    Class7030 var11 = new Class7030(var10);
                    if (var11.method21763("success")) {
                        if (var11.has("premium")) {
                            new Thread(new Class1550(var11.method21763("premium"))).start();
                        }

                        this.method30453(var11);
                        return null;
                    }

                    if (var11.has("error")) {
                        var3 = var11.method21773("error");
                    }

                    var12 = var3;
                }

                return var12;
            }
        } catch (IOException var25) {
            var3 = var25.getMessage();
            var25.printStackTrace();
        }

        return var3;
    }

    public void method30450() {
        if (this.field38419 == null) {
            File var3 = new File("jello/jello.lic");
            if (var3.exists()) {
                try {
                    byte[] var4 = Files.readAllBytes(var3.toPath());
                    this.field38419 = new Class8248(var4);
                    if (this.field38419.field35440 == null || this.field38419.field35440.length() == 0) {
                        this.field38419 = null;
                    }

                    if (this.method30449() != null) {
                        this.field38419 = null;
                    }
                } catch (IOException var5) {
                }
            }
        }
    }

    public String method30451(String var1, Class9507 var2) {
        String var5 = "Unexpected error";

        try {
            HttpPost var6 = new HttpPost(this.field38423);
            ArrayList var7 = new ArrayList();
            var7.add(new BasicNameValuePair("key", var1));
            var7.add(new BasicNameValuePair("challengeUid", var2.method36707()));
            var7.add(new BasicNameValuePair("challengeAnswer", var2.method36705()));
            var7.add(new BasicNameValuePair("token", this.field38426));
            var2.method36704(false);
            var6.setEntity(new UrlEncodedFormEntity(var7, "UTF-8"));
            HttpResponse var8 = this.field38417.execute(var6);
            HttpEntity var9 = var8.getEntity();
            if (var9 != null) {
                String var14;
                try (InputStream var10 = var9.getContent()) {
                    String var12 = IOUtils.toString(var10, "UTF-8");
                    Class7030 var13 = new Class7030(var12);
                    if (var13.method21763("success")) {
                        this.method30453(var13);
                        return null;
                    }

                    if (var13.has("error")) {
                        var5 = var13.method21773("error");
                    }

                    var14 = var5;
                }

                return var14;
            }
        } catch (IOException var27) {
            var5 = var27.getMessage();
            var27.printStackTrace();
        }

        return var5;
    }

    public Class9507 method30452() {
        if (this.field38418 != null && this.field38418.method36703()) {
            return this.field38418;
        } else {
           /* try {
                HttpPost var3 = new HttpPost(this.field38424);
                ArrayList var4 = new ArrayList();
                var4.add(new BasicNameValuePair("token", this.field38426));
                var3.setEntity(new UrlEncodedFormEntity(var4, "UTF-8"));
                HttpResponse var5 = this.field38417.execute(var3);
                HttpEntity var6 = var5.getEntity();
                if (var6 != null) {
                    Class9507 var13;
                    try (InputStream var7 = var6.getContent()) {
                        String var9 = IOUtils.toString(var7, "UTF-8");
                        Class7030 var10 = new Class7030(var9);
                        if (!var10.method21763("success")) {
                            return null;
                        }

                        String var11 = var10.method21773("uid");
                        boolean var12 = false;
                        if (var10.has("captcha")) {
                            var12 = var10.method21763("captcha");
                        }

                        this.field38418 = new Class9507(var11, var12);
                        var13 = this.field38418;
                    }

                    return var13;
                }
            } catch (IOException var26) {
                var26.printStackTrace();
            }

            return null;*/

            this.field38418 = new Class9507("001", false);
            return this.field38418;
        }
    }

    public void method30453(JSONObject var1) {
        String var4 = null;
        String var5 = null;
        String var6 = null;
        if (var1.has("username")) {
            var5 = var1.method21773("username");
        }

        if (var1.has("auth_token")) {
            var4 = var1.method21773("auth_token");
        }

        if (var1.has("agora_token")) {
            var6 = var1.method21773("agora_token");
        }

        if (var4 != null && var5 != null && var6 != null) {
            try {
                this.field38419 = new Class8248(var5, var4, var6);
                FileUtils.writeByteArrayToFile(new File("jello/jello.lic"), this.field38419.method28761());
            } catch (IOException var8) {
            }
        }

        if (var1.has("session")) {
            this.method30454(var1.method21773("session"));
        }
    }

    public void method30454(String var1) {
        if (!var1.equals("error")) {
            this.field38425 = var1;
        } else {
            this.field38425 = null;
        }
    }

    public Class8248 method30455() {
        return this.field38419;
    }

    public void method30456() {
        this.field38425 = null;
        this.field38419 = null;
        premium = false;
        File var3 = new File("jello/jello.lic");
        if (var3.exists()) {
            var3.delete();
        }
    }

    public String method30457() {
        return this.field38425;
    }

    public String method30458() {
        return "User";
    }

    public String method30459() {
        return this.field38426;
    }

    public boolean isPremium() {
        return premium;
    }
}
