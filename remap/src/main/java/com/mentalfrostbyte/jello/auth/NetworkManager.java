// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.auth;

import com.mentalfrostbyte.Client;
import mapped.IRCManager;
import mapped.PremiumChecker;
import org.apache.commons.io.FileUtils;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.io.File;
import java.io.InputStream;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpEntity;
import java.util.List;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import java.util.ArrayList;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import java.util.UUID;
import org.apache.http.client.HttpClient;
import xd.PremiumJSONObject;

public class NetworkManager
{
    public HttpClient httpClient;
    public CaptchaChecker captcha;
    public Encryptor encryptor;
    public String mainURL;
    public String loginUrl;
    public String registerUrl;
    public String claimPremiumUrl;
    public String challengeUrl;
    public String session;
    public String token;
    public static boolean premium = false;
    public IRCManager IRCManager;
    
    public NetworkManager() {
        this.mainURL = "https://jelloprg.sigmaclient.info/";
        this.loginUrl = this.mainURL + "/login";
        this.registerUrl = this.mainURL + "/register";
        this.claimPremiumUrl = this.mainURL + "/claim_premium";
        this.challengeUrl = this.mainURL + "/challenge";
        this.token = UUID.randomUUID().toString().replaceAll("-", "");
        this.httpClient = HttpClients.createDefault();
    }
    
    public void init() {
        Client.getInstance().getEventBus().registerInstance(this);
        this.IRCManager = new IRCManager(this);
    }

    public String login(String var1, String var2, CaptchaChecker var3) {
        String error = "Unexpected error";

        try {
            HttpPost httpPost = new HttpPost(this.loginUrl);
            List<BasicNameValuePair> requests = new ArrayList<>();
            requests.add(new BasicNameValuePair("username", var1));
            requests.add(new BasicNameValuePair("password", var2));
            requests.add(new BasicNameValuePair("challengeUid", var3.getChallengeUid()));
            requests.add(new BasicNameValuePair("challengeAnswer", var3.getChallengeAnswer()));
            requests.add(new BasicNameValuePair("token", this.token));
            var3.method30473(false);
            httpPost.setEntity(new UrlEncodedFormEntity(requests, "UTF-8"));
            HttpResponse response = this.httpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String response_real;
                try (InputStream inputStream = entity.getContent()) {
                    String content = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
                    PremiumJSONObject json = new PremiumJSONObject(content);
                    if (json.getBoolean("success")) {
                        if (json.has("premium")) {
                            new Thread(new PremiumChecker(json.has("premium"))).start();
                        }

                        this.parse(json);
                        return null;
                    }

                    if (json.has("error")) {
                        error = json.getString("error");
                    }

                    response_real = error;
                }

                return response_real;
            }
        } catch (IOException exc) {
            error = exc .getMessage();
            exc.printStackTrace();
        }

