package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.MovementAntiBot;

public class AntiBot extends Module {
    public AntiBot() {
        super(ModuleCategory.COMBAT, "AntiBot", "Avoid the client to focus bots.");
        this.registerSetting(new ModeSetting("Mode", "Mode", 0, "Advanced", "Hypixel").method18616(var1 -> this.setup()));
    }

    @Override
    public void method15953() {
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
        Client.getInstance().getCombatManager().field35946 = null;
        Client.getInstance().getCombatManager().bots.clear();
    }

    private void setup() {
        Client.getInstance().getCombatManager().bots.clear();
        String var3 = this.getStringSettingValueByName("Mode");
        switch (var3) {
            case "Advanced":
                Client.getInstance().getCombatManager().field35946 = new MovementAntiBot();
                break;
            case "Hypixel":
                Client.getInstance().getCombatManager().field35946 = new HypixelAntiBot();
        }
    }
}
