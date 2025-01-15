// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;

import java.util.Random;

public class Class4010 extends Class3833
{
    private static String[] field18069;
    
    public Class4010(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public void method11845(final Class1847 class1847, final BlockPos class1848, final Entity class1849) {
        if (!class1849.method1704()) {
            if (class1849 instanceof Class511) {
                if (!Class8742.method30216((Class511)class1849)) {
                    class1849.method1740(Class7929.field32566, 1.0f);
                }
            }
        }
        super.method11845(class1847, class1848, class1849);
    }
    
    @Override
    public boolean method11804(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        Class3858.method11923(class7097, class7098.method1137(), true);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7097 == Direction.UP) {
            if (class7098.method21696() == Class7521.field29173) {
                class7099.method6833().method21345(class7100, this, this.method11826(class7099));
            }
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public void method11821(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        final BlockPos method1137 = class7098.method1137();
        if (class7097.method6702(class7098).method21793(Class7324.field28319)) {
            class7097.method6705(null, class7098, Class8520.field35199, Class286.field1582, 0.5f, 2.6f + (class7097.field10062.nextFloat() - class7097.field10062.nextFloat()) * 0.8f);
            class7097.method6911(Class8432.field34632, method1137.getX() + 0.5, method1137.getY() + 0.25, method1137.getZ() + 0.5, 8, 0.5, 0.25, 0.5, 0.0);
        }
    }
    
    @Override
    public int method11826(final Class1852 class1852) {
        return 20;
    }
    
    @Override
    public void method11828(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        class7097.method6833().method21345(class7098, this, this.method11826(class7097));
    }
    
    @Override
    public boolean method11779(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7499<?> class7099) {
        return class7099.method23363();
    }
    
    @Override
    public boolean method11803(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return true;
    }
}
