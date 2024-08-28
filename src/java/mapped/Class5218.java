package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4401;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.impl.Class4430;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5218 extends Module {
    private int field23549 = -1;
    private int field23550;
    private int field23551;

    public Class5218() {
        super(ModuleCategory.PLAYER, "Basic", "Basic AutoGapple");
    }

    @Override
    public void isInDevelopment() {
        this.field23549 = -1;
        this.field23551 = 20;
    }

    @EventTarget
    public void method16246(Class4401 var1) {
        if (this.method15996()) {
            if (this.field23549 >= 0) {
                var1.method13900(true);
            }
        }
    }

    @EventTarget
    public void method16247(Class4430 var1) {
        if (this.method15996()) {
            int var4 = mc.field1299.field44655.length;

            for (int var5 = 0; var5 < var4; var5++) {
                Class2007 var6 = mc.field1299.field44655[var5];
                String var7 = var6.method8513();
                int var8 = Integer.parseInt(String.valueOf(var7.charAt(var7.length() - 1)));
                if (var1.method13977() == var6.field13070.field34875 && var8 - 1 != mc.field1339.field4902.field5443) {
                    this.field23549 = -1;
                    this.field23551 = 0;
                }
            }
        }
    }

    @EventTarget
    public void method16248(TickEvent var1) {
        if (this.method15996()) {
            if (this.field23551 < 20) {
                this.field23551++;
            }

            int var4 = -1;
            if (mc.field1339.method3042() <= this.method16004().method15977("Health") * 2.0F) {
                var4 = ((Class5331) this.method16004()).method16749(false);
                if (this.field23549 == -1 && this.field23551 >= 20 && var4 != -1) {
                    this.field23549 = 0;
                    this.field23551 = 0;
                }
            }

            if (var4 >= 0 || this.field23549 != -1) {
                if (this.field23549 >= 0) {
                    this.field23549++;
                    if (this.field23549 != 1) {
                        if (this.field23549 > 1
                                && mc.field1339.method3094(Class79.field182).method32107() != Class8514.field37872
                                && mc.field1339.method3094(Class79.field182).method32107() != Class8514.field37873) {
                            mc.field1339.field4902.field5443 = this.field23550;
                            this.field23550 = -1;
                            this.field23549 = -1;
                        }
                    } else {
                        this.field23550 = mc.field1339.field4902.field5443;
                        mc.field1339.field4902.field5443 = var4;
                        mc.field1337.method23138();
                        mc.field1337.method23140(mc.field1339, mc.field1338, Class79.field182);
                    }
                }
            }
        }
    }

    @EventTarget
    public void method16249(Class4396 var1) {
        if (this.method15996() && this.field23549 > 1) {
            Packet var4 = var1.method13898();
            if (var4 instanceof Class5553) {
                Class5553 var5 = (Class5553) var4;
                if (var5.method17470() == mc.field1339.method3205()) {
                    for (Class9773 var7 : var5.method17469()) {
                        Class9289 var8 = var7.method38447();
                        if (var8.method35015() == 14) {
                            mc.field1339.field4902.field5443 = this.field23550;
                            this.field23550 = -1;
                            this.field23549 = -1;
                        }
                    }
                }
            }
        }
    }
}
