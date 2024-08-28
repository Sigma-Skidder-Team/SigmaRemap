package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4426;
import com.mentalfrostbyte.jello.event.impl.Class4430;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5225 extends Module {
    private double field23569;
    private boolean field23570;
    private boolean field23571;

    public Class5225() {
        super(ModuleCategory.MOVEMENT, "Spartan", "A fly for Spartan anticheat");
        this.method15972(new Class6004("Ground Spoof", "Send on ground packets", true));
        this.method15972(new Class6004("Fake Block", "Send on fake blockplacing packet", true));
    }

    @Override
    public void isInDevelopment() {
        this.field23570 = false;
        this.field23569 = -10.0;
        if (!mc.field1299.field44637.method8509()) {
            this.field23571 = false;
        } else {
            mc.field1299.field44637.field13071 = false;
            this.field23571 = true;
        }
    }

    @EventTarget
    private void method16268(Class4430 var1) {
        if (this.method15996()) {
            if (var1.method13977() == mc.field1299.field44637.field13070.field34875) {
                var1.method13900(true);
                this.field23571 = true;
            }
        }
    }

    @EventTarget
    private void method16269(Class4426 var1) {
        if (this.method15996()) {
            if (var1.method13973() == mc.field1299.field44637.field13070.field34875) {
                var1.method13900(true);
                this.field23571 = false;
            }
        }
    }

    @EventTarget
    public void method16270(Class4399 var1) {
        if (this.method15996() && var1.method13921() && this.method15974("Ground Spoof")) {
            if (this.field23570) {
                this.field23570 = !this.field23570;
                var1.method13920(true);
            }
        }
    }

    @EventTarget
    public void method16271(Class4435 var1) {
        if (this.method15996()) {
            boolean var4 = mc.field1339.field5036 || Class5628.method17730(mc.field1339, 0.001F);
            if (!var4) {
                if (var1.method13994() < 0.0) {
                    if (this.field23569 != mc.field1339.getPositionVec().field18049) {
                        if (mc.field1339.getPositionVec().field18049 + var1.method13994() < this.field23569) {
                            this.field23570 = true;
                            int var5 = this.method16272();
                            boolean var6 = this.method15974("Fake Block");
                            if (var5 >= 0 && var6) {
                                mc.getClientPlayNetHandler().sendPacket(new Class5539(var5));
                            }

                            if (var6 && (var5 >= 0 || mc.field1339.getHeldItem(Hand.field182).method32107() instanceof Class3292)) {
                                Class8711 var7 = new Class8711(
                                        mc.field1339.getPositionVec().method11339(0.0, -2.0, 0.0),
                                        Direction.field673,
                                        mc.field1339.method3432().method8336(0, -2, 0),
                                        false
                                );
                                Class5570 var8 = new Class5570(Hand.field182, var7);
                                mc.getClientPlayNetHandler().sendPacket(var8);
                            }

                            if (var5 >= 0 && var6) {
                                mc.getClientPlayNetHandler().sendPacket(new Class5539(mc.field1339.field4902.field5443));
                            }

                            var1.method13995(this.field23569 - mc.field1339.getPositionVec().field18049);
                        }
                    } else {
                        mc.field1339.method2914();
                        var1.method13995(mc.field1339.method3433().field18049);
                        this.field23569 = !mc.field1299.field44636.method8509()
                                ? (!this.field23571 ? mc.field1339.getPositionVec().field18049 : mc.field1339.getPositionVec().field18049 - 1.0)
                                : (!this.field23571 ? mc.field1339.getPositionVec().field18049 + 1.0 : mc.field1339.getPositionVec().field18049);
                        Class9567.method37088(var1, 0.35);
                    }
                }
            } else {
                mc.field1339.method2914();
                var1.method13995(mc.field1339.method3433().field18049);
                Class9567.method37088(var1, 0.35);
                this.field23569 = !mc.field1299.field44636.method8509()
                        ? (!this.field23571 ? mc.field1339.getPositionVec().field18049 : mc.field1339.getPositionVec().field18049 - 1.0)
                        : (!this.field23571 ? mc.field1339.getPositionVec().field18049 + 1.0 : mc.field1339.getPositionVec().field18049);
            }

            Class5628.method17724(var1.method13992());
            Class5628.method17725(var1.method13994());
            Class5628.method17726(var1.method13996());
        }
    }

    public int method16272() {
        for (int var3 = 36; var3 < 45; var3++) {
            if (mc.field1339.field4904.method18131(var3).method18266()) {
                ItemStack var4 = mc.field1339.field4904.method18131(var3).method18265();
                if (var4.method32107() instanceof Class3292) {
                    if (var3 - 36 == mc.field1339.field4902.field5443) {
                        var3 = 34;
                    }

                    return var3 - 36;
                }
            }
        }

        return -1;
    }
}
