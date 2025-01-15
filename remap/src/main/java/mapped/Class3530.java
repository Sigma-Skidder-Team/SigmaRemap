// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3530 extends Class3446
{
    private static String[] field16558;
    public final /* synthetic */ Class843 field16559;
    
    public Class3530(final Class843 field16559) {
        this.field16559 = field16559;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        return !this.field16559.method4148().method19905() && Class843.method5049(this.field16559).nextInt(7) == 0;
    }
    
    @Override
    public boolean method11017() {
        return false;
    }
    
    @Override
    public void method11016() {
        BlockPos method5037 = this.field16559.method5037();
        if (method5037 == null) {
            method5037 = new BlockPos(this.field16559);
        }
        int i = 0;
        while (i < 3) {
            final BlockPos method5038 = method5037.method1134(Class843.method5050(this.field16559).nextInt(15) - 7, Class843.method5051(this.field16559).nextInt(11) - 5, Class843.method5052(this.field16559).nextInt(15) - 7);
            if (!this.field16559.field2391.method6961(method5038)) {
                ++i;
            }
            else {
                Class843.method5053(this.field16559).method19907(method5038.getX() + 0.5, method5038.getY() + 0.5, method5038.getZ() + 0.5, 0.25);
                if (this.field16559.method4152() != null) {
                    break;
                }
                this.field16559.method4147().method24669(method5038.getX() + 0.5, method5038.getY() + 0.5, method5038.getZ() + 0.5, 180.0f, 20.0f);
                break;
            }
        }
    }
}
