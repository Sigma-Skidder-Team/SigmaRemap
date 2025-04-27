// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.auth.managers;

import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.auth.agora.PlayerInfo;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;

import java.net.Proxy;

import com.mojang.authlib.GameProfile;

import java.net.URISyntaxException;
import java.util.Iterator;

import com.google.gson.JsonArray;
import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import mapped.*;
import net.minecraft.entity.Entity;

import java.util.ArrayList;

import totalcross.json.JSONException;
import totalcross.json.JSONObject;

import java.util.HashMap;
import java.util.UUID;
import java.util.List;

public class IRCManager {
    private final Minecraft mc = Minecraft.getInstance();
    private final List<UUID> seenPlayers = new ArrayList<>();
    private final HashMap<UUID, PlayerInfo> playerInfoMap = new HashMap<>();
    private Socket socket;
    public MessageManager messageManager;

    public IRCManager() {
        Client.getInstance().getEventBus().registerInstance(this);
        this.messageManager = new MessageManager();
    }

    public static void loadLicense() {
        Client.getInstance().getNetworkManager().loadLicense();
    }

    public HashMap<UUID, PlayerInfo> getPlayerInfoMap() {
        return this.playerInfoMap;
    }

    public boolean isTracked(final Entity entity) {
        return entity != null && this.playerInfoMap.containsKey(entity.getUniqueID());
    }

    public PlayerInfo getPlayerInfo(final Entity entity) {
        return this.playerInfoMap.get(entity.getUniqueID());
    }

    @EventListener
    private void onPlayerTick(final EventPlayerTick event) {
        if (this.mc.player.ticksExisted % 100 != 0) {
            return;
        }

        this.cleanupPlayers();

        final List<AbstractClientPlayerEntity> playerList = this.mc.world.getPlayers();
        final Iterator<AbstractClientPlayerEntity> iterator = playerList.iterator();

        while (iterator.hasNext()) {
            final AbstractClientPlayerEntity player = iterator.next();
            if (!this.seenPlayers.contains(player.getUniqueID())) {
                if (!Client.getInstance().getBotManager().isBot(player)) {
                    if (!player.getName().getUnformattedComponentText().equals("")) {
                        continue;
                    }
                }
            }
            iterator.remove();
        }

        if (playerList.size() != 0) {
            final Iterator<AbstractClientPlayerEntity> sendIterator = playerList.iterator();
            int sent = 0;
            final JsonArray jsonArray = new JsonArray();
            while (sendIterator.hasNext() && sent++ < 70) {
                final Entity entity = sendIterator.next();
                jsonArray.add(entity.getName().getUnformattedComponentText());
                this.seenPlayers.add(entity.getUniqueID());
            }

            if (this.socket != null && this.socket.connected()) {
                this.socket.emit("fetch", jsonArray);
            }
        }
    }

    private void cleanupPlayers() {
        final Iterator<UUID> seenIterator = this.seenPlayers.iterator();
        while (seenIterator.hasNext()) {
            if (this.mc.world.getPlayerByUuid(seenIterator.next()) != null) {
                continue;
            }
            seenIterator.remove();
        }

        final Iterator<UUID> infoIterator = this.playerInfoMap.keySet().iterator();
        while (infoIterator.hasNext()) {
            if (this.mc.world.getPlayerByUuid(infoIterator.next()) != null) {
                continue;
            }
            infoIterator.remove();
        }
    }

    public void sendMessage(final String target, final String message) {
        final JSONObject json = new JSONObject();
        json.put("target", target);
        json.put("message", message);

        if (this.socket != null) {
            this.socket.emit("message", json);
        }
    }

    @EventListener
    private void onPacket(final EventReceivePacket event) {
        if (event.getPacket() instanceof SLoginSuccessPacket) {
            Client.getLogger2().info("Connecting...");

            try {
                this.socket = IO.socket("http://localhost:3000");
            } catch (final URISyntaxException e) {
                e.printStackTrace();
            }

            this.socket.on("connect", new ConnectListener(this)).on("login-successful", new LoginSuccessListener(this)).on("jello-user", new UserInfoListener()).on("chat-message", new ChatMessageListener(this)).on("disconnect", new DisconnectListener());
            this.socket.connect();
        }
    }

    private void authenticateWithMojang(final GameProfile gameProfile, final String serverId) throws AuthenticationException {
        final String token = this.mc.session.getToken();
        new YggdrasilAuthenticationService(Proxy.NO_PROXY, token)
                .createMinecraftSessionService()
                .joinServer(gameProfile, token, serverId);

        Client.getLogger2().info("Jello Connect: successfully reached out to Mojang's servers " + serverId);
        System.out.println("https://sessionserver.mojang.com/session/minecraft/hasJoined?serverId=" + serverId + "&username=" + this.mc.session.getUsername());
    }

    public static class DisconnectListener implements Emitter.Listener {
        @Override
        public void call(final Object... args) {
            System.out.println("disconnect");
            Client.getInstance()
                    .getNotificationManager()
                    .send(new Notification("Jello connect", "Connection Failed. Try relogging.", ClientAssets.gingerbread));
        }
    }

    public static class LoginSuccessListener implements Emitter.Listener {
        public final IRCManager parent;

        public LoginSuccessListener(final IRCManager parent) {
            this.parent = parent;
        }

        @Override
        public void call(final Object... args) {
            final JSONObject json = (JSONObject) args[0];
            System.out.println(json);

            if (this.parent.mc.session == null || this.parent.mc.session.getProfile() == null) {
                return;
            }

            try {
                parent.authenticateWithMojang(parent.mc.session.getProfile(), json.getString("serverHash"));
                System.out.println("s");
                final JSONObject authJson = new JSONObject();
                authJson.put("username", this.parent.mc.session.getUsername());
                this.parent.socket.emit("server-auth", authJson);
            } catch (final JSONException | AuthenticationException e) {
                e.printStackTrace();
            }

            Client.getInstance()
                    .getNotificationManager()
                    .send(new Notification("Jello connect", "Connected!", ClientAssets.gingerbread));
        }
    }

    public static class UserInfoListener implements Emitter.Listener {
        @Override
        public void call(final Object... array) {
            System.out.println(array[0]);
        }
    }

    public static class ConnectListener implements Emitter.Listener {
        public final IRCManager parent;

        public ConnectListener(final IRCManager parent) {
            this.parent = parent;
        }

        @Override
        public void call(final Object... args) {
            parent.socket.emit("my other event", "hi");
            final JSONObject loginJson = new JSONObject();
            loginJson.put("session", "TOMYGAMESTESTINGID");
            parent.socket.emit("login", loginJson);
            System.out.println("hey");
        }
    }

    public static class ChatMessageListener implements Emitter.Listener {
        public final IRCManager parent;

        public ChatMessageListener(final IRCManager parent) {
            this.parent = parent;
        }

        @Override
        public void call(final Object... args) {
            final JSONObject json = (JSONObject) args[0];
            if (json.has("messageId")) {
                final JSONObject ack = new JSONObject();
                ack.put("messageId", json.getString("messageId"));
                this.parent.socket.emit("message-received", ack);

                this.parent.messageManager.addMessage(
                        json.getString("senderId"),
                        json.getString("message"),
                        json.getLong("timestamp")
                );
            }
        }
    }
}
