// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.net.Proxy;
import com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService;
import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.util.Iterator;
import com.google.gson.JsonArray;
import net.minecraft.entity.Entity;
import org.apache.http.impl.client.HttpClients;
import java.util.ArrayList;
import org.apache.http.client.HttpClient;
import java.util.HashMap;
import java.util.UUID;
import java.util.List;

public class Class9198
{
    private Minecraft field38982;
    private String field38983;
    private Thread field38984;
    private List<UUID> field38985;
    private HashMap<UUID, Class6538> field38986;
    private HttpClient field38987;
    private Class6466 field38988;
    private Class4960 field38989;
    public Class9194 field38990;
    
    public Class9198(final Class6466 field38988) {
        this.field38982 = Minecraft.method5277();
        this.field38985 = new ArrayList<UUID>();
        this.field38986 = new HashMap<UUID, Class6538>();
        Class9463.method35173().method35188().method21094(this);
        this.field38987 = (HttpClient)HttpClients.createDefault();
        this.field38988 = field38988;
        this.field38990 = new Class9194(this);
    }
    
    public static void method33654() {
        Class9463.method35173().method35201().method19342();
    }
    
    public HashMap<UUID, Class6538> method33655() {
        return this.field38986;
    }
    
    public boolean method33656(final Entity class399) {
        return class399 != null && this.field38986.containsKey(class399.method1865());
    }
    
    public Class6538 method33657(final Entity class399) {
        return this.field38986.get(class399.method1865());
    }
    
    @Class6753
    private void method33658(final Class5743 class5743) {
        if (this.field38982.field4684.ticksExisted % 100 != 0) {
            return;
        }
        this.method33659();
        final List<Class754> method6840 = this.field38982.world.method6840();
        final Iterator<Class754> iterator = method6840.iterator();
        while (iterator.hasNext()) {
            final Class754 class5744 = iterator.next();
            if (!this.field38985.contains(class5744.method1865())) {
                if (!Class9463.method35173().method35191().method31751(class5744)) {
                    if (!class5744.getName().getUnformattedComponentText().equals("")) {
                        continue;
                    }
                }
            }
            iterator.remove();
        }
        if (method6840.size() != 0) {
            final Iterator<Class754> iterator2 = method6840.iterator();
            int n = 0;
            final JsonArray jsonArray = new JsonArray();
            while (iterator2.hasNext() && n++ < 70) {
                final Entity class5745 = iterator2.next();
                jsonArray.add(class5745.getName().getUnformattedComponentText());
                this.field38985.add(class5745.method1865());
            }
            if (this.field38989 != null) {
                if (this.field38989.method14958()) {
                    this.field38989.method14942("fetch", jsonArray);
                }
            }
        }
    }
    
    private void method33659() {
        final Iterator<UUID> iterator = this.field38985.iterator();
        while (iterator.hasNext()) {
            if (this.field38982.world.method7143(iterator.next()) != null) {
                continue;
            }
            iterator.remove();
        }
        final Iterator<UUID> iterator2 = this.field38986.keySet().iterator();
        while (iterator.hasNext()) {
            if (this.field38982.world.method7143(iterator2.next()) != null) {
                continue;
            }
            iterator2.remove();
        }
    }
    
    public void method33660(final String s, final String s2) {
        final Class4405 class4405 = new Class4405();
        class4405.method13301("target", s);
        class4405.method13301("message", s2);
        if (this.field38989 != null) {
            this.field38989.method14942("message", class4405);
        }
    }
    
    @Class6753
    private void method33661(final Class5723 class5723) {
        if (class5723.method16998() instanceof Class4367) {
            final Class4367 class5724 = (Class4367)class5723.method16998();
            Class9463.method35174().method20240("Connecting...");
            try {
                this.field38989 = Class6593.method20037("http://localhost:3000");
            }
            catch (final URISyntaxException ex) {
                ex.printStackTrace();
            }
            this.field38989.method14976("connect", new Class4663(this)).method14976("login-successful", new Class4679(this)).method14976("jello-user", new Class4686(this)).method14976("chat-message", new Class4660(this)).method14976("disconnect", new Class4687(this));
            this.field38989.method14940();
        }
    }
    
    public static String method33662(final String s) {
        try {
            return new BigInteger(method33663(s, "SHA-1")).toString(16).replace("-", "");
        }
        catch (final NoSuchAlgorithmException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    private static byte[] method33663(final String s, final String algorithm) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(algorithm).digest(s.getBytes(StandardCharsets.UTF_8));
    }
    
    private void method33664(final GameProfile gameProfile, final String s) throws AuthenticationException, IOException {
        final String method33693 = this.field38982.field4642.method33693();
        ((YggdrasilMinecraftSessionService)new YggdrasilAuthenticationService(Proxy.NO_PROXY, method33693).createMinecraftSessionService()).joinServer(gameProfile, method33693, s);
        Class9463.method35173();
        Class9463.method35174().method20240("Jello Connect: successfully reached out mojangs servers " + s);
        System.out.println("https://sessionserver.mojang.com/session/minecraft/hasJoined?serverId=" + s + "&username=" + this.field38982.field4642.method33692());
    }
    
    private String method33665(final String s) {
        try {
            final byte[] digest = MessageDigest.getInstance("MD5").digest(s.getBytes());
            final StringBuffer sb = new StringBuffer();
            for (int i = 0; i < digest.length; ++i) {
                sb.append(Integer.toHexString((digest[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        }
        catch (final NoSuchAlgorithmException ex) {
            return null;
        }
    }
}
