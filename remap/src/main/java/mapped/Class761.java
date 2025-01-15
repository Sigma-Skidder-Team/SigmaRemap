// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class761 extends Class760 implements Class762
{
    private static final Class8810<Boolean> field4132;
    private int field4133;
    
    public Class761(final Class7499<? extends Class761> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field4133 = 1;
        this.field4108 = 5;
        this.field4110 = new Class6571(this);
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(5, new Class3571(this));
        this.field4114.method22062(7, new Class3596(this));
        this.field4114.method22062(7, new Class3525(this));
        this.field4115.method22062(1, new Class3555<Object>(this, Class512.class, 10, true, false, class511 -> Math.abs(class511.method1941() - this.method1941()) <= 4.0));
    }
    
    public boolean method4222() {
        return this.field2432.method33568(Class761.field4132);
    }
    
    public void method4223(final boolean b) {
        this.field2432.method33569(Class761.field4132, b);
    }
    
    public int method4224() {
        return this.field4133;
    }
    
    @Override
    public boolean method4170() {
        return true;
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        if (this.method1849(class7929)) {
            return false;
        }
        if (class7929.method25713() instanceof Class417 && class7929.method25714() instanceof Class512) {
            super.method1740(class7929, 1000.0f);
            return true;
        }
        return super.method1740(class7929, n);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class761.field4132, false);
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(10.0);
        this.method2710(Class8107.field33406).method23941(100.0);
    }
    
    @Override
    public Class286 method1922() {
        return Class286.field1583;
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35224;
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return Class8520.field35226;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35225;
    }
    
    @Override
    public float method2720() {
        return 10.0f;
    }
    
    public static boolean method4225(final Class7499<Class761> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        if (class7500.method6954() != Class2113.field12290) {
            if (random.nextInt(20) == 0) {
                if (Class759.method4178(class7499, class7500, class7501, class7502, random)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public int method4181() {
        return 1;
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("ExplosionPower", this.field4133);
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        if (class51.method316("ExplosionPower", 99)) {
            this.field4133 = class51.method319("ExplosionPower");
        }
    }
    
    @Override
    public float method2789(final Class290 class290, final Class8295 class291) {
        return 2.6f;
    }
    
    static {
        field4132 = Class9184.method33564(Class761.class, Class7709.field30661);
    }
}
