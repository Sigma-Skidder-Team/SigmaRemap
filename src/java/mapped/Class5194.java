package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5194 extends Module {
    public int field23503 = -1;

    public Class5194() {
        super(ModuleCategory.ITEM, "AutoTotem", "Automatically equips a totem in your second hand");
    }

    @EventTarget
    private void method16175(TickEvent var1) {
        this.method16177();
    }

    @EventTarget
    private void method16176(Class4399 var1) {
        if (!var1.method13921()) {
            this.method16177();
        }
    }

    @Override
    public String method15990() {
        return this.method15991();
    }

    private void method16177() {
        if (this.method15996() && mc.field1339 != null && !mc.field1339.field4919.field29609) {
            ItemStack var3 = mc.field1339.method2943(Class2106.field13732);
            if (var3.method32107() != Class8514.field38126) {
                int var4 = Class7789.method25822(Class8514.field38126);
                if (var4 != -1) {
                    mc.field1337.method23144(0, var4 >= 9 ? var4 : var4 + 36, 0, Class2259.field14694, mc.field1339);
                    mc.field1337.method23144(0, 45, 0, Class2259.field14694, mc.field1339);
                    mc.field1337.method23144(0, var4 >= 9 ? var4 : var4 + 36, 0, Class2259.field14694, mc.field1339);
                }
            }
        }
    }
}
