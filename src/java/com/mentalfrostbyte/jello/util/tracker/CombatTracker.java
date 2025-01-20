package com.mentalfrostbyte.jello.util.tracker;

import com.google.gson.JsonArray;
import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.network.Class8930;
import com.mentalfrostbyte.jello.unmapped.Class8433;
import com.mentalfrostbyte.jello.unmapped.RandomModuleThread;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService;
import io.socket.client.Socket;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.entity.Entity;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import totalcross.json.JSONObject;

import java.io.IOException;
import java.net.Proxy;
import java.util.*;

public class CombatTracker {
    public HashMap<UUID, Class8433> field36054 = new HashMap<>();
    public HttpClient field36055;
    public Socket field36057;
    public Class8930 field36058;
    private final Minecraft field36050 = Minecraft.getInstance();
    private final List<UUID> field36053 = new ArrayList<>();

    public CombatTracker() {
        Client.getInstance().eventManager.register(this);
        this.field36055 = HttpClients.createDefault();
        this.field36058 = new Class8930(this);
        RandomModuleThread.field8342 = RandomModuleThread.field8342
                | Client.getInstance().networkManager.field38425 != null;
    }

    public static Minecraft method29522(CombatTracker var0) {
        return var0.field36050;
    }

    public static void method29523(CombatTracker var0, GameProfile var1, String var2)
            throws AuthenticationException, IOException {
        var0.method29520(var1, var2);
    }

    public HashMap<UUID, Class8433> method29510() {
        return this.field36054;
    }

    public Class8433 method29512(Entity var1) {
        return this.field36054.get(var1.getUniqueID());
    }

    @EventTarget
    private void method29513(TickEvent tickEvent) {
        if (this.field36050.player.ticksExisted % 100 == 0) {
            this.method29514();
            List<AbstractClientPlayerEntity> var4 = this.field36050.world.method6870();

            var4.removeIf(var6 -> this.field36053.contains(var6.getUniqueID())
                    || Client.getInstance().combatManager.isTargetABot(var6)
                    || var6.getName().getUnformattedComponentText().isEmpty());

            if (!var4.isEmpty()) {
                Iterator<AbstractClientPlayerEntity> var10 = var4.iterator();
                int var7 = 0;
                JsonArray var8 = new JsonArray();

                while (var10.hasNext() && var7++ < 70) {
                    Entity var9 = (Entity) var10.next();
                    var8.add(var9.getName().getUnformattedComponentText());
                    this.field36053.add(var9.getUniqueID());
                }

                if (this.field36057 != null && this.field36057.connected()) {
                    this.field36057.emit("fetch", var8);
                }
            }
        }
    }

    private void method29514() {
        Iterator<UUID> var3 = this.field36053.iterator();

        while (var3.hasNext()) {
            if (this.field36050.world.method7196(var3.next()) == null) {
                var3.remove();
            }
        }

        Iterator<UUID> var4 = this.field36054.keySet().iterator();

        while (var3.hasNext()) {
            if (this.field36050.world.method7196(var4.next()) == null) {
                var4.remove();
            }
        }
    }

    public void method29515(String var1, String var2) {
        JSONObject var5 = new JSONObject();
        var5.put("target", var1);
        var5.put("message", var2);
        if (this.field36057 != null) {
            this.field36057.emit("message", var5);
        }
    }

    private void method29520(GameProfile var1, String var2) throws AuthenticationException, IOException {
        String var5 = this.field36050.session.getToken();
        YggdrasilAuthenticationService var6 = new YggdrasilAuthenticationService(Proxy.NO_PROXY, var5);
        YggdrasilMinecraftSessionService var7 = (YggdrasilMinecraftSessionService) var6.createMinecraftSessionService();
        var7.joinServer(var1, var5, var2);
        Client.getInstance();
        Client.getClientLogger().info("Jello Connect: successfully reached out mojangs servers " + var2);
        System.out
                .println("https://sessionserver.mojang.com/session/minecraft/hasJoined?serverId=" + var2 + "&username="
                        + this.field36050.session.getUsername());
    }
}
