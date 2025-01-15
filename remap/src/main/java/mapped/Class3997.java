// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;

import java.util.Random;

public class Class3997 extends Class3833
{
    private static String[] field18015;
    public static final Class7113 field18016;
    
    public Class3997(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3997.field18016, false));
    }
    
    @Override
    public int method11781(final Class7096 class7096) {
        return class7096.method21772((Class7111<Boolean>)Class3997.field18016) ? super.method11781(class7096) : 0;
    }
    
    @Override
    public void method11847(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class512 class7099) {
        method12145(class7096, class7097, class7098);
        super.method11847(class7096, class7097, class7098, class7099);
    }
    
    @Override
    public void method11845(final Class1847 class1847, final BlockPos class1848, final Entity class1849) {
        method12145(class1847.method6701(class1848), class1847, class1848);
        super.method11845(class1847, class1848, class1849);
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (!class7097.field10067) {
            method12145(class7096, class7097, class7098);
            return Class2201.field13402;
        }
        method12146(class7097, class7098);
        return Class2201.field13400;
    }
    
    private static void method12145(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098) {
        method12146(class7097, class7098);
        if (!class7096.method21772((Class7111<Boolean>)Class3997.field18016)) {
            class7097.method6688(class7098, ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3997.field18016, true), 3);
        }
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (class7096.method21772((Class7111<Boolean>)Class3997.field18016)) {
            class7097.method6688(class7098, ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3997.field18016, false), 3);
        }
    }
    
    @Override
    public void method11831(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class8321 class7099) {
        super.method11831(class7096, class7097, class7098, class7099);
        if (Class8742.method30195(Class7882.field32366, class7099) == 0) {
            this.method11840(class7097, class7098, 1 + class7097.field10062.nextInt(5));
        }
    }
    
    @Override
    public void method11823(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Random random) {
        if (class7096.method21772((Class7111<Boolean>)Class3997.field18016)) {
            method12146(class7097, class7098);
        }
    }
    
    private static void method12146(final Class1847 class1847, final BlockPos class1848) {
        final Random field10062 = class1847.field10062;
        for (final Direction class1849 : Direction.values()) {
            final BlockPos method1149 = class1848.method1149(class1849);
            if (!class1847.method6701(method1149).method21722(class1847, method1149)) {
                final Axis method1150 = class1849.getAxis();
                class1847.method6709(Class6912.field27101, class1848.getX() + ((method1150 != Axis.X) ? field10062.nextFloat() : (0.5 + 0.5625 * class1849.getXOffset())), class1848.getY() + ((method1150 != Axis.Y) ? field10062.nextFloat() : (0.5 + 0.5625 * class1849.getYOffset())), class1848.getZ() + ((method1150 != Axis.Z) ? field10062.nextFloat() : (0.5 + 0.5625 * class1849.getZOffset())), 0.0, 0.0, 0.0);
            }
        }
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3997.field18016);
    }
    
    static {
        field18016 = Class4024.field18113;
    }
}
