// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.io.FileUtils;
import java.nio.file.Files;
import java.io.File;
import java.io.InputStream;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
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
    public HttpClient field25685;
    public Class8773 field25686;
    public Class7994 field25687;
    public String field25688;
    public String field25689;
    public String field25690;
    public String field25691;
    public String field25692;
    public String field25693;
    public String field25694;
    public static boolean field25695;
    public static boolean field25696;
    public Class9198 field25697;
    
    public Class6466() {
        this.field25688 = "https://jelloprg.sigmaclient.info/";
        this.field25689 = this.field25688 + "/login";
        this.field25690 = this.field25688 + "/register";
        this.field25691 = this.field25688 + "/claim_premium";
        this.field25692 = this.field25688 + "/challenge";
        this.field25694 = UUID.randomUUID().toString().replaceAll("-", "");
        this.field25685 = (HttpClient)HttpClients.createDefault();
        if (!Class6466.field25695) {}
    }
    
    public void method19338() {
        Class9463.method35173().method35188().method21094(this);
        this.field25697 = new Class9198(this);
    }
    
    public String method19339(final String s, final String s2, final Class8773 class8773) {
        new Thread(new Class1490(true)).start();
        return "Cracked";
    }
    
    public String method19340(final String s, final String s2, String s3, final Class8773 class8773) {
        if (s3 == null) {
            s3 = "";
        }
        String s4 = "Unexpected error";
        try {
            final HttpPost httpPost = new HttpPost(this.field25690);
            final ArrayList list = new ArrayList();
            list.add(new BasicNameValuePair("username", s));
            list.add(new BasicNameValuePair("password", s2));
            list.add(new BasicNameValuePair("email", s3));
            list.add(new BasicNameValuePair("challengeUid", class8773.method30476()));
            list.add(new BasicNameValuePair("challengeAnswer", class8773.method30474()));
            list.add(new BasicNameValuePair("token", this.field25694));
            class8773.method30473(false);
            httpPost.setEntity((HttpEntity)new UrlEncodedFormEntity((List)list, "UTF-8"));
            final HttpEntity entity = this.field25685.execute((HttpUriRequest)httpPost).getEntity();
            if (entity != null) {
                try (final InputStream content = entity.getContent()) {
                    final Class4404 class8774 = new Class4404(IOUtils.toString(content, "UTF-8"));
                    if (class8774.method13253("success")) {
                        this.method19345(class8774);
                        return null;
                    }
                    if (class8774.method13269("error")) {
                        s4 = class8774.method13268("error");
                    }
                    return s4;
                }
            }
        }
        catch (final IOException ex) {
            s4 = ex.getMessage();
            ex.printStackTrace();
        }
        return s4;
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
                    Class9463.method35174().method20243("Logged in!");
                }
            }
            catch (final IOException ex) {}
        }
    }
    
    public String method19343(final String s, final Class8773 class8773) {
        String s2 = "Unexpected error";
        try {
            final HttpPost httpPost = new HttpPost(this.field25691);
            final ArrayList list = new ArrayList();
            list.add(new BasicNameValuePair("key", s));
            list.add(new BasicNameValuePair("challengeUid", class8773.method30476()));
            list.add(new BasicNameValuePair("challengeAnswer", class8773.method30474()));
            list.add(new BasicNameValuePair("token", this.field25694));
            class8773.method30473(false);
            httpPost.setEntity((HttpEntity)new UrlEncodedFormEntity((List)list, "UTF-8"));
            final HttpEntity entity = this.field25685.execute((HttpUriRequest)httpPost).getEntity();
            if (entity != null) {
                try (final InputStream content = entity.getContent()) {
                    final Class4404 class8774 = new Class4404(IOUtils.toString(content, "UTF-8"));
                    if (class8774.method13253("success")) {
                        this.method19345(class8774);
                        return null;
                    }
                    if (class8774.method13269("error")) {
                        s2 = class8774.method13268("error");
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
    
    public Class8773 method19344() {
        if (this.field25686 != null && this.field25686.method30472()) {
            return this.field25686;
        }
        try {
            final HttpPost httpPost = new HttpPost(this.field25692);
            final ArrayList list = new ArrayList();
            list.add(new BasicNameValuePair("token", this.field25694));
            httpPost.setEntity((HttpEntity)new UrlEncodedFormEntity((List)list, "UTF-8"));
            final HttpEntity entity = this.field25685.execute((HttpUriRequest)httpPost).getEntity();
            if (entity != null) {
                try (final InputStream content = entity.getContent()) {
                    final Class4404 class4404 = new Class4404(IOUtils.toString(content, "UTF-8"));
                    if (class4404.method13253("success")) {
                        final String method13268 = class4404.method13268("uid");
                        boolean method13269 = false;
                        if (class4404.method13269("captcha")) {
                            method13269 = class4404.method13253("captcha");
                        }
                        this.field25686 = new Class8773(method13268, method13269);
                        return this.field25686;
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
    
    public void method19345(final Class4405 class4405) {
        String method13268 = null;
        String method13269 = null;
        String method13270 = null;
        if (class4405.method13269("username")) {
            method13269 = class4405.method13268("username");
        }
        if (class4405.method13269("auth_token")) {
            method13268 = class4405.method13268("auth_token");
        }
        if (class4405.method13269("agora_token")) {
            method13270 = class4405.method13268("agora_token");
        }
        if (method13268 != null && method13269 != null && method13270 != null) {
            try {
                this.field25687 = new Class7994(method13269, method13268, method13270);
                FileUtils.writeByteArrayToFile(new File("jello/jello.lic"), this.field25687.method26158());
            }
            catch (final IOException ex) {}
        }
        if (class4405.method13269("session")) {
            this.method19346(class4405.method13268("session"));
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
    
    public String method19351() {
        return this.field25694;
    }
    
    public boolean method19352() {
        return Class6466.field25695;
    }
    
    static {
        Class6466.field25695 = false;
        Class6466.field25696 = false;
    }
}
