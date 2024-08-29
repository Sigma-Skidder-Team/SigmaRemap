package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.Class7248;

public class Class5288 extends Module {
    public Class5288() {
        super(ModuleCategory.COMBAT, "AntiBot", "Avoid the client to focus bots.");
        this.registerSetting(new ModeSetting("Mode", "Mode", 0, "Advanced", "Hypixel").method18616(var1 -> this.method16603()));
    }

    @Override
    public void method15953() {
        if (this.isEnabled()) {
            this.method16603();
        }
    }

    @Override
    public void onEnable() {
        this.method16603();
    }

    @Override
    public void onDisable() {
        Client.getInstance().getCombatManager().field35946 = null;
        Client.getInstance().getCombatManager().field35947.clear();
    }

    private void method16603() {
        Client.getInstance().getCombatManager().field35947.clear();
        String var3 = this.getStringSettingValueByName("Mode");
        switch (var3) {
            case "Advanced":
                Client.getInstance().getCombatManager().field35946 = new Class7248();
                break;
            case "Hypixel":
                Client.getInstance().getCombatManager().field35946 = new Class7250();
        }
    }
}
