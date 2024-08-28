package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4426;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.impl.Class4430;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.Class8005;

public class Class5200 extends Module {
    public int field23511 = -1;

    public Class5200() {
        super(ModuleCategory.ITEM, "AutoTools", "Picks the best tool when breaking blocks");
        this.method15972(new Class6005("Inv Mode", "The way it will move tools in your inventory", 0, "Basic", "OpenInv", "FakeInv"));
    }

    @EventTarget
    public void method16189(Class4426 var1) {
        if (this.method15996() && mc.field1339 != null && var1.method13973() == 0) {
            if (this.field23511 != -1) {
                mc.field1339.field4902.field5443 = this.field23511;
                this.field23511 = -1;
            }
        }
    }

    @EventTarget
    private void method16190(Class4430 var1) {
        if (this.method15996() && mc.field1339 != null && var1.method13977() == 0) {
            this.method16192(var1.method13979());
        }
    }

    @EventTarget
    private void method16191(TickEvent var1) {
        if (this.method15996() && mc.field1339 != null && mc.field1299.field44643.method8509()) {
            this.method16192(null);
        }
    }

    public void method16192(BlockPos var1) {
        BlockPos var4 = var1 == null
                ? (mc.field1346.method31417() != Class2100.field13690 ? null : ((Class8711) mc.field1346).method31423())
                : var1;
        if (var4 != null) {
            int var5 = Class7789.method25837(mc.field1338.method6738(var4));
            if (var5 != -1) {
                if (mc.field1339.field4902.field5443 != var5 % 9 && this.field23511 == -1) {
                    this.field23511 = mc.field1339.field4902.field5443;
                }

                if (var5 >= 36 && var5 <= 44) {
                    mc.field1339.field4902.field5443 = var5 % 9;
                } else if (Client.getInstance().method19939().method31333() > 1) {
                    String var6 = this.getStringSettingValueByName("Inv Mode");
                    if (var6.equals("OpenInv") && !(mc.field1355 instanceof Class859)) {
                        return;
                    }

                    if (var6.equals("FakeInv") && Class8005.method27349() <= Class5989.field26136.method18582()) {
                        mc.getClientPlayNetHandler().sendPacket(new Class5564(Class2175.field14279));
                    }

                    mc.field1339.field4902.field5443 = Class7789.method25857(var5);
                    if (var6.equals("FakeInv")) {
                        mc.getClientPlayNetHandler().sendPacket(new Class5482(-1));
                    }
                }
            }
        }
    }
}
