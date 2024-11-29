package com.mentalfrostbyte.jello.account;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.TextureUtil;
import fr.litarvan.openauth.microsoft.MicrosoftAuthResult;
import fr.litarvan.openauth.microsoft.MicrosoftAuthenticationException;
import fr.litarvan.openauth.microsoft.MicrosoftAuthenticator;
import lol.Texture;
import mapped.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Base64OutputStream;
import org.apache.commons.io.output.ByteArrayOutputStream;
import totalcross.json.JSONArray;
import totalcross.json.JSONException;
import totalcross.json.JSONObject;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;

public class Account {
    /**
     * This field is unused so IDK what to name it
     */
    private static final Date field42084 = new Date();
    private String knownName = "Unknown name";
    private String knownUUID = "steve";
    private String email;
    private String password;
    private ArrayList<Ban> bans = new ArrayList<Ban>();
    private long lastUsed;
    private final long dateAdded;
    private int useCount;
    private BufferedImage skin;
    private BufferedImage field42081;
    private Texture skinTexture;
    private Thread skinUpdateThread;

    public Account(String email, String password, ArrayList<Ban> bans, String knownName) {
        this.email = email;
        this.password = password;
        this.dateAdded = System.currentTimeMillis();
        this.lastUsed = 0L;
        this.useCount = 0;
        if (bans != null) {
            this.bans = bans;
        }

        if (knownName != null) {
            this.knownName = knownName;
        }
    }

    public Account(String var1, String var2, ArrayList<Ban> var3) {
        this(var1, var2, var3, null);
    }

    public Account(String var1, String var2) {
        this(var1, var2, null, null);
    }

    public Account(JSONObject var1) throws JSONException {
        if (var1.has("email")) {
            this.email = var1.getString("email");
        }

        if (var1.has("password")) {
            this.password = decodeBase64(var1.getString("password"));
        }

        if (var1.has("bans")) {
            for (Object var5 : var1.getJSONArray("bans")) {
                this.bans.add(new Ban((JSONObject) var5));
            }
        }

        if (var1.has("knownName")) {
            this.knownName = var1.getString("knownName");
        }

        if (var1.has("knownUUID")) {
            this.knownUUID = var1.getString("knownUUID");
        }

        if (var1.has("dateAdded")) {
            this.dateAdded = var1.getLong("dateAdded");
        } else {
            this.dateAdded = System.currentTimeMillis();
        }

        if (var1.has("lastUsed")) {
            this.lastUsed = var1.getLong("lastUsed");
        }

        if (var1.has("useCount")) {
            this.useCount = var1.getInt("useCount");
        }

        if (var1.has("skin")) {
            byte[] var7 = parseBase64Binary(var1.getString("skin"));

            try {
                this.skin = ImageIO.read(new ByteArrayInputStream(var7));
            } catch (IOException var6) {
                var6.printStackTrace();
            }
        }
    }

    /**
     * Seems to be unused. Maybe for a prototype of a clipboard login or smth
     * @param email Email
     * @param password Password
     * @return Returns the session ig
     * @throws MicrosoftAuthenticationException if the authentication fails horribly
     */
    public static Session fastLogin(String email, String password) throws MicrosoftAuthenticationException {
        return alternativeLogin(new Account(email, password));
    }

    public static Session alternativeLogin(Account account) throws MicrosoftAuthenticationException {
        if (!account.isEmailAValidEmailFormat()) {
            MicrosoftAuthenticator authenticator = new MicrosoftAuthenticator();
            MicrosoftAuthResult result = authenticator.loginWithCredentials("email", "password");
            // Or using a webview: authenticator.loginWithWebView();
            // Or using refresh token: authenticator.loginWithRefreshToken("refresh token");
            // Or using your own way: authenticator.loginWithTokens("access token", "refresh token");

            System.out.printf("Logged in with '%s'%n", result.getProfile().getName());
            account.updateUsedCount();
            return new Session(
                    result.getProfile().getName(), result.getProfile().getId(), result.getAccessToken(), account.getAccountType().name()
            );
        } else {
            return new Session(account.getEmail(), "", "", "mojang");
        }
    }

    public static String encodeBase64(String s) {
        byte[] bytes = Base64.encodeBase64(s.getBytes());
        return new String(bytes, StandardCharsets.UTF_8);
    }

    public static String decodeBase64(String s) {
        byte[] bytes = Base64.decodeBase64(s.getBytes());
        return new String(bytes, StandardCharsets.UTF_8);
    }

    public void updateUsedCount() {
        this.useCount++;
    }

    public ArrayList<Ban> getBans() {
        return this.bans;
    }

    public String getEmail() {
        return this.email;
    }

    public String getKnownName() {
        return this.knownName;
    }

    public String getName() {
        return !this.knownName.equals("Unknown name") ? this.knownName : this.email;
    }

    public String getKnownUUID() {
        return this.knownUUID;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String var1) {
        this.password = var1;
    }

    public void setEmail(String var1) {
        this.email = var1;
    }

    public void registerBan(Ban ban) {
        this.unbanFromServerIP(ban.getServerIP());
        this.bans.add(ban);
    }

    public void unbanFromServerIP(String var1) {
        this.bans.removeIf(ban -> ban.getServerIP().equals(var1));
    }

