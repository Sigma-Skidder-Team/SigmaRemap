// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class3885 extends Class3874
{
    private static String[] field17544;
    public static final Class7112 field17545;
    private static final Class7702[] field17546;
    
    public Class3885(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3885.field17545, 0));
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        return Class3885.field17546[class7096.method21772((Class7111<Integer>)Class3885.field17545)];
    }
    
    @Override
    public boolean method11943(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return class7096.method21696() == Class7521.field29339;
    }
    
    @Override
    public void method11822(Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        final int intValue = class7096.method21772((Class7111<Integer>)Class3885.field17545);
        if (intValue < 3) {
            if (random.nextInt(10) == 0) {
                class7096 = (Class7096)((Class7097<Object, Object>)class7096).method21773((Class7111<Comparable>)Class3885.field17545, intValue + 1);
                class7097.method6688(class7098, class7096, 2);
            }
        }
        super.method11822(class7096, class7097, class7098, random);
    }
    
    @Override
    public ItemStack method11862(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857) {
        return new ItemStack(Class7739.field31440);
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3885.field17545);
    }
    
    static {
        field17545 = Class8970.field37771;
        field17546 = new Class7702[] { Class3833.method11778(0.0, 0.0, 0.0, 16.0, 5.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 8.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 11.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 14.0, 16.0) };
    }
}
