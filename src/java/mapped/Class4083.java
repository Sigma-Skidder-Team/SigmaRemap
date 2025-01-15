// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4083 extends Class3820
{
    private static String[] field18187;
    
    public Class4083(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final Class1847 method21654 = class7075.method21654();
        final Class354 method21655 = class7075.method21639();
        final Class7096 method21656 = method21654.method6701(method21655);
        int n = 0;
        if (method21656.method21696() != Class7521.field29818) {
            final Class354 method21657 = method21655.method1149(class7075.method21648());
            if (method21654.method6701(method21657).method21706()) {
                this.method12288(method21654, method21657);
                method21654.method6692(method21657, ((Class4011)Class7521.field29289).method12184(method21654, method21657));
                n = 1;
            }
        }
        else if (!((Class7097<Object, Class7096>)method21656).method21772((Class7111<Boolean>)Class3918.field17760)) {
            if (!((Class7097<Object, Class7096>)method21656).method21772((Class7111<Boolean>)Class3918.field17762)) {
                this.method12288(method21654, method21655);
                method21654.method6692(method21655, ((Class7097<Object, Class7096>)method21656).method21773((Class7111<Comparable>)Class3918.field17760, true));
                n = 1;
            }
        }
        if (n == 0) {
            return Class2201.field13403;
        }
        class7075.method21651().method27693(1);
        return Class2201.field13400;
    }
    
    private void method12288(final Class1847 class1847, final Class354 class1848) {
        class1847.method6705(null, class1848, Class8520.field35189, Class286.field1582, 1.0f, (Class4083.field17363.nextFloat() - Class4083.field17363.nextFloat()) * 0.2f + 1.0f);
    }
}
