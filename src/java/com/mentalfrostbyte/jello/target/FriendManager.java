package com.mentalfrostbyte.jello.target;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.command.CommandManager;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4430;
import totalcross.json.JSONArray;
import net.minecraft.entity.Entity;
import mapped.Class8906;
import net.minecraft.client.Minecraft;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FriendManager {
    public List<String> field34176 = new CopyOnWriteArrayList<String>();
    public List<String> field34177 = new CopyOnWriteArrayList<String>();
    public int field34178 = 0;
    private final Minecraft field34179 = Minecraft.getInstance();

    public void method26995() {
        Client.getInstance().getEventManager().register(this);
        this.method27011();
    }

    @EventTarget
    private void method26996(Class4430 var1) {
        if (var1.method13977() == this.field34179.gameSettings.keyBindPickBlock.field13070.field34875
                && this.field34179.pointedEntity != null
                && this.field34179.pointedEntity.getName() != null) {
            CommandManager var4 = Client.getInstance().getCommandManager();
            var4.method30236();
            if (this.method26997(this.field34179.pointedEntity)) {
                this.method27005(this.field34179.pointedEntity.getName().getUnformattedComponentText());
                Class8906.method32487(
                        var4.method30235() + " " + this.field34179.pointedEntity.getName().getUnformattedComponentText() + " is no longer your friend."
                );
            } else {
                this.method27001(this.field34179.pointedEntity.getName().getUnformattedComponentText());
                Class8906.method32487(var4.method30235() + " " + this.field34179.pointedEntity.getName().getUnformattedComponentText() + " is now your friend.");
            }

            this.method27009();
        }
    }

    public boolean method26997(Entity var1) {
        return this.field34176.contains(var1.getName().getUnformattedComponentText().toLowerCase());
    }

    public boolean method26998(String var1) {
        return this.field34176.contains(var1.toLowerCase());
    }

    public boolean method26999(Entity var1) {
        return this.field34177.contains(var1.getName().getUnformattedComponentText().toLowerCase());
    }

    public boolean method27000(String var1) {
        return this.field34177.contains(var1.toLowerCase());
    }

    public boolean method27001(String var1) {
        if (this.method26998(var1)) {
            return false;
        } else {
            this.field34176.add(var1.toLowerCase());
            this.method27009();
            return true;
        }
    }

    public boolean method27002(String var1) {
        if (this.method27000(var1)) {
            return false;
        } else {
            this.field34177.add(var1.toLowerCase());
            this.method27010();
            return true;
        }
    }

    public List<String> method27003() {
        return this.field34176;
    }

    public List<String> method27004() {
        return this.field34177;
    }

    public boolean method27005(String var1) {
        boolean var4 = this.field34176.remove(var1.toLowerCase());
        if (var4) {
            this.method27009();
        }

        return var4;
    }

    public boolean method27006(String var1) {
        boolean var4 = this.field34177.remove(var1.toLowerCase());
        if (var4) {
            this.method27010();
        }

        return var4;
    }

    public boolean method27007() {
        if (!this.field34176.isEmpty()) {
            this.field34176.clear();
            this.method27009();
            return true;
        } else {
            return false;
        }
    }

    public boolean method27008() {
        if (!this.field34177.isEmpty()) {
            this.field34177.clear();
            this.method27010();
            return true;
        } else {
            return false;
        }
    }

    public void method27009() {
        Client.getInstance().getConfig().method21801("friends", this.field34176);
    }

    public void method27010() {
        Client.getInstance().getConfig().method21801("enemies", this.field34177);
    }

    private void method27011() {
        if (Client.getInstance().getConfig().has("friends")) {
            JSONArray var3 = Client.getInstance().getConfig().getJSONArray("friends");
            if (var3 != null) {
                var3.forEach(var1 -> this.field34176.add((String) var1));
            }
        }

        if (Client.getInstance().getConfig().has("enemies")) {
            JSONArray var4 = Client.getInstance().getConfig().getJSONArray("enemies");
            if (var4 != null) {
                var4.forEach(var1 -> this.field34177.add((String) var1));
            }
        }
    }
}
