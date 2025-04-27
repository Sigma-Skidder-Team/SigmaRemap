// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.auth.NetworkManager;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;

import java.net.Proxy;

import com.mojang.authlib.GameProfile;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.util.Iterator;

import com.google.gson.JsonArray;
import net.minecraft.entity.Entity;

import java.util.ArrayList;

import totalcross.json.JSONObject;

import java.util.HashMap;
import java.util.UUID;
import java.util.List;

public class IRCManager {
    private final Minecraft mc = Minecraft.getInstance();
    private final List<UUID> field38985 = new ArrayList<>();
    private final HashMap<UUID, Class6538> field38986 = new HashMap<>();
    //private Socket socket;
    public Class9194 field38990;

    public IRCManager(final NetworkManager field38988) {
        Client.getInstance().getEventBus().registerInstance(this);
        this.field38990 = new Class9194(this);
    }

    public static void loadLicense() {
        Client.getInstance().getNetworkManager().loadLicense();
    }

    public HashMap<UUID, Class6538> method33655() {
        return this.field38986;
    }

    public boolean method33656(final Entity class399) {
        return class399 != null && this.field38986.containsKey(class399.getUniqueID());
    }

    public Class6538 method33657(final Entity entity) {
        return this.field38986.get(entity.getUniqueID());
    }

    @EventListener
    private void method33658(final EventPlayerTickI eventPlayerTick) {
        if (this.mc.player.ticksExisted % 100 != 0) {
            return;
        }
        this.method33659();
        final List<Class754> method6840 = this.mc.world.method6840();
        final Iterator<Class754> iterator = method6840.iterator();
        while (iterator.hasNext()) {
            final Class754 class5744 = iterator.next();
            if (!this.field38985.contains(class5744.getUniqueID())) {
                if (!Client.getInstance().getBotManager().method31751(class5744)) {
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
                this.field38985.add(class5745.getUniqueID());
            }
            /*
            if (this.socket != null) {
                if (this.socket.method14958()) {
                    this.socket.emit("fetch", jsonArray);
                }
            }
             */
        }
    }

    private void method33659() {
        final Iterator<UUID> iterator = this.field38985.iterator();
        while (iterator.hasNext()) {
            if (this.mc.world.method7143(iterator.next()) != null) {
                continue;
            }
            iterator.remove();
        }
        final Iterator<UUID> iterator2 = this.field38986.keySet().iterator();
        while (iterator.hasNext()) {
            if (this.mc.world.method7143(iterator2.next()) != null) {
                continue;
            }
            iterator2.remove();
        }
    }

    public void method33660(final String s, final String s2) {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("target", s);
        jsonObject.put("message", s2);

        if (this.socket != null) {
            this.socket.emit("message", jsonObject);
        }
    }

    @EventListener
    private void onPacket(final EventReceivePacket event) {
        if (event.getPacket() instanceof SLoginSuccessPacket) {
            Client.getLogger2().info("Connecting...");

            try {
                this.socket = IO.socket("http://localhost:3000");
            } catch (final URISyntaxException ex) {
                ex.printStackTrace();
            }

            this.socket.on("connect", new Class4663(this)).on("login-successful", new Class4679(this)).on("jello-user", new Class4686(this)).on("chat-message", new Class4660(this)).on("disconnect", new Class4687(this));
            this.socket.connect();
        }
    }

    public static String method33662(final String input) {
        try {
            return new BigInteger(method33663(input)).toString(16).replace("-", "");
        } catch (final NoSuchAlgorithmException cause) {
            throw new RuntimeException(cause);
        }
    }

    private static byte[] method33663(final String input) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-1").digest(input.getBytes(StandardCharsets.UTF_8));
    }

    private void method33664(final GameProfile gameProfile, final String serverId) throws AuthenticationException {
        final String method33693 = this.mc.field4642.method33693();
        new YggdrasilAuthenticationService(Proxy.NO_PROXY, method33693).createMinecraftSessionService().joinServer(gameProfile, method33693, serverId);
        Client.getInstance();
        Client.getLogger2().info("Jello Connect: successfully reached out mojangs servers " + serverId);
        System.out.println("https://sessionserver.mojang.com/session/minecraft/hasJoined?serverId=" + serverId + "&username=" + this.mc.field4642.method33692());
    }

    private String method33665(final String input) {
        try {
            final byte[] digest = MessageDigest.getInstance("MD5").digest(input.getBytes());
            final StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 0xFF) | 0x100), 1, 3);
            }
            return sb.toString();
        } catch (final NoSuchAlgorithmException ex) {
            return null;
        }
    }

    public static class Class4687 implements Emitter.Listener
    {
        public final /* synthetic */ IRCManager field20237;

        public Class4687(final IRCManager field20237) {
            this.field20237 = field20237;
        }

        @Override
        public void call(final Object... array) {
            System.out.println("disconnect");
            Client.getInstance().getNotificationManager().send(new Notification("Jello connect", "Connexion Failed. Try relogging.", ClientAssets.gingerbread));
        }
    }

    public static class Class4679 implements Emitter.Listener
    {
        public final /* synthetic */ IRCManager parent;

        public Class4679(final IRCManager parent) {
            this.parent = parent;
        }

        @Override
        public void call(final Object... array) {
            final JSONObject x = (JSONObject)array[0];
            System.out.println(x);
            if (IRCManager.method33667(this.parent).field4642 == null || IRCManager.method33667(this.parent).field4642.method33694() == null) {
                return;
            }
            try {
                IRCManager.method33668(this.parent, IRCManager.method33667(this.parent).field4642.method33694(), x.getString("serverHash"));
                System.out.println("s");
                final JSONObject JSONObject = new JSONObject();
                JSONObject.put("username", IRCManager.method33667(this.parent).field4642.method33692());
                IRCManager.method33666(this.parent).method14942("server-auth", JSONObject);
            }
            catch (final JSONException | AuthenticationException | IOException ex) {
                ((Throwable)ex).printStackTrace();
            }
            Client.getInstance().getNotificationManager().send(new Notification("Jello connect", "Connected!", ClientAssets.gingerbread));
        }
    }

    public static class Class4660 implements Emitter.Listener
    {
        public final /* synthetic */ IRCManager field20166;

        public Class4660(final IRCManager field20166) {
            this.field20166 = field20166;
        }

        @Override
        public void call(final Object... array) {
            final JSONObject JSONObject = (JSONObject)array[0];
            if (JSONObject.has("messageId")) {
                final JSONObject class4406 = new JSONObject();
                class4406.put("messageId", JSONObject.getString("messageId"));
                IRCManager.method33666(this.field20166).method14942("message-received", class4406);
                this.field20166.field38990.method33644(JSONObject.getString("senderId"), JSONObject.getString("message"), JSONObject.getLong("timestamp"));
            }
        }
    }

    public static class Class4686 implements Emitter.Listener
    {
        private static String[] field20235;
        public final /* synthetic */ IRCManager field20236;

        public Class4686(final IRCManager field20236) {
            this.field20236 = field20236;
        }

        @Override
        public void call(final Object... array) {
            System.out.println(array[0]);
        }
    }
}
