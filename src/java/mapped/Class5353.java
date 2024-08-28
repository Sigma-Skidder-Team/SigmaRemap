package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5353 extends Module {
    public int field23918 = 0;
    private double field23912;
    private float field23913;
    private float field23914;
    private boolean field23915;
    private float field23916;
    private float field23917 = 1.0F;

    public Class5353() {
        super(ModuleCategory.MOVEMENT, "TestSpeed", "Legit Sprint jumping.");
        this.method15972(new Class6004("Sprint", "Sprints when walking", true));
        this.method15972(new Class6004("AutoJump", "Automatically jumps for you.", true));
    }

    @EventTarget
    public void method16796(Class4399 var1) {
        if (this.method15996() && field23386.field1339 != null && !Client.getInstance().getModuleManager().method14662(Class5333.class).method15996()) {
            if (field23386.field1339.field5036 && var1.method13921()) {
                var1.method13912(var1.method13911() + 1.0E-14);
            }
        }
    }

    @EventTarget
    public void method16797(Class4435 var1) {
        if (this.method15996()) {
            if (field23386.field1339.field5036
                    && field23386.field1339.field5038
                    && (field23386.field1339.field4984 != 0.0F || field23386.field1339.field4982 != 0.0F)
                    && this.method15974("AutoJump")) {
                field23386.field1339.method2914();
                var1.method13993(field23386.field1339.method3433().field18048);
                var1.method13995(field23386.field1339.method3433().field18049);
                var1.method13997(field23386.field1339.method3433().field18050);
            }

            double var4 = var1.method13998().field18049;
            var1.method13998().field18049 = 0.0;
            double var6 = var1.method13998().method11348();
            var1.method13998().field18049 = var4;
            this.field23916 = Class9567.method37092(var1, var6, Class9567.method37083()[0], this.field23916, 45.0F);
            if (this.field23913 != 0.0F || this.field23914 != 0.0F) {
                this.field23913 = (float) ((double) this.field23913 * 0.85);
                this.field23914 = (float) ((double) this.field23914 * 0.85);
                this.field23917 = Math.min(1.0F, this.field23917 + 0.1F);
            }

            if (field23386.field1339.field5036 && !this.field23915) {
                this.field23913 = 0.0F;
                this.field23914 = 0.0F;
                this.field23917 = Math.min(1.0F, this.field23917 + 0.33F);
            }

            this.field23915 = false;
            this.field23918++;
        }
    }

    @EventTarget
    @LowerPriority
    public void method16798(Class4436 var1) {
        if (this.method15996() && !Class5381.method16953() && !Client.getInstance().getModuleManager().method14662(Class5333.class).method15996()) {
            if (!field23386.field1299.field44636.method8509() || !Client.getInstance().getModuleManager().method14662(Class5328.class).method15996()) {
                this.field23916 = Class9567.method37083()[0];
                this.field23918 = 0;
                var1.method14003(var1.method14001().method11348() * 1.05F);
            }
        }
    }

    @EventTarget
    private void method16799(Class4396 var1) {
        if (this.method15996()) {
            if (field23386.field1339 != null && var1.method13898() instanceof Class5590) {
                Class5590 var4 = (Class5590) var1.method13898();
                if (var4.method17565() != field23386.field1339.method3205()) {
                }
            }
        }
    }
}
