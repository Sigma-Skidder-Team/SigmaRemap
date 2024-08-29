package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5193 extends Module {
    private int field23501;
    private double field23502;

    public Class5193() {
        super(ModuleCategory.MOVEMENT, "Cubecraft", "Longjump for Cubecraft.");
        this.registerSetting(new NumberSetting<Float>("Boost", "Longjump boost", 3.0F, Float.class, 1.0F, 5.0F, 0.01F));
    }

    @Override
    public void onDisable() {
        Class9567.method37090(Class9567.method37075() * 0.8);
        mc.timer.field40360 = 1.0F;
    }

    @Override
    public void onEnable() {
        this.field23501 = -1;
        mc.timer.field40360 = 0.3F;
    }

    @EventTarget
    public void method16174(TickEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            if (!Class5628.method17730(mc.player, 0.001F)) {
                this.field23501++;
                this.field23502 -= 0.005;
                if (this.field23502 < 0.26 || this.field23501 > 6) {
                    this.field23502 = 0.26;
                }

                Class9567.method37090(this.field23502);
                if (this.field23501 > 5) {
                    this.method16004().method16000();
                }
            } else {
                if (this.field23501 > 0) {
                    Class9567.method37090(0.0);
                    this.method16004().method16000();
                    this.field23501 = 0;
                }

                double var4 = mc.player.getPosX();
                double var6 = mc.player.getPosY();
                double var8 = mc.player.getPosZ();
                int var10 = 49 + Class9567.method37079() * 17;

                for (int var11 = 0; var11 < var10; var11++) {
                    mc.getConnection().sendPacket(new Class5605(var4, var6 + 0.06248, var8, false));
                    mc.getConnection().sendPacket(new Class5605(var4, var6, var8, false));
                }

                mc.getConnection().sendPacket(new Class5605(var4, var6, var8, true));
                Class5628.method17725(Class9567.method37080());
                this.field23501 = 0;
                this.field23502 = this.getNumberValueBySettingName("Boost") / 2.0F;
                Class9567.method37090(this.field23502);
            }
        }
    }
}
