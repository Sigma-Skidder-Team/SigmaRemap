// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.Random;

public class Class3952 extends Class3841
{
    private static String[] field17851;
    public static final Class7702 field17852;
    
    public Class3952(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class436 method11898(final Class1855 class1855) {
        return new Class489();
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        return Class3952.field17852;
    }
    
    @Override
    public void method11850(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Entity class7099) {
        if (!class7097.field10067) {
            if (!class7099.method1805()) {
                if (!class7099.method1806()) {
                    if (class7099.method1855()) {
                        if (Class7698.method24496(Class7698.method24489(class7099.method1886().method18499(-class7098.getX(), -class7098.getY(), -class7098.getZ())), class7096.method21725(class7097, class7098), Class9306.field39924)) {
                            class7099.method1854((class7097.field10063.method20487() != Class383.field2225) ? Class383.field2225 : Class383.field2223);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void method11823(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Random random) {
        class7097.method6709(Class8432.field34639, class7098.getX() + (double)random.nextFloat(), class7098.getY() + 0.8, class7098.getZ() + (double)random.nextFloat(), 0.0, 0.0, 0.0);
    }
    
    @Override
    public Class8321 method11862(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857) {
        return Class8321.field34174;
    }
    
    @Override
    public boolean method11799(final Class7096 class7096, final Class7255 class7097) {
        return false;
    }
    
    static {
        field17852 = Class3833.method11778(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
    }
}
