// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3482 extends Class3479
{
    private static String[] field16404;
    private final Class830 field16405;
    
    public Class3482(final Class830 field16405, final double n) {
        super(field16405, n, 8, 2);
        this.field16405 = field16405;
    }
    
    @Override
    public boolean method11013() {
        if (super.method11013()) {
            if (!this.field16405.field2391.method6703()) {
                if (this.field16405.method1706()) {
                    if (this.field16405.getPosY() >= this.field16405.field2391.method6743() - 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return super.method11017();
    }
    
    @Override
    public boolean method11050(final Class1852 class1852, final BlockPos class1853) {
        final BlockPos method1137 = class1853.method1137();
        return class1852.method6961(method1137) && class1852.method6961(method1137.method1137()) && class1852.method6701(class1853).method21731(class1852, class1853, this.field16405);
    }
    
    @Override
    public void method11015() {
        this.field16405.method4947(false);
        Class830.method4948(this.field16405, this.field16405.field4443);
        super.method11015();
    }
    
    @Override
    public void method11018() {
        super.method11018();
    }
}
