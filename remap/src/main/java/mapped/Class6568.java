// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

public class Class6568 extends Class6564
{
    private static String[] field26083;
    private final Class830 field26084;
    
    public Class6568(final Class830 field26084) {
        super(field26084);
        this.field26084 = field26084;
    }
    
    @Override
    public void method19904() {
        final LivingEntity method4152 = this.field26084.method4152();
        if (Class830.method4949(this.field26084) && this.field26084.method1706()) {
            if ((method4152 != null && method4152.getPosY() > this.field26084.getPosY()) || Class830.method4950(this.field26084)) {
                this.field26084.method1936(this.field26084.getMotion().add(0.0, 0.002, 0.0));
            }
            if (this.field26073 != Class2198.field13376 || this.field26084.method4150().method24731()) {
                this.field26084.method2733(0.0f);
                return;
            }
            final double n = this.field26067 - this.field26084.getPosX();
            final double n2 = this.field26068 - this.field26084.getPosY();
            final double n3 = this.field26069 - this.field26084.getPosZ();
            final double n4 = n2 / MathHelper.sqrt(n * n + n2 * n2 + n3 * n3);
            this.field26084.rotationYaw = this.method19909(this.field26084.rotationYaw, (float)(MathHelper.method35693(n3, n) * 57.2957763671875) - 90.0f, 90.0f);
            this.field26084.field2951 = this.field26084.rotationYaw;
            final float method4153 = MathHelper.method35700(0.125f, this.field26084.method2732(), (float)(this.field26070 * this.field26084.method2710(Class8107.field33408).method23950()));
            this.field26084.method2733(method4153);
            this.field26084.method1936(this.field26084.getMotion().add(method4153 * n * 0.005, method4153 * n4 * 0.1, method4153 * n3 * 0.005));
        }
        else {
            if (!this.field26084.onGround) {
                this.field26084.method1936(this.field26084.getMotion().add(0.0, -0.008, 0.0));
            }
            super.method19904();
        }
    }
}