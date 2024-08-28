package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4429;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5309 extends Module {
    public Class5309() {
        super(ModuleCategory.COMBAT, "InteractRange", "Allows you to interact farer away");
        this.method15972(new Class6009<Float>("Range", "Range value", 4.0F, Float.class, 3.0F, 8.0F, 0.01F));
    }

    @EventTarget
    private void method16684(Class4429 var1) {
        if (this.method15996()) {
            Entity var4 = Class5628.method17711(field23386.field1339.field5031, field23386.field1339.field5032, this.method15977("Range"), 0.0);
            Class8711 var5 = Class9217.method34567(field23386.field1339.field5031, field23386.field1339.field5032, this.method15977("Range"));
            if (var4 != null && field23386.field1346.method31417() == Class2100.field13689) {
                field23386.field1346 = new Class8709(var4);
            }

            if (var4 == null && field23386.field1346.method31417() == Class2100.field13689 && var5 != null) {
                field23386.field1346 = var5;
            }
        }
    }
}
