package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.util.InDevelopment;

@InDevelopment
public class Class5318 extends Module {
    public Class5318() {
        super(ModuleCategory.MISC, "PacketEssentials", "Ignores all types of junk cosmetic packets to improve fps");
    }

    @EventTarget
    private void method16709(Class4396 var1) {
        if (this.method15996()) {
            if (!(var1.method13898() instanceof Class5487)) {
                if (!(var1.method13898() instanceof Class5582)) {
                    if (!(var1.method13898() instanceof Class5547)) {
                        if (!(var1.method13898() instanceof Class5472)) {
                            if (!(var1.method13898() instanceof Class5576)) {
                                if (var1.method13898() instanceof Class5553) {
                                    var1.method13900(true);
                                }
                            } else {
                                var1.method13900(true);
                            }
                        } else {
                            var1.method13900(true);
                        }
                    } else {
                        Class5547 var4 = (Class5547) var1.method13898();
                        var1.method13900(true);
                    }
                } else {
                    Class5582 var5 = (Class5582) var1.method13898();
                    if (var5.method17537() == 1) {
                        var1.method13900(true);
                    }
                }
            } else {
                Class5487 var6 = (Class5487) var1.method13898();
                if (var6.method17266() == EntityType.field41006) {
                    var1.method13900(true);
                }

                if (var6.method17266() == EntityType.field41035) {
                    var1.method13900(true);
                }
            }
        }
    }
}
