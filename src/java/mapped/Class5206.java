package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.Class8005;

public class Class5206 extends Module {
    public Class5206() {
        super(ModuleCategory.MOVEMENT, "FastLadder", "Allows you to climp ladders faster");
        this.registerSetting(new NumberSetting<Float>("Motion", "Climbing motion", 0.35F, Float.class, 0.2F, 1.0F, 0.05F));
        this.registerSetting(new ModeSetting("Down mode", "The way you will go down on ladders", 0, "None", "OnSneak", "Always"));
    }

    @EventTarget
    private void method16217(Class4435 var1) {
        if (this.isEnabled() && mc.player.method3063()) {
            boolean var4 = Class8005.method27349() >= Class5989.field26130.method18582() || mc.getCurrentServerData() == null;
            if (!mc.player.collidedHorizontally && (!mc.player.field4981 || !var4)) {
                if (this.getStringSettingValueByName("Down mode").equals("OnSneak") && mc.gameSettings.keyBindSneak.isKeyDown()
                        || this.getStringSettingValueByName("Down mode").equals("Always")) {
                    var1.method13995(-this.getNumberValueBySettingName("Motion"));
                }
            } else {
                var1.method13995(this.getNumberValueBySettingName("Motion"));
            }
        }
    }
}
