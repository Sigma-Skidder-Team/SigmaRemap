package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4426;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.impl.Class4430;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;

public class Class5256 extends PremiumModule {
    public boolean field23643 = false;

    public Class5256() {
        super("BoatFly", "Fly with a boat", ModuleCategory.MOVEMENT);
        this.registerSetting(new NumberSetting<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.28F, 10.0F, 0.01F));
    }

    @EventTarget
    public void method16416(TickEvent var1) {
        if (this.isEnabled()) {
            if (mc.player.getRidingEntity() != null) {
                float var4 = Class9567.method37086();
                float var5 = this.getNumberValueBySettingName("Speed");
                double var6 = Math.cos(Math.toRadians(var4)) * (double) var5;
                double var8 = Math.sin(Math.toRadians(var4)) * (double) var5;
                if (!Class9567.method37087()) {
                    var6 = 0.0;
                    var8 = 0.0;
                }

                Entity var10 = mc.player.getRidingEntity();
                var10.rotationYaw = mc.player.rotationYaw;
                var10.method3435(var6, !mc.player.field4981 ? (!this.field23643 ? 0.0 : (double) (-var5)) : (double) var5, var8);
            }
        }
    }

    @EventTarget
    private void method16417(Class4430 var1) {
        if (this.isEnabled()) {
            if (mc.player.getRidingEntity() != null) {
                if (!mc.player.getRidingEntity().onGround) {
                    if (var1.method13977() == mc.gameSettings.keyBindSneak.field13070.field34875) {
                        var1.method13900(true);
                        this.field23643 = true;
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16418(Class4426 var1) {
        if (this.isEnabled()) {
            if (this.field23643 && var1.method13973() == mc.gameSettings.keyBindSneak.field13070.field34875) {
                this.field23643 = false;
            }

            if (mc.player.getRidingEntity() != null) {
                if (!mc.player.getRidingEntity().onGround) {
                    if (var1.method13973() == mc.gameSettings.keyBindSneak.field13070.field34875) {
                        var1.method13900(true);
                        this.field23643 = false;
                    }
                }
            }
        }
    }

    @Override
    public void onEnable() {
        if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
            if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
                this.field23643 = false;
            }
        } else {
            mc.gameSettings.keyBindSneak.field13071 = false;
            this.field23643 = true;
        }
    }

    @Override
    public void onDisable() {
        mc.gameSettings.keyBindSneak.field13071 = this.field23643;
    }
}
