// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3913 extends Class3833 implements Class3872
{
    private static String[] field17719;
    public static final Class7702 field17720;
    public static final Class7702 field17721;
    public static final Class7702 field17722;
    public static final Class7112 field17723;
    public static final Class7114<Class184> field17724;
    public static final Class7112 field17725;
    
    public Class3913(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3913.field17723, 0)).method21773(Class3913.field17724, Class184.field574)).method21773((Class7111<Comparable>)Class3913.field17725, 0));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3913.field17723, Class3913.field17724, Class3913.field17725);
    }
    
    @Override
    public Class2180 method11879() {
        return Class2180.field12914;
    }
    
    @Override
    public boolean method11818(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return true;
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        final Class7702 class7100 = (class7096.method21772(Class3913.field17724) != Class184.field576) ? Class3913.field17720 : Class3913.field17721;
        final Vec3d method21732 = class7096.method21732(class7097, class7098);
        return class7100.method24541(method21732.x, method21732.y, method21732.z);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    @Override
    public Class7702 method11809(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        final Vec3d method21732 = class7096.method21732(class7097, class7098);
        return Class3913.field17722.method24541(method21732.x, method21732.y, method21732.z);
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        if (!class7074.method21654().method6702(class7074.method21639()).method21781()) {
            return null;
        }
        final Class7096 method6701 = class7074.method21654().method6701(class7074.method21639().method1139());
        if (!method6701.method21755(Class7188.field27925)) {
            return null;
        }
        final Class3833 method6702 = method6701.method21696();
        if (method6702 == Class7521.field29760) {
            return ((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3913.field17723, 0);
        }
        if (method6702 != Class7521.field29761) {
            return Class7521.field29760.method11878();
        }
        return (Class7096)((Class7097<Object, Object>)this.method11878()).method21773((Class7111<Comparable>)Class3913.field17723, (method6701.method21772((Class7111<Integer>)Class3913.field17723) > 0) ? 1 : 0);
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (class7096.method21752(class7097, class7098)) {
            if (class7096.method21772((Class7111<Integer>)Class3913.field17725) == 0) {
                if (random.nextInt(3) == 0) {
                    if (class7097.method6961(class7098.method1137())) {
                        if (class7097.method6993(class7098.method1137(), 0) >= 9) {
                            final int n = this.method12019(class7097, class7098) + 1;
                            if (n < 16) {
                                this.method12017(class7096, class7097, class7098, random, n);
                            }
                        }
                    }
                }
            }
        }
        else {
            class7097.method7149(class7098, true);
        }
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        return class7097.method6701(class7098.method1139()).method21755(Class7188.field27925);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (!class7096.method21752(class7099, class7100)) {
            class7099.method6833().method21345(class7100, this, 1);
        }
        if (class7097 == Direction.UP) {
            if (class7098.method21696() == Class7521.field29761) {
                if (class7098.method21772((Class7111<Integer>)Class3913.field17723) > class7096.method21772((Class7111<Integer>)Class3913.field17723)) {
                    class7099.method6688(class7100, ((Class7097<O, Class7096>)class7096).method21768((Class7111<Comparable>)Class3913.field17723), 2);
                }
            }
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11945(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857, final boolean b) {
        final int method12018 = this.method12018(class1855, class1856);
        return method12018 + this.method12019(class1855, class1856) + 1 < 16 && class1855.method6701(class1856.method1138(method12018)).method21772((Class7111<Integer>)Class3913.field17725) != 1;
    }
    
    @Override
    public boolean method11946(final World class1847, final Random random, final BlockPos class1848, final Class7096 class1849) {
        return true;
    }
    
    @Override
    public void method11947(final Class1849 class1849, final Random random, final BlockPos class1850, final Class7096 class1851) {
        int method12018 = this.method12018(class1849, class1850);
        int n = method12018 + this.method12019(class1849, class1850) + 1;
        final int n2 = 1 + random.nextInt(2);
        int i = 0;
        while (i < n2) {
            final BlockPos method12019 = class1850.method1138(method12018);
            final Class7096 method12020 = class1849.method6701(method12019);
            if (n < 16) {
                if (method12020.method21772((Class7111<Integer>)Class3913.field17725) != 1) {
                    if (class1849.method6961(method12019.method1137())) {
                        this.method12017(method12020, class1849, method12019, random, n);
                        ++method12018;
                        ++n;
                        ++i;
                        continue;
                    }
                }
            }
        }
    }
    
    @Override
    public float method11830(final Class7096 class7096, final Class512 class7097, final Class1855 class7098, final BlockPos class7099) {
        return (class7097.method2713().method27622() instanceof Class4077) ? 1.0f : super.method11830(class7096, class7097, class7098, class7099);
    }
    
    public void method12017(final Class7096 class7096, final World class7097, final BlockPos class7098, final Random random, final int n) {
        final Class7096 method6701 = class7097.method6701(class7098.method1139());
        final BlockPos method6702 = class7098.method1140(2);
        final Class7096 method6703 = class7097.method6701(method6702);
        Class184 class7099 = Class184.field574;
        if (n >= 1) {
            if (method6701.method21696() == Class7521.field29761 && ((Class7097<O, Class7096>)method6701).method21772(Class3913.field17724) != Class184.field574) {
                if (method6701.method21696() == Class7521.field29761) {
                    if (((Class7097<O, Class7096>)method6701).method21772(Class3913.field17724) != Class184.field574) {
                        class7099 = Class184.field576;
                        if (method6703.method21696() == Class7521.field29761) {
                            class7097.method6688(class7098.method1139(), ((Class7097<O, Class7096>)method6701).method21773(Class3913.field17724, Class184.field575), 3);
                            class7097.method6688(method6702, ((Class7097<O, Class7096>)method6703).method21773(Class3913.field17724, Class184.field574), 3);
                        }
                    }
                }
            }
            else {
                class7099 = Class184.field575;
            }
        }
        final int i = (class7096.method21772((Class7111<Integer>)Class3913.field17723) == 1 || method6703.method21696() == Class7521.field29761) ? 1 : 0;
        int j = 0;
        Label_0257: {
            if (n < 11 || random.nextFloat() >= 0.25f) {
                if (n != 15) {
                    j = 0;
                    break Label_0257;
                }
            }
            j = 1;
        }
        class7097.method6688(class7098.method1137(), (Class7096)((Class7097<Object, Object>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3913.field17723, i)).method21773(Class3913.field17724, class7099)).method21773((Class7111<Comparable>)Class3913.field17725, j), 3);
    }
    
    public int method12018(final Class1855 class1855, final BlockPos class1856) {
        int n;
        for (n = 0; n < 16 && class1855.method6701(class1856.method1138(n + 1)).method21696() == Class7521.field29761; ++n) {}
        return n;
    }
    
    public int method12019(final Class1855 class1855, final BlockPos class1856) {
        int n;
        for (n = 0; n < 16 && class1855.method6701(class1856.method1140(n + 1)).method21696() == Class7521.field29761; ++n) {}
        return n;
    }
    
    static {
        field17720 = Class3833.method11778(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
        field17721 = Class3833.method11778(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
        field17722 = Class3833.method11778(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
        field17723 = Class8970.field37769;
        field17724 = Class8970.field37803;
        field17725 = Class8970.field37791;
    }
}
