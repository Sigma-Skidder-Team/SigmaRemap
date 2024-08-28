package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

import java.util.Iterator;

public class Class5348 extends Module {
    private int field23902;
    private int field23903;
    private boolean field23904;

    public Class5348() {
        super(ModuleCategory.MOVEMENT, "AGC", "A fly for AntiGamingChair");
    }

    @Override
    public void isInDevelopment() {
        this.field23902 = 0;
        if (!mc.gameSettings.field44637.method8509()) {
            this.field23904 = false;
        } else {
            mc.gameSettings.field44637.field13071 = false;
            this.field23904 = true;
        }

        this.field23903 = 1;
    }

    @EventTarget
    private void method16780(Class4430 var1) {
        if (this.method15996()) {
            if (var1.method13977() == mc.gameSettings.field44637.field13070.field34875) {
                var1.method13900(true);
                this.field23904 = true;
            }
        }
    }

    @EventTarget
    private void method16781(Class4426 var1) {
        if (this.method15996()) {
            if (var1.method13973() == mc.gameSettings.field44637.field13070.field34875) {
                var1.method13900(true);
                this.field23904 = false;
            }
        }
    }

    @Override
    public void method15965() {
        Class9567.method37090(0.0);
        if (mc.player.method3433().field18049 > 0.0) {
            Class5628.method17725(-0.0789);
        }
    }

    @EventTarget
    @LowerPriority
    public void method16782(Class4435 var1) {
        if (this.method15996()) {
            if (this.field23902 <= (this.field23903 != 3 ? this.field23903 : 1) - 2) {
                if (this.field23902 == -1) {
                    var1.method13995(this.field23903 != 3 ? 0.001 : 0.095);
                    if (this.field23903 != 3) {
                        Class9567.method37088(var1, 0.32);
                    }

                    Class5628.method17725(var1.method13994());
                }
            } else {
                var1.method13995(0.0);
                Class9567.method37088(var1, 0.0);
            }
        }
    }

    @EventTarget
    public void method16783(Class4399 var1) {
        if (this.method15996() && var1.method13921()) {
            this.field23902++;
            if (this.field23902 != (this.field23903 != 3 ? this.field23903 : 1)) {
                if (this.field23902 > (this.field23903 != 3 ? this.field23903 : 1)) {
                    if (this.field23902 % 20 != 0) {
                        var1.method13900(true);
                    } else {
                        double var4 = this.method16785();
                        var1.method13912(var4 - 1.0E-4);
                        var1.method13908(true);
                        var1.method13920(true);
                    }
                }
            } else {
                double var6 = this.method16785();
                var1.method13912(var6 - 1.0E-4);
                var1.method13920(true);
                var1.method13908(true);
                this.field23903 = !this.field23904
                        ? (!mc.gameSettings.field44636.method8509() ? 1 : 3)
                        : (!mc.gameSettings.field44636.method8509() ? 2 : 1);
            }
        }
    }

    @EventTarget
    public void method16784(Class4396 var1) {
        if (this.method15996()) {
            Packet var4 = var1.method13898();
            if (var4 instanceof Class5473) {
                Class5473 var5 = (Class5473) var4;
                if (this.field23902 >= (this.field23903 != 3 ? this.field23903 : 1)) {
                    this.field23902 = -1;
                }

                var5.field24300 = mc.player.field5031;
                var5.field24301 = mc.player.field5032;
            }
        }
    }

    private double method16785() {
        if (!(mc.player.getPositionVec().field18049 < 1.0)) {
            if (!mc.player.field5036) {
                Class6488 var3 = mc.player.field5035.method19662(0.0, -mc.player.getPositionVec().field18049, 0.0);
                Iterator var4 = mc.world.method7055(mc.player, var3).iterator();
                double var5 = -1.0;
                BlockPos var7 = null;

                while (var4.hasNext()) {
                    Class6408 var8 = (Class6408) var4.next();
                    if (var8.method19514().field28453 > var5) {
                        var5 = var8.method19514().field28453;
                        var7 = new BlockPos(var8.method19514().field28449, var8.method19514().field28450, var8.method19514().field28451);
                    }
                }

                if (var7 != null) {
                    Block var9 = mc.world.method6738(var7).method23383();
                    if (var9 instanceof Class3410) {
                        var5 = (double) ((int) var5) - 1.0E-4;
                    }
                }

                return var5;
            } else {
                return mc.player.getPosY();
            }
        } else {
            return -1.0;
        }
    }
}
