// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class6571 extends Class6564
{
    private static String[] field26089;
    private final Class761 field26090;
    private int field26091;
    
    public Class6571(final Class761 field26090) {
        super(field26090);
        this.field26090 = field26090;
    }
    
    @Override
    public void method19904() {
        if (this.field26073 == Class2198.field13376) {
            if (this.field26091-- <= 0) {
                this.field26091 += this.field26090.method2633().nextInt(5) + 2;
                final Vec3d class5487 = new Vec3d(this.field26067 - this.field26090.method1938(), this.field26068 - this.field26090.method1941(), this.field26069 - this.field26090.method1945());
                final double method16752 = class5487.method16752();
                final Vec3d method16753 = class5487.method16738();
                if (!this.method19915(method16753, MathHelper.method35650(method16752))) {
                    this.field26073 = Class2198.field13375;
                }
                else {
                    this.field26090.method1936(this.field26090.method1935().method16743(method16753.method16748(0.1)));
                }
            }
        }
    }
    
    private boolean method19915(final Vec3d class5487, final int n) {
        Class6221 class5488 = this.field26090.method1886();
        for (int i = 1; i < n; ++i) {
            class5488 = class5488.method18501(class5487);
            if (!this.field26090.field2391.method6978(this.field26090, class5488)) {
                return false;
            }
        }
        return true;
    }
}
