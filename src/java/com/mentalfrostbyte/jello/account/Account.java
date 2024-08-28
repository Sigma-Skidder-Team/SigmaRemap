package com.mentalfrostbyte.jello.account;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.TextureUtil;
import com.mojang.authlib.Agent;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import mapped.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Base64OutputStream;
import org.apache.commons.io.output.ByteArrayOutputStream;

import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Pattern;

public class Account {
    private static final Date field42084 = new Date();
    private String field42072 = "Unknown name";
    private String field42073 = "steve";
    private String field42074;
    private String field42075;
    private ArrayList<Class8794> field42076 = new ArrayList<Class8794>();
    private long field42077;
    private final long field42078;
    private int field42079;
    private BufferedImage field42080;
    private BufferedImage field42081;
    private Texture field42082;
    private Thread field42083;

    public Account(String var1, String var2, ArrayList<Class8794> var3, String var4) {
        this.field42074 = var1;
        this.field42075 = var2;
        this.field42078 = System.currentTimeMillis();
        this.field42077 = 0L;
        this.field42079 = 0;
        if (var3 != null) {
            this.field42076 = var3;
        }

        if (var4 != null) {
            this.field42072 = var4;
        }
    }

    public Account(String var1, String var2, ArrayList<Class8794> var3) {
        this(var1, var2, var3, null);
    }

    public Account(String var1, String var2) {
        this(var1, var2, null, null);
    }

    public Account(JSONObject var1) {
        if (var1.has("email")) {
            this.field42074 = var1.method21773("email");
        }

        if (var1.has("password")) {
            this.field42075 = method34235(var1.method21773("password"));
        }

        if (var1.has("bans")) {
            for (Object var5 : var1.method21768("bans")) {
                this.field42076.add(new Class8794((JSONObject) var5));
            }
        }

        if (var1.has("knownName")) {
            this.field42072 = var1.method21773("knownName");
        }

        if (var1.has("knownUUID")) {
            this.field42073 = var1.method21773("knownUUID");
        }

        if (var1.has("dateAdded")) {
            this.field42078 = var1.method21770("dateAdded");
        } else {
            this.field42078 = System.currentTimeMillis();
        }

        if (var1.has("lastUsed")) {
            this.field42077 = var1.method21770("lastUsed");
        }

        if (var1.has("useCount")) {
            this.field42079 = var1.method21767("useCount");
        }

        if (var1.has("skin")) {
            byte[] var7 = DatatypeConverter.parseBase64Binary(var1.method21773("skin"));

            try {
                this.field42080 = ImageIO.read(new ByteArrayInputStream(var7));
            } catch (IOException var6) {
                var6.printStackTrace();
            }
        }
    }

    public static Class6974 method34212(String var0, String var1) throws AuthenticationException {
        return method34213(new Account(var0, var1));
    }

    public static Class6974 method34213(Account var0) throws AuthenticationException {
        if (!var0.method34240()) {
            String var3 = "-";
            YggdrasilAuthenticationService var4 = new YggdrasilAuthenticationService(Proxy.NO_PROXY, var3);
            YggdrasilUserAuthentication var5 = new YggdrasilUserAuthentication(var4, var3, Agent.MINECRAFT);
            var5.setUsername(var0.method34216());
            var5.setPassword(var0.method34220());
            var5.logIn();
            var0.method34214();
            return new Class6974(
                    var5.getSelectedProfile().getName(), var5.getSelectedProfile().getId().toString(), var5.getAuthenticatedToken(), var0.method34230().name()
            );
        } else {
            return new Class6974(var0.method34216(), "", "", "mojang");
        }
    }

    public static String method34234(String var0) {
        byte[] var3 = Base64.encodeBase64(var0.getBytes());
        return new String(var3, StandardCharsets.UTF_8);
    }

    public static String method34235(String var0) {
        byte[] var3 = Base64.decodeBase64(var0.getBytes());
        return new String(var3, StandardCharsets.UTF_8);
    }

    public void method34214() {
        this.field42079++;
    }

    public ArrayList<Class8794> method34215() {
        return this.field42076;
    }

    public String method34216() {
        return this.field42074;
    }

    public String method34217() {
        return this.field42072;
    }

    public String method34218() {
        return !this.field42072.equals("Unknown name") ? this.field42072 : this.field42074;
    }

    public String method34219() {
        return this.field42073;
    }

    public String method34220() {
        return this.field42075;
    }

    public void method34221(String var1) {
        this.field42075 = var1;
    }

    public void method34222(String var1) {
        this.field42074 = var1;
    }

    public void method34223(Class8794 var1) {
        this.method34224(var1.method31734());
        this.field42076.add(var1);
    }

    public void method34224(String var1) {
        Iterator var4 = this.field42076.iterator();

        while (var4.hasNext()) {
            if (((Class8794) var4.next()).method31734().equals(var1)) {
                var4.remove();
            }
        }
    }

