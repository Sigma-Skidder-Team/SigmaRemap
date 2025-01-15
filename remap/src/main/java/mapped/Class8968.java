// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class8968 implements Class8967
{
    private static String[] field37678;
    private double field37679;
    private double field37680;
    private long field37681;
    public final /* synthetic */ Class4101 field37682;
    
    public Class8968(final Class4101 field37682) {
        this.field37682 = field37682;
    }
    
    @Override
    public float method31812(final ItemStack class8321, Class1847 field2391, final Class511 class8322) {
        if (class8322 == null && !class8321.method27677()) {
            return 0.0f;
        }
        final boolean b = class8322 != null;
        final Entity class8323 = b ? class8322 : class8321.method27679();
        if (field2391 == null) {
            field2391 = class8323.field2391;
        }
        double n;
        if (!field2391.field10063.method20492()) {
            n = Math.random();
        }
        else {
            n = 0.5 - (MathHelper.method35666((b ? class8323.field2399 : this.method31815((Class862)class8323)) / 360.0, 1.0) - 0.25 - this.method31816(field2391, class8323) / 6.2831854820251465);
        }
        if (b) {
            n = this.method31814(field2391, n);
        }
        return MathHelper.method35665((float)n, 1.0f);
    }
    
    private double method31814(final Class1847 class1847, final double n) {
        if (class1847.method6754() != this.field37681) {
            this.field37681 = class1847.method6754();
            this.field37680 += (MathHelper.method35666(n - this.field37679 + 0.5, 1.0) - 0.5) * 0.1;
            this.field37680 *= 0.8;
            this.field37679 = MathHelper.method35666(this.field37679 + this.field37680, 1.0);
        }
        return this.field37679;
    }
    
    private double method31815(final Class862 class862) {
        return MathHelper.method35667(180 + class862.method1882().getHorizontalIndex() * 90);
    }
    
    private double method31816(final Class1851 class1851, final Entity class1852) {
        final BlockPos method6758 = class1851.method6758();
        return Math.atan2(method6758.getZ() - class1852.getPosZ(), method6758.getX() - class1852.getPosX());
    }
}
