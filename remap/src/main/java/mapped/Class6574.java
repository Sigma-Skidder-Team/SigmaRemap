// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class6574 extends Class6564
{
    private static String[] field26065;
    private final int field26095;
    private final boolean field26096;
    
    public Class6574(final Class759 class759, final int field26095, final boolean field26096) {
        super(class759);
        this.field26095 = field26095;
        this.field26096 = field26096;
    }
    
    @Override
    public void method19904() {
        if (this.field26073 != Class2198.field13376) {
            if (!this.field26096) {
                this.field26066.method1699(false);
            }
            this.field26066.method4163(0.0f);
            this.field26066.method4162(0.0f);
        }
        else {
            this.field26073 = Class2198.field13375;
            this.field26066.method1699(true);
            final double n = this.field26067 - this.field26066.getPosX();
            final double n2 = this.field26068 - this.field26066.getPosY();
            final double n3 = this.field26069 - this.field26066.getPosZ();
            if (n * n + n2 * n2 + n3 * n3 < 2.500000277905201E-7) {
                this.field26066.method4163(0.0f);
                this.field26066.method4162(0.0f);
                return;
            }
            this.field26066.rotationYaw = this.method19909(this.field26066.rotationYaw, (float)(MathHelper.method35693(n3, n) * 57.2957763671875) - 90.0f, 90.0f);
            float n4;
            if (!this.field26066.onGround) {
                n4 = (float)(this.field26070 * this.field26066.method2710(Class8107.field33409).method23950());
            }
            else {
                n4 = (float)(this.field26070 * this.field26066.method2710(Class8107.field33408).method23950());
            }
            this.field26066.method2733(n4);
            this.field26066.rotationPitch = this.method19909(this.field26066.rotationPitch, (float)(-(MathHelper.method35693(n2, MathHelper.sqrt(n * n + n3 * n3)) * 57.2957763671875)), (float)this.field26095);
            this.field26066.method4163((n2 <= 0.0) ? (-n4) : n4);
        }
    }
}
