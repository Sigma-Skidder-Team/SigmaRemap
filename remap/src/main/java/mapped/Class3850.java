// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class Class3850 extends Class3849
{
    private static String[] field17458;
    public static final Class7112 field17459;
    
    public Class3850(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3850.field17459, 0));
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if ((random.nextInt(3) == 0 || this.method11912(class7097, class7098, 4)) && class7097.method6969(class7098) > 11 - class7096.method21772((Class7111<Integer>)Class3850.field17459) - class7096.method21700(class7097, class7098) && this.method11911(class7096, class7097, class7098)) {
            try (final Class386 method1296 = Class386.method1296()) {
                final Direction[] values = Direction.values();
                for (int length = values.length, i = 0; i < length; ++i) {
                    method1296.method1303(class7098).method1304(values[i]);
                    final Class7096 method1297 = class7097.method6701(method1296);
                    if (method1297.method21696() == this && !this.method11911(method1297, class7097, method1296)) {
                        class7097.method6907().method21345(method1296, this, MathHelper.method35658(random, 20, 40));
                    }
                }
            }
        }
        else {
            class7097.method6907().method21345(class7098, this, MathHelper.method35658(random, 20, 40));
        }
    }
    
    private boolean method11911(final Class7096 class7096, final World class7097, final BlockPos class7098) {
        final int intValue = class7096.method21772((Class7111<Integer>)Class3850.field17459);
        if (intValue >= 3) {
            this.method11910(class7096, class7097, class7098);
            return true;
        }
        class7097.method6688(class7098, (Class7096)((Class7097<Object, Object>)class7096).method21773((Class7111<Comparable>)Class3850.field17459, intValue + 1), 2);
        return false;
    }
    
    @Override
    public void method11825(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class3833 class7099, final BlockPos class7100, final boolean b) {
        if (class7099 == this) {
            if (this.method11912(class7097, class7098, 2)) {
                this.method11910(class7096, class7097, class7098);
            }
        }
        super.method11825(class7096, class7097, class7098, class7099, class7100, b);
    }
    
    private boolean method11912(final Class1855 class1855, final BlockPos class1856, final int n) {
        int n2 = 0;
        try (final Class386 method1296 = Class386.method1296()) {
            final Direction[] values = Direction.values();
            for (int length = values.length, i = 0; i < length; ++i) {
                method1296.method1303(class1856).method1304(values[i]);
                if (class1855.method6701(method1296).method21696() == this && ++n2 >= n) {
                    return false;
                }
            }
            return true;
        }
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3850.field17459);
    }
    
    @Override
    public ItemStack method11862(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857) {
        return ItemStack.field34174;
    }
    
    static {
        field17459 = Class8970.field37771;
    }
}
