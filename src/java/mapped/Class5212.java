package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5212 extends Module {
    private float field23538;
    private boolean field23539;

    public Class5212() {
        super(ModuleCategory.WORLD, "Weather", "Removes rain and changes the world's time");
        this.method15972(new Class6004("Custom time", "Set the world time", true));
        this.method15972(new Class6009<Float>("Time", "Time to set the world to", 12000.0F, Float.class, 0.0F, 24000.0F, 1.0F).method18616(var1 -> {
            if (this.method15974("Custom time") && this.method15996()) {
                mc.world.method6834(-((long) this.method15977("Time")));
            }
        }));
        this.method15972(new Class6004("Disable rain", "Disable rain", true));
    }

    @Override
    public void isInDevelopment() {
        this.field23538 = mc.world.method6792(1.0F);
        if (mc.world.method6792(1.0F) != 1.0F) {
            if (mc.world.method6792(1.0F) == 0.0F) {
                this.field23539 = false;
            }
        } else {
            this.field23539 = true;
        }

        mc.world.method6834((long) this.method15977("Time"));
    }

    @EventTarget
    private void method16230(TickEvent var1) {
        if (this.method15996()) {
            if (!this.method15974("Disable rain")) {
                if (this.field23539) {
                    if (!(this.field23538 < 1.0F)) {
                        if (this.field23538 > 1.0F) {
                            this.field23538 = 1.0F;
                        }
                    } else {
                        this.field23538 = (float) ((double) this.field23538 + 0.05);
                    }
                }
            } else if (!(this.field23538 > 0.0F)) {
                if (this.field23538 < 0.0F) {
                    this.field23538 = 0.0F;
                }
            } else {
                this.field23538 = (float) ((double) this.field23538 - 0.05);
            }

            mc.world.method6793(this.field23538);
            mc.world.method6791(this.field23538);
        }
    }

    @EventTarget
    private void method16231(Class4396 var1) {
        if (this.method15996()) {
            if (!(var1.method13898() instanceof Class5577)) {
                if (var1.method13898() instanceof Class5534) {
                    Class5534 var4 = (Class5534) var1.method13898();
                    if (var4.method17397().field43543 == 7) {
                        if (var4.method17398() != 1.0F) {
                            if (var4.method17398() == 0.0F) {
                                this.field23539 = false;
                            }
                        } else {
                            this.field23539 = true;
                        }

                        if (!this.method15974("Disable rain")) {
                            this.field23538 = var4.method17398();
                        } else {
                            var1.method13899(new Class5534(var4.method17397(), 0.0F));
                            this.field23538 = 0.0F;
                        }
                    }
                }
            } else if (this.method15974("Custom time")) {
                var1.method13899(new Class5577(-((long) this.method15977("Time")), -((long) this.method15977("Time")), true));
            }
        }
    }
}
