package com.mentalfrostbyte.jello.combat;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.command.CommandManager;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventKeyPress;
import totalcross.json.JSONArray;
import net.minecraft.entity.Entity;
import mapped.ChatUtilThing;
import net.minecraft.client.Minecraft;
import totalcross.json.JSONException;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FriendManager {
    public List<String> friends = new CopyOnWriteArrayList<>();
    public List<String> enemies = new CopyOnWriteArrayList<>();
    private final Minecraft mc = Minecraft.getInstance();

    public void init() {
        Client.getInstance().eventManager.register(this);
        try {
            this.loadFromCurrentConfig();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @EventTarget
    private void onKeyPress(EventKeyPress event) throws JSONException {
        if (event.getKey() == this.mc.gameSettings.keyBindPickBlock.keyCode.keyCode
                && this.mc.pointedEntity != null
                && this.mc.pointedEntity.getName() != null) {
            CommandManager commandManager = Client.getInstance().commandManager;
            commandManager.setNoCustomPrefix();
            if (this.isFriend(this.mc.pointedEntity)) {
                this.removeFriend(this.mc.pointedEntity.getName().getUnformattedComponentText());
                ChatUtilThing.sendMessage(
                        commandManager.getPrefix() + " " + this.mc.pointedEntity.getName().getUnformattedComponentText()
                                + " is no longer your friend.");
            } else {
                this.addFriend(this.mc.pointedEntity.getName().getUnformattedComponentText());
                ChatUtilThing.sendMessage(
                        commandManager.getPrefix() + " " + this.mc.pointedEntity.getName().getUnformattedComponentText()
                                + " is now your friend.");
            }

            this.updateConfigFriends();
        }
    }

    public boolean isFriend(Entity entity) {
        return this.friends.contains(entity.getName().getUnformattedComponentText().toLowerCase());
    }

    public boolean isFriend(String name) {
        return this.friends.contains(name.toLowerCase());
    }

    public boolean isEnemy(Entity entity) {
        return this.enemies.contains(entity.getName().getUnformattedComponentText().toLowerCase());
    }

    public boolean isEnemy(String name) {
        return this.enemies.contains(name.toLowerCase());
    }

    public boolean addFriend(String name) {
        if (this.isFriend(name)) {
            return false;
        } else {
            this.friends.add(name.toLowerCase());
            this.updateConfigFriends();
            return true;
        }
    }

    public boolean addEnemy(String name) {
        if (this.isEnemy(name)) {
            return false;
        } else {
            this.enemies.add(name.toLowerCase());
            this.updateConfigEnemies();
            return true;
        }
    }

    public List<String> getFriends() {
        return this.friends;
    }

    public List<String> getEnemies() {
        return this.enemies;
    }

    public boolean removeFriend(String name) {
        boolean contained = this.friends.remove(name.toLowerCase());
        if (contained) {
            this.updateConfigFriends();
        }

        return contained;
    }

    public boolean removeEnemy(String name) {
        boolean contained = this.enemies.remove(name.toLowerCase());
        if (contained) {
            this.updateConfigEnemies();
        }

        return contained;
    }

    public boolean removeAllFriends() {
        if (!this.friends.isEmpty()) {
            this.friends.clear();
            this.updateConfigFriends();
            return true;
        } else {
            return false;
        }
    }

    public boolean removeAllEnemies() {
        if (!this.enemies.isEmpty()) {
            this.enemies.clear();
            this.updateConfigEnemies();
            return true;
        } else {
            return false;
        }
    }

    public void updateConfigFriends() {
        Client.getInstance().getConfig().put("friends", this.friends);
    }

    public void updateConfigEnemies() {
        Client.getInstance().getConfig().put("enemies", this.enemies);
    }

    private void loadFromCurrentConfig() throws JSONException {
        if (Client.getInstance().getConfig().has("friends")) {
            JSONArray configFriends = Client.getInstance().getConfig().getJSONArray("friends");
            if (configFriends != null) {
                configFriends.forEach(friend -> this.friends.add((String) friend));
            }
        }

        if (Client.getInstance().getConfig().has("enemies")) {
            JSONArray configEnemies = Client.getInstance().getConfig().getJSONArray("enemies");
            if (configEnemies != null) {
                configEnemies.forEach(enemy -> this.enemies.add((String) enemy));
            }
        }
    }
}
