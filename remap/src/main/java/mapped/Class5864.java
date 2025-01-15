// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class5864<T extends Class827> extends Class5863<T>
{
    private static String[] field24033;
    
    public Class5864(final float n, final float n2, final int n3, final int n4) {
        super(n, n2, n3, n4);
        (this.field23996 = new Class6300(this, 32, 48)).method18638(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, n);
        this.field23996.method18642(-5.0f, 2.0f + n2, 0.0f);
        (this.field23998 = new Class6300(this, 16, 48)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, n);
        this.field23998.method18642(-1.9f, 12.0f + n2, 0.0f);
    }
    
    public Class5864(final float n, final boolean b) {
        super(n, 0.0f, 64, b ? 32 : 64);
    }
    
    public void method17600(final T t, final float n, final float n2, final float n3) {
        this.field24001 = Class2036.field11607;
        this.field24000 = Class2036.field11607;
        if (t.method2715(Class316.field1877).getItem() == Items.field31607) {
            if (t.method4216()) {
                if (t.method2755() != Class2226.field13698) {
                    this.field24000 = Class2036.field11611;
                }
                else {
                    this.field24001 = Class2036.field11611;
                }
            }
        }
        super.method17579(t, n, n2, n3);
    }
    
    public void method17592(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        super.method17597(t, n, n2, n3, n4, n5);
        if (this.field24000 == Class2036.field11611) {
            this.field23997.field25183 = this.field23997.field25183 * 0.5f - 3.1415927f;
            this.field23997.field25184 = 0.0f;
        }
        if (this.field24001 == Class2036.field11611) {
            this.field23996.field25183 = this.field23996.field25183 * 0.5f - 3.1415927f;
            this.field23996.field25184 = 0.0f;
        }
        if (this.field24003 > 0.0f) {
            this.field23996.field25183 = this.method17581(this.field23996.field25183, -2.5132742f, this.field24003) + this.field24003 * 0.35f * MathHelper.sin(0.1f * n3);
            this.field23997.field25183 = this.method17581(this.field23997.field25183, -2.5132742f, this.field24003) - this.field24003 * 0.35f * MathHelper.sin(0.1f * n3);
            this.field23996.field25185 = this.method17581(this.field23996.field25185, -0.15f, this.field24003);
            this.field23997.field25185 = this.method17581(this.field23997.field25185, 0.15f, this.field24003);
            final Class6300 field23999 = this.field23999;
            field23999.field25183 -= this.field24003 * 0.55f * MathHelper.sin(0.1f * n3);
            final Class6300 field24000 = this.field23998;
            field24000.field25183 += this.field24003 * 0.55f * MathHelper.sin(0.1f * n3);
            this.field23993.field25183 = 0.0f;
        }
    }
}
