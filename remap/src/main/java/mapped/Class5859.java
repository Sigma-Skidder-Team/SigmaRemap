// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class5859<T extends Class827> extends Class5853<T> implements Class5858
{
    private static String[] field24018;
    private Class6300 field24019;
    
    public Class5859(final float n, final boolean b) {
        super(n, 0.0f, 64, b ? 32 : 64);
        if (!b) {
            this.field23993 = new Class6300(this, 0, 0);
            this.field23993.method18634(0, 0).method18638(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f, n);
            this.field23993.method18634(24, 0).method18638(-1.0f, -3.0f, -6.0f, 2.0f, 4.0f, 2.0f, n);
            (this.field23994 = new Class6300(this, 32, 0)).method18638(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f, n + 0.5f);
            this.field24019 = new Class6300(this);
            this.field24019.method18634(30, 47).method18638(-8.0f, -8.0f, -6.0f, 16.0f, 16.0f, 1.0f, n);
            this.field24019.field25183 = -1.5707964f;
            this.field23994.method18633(this.field24019);
            (this.field23995 = new Class6300(this, 16, 20)).method18638(-4.0f, 0.0f, -3.0f, 8.0f, 12.0f, 6.0f, n);
            this.field23995.method18634(0, 38).method18638(-4.0f, 0.0f, -3.0f, 8.0f, 18.0f, 6.0f, n + 0.05f);
            (this.field23996 = new Class6300(this, 44, 22)).method18638(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, n);
            this.field23996.method18642(-5.0f, 2.0f, 0.0f);
            this.field23997 = new Class6300(this, 44, 22);
            this.field23997.field25186 = true;
            this.field23997.method18638(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, n);
            this.field23997.method18642(5.0f, 2.0f, 0.0f);
            (this.field23998 = new Class6300(this, 0, 22)).method18642(-2.0f, 12.0f, 0.0f);
            this.field23998.method18638(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, n);
            this.field23999 = new Class6300(this, 0, 22);
            this.field23999.field25186 = true;
            this.field23999.method18642(2.0f, 12.0f, 0.0f);
            this.field23999.method18638(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, n);
        }
        else {
            (this.field23993 = new Class6300(this, 0, 0)).method18638(-4.0f, -10.0f, -4.0f, 8.0f, 8.0f, 8.0f, n);
            (this.field23995 = new Class6300(this, 16, 16)).method18638(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, n + 0.1f);
            (this.field23998 = new Class6300(this, 0, 16)).method18642(-2.0f, 12.0f, 0.0f);
            this.field23998.method18638(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, n + 0.1f);
            this.field23999 = new Class6300(this, 0, 16);
            this.field23999.field25186 = true;
            this.field23999.method18642(2.0f, 12.0f, 0.0f);
            this.field23999.method18638(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, n + 0.1f);
        }
    }
    
    public void method17592(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        super.method17580(t, n, n2, n3, n4, n5);
        final float method35638 = MathHelper.sin(this.field23955 * 3.1415927f);
        final float method35639 = MathHelper.sin((1.0f - (1.0f - this.field23955) * (1.0f - this.field23955)) * 3.1415927f);
        this.field23996.field25185 = 0.0f;
        this.field23997.field25185 = 0.0f;
        this.field23996.field25184 = -(0.1f - method35638 * 0.6f);
        this.field23997.field25184 = 0.1f - method35638 * 0.6f;
        final float n6 = -3.1415927f / (t.method4216() ? 1.5f : 2.25f);
        this.field23996.field25183 = n6;
        this.field23997.field25183 = n6;
        final Class6300 field23996 = this.field23996;
        field23996.field25183 += method35638 * 1.2f - method35639 * 0.4f;
        final Class6300 field23997 = this.field23997;
        field23997.field25183 += method35638 * 1.2f - method35639 * 0.4f;
        final Class6300 field23998 = this.field23996;
        field23998.field25185 += MathHelper.cos(n3 * 0.09f) * 0.05f + 0.05f;
        final Class6300 field23999 = this.field23997;
        field23999.field25185 -= MathHelper.cos(n3 * 0.09f) * 0.05f + 0.05f;
        final Class6300 field24000 = this.field23996;
        field24000.field25183 += MathHelper.sin(n3 * 0.067f) * 0.05f;
        final Class6300 field24001 = this.field23997;
        field24001.field25183 -= MathHelper.sin(n3 * 0.067f) * 0.05f;
    }
    
    @Override
    public void method17589(final boolean field25187) {
        this.field23993.field25187 = field25187;
        this.field23994.field25187 = field25187;
        this.field24019.field25187 = field25187;
    }
}
