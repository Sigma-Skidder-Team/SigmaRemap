// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class3957 extends Class3841
{
    private static String[] field17863;
    
    public Class3957(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class436 method11898(final Class1855 class1855) {
        return new Class488();
    }
    
    @Override
    public void method11823(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Random random) {
        final Class436 method6727 = class7097.method6727(class7098);
        if (method6727 instanceof Class488) {
            for (int method6728 = ((Class488)method6727).method2445(), i = 0; i < method6728; ++i) {
                double n = class7098.method1074() + (double)random.nextFloat();
                final double n2 = class7098.method1075() + (double)random.nextFloat();
                double n3 = class7098.method1076() + (double)random.nextFloat();
                double n4 = (random.nextFloat() - 0.5) * 0.5;
                final double n5 = (random.nextFloat() - 0.5) * 0.5;
                double n6 = (random.nextFloat() - 0.5) * 0.5;
                final int n7 = random.nextInt(2) * 2 - 1;
                if (!random.nextBoolean()) {
                    n = class7098.method1074() + 0.5 + 0.25 * n7;
                    n4 = random.nextFloat() * 2.0f * n7;
                }
                else {
                    n3 = class7098.method1076() + 0.5 + 0.25 * n7;
                    n6 = random.nextFloat() * 2.0f * n7;
                }
                class7097.method6709(Class8432.field34637, n, n2, n3, n4, n5, n6);
            }
        }
    }
    
    @Override
    public Class8321 method11862(final Class1855 class1855, final Class354 class1856, final Class7096 class1857) {
        return Class8321.field34174;
    }
    
    @Override
    public boolean method11799(final Class7096 class7096, final Class7255 class7097) {
        return false;
    }
}