        return error;
    }
    
    public void register(final String s, final String s2, String s3, final CaptchaChecker captchaChecker) {
        if (s3 == null) {
            s3 = "";
        }
        String s4 = "Unexpected error";
        try {
            final HttpPost httpPost = new HttpPost(this.registerUrl);
            final List<BasicNameValuePair> list = new ArrayList<>();
            list.add(new BasicNameValuePair("username", s));
            list.add(new BasicNameValuePair("password", s2));
            list.add(new BasicNameValuePair("email", s3));
            list.add(new BasicNameValuePair("challengeUid", captchaChecker.getChallengeUid()));
            list.add(new BasicNameValuePair("challengeAnswer", captchaChecker.getChallengeAnswer()));
            list.add(new BasicNameValuePair("token", this.token));
            captchaChecker.method30473(false);
            httpPost.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
            final HttpEntity entity = this.httpClient.execute(httpPost).getEntity();
            if (entity != null) {
                try (final InputStream content = entity.getContent()) {
                    final PremiumJSONObject json = new PremiumJSONObject(IOUtils.toString(content, StandardCharsets.UTF_8));
                    if (json.getBoolean("success")) {
                        this.parse(json);
                        return;
                    }
                    if (json.has("error")) {
                        s4 = json.getString("error");
                    }
                }
            }
        }
        catch (final IOException ex) {
            s4 = ex.getMessage();
            ex.printStackTrace();
        }
    }
    
    public String validate() {
        new Thread(new PremiumChecker(true)).start();
        return "Cracked";
    }
    
    public void loadLicense() {
        if (this.encryptor != null) {
            return;
        }
        final File file = new File("jello/jello.lic");
        if (file.exists()) {
            try {
                this.encryptor = new Encryptor(Files.readAllBytes(file.toPath()));
                if (this.encryptor.username == null || this.encryptor.username.isEmpty()) {
                    this.encryptor = null;
                }
                if (this.validate() != null) {
                    this.encryptor = null;
                }
                else {
                    Client.getLogger2().setThreadName("Logged in!");
                }
            }
            catch (final IOException ex) {}
        }
    }
    
    public String redeemPremium(final String s, final CaptchaChecker captchaChecker) {
        String s2 = "Unexpected error";
        try {
            final HttpPost httpPost = new HttpPost(this.claimPremiumUrl);
            final ArrayList list = new ArrayList();
            list.add(new BasicNameValuePair("key", s));
            list.add(new BasicNameValuePair("challengeUid", captchaChecker.getChallengeUid()));
            list.add(new BasicNameValuePair("challengeAnswer", captchaChecker.getChallengeAnswer()));
            list.add(new BasicNameValuePair("token", this.token));
            captchaChecker.method30473(false);
            httpPost.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
            final HttpEntity entity = this.httpClient.execute(httpPost).getEntity();
            if (entity != null) {
                try (final InputStream content = entity.getContent()) {
                    final PremiumJSONObject class8774 = new PremiumJSONObject(IOUtils.toString(content, StandardCharsets.UTF_8));
                    if (class8774.getBoolean("success")) {
                        this.parse(class8774);
                        return null;
                    }
                    if (class8774.has("error")) {
                        s2 = class8774.getString("error");
                    }
                    return s2;
                }
            }
        }
        catch (final IOException ex) {
            s2 = ex.getMessage();
            ex.printStackTrace();
        }
        return s2;
    }
    
    public CaptchaChecker getChallengeResponse() {
        if (this.captcha != null && this.captcha.isCompleted()) {
            return this.captcha;
        }
        try {
            final HttpPost httpPost = new HttpPost(this.challengeUrl);
            final List<BasicNameValuePair> list = new ArrayList<>();
            list.add(new BasicNameValuePair("token", this.token));
            httpPost.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
            final HttpEntity entity = this.httpClient.execute(httpPost).getEntity();
            if (entity != null) {
                try (final InputStream content = entity.getContent()) {
                    final PremiumJSONObject premiumJsonObject = new PremiumJSONObject(IOUtils.toString(content, StandardCharsets.UTF_8));
                    if (premiumJsonObject.getBoolean("success")) {
                        final String uid = premiumJsonObject.getString("uid");
                        boolean completed = false;

                        if (premiumJsonObject.has("captcha")) {
                            completed = premiumJsonObject.getBoolean("captcha");
                        }
                        this.captcha = new CaptchaChecker(uid, completed);
                        return this.captcha;
                    }
                    return null;
                }
            }
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public void parse(final totalcross.json.JSONObject JSONObject) {
        String username = null;
        String authToken = null;
        String agoraToken = null;
        if (JSONObject.has("username")) {
            username = JSONObject.getString("username");
        }
        if (JSONObject.has("auth_token")) {
            authToken = JSONObject.getString("auth_token");
        }
        if (JSONObject.has("agora_token")) {
            agoraToken = JSONObject.getString("agora_token");
        }
        if (authToken != null && username != null && agoraToken != null) {
            try {
                this.encryptor = new Encryptor(username, authToken, agoraToken);
                FileUtils.writeByteArrayToFile(new File("jello/jello.lic"), this.encryptor.encrypt());
            }
            catch (final IOException ex) {}
        }
        if (JSONObject.has("session")) {
            this.setSession(JSONObject.getString("session"));
        }
    }
    
    public void setSession(final String session) {
        if (!session.equals("error")) {
            this.session = session;
        }
        else {
            this.session = null;
        }
    }
    
    public Encryptor getEncryptor() {
        return this.encryptor;
    }
    
    public void resetLicense() {
        this.session = null;
        this.encryptor = null;
        premium = false;
        final File file = new File("jello/jello.lic");
        if (file.exists()) {
            file.delete();
        }
    }
    
    public String getSession() {
        return this.session;
    }
    
    public String getToken() {
        return this.token;
    }
    
    public boolean isPremium() {
        return premium;
    }
}
