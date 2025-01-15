// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import javax.annotation.Nullable;

public class Class510 extends Entity
{
    private static final Class8810<Integer> field2915;
    private Class511 field2916;
    private int field2917;
    
    public Class510(final Class7499<? extends Class510> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field2917 = 80;
        this.field2386 = true;
    }
    
    public Class510(final Class1847 class1847, final double field2392, final double field2393, final double field2394, final Class511 field2395) {
        this(Class7499.field29016, class1847);
        this.method1656(field2392, field2393, field2394);
        final double n = class1847.field10062.nextDouble() * 6.2831854820251465;
        this.method1937(-Math.sin(n) * 0.02, 0.20000000298023224, -Math.cos(n) * 0.02);
        this.method2615(80);
        this.field2392 = field2392;
        this.field2393 = field2393;
        this.field2394 = field2394;
        this.field2916 = field2395;
    }
    
    @Override
    public void method1649() {
        this.field2432.method33565(Class510.field2915, 80);
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public boolean method1749() {
        return !this.field2410;
    }
    
    @Override
    public void method1659() {
        if (!this.method1698()) {
            this.method1936(this.method1935().method16744(0.0, -0.04, 0.0));
        }
        this.method1671(Class2160.field12826, this.method1935());
        this.method1936(this.method1935().method16748(0.98));
        if (this.field2404) {
            this.method1936(this.method1935().method16751(0.7, -0.5, 0.7));
        }
        --this.field2917;
        if (this.field2917 > 0) {
            this.method1715();
            if (this.field2391.field10067) {
                this.field2391.method6709(Class8432.field34639, this.method1938(), this.method1941() + 0.5, this.method1945(), 0.0, 0.0, 0.0);
            }
        }
        else {
            this.method1652();
            if (!this.field2391.field10067) {
                this.method2613();
            }
        }
    }
    
    private void method2613() {
        this.field2391.method6722(this, this.method1938(), this.method1942(0.0625), this.method1945(), 4.0f, Class2196.field13366);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        class51.method297("Fuse", (short)this.method2617());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        this.method2615(class51.method318("Fuse"));
    }
    
    @Nullable
    public Class511 method2614() {
        return this.field2916;
    }
    
    @Override
    public float method1890(final Class290 class290, final Class8295 class291) {
        return 0.0f;
    }
    
    public void method2615(final int n) {
        this.field2432.method33569(Class510.field2915, n);
        this.field2917 = n;
    }
    
    @Override
    public void method1880(final Class8810<?> class8810) {
        if (Class510.field2915.equals(class8810)) {
            this.field2917 = this.method2616();
        }
    }
    
    public int method2616() {
        return this.field2432.method33568(Class510.field2915);
    }
    
    public int method2617() {
        return this.field2917;
    }
    
    @Override
    public Class4252<?> method1932() {
        return new Class4339(this);
    }
    
    static {
        field2915 = Class9184.method33564(Class510.class, Class7709.field30654);
    }
}
