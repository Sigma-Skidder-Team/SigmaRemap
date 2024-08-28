package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5313 extends Module {
    public float field23850 = 1.0F;

    public Class5313() {
        super(ModuleCategory.RENDER, "Fullbright", "Makes you see in the dark");
        this.method15972(new Class6005("Type", "Fullbright type", 0, "Normal"));
    }

    @Override
    public void method15953() {
        if (!this.method15996()) {
            mc.field1299.field44672 = 1.0;
        }
    }

    @Override
    public void isInDevelopment() {
        if (this.getStringSettingValueByName("Type").equals("Normal")) {
            mc.field1299.field44672 = 999.0;
        }
    }

    @EventTarget
    public void method16691(TickEvent var1) {
        if (this.method15996()) {
            mc.field1299.field44672 = 999.0;
            if (mc.field1338 != null) {
                if (!this.getStringSettingValueByName("Type").equals("Normal")) {
                    int var4 = 16;
                    BlockPos var5 = new BlockPos(mc.field1339.getPosX(), mc.field1339.getPosY(), mc.field1339.getPosZ())
                            .method8311();
                    Class1670 var6 = mc.field1338.method7011(var5);
                    if (var6 != null && var5.getY() >= 0 && var5.getY() < 256 && !var6.method7095()) {
                        var4 -= var6.method7032(var5);
                    }

                    this.field23850 = this.field23850 + ((float) var4 - this.field23850) * 0.2F;
                    if (!(this.field23850 < 1.5F)) {
                        mc.field1299.field44672 = Math.min(Math.max(1.0F, this.field23850), 10.0F);
                    }
                }
            }
        }
    }

    @Override
    public void method15965() {
        mc.field1299.field44672 = 1.0;
    }
}
