// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class6575 extends Class6564
{
    private static String[] field26065;
    private final Class833 field26097;
    
    public Class6575(final Class833 field26097) {
        super(field26097);
        this.field26097 = field26097;
    }
    
    @Override
    public void method19904() {
        if (this.field26097.method1720(Class7324.field28319)) {
            this.field26097.method1936(this.field26097.method1935().method16744(0.0, 0.005, 0.0));
        }
        if (this.field26073 == Class2198.field13376 && !this.field26097.method4150().method24731()) {
            final double n = this.field26067 - this.field26097.method1938();
            final double n2 = this.field26068 - this.field26097.method1941();
            final double n3 = this.field26069 - this.field26097.method1945();
            final double n4 = n2 / MathHelper.method35641(n * n + n2 * n2 + n3 * n3);
            this.field26097.field2399 = this.method19909(this.field26097.field2399, (float)(MathHelper.method35693(n3, n) * 57.2957763671875) - 90.0f, 90.0f);
            this.field26097.field2951 = this.field26097.field2399;
            this.field26097.method2733(MathHelper.method35700(0.125f, this.field26097.method2732(), (float)(this.field26070 * this.field26097.method2710(Class8107.field33408).method23950())));
            this.field26097.method1936(this.field26097.method1935().method16744(0.0, this.field26097.method2732() * n4 * 0.1, 0.0));
        }
        else {
            this.field26097.method2733(0.0f);
        }
    }
}
