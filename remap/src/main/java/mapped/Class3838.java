// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.world.World;

import java.util.Random;

public class Class3838 extends Class3834
{
    private static String[] field17450;
    public static final Class7113 field17451;
    
    public Class3838(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3838.field17415, Direction.SOUTH)).method21773((Class7111<Comparable>)Class3838.field17451, false));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3838.field17415, Class3838.field17451);
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3838.field17415, class7097.method8142(class7096.method21772((Class7111<Direction>)Class3838.field17415)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Direction>)Class3838.field17415)));
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (!class7096.method21772((Class7111<Boolean>)Class3838.field17451)) {
            class7097.method6688(class7098, ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3838.field17451, true), 2);
            class7097.method6907().method21345(class7098, this, 2);
        }
        else {
            class7097.method6688(class7098, ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3838.field17451, false), 2);
        }
        this.method11897(class7097, class7098, class7096);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.method21772((Class7111<Comparable>)Class3838.field17415) == class7097) {
            if (!class7096.method21772((Class7111<Boolean>)Class3838.field17451)) {
                this.method11896(class7099, class7100);
            }
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    private void method11896(final Class1851 class1851, final BlockPos class1852) {
        if (!class1851.method6678()) {
            if (!class1851.method6833().method21340(class1852, this)) {
                class1851.method6833().method21345(class1852, this, 2);
            }
        }
    }
    
    public void method11897(final World class1847, final BlockPos class1848, final Class7096 class1849) {
        final Direction class1850 = class1849.method21772((Class7111<Direction>)Class3838.field17415);
        final BlockPos method1149 = class1848.method1149(class1850.getOpposite());
        class1847.method6698(method1149, this, class1848);
        class1847.method6697(method1149, this, class1850);
    }
    
    @Override
    public boolean method11849(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public int method11851(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Direction class7099) {
        return class7096.method21715(class7097, class7098, class7099);
    }
    
    @Override
    public int method11848(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Direction class7099) {
        return (class7096.method21772((Class7111<Boolean>)Class3838.field17451) && class7096.method21772((Class7111<Comparable>)Class3838.field17415) == class7099) ? 15 : 0;
    }
    
    @Override
    public void method11828(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (class7096.method21696() != class7099.method21696()) {
            if (!class7097.method6678()) {
                if (class7096.method21772((Class7111<Boolean>)Class3838.field17451)) {
                    if (!class7097.method6833().method21340(class7098, this)) {
                        final Class7096 class7100 = ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3838.field17451, false);
                        class7097.method6688(class7098, class7100, 18);
                        this.method11897(class7097, class7098, class7100);
                    }
                }
            }
        }
    }
    
    @Override
    public void method11829(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (class7096.method21696() != class7099.method21696()) {
            if (!class7097.field10067) {
                if (class7096.method21772((Class7111<Boolean>)Class3838.field17451)) {
                    if (class7097.method6833().method21340(class7098, this)) {
                        this.method11897(class7097, class7098, ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3838.field17451, false));
                    }
                }
            }
        }
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3838.field17415, class7074.method21642().getOpposite().getOpposite());
    }
    
    static {
        field17451 = Class8970.field37741;
    }
}
