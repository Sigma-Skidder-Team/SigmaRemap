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
        if (this.method15996() && mc.player != null && !mc.player.abilities.isCreativeMode) {
            ItemStack var3 = mc.player.method2943(Class2106.field13732);
            if (var3.getItem() != Items.field38126) {
                int var4 = Class7789.method25822(Items.field38126);
                if (var4 != -1) {
                    mc.playerController.method23144(0, var4 >= 9 ? var4 : var4 + 36, 0, Class2259.field14694, mc.player);
                    mc.playerController.method23144(0, 45, 0, Class2259.field14694, mc.player);
                    mc.playerController.method23144(0, var4 >= 9 ? var4 : var4 + 36, 0, Class2259.field14694, mc.player);
                }
            }
        }
    }
}
