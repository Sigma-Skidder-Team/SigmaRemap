// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class3520 extends Class3514
{
    private static String[] field16509;
    
    public Class3520(final Class787 class787, final double n) {
        super(class787, n, 10);
    }
    
    @Override
    public boolean method11013() {
        return !((Class1849)this.field16510.field2391).method6922(new Class354(this.field16510)) && super.method11013();
    }
    
    @Nullable
    @Override
    public Class5487 method11071() {
        final Class1849 class1849 = (Class1849)this.field16510.field2391;
        final Class353 method1089 = Class353.method1089(new Class354(this.field16510));
        final Class353 method1090 = Class6793.method20792(class1849, method1089, 2);
        return (method1090 == method1089) ? null : Class7775.method24905(this.field16510, 10, 7, new Class5487(method1090.method1114()));
    }
}
