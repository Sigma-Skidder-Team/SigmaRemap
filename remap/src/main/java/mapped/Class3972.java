// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

import java.util.Random;

public class Class3972 extends Class3833
{
    private static String[] field17944;
    public static final Class7112 field17945;
    public static final Class7113 field17946;
    
    public Class3972(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3972.field17945, 7)).method21773((Class7111<Comparable>)Class3972.field17946, false));
    }
    
    @Override
    public boolean method11801(final Class7096 class7096) {
        return class7096.method21772((Class7111<Integer>)Class3972.field17945) == 7 && !class7096.method21772((Class7111<Boolean>)Class3972.field17946);
    }
    
    @Override
    public void method11821(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (!class7096.method21772((Class7111<Boolean>)Class3972.field17946)) {
            if (class7096.method21772((Class7111<Integer>)Class3972.field17945) == 7) {
                Class3833.method11836(class7096, class7097, class7098);
                class7097.method6690(class7098, false);
            }
        }
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        class7097.method6688(class7098, method12112(class7096, class7097, class7098), 3);
    }
    
    @Override
    public int method11819(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return 1;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        final int n = method12113(class7098) + 1;
        if (n != 1 || class7096.method21772((Class7111<Integer>)Class3972.field17945) != n) {
            class7099.method6833().method21345(class7100, this, 1);
        }
        return class7096;
    }
    
    private static Class7096 method12112(final Class7096 class7096, final Class1851 class7097, final BlockPos class7098) {
        int min = 7;
        try (final Class386 method1296 = Class386.method1296()) {
            final Direction[] values = Direction.values();
            for (int length = values.length, i = 0; i < length; ++i) {
                method1296.method1303(class7098).method1304(values[i]);
                min = Math.min(min, method12113(class7097.method6701(method1296)) + 1);
                if (min == 1) {
                    break;
                }
            }
        }
        return (Class7096)((Class7097<Object, Object>)class7096).method21773((Class7111<Comparable>)Class3972.field17945, min);
    }
    
    private static int method12113(final Class7096 class7096) {
        if (!Class7188.field27893.method25618(class7096.method21696())) {
            return (class7096.method21696() instanceof Class3972) ? class7096.method21772((Class7111<Integer>)Class3972.field17945) : 7;
        }
        return 0;
    }
    
    @Override
    public void method11823(final Class7096 class7096, final World class7097, final BlockPos class7098, final Random random) {
        if (class7097.method6772(class7098.method1137())) {
            if (random.nextInt(15) == 1) {
                final BlockPos method1139 = class7098.method1139();
                final Class7096 method1140 = class7097.method6701(method1139);
                if (!method1140.method21723() || !method1140.method21761(class7097, method1139, Direction.UP)) {
                    class7097.method6709(Class8432.field34609, class7098.getX() + random.nextFloat(), class7098.getY() - 0.05, class7098.getZ() + random.nextFloat(), 0.0, 0.0, 0.0);
                }
            }
        }
    }
    
    @Override
    public boolean method11794(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return false;
    }
    
    @Override
    public boolean method11779(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final EntityType<?> class7099) {
        return class7099 == EntityType.field29008 || class7099 == EntityType.field29011;
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3972.field17945, Class3972.field17946);
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return method12112(((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3972.field17946, true), class7074.method21654(), class7074.method21639());
    }
    
    static {
        field17945 = Class8970.field37778;
        field17946 = Class8970.field37740;
    }
}
