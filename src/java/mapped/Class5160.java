package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4422;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5160 extends Module {
    private int field23424;
    private double field23425;
    private double field23426;
    private double field23427;

    public Class5160() {
        super(ModuleCategory.MOVEMENT, "Hawk", "A fly for Hawk anticheat");
    }

    @Override
    public void method15966() {
        this.field23425 = field23386.field1339.getPosX();
        this.field23426 = field23386.field1339.getPosY();
        this.field23427 = field23386.field1339.getPosZ();
        this.field23424 = 0;
    }

    @Override
    public void method15965() {
        Class9567.method37090(0.0);
        if (field23386.field1339.method3433().field18049 > 0.0) {
            Class5628.method17725(-0.0789);
        }
    }

    @EventTarget
    @LowerPriority
    public void method16052(Class4435 var1) {
        if (this.method15996()) {
            double var4 = 0.125;
            if (this.field23424 != -1) {
                if (this.field23424 == 0) {
                    Class9567.method37088(var1, 0.18);
                }
            } else {
                var1.method13995(0.015);
                Class9567.method37088(var1, var4);
            }

            Class5628.method17725(var1.method13994());
            Class5628.method17724(var1.method13992());
            Class5628.method17726(var1.method13996());
        }
    }

    @EventTarget
    public void method16053(Class4399 var1) {
        if (this.method15996() && var1.method13921()) {
            this.field23424++;
            if (this.field23424 == 1) {
                var1.method13912(0.1);
            }

            var1.method13908(true);
            var1.method13920(false);
        }
    }

    @EventTarget
    public void method16054(Class4396 var1) {
        if (this.method15996()) {
            Packet var4 = var1.method13898();
            if (var4 instanceof Class5473) {
                Class5473 var5 = (Class5473) var4;
                if (this.field23424 >= 1) {
                    this.field23424 = -1;
                }

                this.field23425 = var5.field24297;
                this.field23426 = var5.field24298;
                this.field23427 = var5.field24299;
                var5.field24300 = field23386.field1339.field5031;
                var5.field24301 = field23386.field1339.field5032;
            }
        }
    }

    @EventTarget
    public void method16055(Class4422 var1) {
        if (this.method15996()) {
            double var4 = this.field23426;
            double var6 = this.field23425;
            double var8 = this.field23427;
            field23386.field1339.field5028.field18049 = var4;
            field23386.field1339.field5049 = var4;
            field23386.field1339.field4915 = var4;
            field23386.field1339.field5026 = var4;
            field23386.field1339.field5028.field18048 = var6;
            field23386.field1339.field5048 = var6;
            field23386.field1339.field4914 = var6;
            field23386.field1339.field5025 = var6;
            field23386.field1339.field5028.field18050 = var8;
            field23386.field1339.field5050 = var8;
            field23386.field1339.field4916 = var8;
            field23386.field1339.field5027 = var8;
        }
    }
}
