package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5241 extends Module {
    private int field23599;
    private double field23600;
    private boolean field23601;

    public Class5241() {
        super(ModuleCategory.MOVEMENT, "SlowHop", "SlowHop speed");
        this.method15972(new Class6004("AutoJump", "Automatically jumps for you.", true));
    }

    @Override
    public void method15966() {
        this.field23600 = Class9567.method37075();
        this.field23599 = 2;
    }

    @Override
    public void method15965() {
        Class9567.method37090(Class9567.method37075());
    }

    @EventTarget
    public void method16338(Class4435 var1) {
        if (this.method15996()) {
            boolean var4 = this.method15974("AutoJump");
            double var5 = Class9567.method37075();
            boolean var7 = Class5628.method17686();
            if (!field23386.field1339.field5036) {
                this.field23599++;
                this.field23600 = 0.36 - (double) this.field23599 / 250.0;
                if (this.field23600 < var5) {
                    this.field23600 = var5;
                }

                Class9567.method37088(var1, this.field23600);
            } else {
                this.field23599 = 0;
                field23386.field1339.method2914();
                var1.method13995(field23386.field1339.method3433().field18049);
            }
        }
    }

    @EventTarget
    public void method16339(Class4436 var1) {
        if (this.method15996()) {
            var1.method14002(0.407 + 0.1 * (double) Class9567.method37079());
            this.field23599 = 0;
            var1.method14003(1.8);
        }
    }
}
