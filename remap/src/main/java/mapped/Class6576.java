// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class6576 extends Class6564
{
    private static String[] field26065;
    private final Class793 field26098;
    
    public Class6576(final Class793 field26098) {
        super(field26098);
        this.field26098 = field26098;
    }
    
    private void method19916() {
        if (!this.field26098.method1706()) {
            if (this.field26098.onGround) {
                this.field26098.method2733(Math.max(this.field26098.method2732() / 2.0f, 0.06f));
            }
        }
        else {
            this.field26098.method1936(this.field26098.getMotion().add(0.0, 0.005, 0.0));
            if (!Class793.method4466(this.field26098).method1082(this.field26098.method1934(), 16.0)) {
                this.field26098.method2733(Math.max(this.field26098.method2732() / 2.0f, 0.08f));
            }
            if (this.field26098.method2625()) {
                this.field26098.method2733(Math.max(this.field26098.method2732() / 3.0f, 0.06f));
            }
        }
    }
    
    @Override
    public void method19904() {
        this.method19916();
        if (this.field26073 == Class2198.field13376 && !this.field26098.method4150().method24731()) {
            final double n = this.field26067 - this.field26098.getPosX();
            final double n2 = this.field26068 - this.field26098.getPosY();
            final double n3 = this.field26069 - this.field26098.getPosZ();
            final double n4 = n2 / MathHelper.sqrt(n * n + n2 * n2 + n3 * n3);
            this.field26098.rotationYaw = this.method19909(this.field26098.rotationYaw, (float)(MathHelper.method35693(n3, n) * 57.2957763671875) - 90.0f, 90.0f);
            this.field26098.field2951 = this.field26098.rotationYaw;
            this.field26098.method2733(MathHelper.method35700(0.125f, this.field26098.method2732(), (float)(this.field26070 * this.field26098.method2710(Class8107.field33408).method23950())));
            this.field26098.method1936(this.field26098.getMotion().add(0.0, this.field26098.method2732() * n4 * 0.1, 0.0));
        }
        else {
            this.field26098.method2733(0.0f);
        }
    }
}
