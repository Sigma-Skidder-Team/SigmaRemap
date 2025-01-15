// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;

public class Class403 extends Class402
{
    private static final Class8810<Byte> field2484;
    private static final Class8810<Boolean> field2485;
    private Class8321 field2486;
    private boolean field2487;
    public int field2488;
    
    public Class403(final Class7499<? extends Class403> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field2486 = new Class8321(Class7739.field31607);
    }
    
    public Class403(final Class1847 class1847, final Class511 class1848, final Class8321 class1849) {
        super(Class7499.field29040, class1848, class1847);
        this.field2486 = new Class8321(Class7739.field31607);
        this.field2486 = class1849.method27641();
        this.field2432.method33569(Class403.field2484, (byte)Class8742.method30219(class1849));
        this.field2432.method33569(Class403.field2485, class1849.method27671());
    }
    
    public Class403(final Class1847 class1847, final double n, final double n2, final double n3) {
        super(Class7499.field29040, n, n2, n3, class1847);
        this.field2486 = new Class8321(Class7739.field31607);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class403.field2484, (Byte)0);
        this.field2432.method33565(Class403.field2485, false);
    }
    
    @Override
    public void method1659() {
        if (this.field2473 > 4) {
            this.field2487 = true;
        }
        final Entity method1973 = this.method1973();
        if (this.field2487 || this.method1987()) {
            if (method1973 != null) {
                final byte byteValue = this.field2432.method33568(Class403.field2484);
                if (byteValue > 0 && !this.method1990()) {
                    if (!this.field2391.field10067) {
                        if (this.field2474 == Class2151.field12783) {
                            this.method1767(this.method1974(), 0.1f);
                        }
                    }
                    this.method1652();
                }
                else if (byteValue > 0) {
                    this.method1986(true);
                    final Vec3d class5487 = new Vec3d(method1973.getPosX() - this.getPosX(), method1973.method1944() - this.getPosY(), method1973.getPosZ() - this.getPosZ());
                    this.method1948(this.getPosX(), this.getPosY() + class5487.y * 0.015 * byteValue, this.getPosZ());
                    if (this.field2391.field10067) {
                        this.field2418 = this.getPosY();
                    }
                    this.method1936(this.method1935().scale(0.95).add(class5487.normalize().scale(0.05 * byteValue)));
                    if (this.field2488 == 0) {
                        this.method1695(Class8520.field35636, 10.0f, 1.0f);
                    }
                    ++this.field2488;
                }
            }
        }
        super.method1659();
    }
    
    private boolean method1990() {
        final Entity method1973 = this.method1973();
        return method1973 != null && method1973.method1768() && (!(method1973 instanceof Class513) || !method1973.method1639());
    }
    
    @Override
    public Class8321 method1974() {
        return this.field2486.method27641();
    }
    
    public boolean method1991() {
        return this.field2432.method33568(Class403.field2485);
    }
    
    @Nullable
    @Override
    public Class7007 method1971(final Vec3d class5487, final Vec3d class5488) {
        return this.field2487 ? null : super.method1971(class5487, class5488);
    }
    
    @Override
    public void method1967(final Class7007 class7007) {
        final Entity method21452 = class7007.method21452();
        float n = 8.0f;
        if (method21452 instanceof Class511) {
            n += Class8742.method30202(this.field2486, ((Class511)method21452).method2712());
        }
        final Entity method21453 = this.method1973();
        final Class7929 method21454 = Class7929.method25697(this, (method21453 != null) ? method21453 : this);
        this.field2487 = true;
        Class7795 class7008 = Class8520.field35634;
        if (method21452.method1740(method21454, n)) {
            if (method21452.method1642() == Class7499.field28977) {
                return;
            }
            if (method21452 instanceof Class511) {
                final Class511 class7009 = (Class511)method21452;
                if (method21453 instanceof Class511) {
                    Class8742.method30204(class7009, method21453);
                    Class8742.method30205((Class511)method21453, class7009);
                }
                this.method1970(class7009);
            }
        }
        this.method1936(this.method1935().mul(-0.01, -0.1, -0.01));
        float n2 = 1.0f;
        if (this.field2391 instanceof Class1849) {
            if (this.field2391.method6770()) {
                if (Class8742.method30221(this.field2486)) {
                    final BlockPos method21455 = method21452.method1894();
                    if (this.field2391.method6994(method21455)) {
                        final Class422 class7010 = new Class422(this.field2391, method21455.getX() + 0.5, method21455.getY(), method21455.getZ() + 0.5, false);
                        class7010.method2038((method21453 instanceof Class513) ? ((Class513)method21453) : null);
                        ((Class1849)this.field2391).method6903(class7010);
                        class7008 = Class8520.field35641;
                        n2 = 5.0f;
                    }
                }
            }
        }
        this.method1695(class7008, n2, 1.0f);
    }
    
    @Override
    public Class7795 method1968() {
        return Class8520.field35635;
    }
    
    @Override
    public void method1736(final Class512 class512) {
        final Entity method1973 = this.method1973();
        if (method1973 == null || method1973.method1865() == class512.method1865()) {
            super.method1736(class512);
        }
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        if (class51.method316("Trident", 10)) {
            this.field2486 = Class8321.method27619(class51.method327("Trident"));
        }
        this.field2487 = class51.method329("DealtDamage");
        this.field2432.method33569(Class403.field2484, (byte)Class8742.method30219(this.field2486));
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method295("Trident", this.field2486.method27627(new Class51()));
        class51.method312("DealtDamage", this.field2487);
    }
    
    @Override
    public void method1964() {
        final byte byteValue = this.field2432.method33568(Class403.field2484);
        if (this.field2474 != Class2151.field12783 || byteValue <= 0) {
            super.method1964();
        }
    }
    
    @Override
    public float method1985() {
        return 0.99f;
    }
    
    @Override
    public boolean method1752(final double n, final double n2, final double n3) {
        return true;
    }
    
    static {
        field2484 = Class9184.method33564(Class403.class, Class7709.field30653);
        field2485 = Class9184.method33564(Class403.class, Class7709.field30661);
    }
}
