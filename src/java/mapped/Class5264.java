package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;

public class Class5264 extends PremiumModule {
    private int field23678;
    private int field23679;
    private int field23680;
    private int field23681;

    public Class5264() {
        super("Hypixel", "Hypixel bypass", ModuleCategory.PLAYER);
        this.method15972(new Class6004("Fire resistance potions", "Automatically drink fire pots", true));
        this.field23678 = -1;
        this.field23681 = -1;
    }

    @Override
    public void method15966() {
        this.field23678 = -1;
        this.field23680 = 20;
        this.field23681 = -1;
    }

    @EventTarget
    public void method16472(Class4399 var1) {
        if (this.method15996() && var1.method13921() && !(field23386.field1355 instanceof Class868)) {
            if (this.field23680 < 20) {
                this.field23680++;
            }

            if (this.field23681 == -1 && this.field23680 >= 20 && this.field23678 == -1) {
                if (field23386.field1339.method3042() <= this.method16004().method15977("Health") * 2.0F && field23386.field1339.method2959() == 0.0F) {
                    this.field23681 = ((Class5331) this.method16004()).method16749(false);
                    if (this.field23681 >= 0) {
                        this.field23678 = 0;
                        this.field23680 = 0;
                    }
                }

                if (this.field23678 == -1 && this.method15974("Fire resistance potions") && !field23386.field1339.method3033(Class7144.method22287(12))) {
                    this.field23681 = ((Class5331) this.method16004()).method16749(true);
                    if (this.field23681 >= 0) {
                        this.field23678 = 0;
                        this.field23680 = 0;
                    }
                }
            }

            if (this.field23681 >= 0 && this.field23678 >= 0) {
                this.field23678++;
                if (this.field23678 == 2) {
                    var1.method13916(var1.method13915() + 1.0F);
                }

                if (this.field23678 != 1) {
                    if (this.field23678 >= 3) {
                        field23386.getClientPlayNetHandler().sendPacket(new Class5555(Class79.field182));
                        field23386.getClientPlayNetHandler().sendPacket(new Class5539(this.field23681 + (this.field23681 != 8 ? 1 : -1)));
                        field23386.getClientPlayNetHandler().sendPacket(new Class5539(this.field23681));
                        field23386.field1339.field4902.field5443 = this.field23679;
                        this.field23679 = -1;
                        this.field23678 = -1;
                        this.field23681 = -1;
                    }
                } else {
                    this.field23679 = field23386.field1339.field4902.field5443;
                    field23386.field1339.field4902.field5443 = this.field23681;
                }
            }
        }
    }
}
