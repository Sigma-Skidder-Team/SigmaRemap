// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

public class Class5854<T extends Class759 & Class768> extends Class5853<T>
{
    private static String[] field24005;
    
    public Class5854() {
        this(0.0f, false);
    }
    
    public Class5854(final float n, final boolean b) {
        super(n);
        if (!b) {
            (this.field23996 = new Class6300(this, 40, 16)).method18638(-1.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f, n);
            this.field23996.method18642(-5.0f, 2.0f, 0.0f);
            this.field23997 = new Class6300(this, 40, 16);
            this.field23997.field25186 = true;
            this.field23997.method18638(-1.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f, n);
            this.field23997.method18642(5.0f, 2.0f, 0.0f);
            (this.field23998 = new Class6300(this, 0, 16)).method18638(-1.0f, 0.0f, -1.0f, 2.0f, 12.0f, 2.0f, n);
            this.field23998.method18642(-2.0f, 12.0f, 0.0f);
            this.field23999 = new Class6300(this, 0, 16);
            this.field23999.field25186 = true;
            this.field23999.method18638(-1.0f, 0.0f, -1.0f, 2.0f, 12.0f, 2.0f, n);
            this.field23999.method18642(2.0f, 12.0f, 0.0f);
        }
    }
    
    public void method17587(final T t, final float n, final float n2, final float n3) {
        this.field24001 = Class2036.field11607;
        this.field24000 = Class2036.field11607;
        if (t.method2715(Class316.field1877).method27622() == Class7739.field31279) {
            if (t.method4216()) {
                if (t.method2755() != Class2226.field13698) {
                    this.field24000 = Class2036.field11610;
                }
                else {
                    this.field24001 = Class2036.field11610;
                }
            }
        }
        super.method17579(t, n, n2, n3);
    }
    
    public void method17588(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        super.method17580(t, n, n2, n3, n4, n5);
        final ItemStack method2713 = t.method2713();
        if (t.method4216()) {
            if (method2713.method27620() || method2713.method27622() != Class7739.field31279) {
                final float method2714 = MathHelper.sin(this.field23955 * 3.1415927f);
                final float method2715 = MathHelper.sin((1.0f - (1.0f - this.field23955) * (1.0f - this.field23955)) * 3.1415927f);
                this.field23996.field25185 = 0.0f;
                this.field23997.field25185 = 0.0f;
                this.field23996.field25184 = -(0.1f - method2714 * 0.6f);
                this.field23997.field25184 = 0.1f - method2714 * 0.6f;
                this.field23996.field25183 = -1.5707964f;
                this.field23997.field25183 = -1.5707964f;
                final Class6300 field23996 = this.field23996;
                field23996.field25183 -= method2714 * 1.2f - method2715 * 0.4f;
                final Class6300 field23997 = this.field23997;
                field23997.field25183 -= method2714 * 1.2f - method2715 * 0.4f;
                final Class6300 field23998 = this.field23996;
                field23998.field25185 += MathHelper.cos(n3 * 0.09f) * 0.05f + 0.05f;
                final Class6300 field23999 = this.field23997;
                field23999.field25185 -= MathHelper.cos(n3 * 0.09f) * 0.05f + 0.05f;
                final Class6300 field24000 = this.field23996;
                field24000.field25183 += MathHelper.sin(n3 * 0.067f) * 0.05f;
                final Class6300 field24001 = this.field23997;
                field24001.field25183 -= MathHelper.sin(n3 * 0.067f) * 0.05f;
            }
        }
    }
    
    @Override
    public void method17578(final Class2226 class2226, final Class7351 class2227) {
        final float n = (class2226 != Class2226.field13698) ? -1.0f : 1.0f;
        final Class6300 method17585;
        final Class6300 class2228 = method17585 = this.method17585(class2226);
        method17585.field25180 += n;
        class2228.method18645(class2227);
        final Class6300 class2229 = class2228;
        class2229.field25180 -= n;
    }
}
