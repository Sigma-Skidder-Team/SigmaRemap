// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class3912 extends Class3910
{
    private static String[] field17718;
    
    public Class3912(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public void method11823(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Random random) {
        super.method11823(class7096, class7097, class7098, random);
        if (random.nextInt(10) == 0) {
            class7097.method6709(Class8432.field34634, class7098.method1074() + (double)random.nextFloat(), class7098.method1075() + 1.1, class7098.method1076() + (double)random.nextFloat(), 0.0, 0.0, 0.0);
        }
    }
}
