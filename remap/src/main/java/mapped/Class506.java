// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

public class Class506 extends Class428
{
    private static final Class8810<Boolean> field2886;
    private int field2887;
    public double field2888;
    public double field2889;
    private static final Class120 field2890;
    
    public Class506(final Class7499<? extends Class506> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    public Class506(final Class1847 class1847, final double n, final double n2, final double n3) {
        super(Class7499.field29002, class1847, n, n2, n3);
    }
    
    @Override
    public Class2080 method2139() {
        return Class2080.field12026;
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class506.field2886, false);
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (!this.field2391.method6678()) {
            if (this.field2887 > 0) {
                --this.field2887;
            }
            if (this.field2887 <= 0) {
                this.field2888 = 0.0;
                this.field2889 = 0.0;
            }
            this.method2599(this.field2887 > 0);
        }
        if (this.method2598()) {
            if (this.field2423.nextInt(4) == 0) {
                this.field2391.method6709(Class8432.field34632, this.method1938(), this.method1941() + 0.8, this.method1945(), 0.0, 0.0, 0.0);
            }
        }
    }
    
    @Override
    public double method2125() {
        return 0.2;
    }
    
    @Override
    public void method2123(final Class7929 class7929) {
        super.method2123(class7929);
        if (!class7929.method25707()) {
            if (this.field2391.method6765().method31216(Class8878.field37321)) {
                this.method1764(Class7521.field29299);
            }
        }
    }
    
    @Override
    public void method2128(final BlockPos class354, final Class7096 class355) {
        super.method2128(class354, class355);
        final Vec3d method1935 = this.method1935();
        final double method1936 = Entity.method1680(method1935);
        final double n = this.field2888 * this.field2888 + this.field2889 * this.field2889;
        if (n > 1.0E-4) {
            if (method1936 > 0.001) {
                final double n2 = MathHelper.method35641(method1936);
                final double n3 = MathHelper.method35641(n);
                this.field2888 = method1935.field22770 / n2 * n3;
                this.field2889 = method1935.field22772 / n2 * n3;
            }
        }
    }
    
    @Override
    public void method2130() {
        final double n = this.field2888 * this.field2888 + this.field2889 * this.field2889;
        if (n <= 1.0E-7) {
            this.method1936(this.method1935().method16751(0.98, 0.0, 0.98));
        }
        else {
            final double n2 = MathHelper.method35641(n);
            this.field2888 /= n2;
            this.field2889 /= n2;
            this.method1936(this.method1935().method16751(0.8, 0.0, 0.8).method16744(this.field2888, 0.0, this.field2889));
        }
        super.method2130();
    }
    
    @Override
    public boolean method1770(final Class512 class512, final Class316 class513) {
        final Class8321 method2715 = class512.method2715(class513);
        if (Class506.field2890.test(method2715)) {
            if (this.field2887 + 3600 <= 32000) {
                if (!class512.field3025.field27304) {
                    method2715.method27693(1);
                }
                this.field2887 += 3600;
            }
        }
        if (this.field2887 > 0) {
            this.field2888 = this.method1938() - class512.method1938();
            this.field2889 = this.method1945() - class512.method1945();
        }
        return true;
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method305("PushX", this.field2888);
        class51.method305("PushZ", this.field2889);
        class51.method297("Fuel", (short)this.field2887);
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.field2888 = class51.method322("PushX");
        this.field2889 = class51.method322("PushZ");
        this.field2887 = class51.method318("Fuel");
    }
    
    public boolean method2598() {
        return this.field2432.method33568(Class506.field2886);
    }
    
    public void method2599(final boolean b) {
        this.field2432.method33569(Class506.field2886, b);
    }
    
    @Override
    public Class7096 method2141() {
        return ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29299.method11878()).method21773((Class7111<Comparable>)Class3951.field17846, Direction.NORTH)).method21773((Class7111<Comparable>)Class3951.field17847, this.method2598());
    }
    
    static {
        field2886 = Class9184.method33564(Class506.class, Class7709.field30661);
        field2890 = Class120.method618(Class7739.field31281, Class7739.field31282);
    }
}
