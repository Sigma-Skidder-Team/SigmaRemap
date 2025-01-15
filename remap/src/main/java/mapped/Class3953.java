// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import java.util.Random;
import org.apache.logging.log4j.Logger;

public class Class3953 extends Class3841
{
    private static final Logger field17390;
    public static final Class7115 field17853;
    public static final Class7113 field17854;
    
    public Class3953(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3953.field17853, Direction.NORTH)).method21773((Class7111<Comparable>)Class3953.field17854, false));
    }
    
    @Override
    public Class436 method11898(final Class1855 class1855) {
        final Class500 class1856 = new Class500();
        class1856.method2543(this == Class7521.field29640);
        return class1856;
    }
    
    @Override
    public void method11825(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class3833 class7099, final BlockPos class7100, final boolean b) {
        if (!class7097.field10067) {
            final Class436 method6727 = class7097.method6727(class7098);
            if (method6727 instanceof Class500) {
                final Class500 class7101 = (Class500)method6727;
                final boolean method6728 = class7097.method6749(class7098);
                final boolean method6729 = class7101.method2541();
                class7101.method2540(method6728);
                if (!method6729) {
                    if (!class7101.method2542()) {
                        if (class7101.method2550() != Class2182.field12921) {
                            if (method6728) {
                                class7101.method2547();
                                class7097.method6833().method21345(class7098, this, this.method11826(class7097));
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        final Class436 method6727 = class7097.method6727(class7098);
        if (method6727 instanceof Class500) {
            final Class500 class7099 = (Class500)method6727;
            final Class865 method6728 = class7099.method2539();
            final boolean b = !Class8272.method27500(method6728.method5212());
            final Class2182 method6729 = class7099.method2550();
            final boolean method6730 = class7099.method2546();
            if (method6729 != Class2182.field12922) {
                if (method6729 == Class2182.field12923) {
                    if (!method6730) {
                        if (class7099.method2551()) {
                            method6728.method5207(0);
                        }
                    }
                    else {
                        this.method12067(class7096, class7097, class7098, method6728, b);
                    }
                }
            }
            else {
                class7099.method2547();
                if (!method6730) {
                    if (class7099.method2551()) {
                        method6728.method5207(0);
                    }
                }
                else {
                    this.method12067(class7096, class7097, class7098, method6728, b);
                }
                if (class7099.method2541() || class7099.method2542()) {
                    class7097.method6907().method21345(class7098, this, this.method11826(class7097));
                }
            }
            class7097.method6783(class7098, this);
        }
    }
    
    private void method12067(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class865 class7099, final boolean b) {
        if (!b) {
            class7099.method5207(0);
        }
        else {
            class7099.method5213(class7097);
        }
        method12068(class7097, class7098, class7096.method21772((Class7111<Direction>)Class3953.field17853));
    }
    
    @Override
    public int method11826(final Class1852 class1852) {
        return 1;
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        final Class436 method6727 = class7097.method6727(class7098);
        if (method6727 instanceof Class500 && class7099.method2908()) {
            class7099.method2829((Class500)method6727);
            return Class2201.field13400;
        }
        return Class2201.field13402;
    }
    
    @Override
    public boolean method11873(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public int method11874(final Class7096 class7096, final World class7097, final BlockPos class7098) {
        final Class436 method6727 = class7097.method6727(class7098);
        return (method6727 instanceof Class500) ? ((Class500)method6727).method2539().method5206() : 0;
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final Class7096 class1849, final LivingEntity class1850, final ItemStack class1851) {
        final Class436 method6727 = class1847.method6727(class1848);
        if (method6727 instanceof Class500) {
            final Class500 class1852 = (Class500)method6727;
            final Class865 method6728 = class1852.method2539();
            if (class1851.method27667()) {
                method6728.method5215(class1851.method27664());
            }
            if (!class1847.field10067) {
                if (class1851.method27660("BlockEntityTag") == null) {
                    method6728.method5219(class1847.method6765().method31216(Class8878.field37328));
                    class1852.method2543(this == Class7521.field29640);
                }
                if (class1852.method2550() == Class2182.field12921) {
                    class1852.method2540(class1847.method6749(class1848));
                }
            }
        }
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3953.field17853, class7097.method8142(class7096.method21772((Class7111<Direction>)Class3953.field17853)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Direction>)Class3953.field17853)));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3953.field17853, Class3953.field17854);
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3953.field17853, class7074.method21642().getOpposite());
    }
    
    private static void method12068(final World class1847, final BlockPos class1848, Direction class1849) {
        final Mutable class1850 = new Mutable(class1848);
        final Class8878 method6765 = class1847.method6765();
        int method6766 = method6765.method31217(Class8878.field37336);
        while (method6766-- > 0) {
            class1850.method1290(class1849);
            final Class7096 method6767 = class1847.method6701(class1850);
            final Class3833 method6768 = method6767.method21696();
            if (method6768 != Class7521.field29640) {
                break;
            }
            final Class436 method6769 = class1847.method6727(class1850);
            if (!(method6769 instanceof Class500)) {
                break;
            }
            final Class500 class1851 = (Class500)method6769;
            if (class1851.method2550() != Class2182.field12921) {
                break;
            }
            if (class1851.method2541() || class1851.method2542()) {
                final Class865 method6770 = class1851.method2539();
                if (!class1851.method2547()) {
                    if (class1851.method2551()) {
                        method6770.method5207(0);
                    }
                }
                else {
                    if (!method6770.method5213(class1847)) {
                        break;
                    }
                    class1847.method6783(class1850, method6768);
                }
            }
            class1849 = method6767.method21772((Class7111<Direction>)Class3953.field17853);
        }
        if (method6766 <= 0) {
            Class3953.field17390.warn("Command Block chain tried to execute more than {} steps!", (Object)Math.max(method6765.method31217(Class8878.field37336), 0));
        }
    }
    
    static {
        field17390 = LogManager.getLogger();
        field17853 = Class3834.field17415;
        field17854 = Class8970.field37721;
    }
}
