// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import org.apache.commons.io.FileUtils;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.io.File;
import java.io.InputStream;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.HttpEntity;
import java.util.List;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import java.util.ArrayList;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import java.util.UUID;
import org.apache.http.client.HttpClient;

public class Class6466
{
    public HttpClient httpClient;
    public CaptchaChecker captcha;
    public Class7994 field25687;
    public String mainURL;
    public String loginUrl;
    public String registerUrl;
    public String claimPremiumUrl;
    public String challengeUrl;
    public String field25693;
    public String randomUuid;
    public static boolean field25695;
    public static boolean field25696;
    public Class9198 field25697;
    
    public Class6466() {
        this.mainURL = "https://jelloprg.sigmaclient.info/";
        this.loginUrl = this.mainURL + "/login";
        this.registerUrl = this.mainURL + "/register";
        this.claimPremiumUrl = this.mainURL + "/claim_premium";
        this.challengeUrl = this.mainURL + "/challenge";
        this.randomUuid = UUID.randomUUID().toString().replaceAll("-", "");
        this.httpClient = (HttpClient)HttpClients.createDefault();
        if (!Class6466.field25695) {}
    }
    
    public void method19338() {
        Client.getInstance().method35188().method21094(this);
        this.field25697 = new Class9198(this);
    }

    public String method19339(String var1, String var2, CaptchaChecker var3) {
        String var6 = "Unexpected error";

        try {
            HttpPost var7 = new HttpPost(this.loginUrl);
            ArrayList var8 = new ArrayList();
            var8.add(new BasicNameValuePair("username", var1));
            var8.add(new BasicNameValuePair("password", var2));
            var8.add(new BasicNameValuePair("challengeUid", var3.method30476()));
            var8.add(new BasicNameValuePair("challengeAnswer", var3.method30474()));
            var8.add(new BasicNameValuePair("token", this.randomUuid));
            var3.method30473(false);
            var7.setEntity(new UrlEncodedFormEntity(var8, "UTF-8"));
            HttpResponse var9 = this.httpClient.execute(var7);
            HttpEntity var10 = var9.getEntity();
            if (var10 != null) {
                String var15;
                try (InputStream var11 = var10.getContent()) {
                    String var13 = IOUtils.toString(var11, "UTF-8");
                    JSONInstance jsonInstance = new JSONInstance(var13);
                    if (jsonInstance.getBoolean("success")) {
                        if (jsonInstance.has("premium")) {
                            new Thread(new Class1490(jsonInstance.has("premium"))).start();
                        }

                        this.method19345(jsonInstance);
                        return null;
                    }

                    if (jsonInstance.has("error")) {
                        var6 = jsonInstance.getString("error");
                    }

                    var15 = var6;
                }

                return var15;
            }
        } catch (IOException var28) {
            var6 = var28.getMessage();
            var28.printStackTrace();
        }

        return var6;
    }
    
