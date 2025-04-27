// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import org.apache.commons.codec.binary.Base64;

import org.apache.commons.codec.binary.Base64OutputStream;
import org.apache.commons.io.output.ByteArrayOutputStream;
import java.net.URL;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Iterator;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.ByteArrayInputStream;
import javax.xml.bind.DatatypeConverter;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import com.mojang.authlib.Agent;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.net.Proxy;
import com.mojang.authlib.exceptions.AuthenticationException;
import org.newdawn.slick.Texture;
import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

import java.util.Date;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Class7971
{
    private String field32787;
    private String field32788;
    private String field32789;
    private String field32790;
    private ArrayList<Class8848> field32791;
    private long field32792;
    private final long field32793;
    private int field32794;
    private BufferedImage field32795;
    private BufferedImage field32796;
    private Texture field32797;
    private Thread field32798;
    private static Date field32799;
    
    public static Session method25884(final String s, final String s2) throws AuthenticationException {
        return method25885(new Class7971(s, s2));
    }
    
    public static Session method25885(final Class7971 class7971) throws AuthenticationException {
        if (!class7971.method25912()) {
            final YggdrasilUserAuthentication yggdrasilUserAuthentication = new YggdrasilUserAuthentication(new YggdrasilAuthenticationService(Proxy.NO_PROXY, "-"), Agent.MINECRAFT);
            yggdrasilUserAuthentication.setUsername(class7971.method25888());
            yggdrasilUserAuthentication.setPassword(class7971.method25892());
            yggdrasilUserAuthentication.logIn();
            class7971.method25886();
            return new Session(yggdrasilUserAuthentication.getSelectedProfile().getName(), yggdrasilUserAuthentication.getSelectedProfile().getId().toString(), yggdrasilUserAuthentication.getAuthenticatedToken(), class7971.method25902().name());
        }
        return new Session(class7971.method25888(), "", "", "mojang");
    }
    
    public Class7971(final String field32789, final String field32790, final ArrayList<Class8848> field32791, final String field32792) {
        this.field32787 = "Unknown name";
        this.field32788 = "steve";
        this.field32791 = new ArrayList<Class8848>();
        this.field32789 = field32789;
        this.field32790 = field32790;
        this.field32793 = System.currentTimeMillis();
        this.field32792 = 0L;
        this.field32794 = 0;
        if (field32791 != null) {
            this.field32791 = field32791;
        }
        if (field32792 != null) {
            this.field32787 = field32792;
        }
    }
    
    public Class7971(final String s, final String s2, final ArrayList<Class8848> list) {
        this(s, s2, list, null);
    }
    
    public Class7971(final String s, final String s2) {
        this(s, s2, null, null);
    }
    
    public Class7971(final JSONObject JSONObject) {
        this.field32787 = "Unknown name";
        this.field32788 = "steve";
        this.field32791 = new ArrayList<Class8848>();
        if (JSONObject.has("email")) {
            this.field32789 = JSONObject.getString("email");
        }
        if (JSONObject.has("password")) {
            this.field32790 = method25907(JSONObject.getString("password"));
        }
        if (JSONObject.has("bans")) {
            final Iterator<Object> iterator = JSONObject.getJSONArray("bans").iterator();
            while (iterator.hasNext()) {
                this.field32791.add(new Class8848(iterator.next()));
            }
        }
        if (JSONObject.has("knownName")) {
            this.field32787 = JSONObject.getString("knownName");
        }
        if (JSONObject.has("knownUUID")) {
            this.field32788 = JSONObject.getString("knownUUID");
        }
        if (JSONObject.has("dateAdded")) {
            this.field32793 = JSONObject.getLong("dateAdded");
        }
        else {
            this.field32793 = System.currentTimeMillis();
        }
        if (JSONObject.has("lastUsed")) {
            this.field32792 = JSONObject.getLong("lastUsed");
        }
        if (JSONObject.has("useCount")) {
            this.field32794 = JSONObject.getInt("useCount");
        }
        if (JSONObject.has("skin")) {
            final byte[] base64Binary = DatatypeConverter.parseBase64Binary(JSONObject.getString("skin"));
            try {
                this.field32795 = ImageIO.read(new ByteArrayInputStream(base64Binary));
            }
            catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void method25886() {
        ++this.field32794;
    }
    
    public ArrayList<Class8848> method25887() {
        return this.field32791;
    }
    
    public String method25888() {
        return this.field32789;
    }
    
    public String method25889() {
        return this.field32787;
    }
    
    public String method25890() {
        if (!this.field32787.equals("Unknown name")) {
            return this.field32787;
        }
        return this.field32789;
    }
    
    public String method25891() {
        return this.field32788;
    }
    
    public String method25892() {
        return this.field32790;
    }
    
    public void method25893(final String field32790) {
        this.field32790 = field32790;
    }
    
    public void method25894(final String field32789) {
        this.field32789 = field32789;
    }
    
    public void method25895(final Class8848 e) {
        this.method25896(e.method30980());
        this.field32791.add(e);
    }
    
    public void method25896(final String anObject) {
        final Iterator<Class8848> iterator = this.field32791.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().method30980().equals(anObject)) {
                continue;
            }
            iterator.remove();
        }
    }
    
    public void method25897(final String field32787) {
        this.field32787 = field32787;
        this.field32798 = null;
    }
    
    public void method25898(final String field32788) {
        this.field32788 = field32788;
    }
    
    public Texture method25899() {
        if (this.field32797 == null && this.field32795 != null) {
            try {
                this.field32797 = BufferedImageUtil.getTexture("skin", this.field32795.getSubimage(8, 8, 8, 8));
            }
            catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
        if (this.field32797 != null) {
            return this.field32797;
        }
        return ClientAssets.skin;
    }
    
    protected void finalize() throws Throwable {
        try {
            if (this.field32797 != null) {
                Client.getInstance().addTexture(this.field32797);
            }
        }
        finally {
            super.finalize();
        }
    }
    
    public BufferedImage method25900() {
        if (this.field32796 == null) {
            if (this.field32795 != null) {
                final Rectangle rectangle = new Rectangle(64, 64);
                this.field32796 = new BufferedImage((int)rectangle.getWidth(), (int)rectangle.getHeight(), 3);
                final Graphics2D graphics = this.field32796.createGraphics();
                graphics.drawImage(this.field32795, 0, 0, null);
                if (this.field32795.getHeight() == 32) {
                    final BufferedImage subimage = this.field32795.getSubimage(0, 16, 16, 16);
                    final BufferedImage subimage2 = this.field32795.getSubimage(40, 16, 16, 16);
                    graphics.drawImage(subimage, 16, 48, null);
                    graphics.drawImage(subimage2, 32, 48, null);
                }
                graphics.dispose();
            }
        }
        return this.field32796;
    }
    
    public void method25901() {
        final Date date = new Date();
        if (!this.method25891().contains("steve")) {
            if (this.field32798 == null) {
                (this.field32798 = new Thread(() -> {
                    try {
                        this.field32795 = ImageIO.read(new URL(ColorUtils.method19129(this.method25891().replaceAll("-", ""))));
                    }
                    catch (final Exception ex) {
                        ex.printStackTrace();
                    }
                })).start();
            }
        }
    }
    
    public Session.Type method25902() {
        return this.field32789.contains("@") ? Session.Type.MOJANG : Session.Type.LEGACY;
    }
    
    public Session method25903() throws AuthenticationException {
        if (!this.method25912()) {
            final YggdrasilUserAuthentication yggdrasilUserAuthentication = new YggdrasilUserAuthentication(new YggdrasilAuthenticationService(Proxy.NO_PROXY, "-"), Agent.MINECRAFT);
            yggdrasilUserAuthentication.setUsername(this.method25888());
            yggdrasilUserAuthentication.setPassword(this.method25892());
            yggdrasilUserAuthentication.logIn();
            this.method25897(yggdrasilUserAuthentication.getSelectedProfile().getName());
            this.method25898(yggdrasilUserAuthentication.getSelectedProfile().getId().toString());
            this.method25901();
            this.field32792 = System.currentTimeMillis();
            return new Session(yggdrasilUserAuthentication.getSelectedProfile().getName(), yggdrasilUserAuthentication.getSelectedProfile().getId().toString(), yggdrasilUserAuthentication.getAuthenticatedToken(), this.method25902().name());
        }
        this.method25897(this.method25888());
        return new Session(this.method25888(), "", "", "mojang");
    }
    
    public JSONObject method25904() {
        final JSONObject JSONObject = new JSONObject();
        JSONObject.put("bans", this.method25905());
        JSONObject.put("email", this.field32789);
        JSONObject.put("password", method25906(this.field32790));
        JSONObject.put("knownName", this.field32787);
        JSONObject.put("knownUUID", this.field32788);
        JSONObject.put("useCount", this.field32794);
        JSONObject.put("lastUsed", this.field32792);
        JSONObject.put("dateAdded", this.field32793);
        if (this.field32795 != null) {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final Base64OutputStream output = new Base64OutputStream(byteArrayOutputStream);
            String string = "";
            try {
                ImageIO.write(this.field32795, "png", output);
                string = byteArrayOutputStream.toString("UTF-8");
            }
            catch (final IOException ex) {
                ex.printStackTrace();
            }
            JSONObject.put("skin", string);
        }
        return JSONObject;
    }
    
    public JSONArray method25905() {
        final JSONArray JSONArray = new JSONArray();
        final Iterator<Class8848> iterator = this.field32791.iterator();
        while (iterator.hasNext()) {
            JSONArray.put(iterator.next().method30979());
        }
        return JSONArray;
    }
    
    public static String method25906(final String s) {
        return new String(Base64.encodeBase64(s.getBytes()), StandardCharsets.UTF_8);
    }
    
    public static String method25907(final String s) {
        return new String(Base64.decodeBase64(s.getBytes()), StandardCharsets.UTF_8);
    }
    
    public int method25908() {
        return this.field32794;
    }
    
    public long method25909() {
        return this.field32792;
    }
    
    public long method25910() {
        return this.field32793;
    }
    
    public Class8848 method25911(final String anObject) {
        for (final Class8848 class8848 : this.method25887()) {
            if (!class8848.method30980().equals(anObject)) {
                continue;
            }
            return class8848;
        }
        return null;
    }
    
    public boolean method25912() {
        return Pattern.compile("[a-zA-Z0-9_]{2,16}").matcher(this.method25888()).matches() && this.method25892().length() == 0;
    }
    
    static {
        Class7971.field32799 = new Date();
    }
}
