package com.mentalfrostbyte.jello.module.impl.combat;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.combat.antibot.HypixelAntiBot;
import com.mentalfrostbyte.jello.module.impl.combat.antibot.MovementAntiBot;
import com.mentalfrostbyte.jello.settings.ModeSetting;

public class AntiBot extends Module {
    public AntiBot() {
        super(ModuleCategory.COMBAT, "AntiBot", "Avoid the client to focus bots.");
        this.registerSetting(
                new ModeSetting("Mode", "Mode", 0, "Advanced", "Hypixel").addObserver(var1 -> this.setup()));
    }

    @Override
    public void initialize() {
        if (this.isEnabled()) {
            this.setup();
        }
    }

    @Override
    public void onEnable() {
        this.setup();
    }

    @Override
    public void onDisable() {
        Client.getInstance().combatManager.antiBot = null;
        Client.getInstance().combatManager.bots.clear();
    }

    private void setup() {
        Client.getInstance().combatManager.bots.clear();
        String mode = this.getStringSettingValueByName("Mode");
        switch (mode) {
            case "Advanced":
                Client.getInstance().combatManager.antiBot = new MovementAntiBot();
                break;
            case "Hypixel":
                Client.getInstance().combatManager.antiBot = new HypixelAntiBot();
        }
    }
}
