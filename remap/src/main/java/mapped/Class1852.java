// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;

import javax.annotation.Nullable;

public interface Class1852 extends Class1856, Class1853, Class1867
{
    @Nullable
    Class1860 method6687(final int p0, final int p1, final Class9312 p2, final boolean p3);
    
    @Deprecated
    boolean method6814(final int p0, final int p1);
    
    int method6699(final Class2020 p0, final int p1, final int p2);
    
    int method6785();
    
    Class5507 method6797();
    
    default Class3090 method6959(final BlockPos class354) {
        return this.method6797().method16810(class354);
    }
    
    default int method6849(final BlockPos class354, final Class8895 class355) {
        return class355.method31308(this.method6959(class354), class354.getX(), class354.getZ());
    }
    
    default Class3090 method6960(final int n, final int n2, final int n3) {
        final Class1860 method6687 = this.method6687(n >> 2, n3 >> 2, Class9312.field39980, false);
        return (method6687 != null && method6687.method7024() != null) ? method6687.method7024().method6960(n, n2, n3) : this.method6841(n, n2, n3);
    }
    
    Class3090 method6841(final int p0, final int p1, final int p2);
    
    boolean method6678();
    
    int method6743();
    
    Class6737 method6789();
    
    default BlockPos method6958(final Class2020 class2020, final BlockPos class2021) {
        return new BlockPos(class2021.getX(), this.method6699(class2020, class2021.getX(), class2021.getZ()), class2021.getZ());
    }
    
    default boolean method6961(final BlockPos class354) {
        return this.method6701(class354).method21706();
    }
    
    default boolean method6962(final BlockPos class354) {
        if (class354.getY() >= this.method6743()) {
            return this.method6994(class354);
        }
        final BlockPos class355 = new BlockPos(class354.getX(), this.method6743(), class354.getZ());
        if (this.method6994(class355)) {
            for (BlockPos class356 = class355.method1139(); class356.getY() > class354.getY(); class356 = class356.method1139()) {
                final Class7096 method6701 = this.method6701(class356);
                if (method6701.method21700(this, class356) > 0 && !method6701.method21697().method26438()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Deprecated
    default float method6963(final BlockPos class354) {
        return this.method6789().method20505(this.method6969(class354));
    }
    
    default int method6964(final BlockPos class354, final Direction class355) {
        return this.method6701(class354).method21720(this, class354, class355);
    }
    
    default Class1860 method6965(final BlockPos class354) {
        return this.method6798(class354.getX() >> 4, class354.getZ() >> 4);
    }
    
    default Class1860 method6798(final int n, final int n2) {
        return this.method6687(n, n2, Class9312.field39989, true);
    }
    
    default Class1860 method6966(final int n, final int n2, final Class9312 class9312) {
        return this.method6687(n, n2, class9312, true);
    }
    
    @Nullable
    default Class1855 method6736(final int n, final int n2) {
        return this.method6687(n, n2, Class9312.field39977, false);
    }
    
    default boolean method6967(final BlockPos class354) {
        return this.method6702(class354).method21793(Class7324.field28319);
    }
    
    default boolean method6968(final AxisAlignedBB class6221) {
        final int method35644 = MathHelper.floor(class6221.field25073);
        final int method35645 = MathHelper.method35650(class6221.field25076);
        final int method35646 = MathHelper.floor(class6221.field25074);
        final int method35647 = MathHelper.method35650(class6221.field25077);
        final int method35648 = MathHelper.floor(class6221.field25075);
        final int method35649 = MathHelper.method35650(class6221.field25078);
        try (final Class386 method35650 = Class386.method1296()) {
            for (int i = method35644; i < method35645; ++i) {
                for (int j = method35646; j < method35647; ++j) {
                    for (int k = method35648; k < method35649; ++k) {
                        if (!this.method6701(method35650.method1300(i, j, k)).method21756().method21781()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
    
    default int method6969(final BlockPos class354) {
        return this.method6970(class354, this.method6785());
    }
    
    default int method6970(final BlockPos class354, final int n) {
        if (class354.getX() >= -30000000) {
            if (class354.getZ() >= -30000000) {
                if (class354.getX() < 30000000) {
                    if (class354.getZ() < 30000000) {
                        return this.method6993(class354, n);
                    }
                }
            }
        }
        return 15;
    }
    
    @Deprecated
    default boolean method6971(final BlockPos class354) {
        return this.method6814(class354.getX() >> 4, class354.getZ() >> 4);
    }
    
    @Deprecated
    default boolean method6972(final BlockPos class354, final BlockPos class355) {
        return this.method6973(class354.getX(), class354.getY(), class354.getZ(), class355.getX(), class355.getY(), class355.getZ());
    }
    
    @Deprecated
    default boolean method6973(int n, final int n2, int n3, int n4, final int n5, int n6) {
        if (n5 >= 0 && n2 < 256) {
            n >>= 4;
            n3 >>= 4;
            n4 >>= 4;
            n6 >>= 4;
            for (int i = n; i <= n4; ++i) {
                for (int j = n3; j <= n6; ++j) {
                    if (!this.method6814(i, j)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
