package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.event.impl.Class4403;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.timer.Timer;
import net.minecraft.entity.Entity;

public class Class5375 extends Module {
    private final Timer field23998 = new Timer();
    private boolean field23999;

    public Class5375() {
        super(ModuleCategory.COMBAT, "Packet", "Packet criticals");
        this.registerSetting(new NumberSetting<Integer>("HurtTime", "The hurtTime to crit at", 15.0F, Integer.class, 0.0F, 20.0F, 1.0F));
        this.registerSetting(new ModeSetting("Mode", "Mode", 0, "Basic", "Hypixel"));
    }

    @EventTarget
    private void method16923(Class4403 var1) {
        if (this.isEnabled() && var1.method13935() != null && var1.method13937()) {
            Entity var4 = var1.method13935();
            if (var4 instanceof Class880
                    && var4.hurtResistantTime <= (int) this.getNumberValueBySettingName("HurtTime")
                    && Class5330.field23887 > 1
                    && (this.field23998.method27121() > 200L || var4.hurtResistantTime > 0)
                    && mc.player.onGround
                    && mc.player.collidedVertically) {
                double[] var5 = new double[]{0.2, 0.0};
                if (this.getStringSettingValueByName("Mode").equals("Hypixel")) {
                    var5 = new double[]{
                            0.0624 + Class5628.method17750(), 1.0E-14 + Class5628.method17750(), 0.0624 + Class5628.method17750(), 1.0E-14 + Class5628.method17750()
                    };
                }

                for (int var6 = 0; var6 < var5.length; var6++) {
                    mc.getConnection()
                            .sendPacket(
                                    new Class5605(mc.player.getPosX(), mc.player.getPosY() + var5[var6], mc.player.getPosZ(), false)
                            );
                }

                this.field23999 = true;
                this.field23998.method27120();
            }
        }
    }

    @EventTarget
    @HigherPriority
    private void method16924(SendPacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.method13932() instanceof Class5603) {
                if (!this.field23998.method27123()) {
                    this.field23998.method27118();
                }

                if (this.field23999 && mc.player.onGround) {
                    var1.method13900(true);
                    this.field23999 = false;
                }
            }
        }
    }
}
