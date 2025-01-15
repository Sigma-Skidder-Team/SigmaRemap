// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class3941 extends Class3841
{
    private static String[] field17830;
    public static final Class7114<Class102> field17831;
    
    public Class3941(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class436 method11898(final Class1855 class1855) {
        return new Class501();
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        final Class436 method6727 = class7097.method6727(class7098);
        if (!(method6727 instanceof Class501)) {
            return Class2201.field13402;
        }
        return ((Class501)method6727).method2553(class7099) ? Class2201.field13400 : Class2201.field13402;
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final Class7096 class1849, final LivingEntity class1850, final ItemStack class1851) {
        if (!class1847.field10067) {
            if (class1850 != null) {
                final Class436 method6727 = class1847.method6727(class1848);
                if (method6727 instanceof Class501) {
                    ((Class501)method6727).method2559(class1850);
                }
            }
        }
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((Class7097<O, Class7096>)this.method11878()).method21773(Class3941.field17831, Class102.field308);
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3941.field17831);
    }
    
    @Override
    public void method11825(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class3833 class7099, final BlockPos class7100, final boolean b) {
        if (!class7097.field10067) {
            final Class436 method6727 = class7097.method6727(class7098);
            if (method6727 instanceof Class501) {
                final Class501 class7101 = (Class501)method6727;
                final boolean method6728 = class7097.method6749(class7098);
                final boolean method6729 = class7101.method2591();
                if (method6728 && !method6729) {
                    class7101.method2592(true);
                    this.method12056(class7101);
                }
                else if (!method6728) {
                    if (method6729) {
                        class7101.method2592(false);
                    }
                }
            }
        }
    }
    
    private void method12056(final Class501 class501) {
        switch (Class9373.field40198[class501.method2570().ordinal()]) {
            case 1: {
                class501.method2584(false);
                break;
            }
            case 2: {
                class501.method2587(false);
                break;
            }
            case 3: {
                class501.method2589();
                break;
            }
        }
    }
    
    static {
        field17831 = Class8970.field37802;
    }
}