    public void setName(String name) {
        this.knownName = name;
        this.skinUpdateThread = null;
    }

    public void setKnownUUID(String var1) {
        this.knownUUID = var1;
    }

    public Texture setSkinTexture() {
        if (this.skinTexture == null && this.skin != null) {
            try {
                this.skinTexture = TextureUtil.method32933("skin", this.skin.getSubimage(8, 8, 8, 8));
            } catch (IOException var4) {
                var4.printStackTrace();
            }
        }

        return this.skinTexture != null ? this.skinTexture : ResourceList.skinPNG;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            if (this.skinTexture != null) {
                Client.getInstance().method19927(this.skinTexture);
            }
        } finally {
            super.finalize();
        }
    }

    public BufferedImage method34228() {
        if (this.field42081 == null && this.skin != null) {
            Rectangle var3 = new Rectangle(64, 64);
            this.field42081 = new BufferedImage((int) var3.getWidth(), (int) var3.getHeight(), 3);
            Graphics2D var4 = this.field42081.createGraphics();
            var4.drawImage(this.skin, 0, 0, null);
            if (this.skin.getHeight() == 32) {
                BufferedImage var5 = this.skin.getSubimage(0, 16, 16, 16);
                BufferedImage var6 = this.skin.getSubimage(40, 16, 16, 16);
                var4.drawImage(var5, 16, 48, null);
                var4.drawImage(var6, 32, 48, null);
            }

            var4.dispose();
        }

        return this.field42081;
    }

    public void updateSkin() {
        // new Date(); // Imma just leave this here
        if (!this.getKnownUUID().contains("steve") && this.skinUpdateThread == null) {
            this.skinUpdateThread = new Thread(() -> {
                try {
                    this.skin = ImageIO.read(new URL(MultiUtilities.getSkinUrlByID(this.getKnownUUID().replaceAll("-", ""))));
                } catch (Exception var4) {
                    var4.printStackTrace();
                }
            });
            this.skinUpdateThread.start();
        }
    }

    /**
     * Maybe a cracked account check??
     * @return Session Type
     */
    public Session.Type getAccountType() {
        return this.email.contains("@") ? Session.Type.MOJANG : Session.Type.LEGACY;
    }

    public Session login() throws MicrosoftAuthenticationException {
        if (!this.isEmailAValidEmailFormat()) {
            MicrosoftAuthenticator authenticator = new MicrosoftAuthenticator();
            MicrosoftAuthResult result = authenticator.loginWithCredentials(email, password);
            System.out.printf("Logged in with '%s'%n", result.getProfile().getName());
            this.setName(result.getProfile().getName());
            this.setKnownUUID(fixUUID(result.getProfile().getId()));
            this.updateSkin();
            this.lastUsed = System.currentTimeMillis();
            return new Session(
                    result.getProfile().getName(), result.getProfile().getId(), result.getAccessToken(), getAccountType().name()
            );
        } else {
            this.setName(this.getEmail());
            return new Session(this.getEmail(), "", "", "mojang");
        }
    }

    /**
     * I made this to fix autism caused by OpenAuth
     */
    public static String fixUUID(String uuidString) {
        return uuidString.replaceFirst(
                "(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}+)",
                "$1-$2-$3-$4-$5"
        );
    }

    public JSONObject method34232() {
        JSONObject var3 = new JSONObject();
        var3.put("bans", this.makeBanJSONArray());
        var3.put("email", this.email);
        var3.put("password", encodeBase64(this.password));
        var3.put("knownName", this.knownName);
        var3.put("knownUUID", this.knownUUID);
        var3.put("useCount", this.useCount);
        var3.put("lastUsed", this.lastUsed);
        var3.put("dateAdded", this.dateAdded);
        if (this.skin != null) {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            Base64OutputStream var5 = new Base64OutputStream(var4);
            String var6 = "";

            try {
                ImageIO.write(this.skin, "png", var5);
                var6 = var4.toString("UTF-8");
            } catch (IOException var8) {
                var8.printStackTrace();
            }

            var3.put("skin", var6);
        }

        return var3;
    }
    public static byte[] parseBase64Binary(String base64String) {
        return Base64.decodeBase64(base64String);
    }

    public JSONArray makeBanJSONArray() {
        JSONArray jsonArray = new JSONArray();

        for (Ban ban : this.bans) {
            jsonArray.put(ban.asJSONObject());
        }

        return jsonArray;
    }

    public int getUseCount() {
        return this.useCount;
    }

    public long getLastUsed() {
        return this.lastUsed;
    }

    public long getDateAdded() {
        return this.dateAdded;
    }

    public Ban getBanInfo(String serverIP) {
        for (Ban var5 : this.getBans()) {
            if (var5.getServerIP().equals(serverIP)) {
                return var5;
            }
        }

        return null;
    }

    /**
     * This is definitely used for a cracked account check!!
     * @return if the input email is a valid email
     */
    public boolean isEmailAValidEmailFormat() {
        Pattern var3 = Pattern.compile("[a-zA-Z0-9_]{2,16}");
        boolean var4 = var3.matcher(this.getEmail()).matches();
        return var4 && this.getPassword().isEmpty();
    }
}
