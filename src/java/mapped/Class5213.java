package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4408;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5213 extends Module {
    private boolean field23540;

    public Class5213() {
        super(ModuleCategory.MOVEMENT, "NoSlow", "Stops slowdown when using an item");
        this.registerSetting(new ModeSetting("Mode", "NoSlow mode", 0, "Vanilla", "NCP"));
    }

    @EventTarget
    private void method16233(Class4408 var1) {
        if (this.method15996()) {
            var1.method13900(true);
        }
    }

    @EventTarget
    private void method16234(Class4399 var1) {
        if (this.method15996()) {
            boolean var4 = Client.getInstance().getModuleManager().method14662(Class5357.class).method15988();
            boolean var5 = mc.player.method3090() != null && mc.player.method3090().getItem() instanceof Class3267;
            if (!var1.method13921()) {
                if (var5 && mc.gameSettings.keyBindUseItem.isKeyDown() && !this.field23540 && !var4 && this.getStringSettingValueByName("Mode").equals("NCP")) {
                    Class5628.method17733();
                    this.field23540 = true;
                } else if (!var5 && this.field23540) {
                    this.field23540 = false;
                }
            } else if (!this.getStringSettingValueByName("Mode").equals("NCP")) {
                if (this.field23540 && !mc.gameSettings.keyBindUseItem.isKeyDown()) {
                    this.field23540 = false;
                }
            } else if (this.field23540 && mc.gameSettings.keyBindUseItem.isKeyDown() && !var4) {
                if (var5) {
                    Class5628.method17734();
                }

                this.field23540 = false;
            }
        }
    }
}
