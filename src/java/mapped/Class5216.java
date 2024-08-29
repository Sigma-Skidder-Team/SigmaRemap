package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

import java.util.Random;

public class Class5216 extends Module {
    private int field23548;

    public Class5216() {
        super(ModuleCategory.COMBAT, "AutoClicker", "Longpress your attack keybind to hit entities automaticly");
    }

    @EventTarget
    private void method16244(TickEvent var1) {
        if (this.method15996()) {
            this.field23548++;
            Random var4 = new Random();
            byte var5 = 2;
            byte var6 = 4;
            int var7 = var4.nextInt(var6 - var5) + var5;
            if (mc.gameSettings.keyBindAttack.isKeyDown() && this.field23548 >= var7) {
                mc.player.swingArm(Hand.MAIN_HAND);
                this.field23548 = 0;
                if (Class5628.method17711(mc.player.field5031, mc.player.field5032, 4.6F, 0.0) != null) {
                    mc.getConnection()
                            .sendPacket(
                                    new CUseEntityPacket(
                                            Class5628.method17711(mc.player.field5031, mc.player.field5032, 4.6F, 0.0), mc.player.method3331()
                                    )
                            );
                    mc.player.swingArm(Hand.MAIN_HAND);
                }
            }
        }
    }
}