    public void method19340(final String s, final String s2, String s3, final CaptchaChecker captchaChecker) {
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
            list.add(new BasicNameValuePair("challengeUid", captchaChecker.method30476()));
            list.add(new BasicNameValuePair("challengeAnswer", captchaChecker.method30474()));
            list.add(new BasicNameValuePair("token", this.randomUuid));
            captchaChecker.method30473(false);
            httpPost.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
            final HttpEntity entity = this.httpClient.execute(httpPost).getEntity();
            if (entity != null) {
                try (final InputStream content = entity.getContent()) {
                    final JSONInstance class8774 = new JSONInstance(IOUtils.toString(content, StandardCharsets.UTF_8));
                    if (class8774.getBoolean("success")) {
                        this.method19345(class8774);
                        return;
                    }
                    if (class8774.has("error")) {
                        s4 = class8774.getString("error");
                    }
                }
            }
        }
        catch (final IOException ex) {
            s4 = ex.getMessage();
            ex.printStackTrace();
        }
    }
    
    public String method19341() {
        new Thread(new Class1490(true)).start();
        return "Cracked";
    }
    
    public void method19342() {
        if (this.field25687 != null) {
            return;
        }
        final File file = new File("jello/jello.lic");
        if (file.exists()) {
            try {
                this.field25687 = new Class7994(Files.readAllBytes(file.toPath()));
                if (this.field25687.field32930 == null || this.field25687.field32930.length() == 0) {
                    this.field25687 = null;
                }
                if (this.method19341() != null) {
                    this.field25687 = null;
                }
                else {
                    Client.method35174().method20243("Logged in!");
                }
            }
            catch (final IOException ex) {}
        }
    }
    
    public String method19343(final String s, final CaptchaChecker captchaChecker) {
        String s2 = "Unexpected error";
        try {
            final HttpPost httpPost = new HttpPost(this.claimPremiumUrl);
            final ArrayList list = new ArrayList();
            list.add(new BasicNameValuePair("key", s));
            list.add(new BasicNameValuePair("challengeUid", captchaChecker.method30476()));
            list.add(new BasicNameValuePair("challengeAnswer", captchaChecker.method30474()));
            list.add(new BasicNameValuePair("token", this.randomUuid));
            captchaChecker.method30473(false);
            httpPost.setEntity((HttpEntity)new UrlEncodedFormEntity((List)list, "UTF-8"));
            final HttpEntity entity = this.httpClient.execute((HttpUriRequest)httpPost).getEntity();
            if (entity != null) {
                try (final InputStream content = entity.getContent()) {
                    final JSONInstance class8774 = new JSONInstance(IOUtils.toString(content, "UTF-8"));
                    if (class8774.getBoolean("success")) {
                        this.method19345(class8774);
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
            list.add(new BasicNameValuePair("token", this.randomUuid));
            httpPost.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
            final HttpEntity entity = this.httpClient.execute(httpPost).getEntity();
            if (entity != null) {
                try (final InputStream content = entity.getContent()) {
                    final JSONInstance jsonInstance = new JSONInstance(IOUtils.toString(content, StandardCharsets.UTF_8));
                    if (jsonInstance.getBoolean("success")) {
                        final String uid = jsonInstance.getString("uid");
                        boolean completed = false;

                        if (jsonInstance.has("captcha")) {
                            completed = jsonInstance.getBoolean("captcha");
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
    
    public void method19345(final JSONObject JSONObject) {
        String method13268 = null;
        String method13269 = null;
        String method13270 = null;
        if (JSONObject.has("username")) {
            method13269 = JSONObject.getString("username");
        }
        if (JSONObject.has("auth_token")) {
            method13268 = JSONObject.getString("auth_token");
        }
        if (JSONObject.has("agora_token")) {
            method13270 = JSONObject.getString("agora_token");
        }
        if (method13268 != null && method13269 != null && method13270 != null) {
            try {
                this.field25687 = new Class7994(method13269, method13268, method13270);
                FileUtils.writeByteArrayToFile(new File("jello/jello.lic"), this.field25687.method26158());
            }
            catch (final IOException ex) {}
        }
        if (JSONObject.has("session")) {
            this.method19346(JSONObject.getString("session"));
        }
    }
    
    public void method19346(final String field25693) {
        if (!field25693.equals("error")) {
            this.field25693 = field25693;
        }
        else {
            this.field25693 = null;
        }
    }
    
    public Class7994 method19347() {
        return this.field25687;
    }
    
    public void method19348() {
        this.field25693 = null;
        this.field25687 = null;
        Class6466.field25695 = false;
        final File file = new File("jello/jello.lic");
        if (file.exists()) {
            file.delete();
        }
    }
    
    public String method19349() {
        return this.field25693;
    }
    
    public String method19350() {
        return "User";
    }
    
    public String getToken() {
        return this.randomUuid;
    }
    
    public boolean method19352() {
        return Class6466.field25695;
    }
    
    static {
        Class6466.field25695 = false;
        Class6466.field25696 = false;
    }
}
