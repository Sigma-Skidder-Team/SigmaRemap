// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class6563 extends Class6564
{
    private static String[] field26063;
    private final Class840 field26064;
    
    public Class6563(final Class840 field26064) {
        super(field26064);
        this.field26064 = field26064;
    }
    
    @Override
    public void method19904() {
        if (this.field26064.method1706()) {
            this.field26064.method1936(this.field26064.method1935().method16744(0.0, 0.005, 0.0));
        }
        if (this.field26073 == Class2198.field13376 && !this.field26064.method4150().method24731()) {
            final double n = this.field26067 - this.field26064.method1938();
            final double n2 = this.field26068 - this.field26064.method1941();
            final double n3 = this.field26069 - this.field26064.method1945();
            if (n * n + n2 * n2 + n3 * n3 >= 2.500000277905201E-7) {
                this.field26064.field2399 = this.method19909(this.field26064.field2399, (float)(MathHelper.method35693(n3, n) * 57.2957763671875) - 90.0f, 10.0f);
                this.field26064.field2951 = this.field26064.field2399;
                this.field26064.field2953 = this.field26064.field2399;
                final float n4 = (float)(this.field26070 * this.field26064.method2710(Class8107.field33408).method23950());
                if (!this.field26064.method1706()) {
                    this.field26064.method2733(n4 * 0.1f);
                }
                else {
                    this.field26064.method2733(n4 * 0.02f);
                    this.field26064.field2400 = this.method19909(this.field26064.field2400, MathHelper.method35653(MathHelper.method35668(-(float)(MathHelper.method35693(n2, MathHelper.method35641(n * n + n3 * n3)) * 57.2957763671875)), -85.0f, 85.0f), 5.0f);
                    final float method35639 = MathHelper.cos(this.field26064.field2400 * 0.017453292f);
                    final float method35640 = MathHelper.sin(this.field26064.field2400 * 0.017453292f);
                    this.field26064.field2970 = method35639 * n4;
                    this.field26064.field2969 = -method35640 * n4;
                }
            }
            else {
                this.field26066.method4162(0.0f);
            }
        }
        else {
            this.field26064.method2733(0.0f);
            this.field26064.method4164(0.0f);
            this.field26064.method4163(0.0f);
            this.field26064.method4162(0.0f);
        }
    }
}
