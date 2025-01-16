// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

public class Class3540 extends Class3446
{
    private static String[] field16584;
    private final Class793 field16585;
    private final double field16586;
    private boolean field16587;
    private int field16588;
    
    public Class3540(final Class793 field16585, final double field16586) {
        this.field16585 = field16585;
        this.field16586 = field16586;
    }
    
    @Override
    public boolean method11013() {
        return !this.field16585.method2625() && (this.field16585.method4456() || (this.field16585.method2633().nextInt(700) == 0 && !Class793.method4466(this.field16585).method1082(this.field16585.method1934(), 64.0)));
    }
    
    @Override
    public void method11015() {
        Class793.method4467(this.field16585, true);
        this.field16587 = false;
        this.field16588 = 0;
    }
    
    @Override
    public void method11018() {
        Class793.method4467(this.field16585, false);
    }
    
    @Override
    public boolean method11017() {
        if (!Class793.method4466(this.field16585).method1082(this.field16585.method1934(), 7.0)) {
            if (!this.field16587) {
                if (this.field16588 <= 600) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11016() {
        final BlockPos method4466 = Class793.method4466(this.field16585);
        final boolean method4467 = method4466.withinDistance(this.field16585.method1934(), 16.0);
        if (method4467) {
            ++this.field16588;
        }
        if (this.field16585.method4150().method24731()) {
            final Vec3d class5487 = new Vec3d(method4466);
            Vec3d class5488 = Class7775.method24906(this.field16585, 16, 3, class5487, 0.3141592741012573);
            if (class5488 == null) {
                class5488 = Class7775.method24905(this.field16585, 8, 7, class5487);
            }
            if (class5488 != null) {
                if (!method4467) {
                    if (this.field16585.world.getBlockState(new BlockPos(class5488)).method21696() != Class7521.field29173) {
                        class5488 = Class7775.method24905(this.field16585, 16, 5, class5487);
                    }
                }
            }
            if (class5488 == null) {
                this.field16587 = true;
                return;
            }
            this.field16585.method4150().method24724(class5488.x, class5488.y, class5488.z, this.field16586);
        }
    }
}