    public void method34225(String var1) {
        this.field42072 = var1;
        this.field42083 = null;
    }

    public void method34226(String var1) {
        this.field42073 = var1;
    }

    public Texture method34227() {
        if (this.field42082 == null && this.field42080 != null) {
            try {
                this.field42082 = TextureUtil.method32933("skin", this.field42080.getSubimage(8, 8, 8, 8));
            } catch (IOException var4) {
                var4.printStackTrace();
            }
        }

        return this.field42082 != null ? this.field42082 : ResourcesDecrypter.skinPNG;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            if (this.field42082 != null) {
                Client.getInstance().method19927(this.field42082);
            }
        } finally {
            super.finalize();
        }
    }

    public BufferedImage method34228() {
        if (this.field42081 == null && this.field42080 != null) {
            Rectangle var3 = new Rectangle(64, 64);
            this.field42081 = new BufferedImage((int) var3.getWidth(), (int) var3.getHeight(), 3);
            Graphics2D var4 = this.field42081.createGraphics();
            var4.drawImage(this.field42080, 0, 0, null);
            if (this.field42080.getHeight() == 32) {
                BufferedImage var5 = this.field42080.getSubimage(0, 16, 16, 16);
                BufferedImage var6 = this.field42080.getSubimage(40, 16, 16, 16);
                var4.drawImage(var5, 16, 48, null);
                var4.drawImage(var6, 32, 48, null);
            }

            var4.dispose();
        }

        return this.field42081;
    }

    public void method34229() {
        new Date();
        if (!this.method34219().contains("steve") && this.field42083 == null) {
            this.field42083 = new Thread(() -> {
                try {
                    this.field42080 = ImageIO.read(new URL(Class5628.method17699(this.method34219().replaceAll("-", ""))));
                } catch (Exception var4) {
                    var4.printStackTrace();
                }
            });
            this.field42083.start();
        }
    }

    public Class2147 method34230() {
        return !this.field42074.contains("@") ? Class2147.field14043 : Class2147.field14044;
    }

    public Class6974 method34231() throws AuthenticationException {
        if (!this.method34240()) {
            String var3 = "-";
            YggdrasilAuthenticationService var4 = new YggdrasilAuthenticationService(Proxy.NO_PROXY, var3);
            YggdrasilUserAuthentication var5 = new YggdrasilUserAuthentication(var4, var3, Agent.MINECRAFT);
            var5.setUsername(this.method34216());
            var5.setPassword(this.method34220());
            var5.logIn();
            this.method34225(var5.getSelectedProfile().getName());
            this.method34226(var5.getSelectedProfile().getId().toString());
            this.method34229();
            this.field42077 = System.currentTimeMillis();
            return new Class6974(
                    var5.getSelectedProfile().getName(),
                    var5.getSelectedProfile().getId().toString().replaceAll("-", ""),
                    var5.getAuthenticatedToken(),
                    this.method34230().name()
            );
        } else {
            this.method34225(this.method34216());
            return new Class6974(this.method34216(), "", "", "mojang");
        }
    }

    public JSONObject method34232() {
        JSONObject var3 = new JSONObject();
        var3.method21806("bans", this.method34233());
        var3.method21806("email", this.field42074);
        var3.method21806("password", method34234(this.field42075));
        var3.method21806("knownName", this.field42072);
        var3.method21806("knownUUID", this.field42073);
        var3.method21803("useCount", this.field42079);
        var3.method21804("lastUsed", this.field42077);
        var3.method21804("dateAdded", this.field42078);
        if (this.field42080 != null) {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            Base64OutputStream var5 = new Base64OutputStream(var4);
            String var6 = "";

            try {
                ImageIO.write(this.field42080, "png", var5);
                var6 = var4.toString("UTF-8");
            } catch (IOException var8) {
                var8.printStackTrace();
            }

            var3.method21806("skin", var6);
        }

        return var3;
    }

    public Class2344 method34233() {
        Class2344 var3 = new Class2344();

        for (Class8794 var5 : this.field42076) {
            var3.method9158(var5.method31733());
        }

        return var3;
    }

    public int method34236() {
        return this.field42079;
    }

    public long method34237() {
        return this.field42077;
    }

    public long method34238() {
        return this.field42078;
    }

    public Class8794 method34239(String var1) {
        for (Class8794 var5 : this.method34215()) {
            if (var5.method31734().equals(var1)) {
                return var5;
            }
        }

        return null;
    }

    public boolean method34240() {
        Pattern var3 = Pattern.compile("[a-zA-Z0-9_]{2,16}");
        boolean var4 = var3.matcher(this.method34216()).matches();
        return var4 && this.method34220().length() == 0;
    }
}
