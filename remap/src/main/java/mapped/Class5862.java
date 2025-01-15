// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public abstract class Class5862<T extends Class763> extends Class5853<T>
{
    public Class5862(final float n, final float n2, final int n3, final int n4) {
        super(n, n2, n3, n4);
    }
    
    public void method17597(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        super.method17580(t, n, n2, n3, n4, n5);
        final boolean method17598 = this.method17598(t);
        final float method17599 = MathHelper.sin(this.field23955 * 3.1415927f);
        final float method17600 = MathHelper.sin((1.0f - (1.0f - this.field23955) * (1.0f - this.field23955)) * 3.1415927f);
        this.field23996.field25185 = 0.0f;
        this.field23997.field25185 = 0.0f;
        this.field23996.field25184 = -(0.1f - method17599 * 0.6f);
        this.field23997.field25184 = 0.1f - method17599 * 0.6f;
        final float n6 = -3.1415927f / (method17598 ? 1.5f : 2.25f);
        this.field23996.field25183 = n6;
        this.field23997.field25183 = n6;
        final Class6300 field23996 = this.field23996;
        field23996.field25183 += method17599 * 1.2f - method17600 * 0.4f;
        final Class6300 field23997 = this.field23997;
        field23997.field25183 += method17599 * 1.2f - method17600 * 0.4f;
        final Class6300 field23998 = this.field23996;
        field23998.field25185 += MathHelper.cos(n3 * 0.09f) * 0.05f + 0.05f;
        final Class6300 field23999 = this.field23997;
        field23999.field25185 -= MathHelper.cos(n3 * 0.09f) * 0.05f + 0.05f;
        final Class6300 field24000 = this.field23996;
        field24000.field25183 += MathHelper.sin(n3 * 0.067f) * 0.05f;
        final Class6300 field24001 = this.field23997;
        field24001.field25183 -= MathHelper.sin(n3 * 0.067f) * 0.05f;
    }
    
    public abstract boolean method17598(final T p0);
}
