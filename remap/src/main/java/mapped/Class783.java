// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import java.util.Random;

public class Class783 extends Class780
{
    private static String[] field4193;
    
    public Class783(final EntityType<? extends Class783> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public static boolean method4331(final EntityType<Class783> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        return Class763.method4230(class7499, class7500, class7501, class7502, random) && (class7501 == Class2101.field12176 || class7500.method6994(class7502));
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35624;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35626;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35625;
    }
    
    @Override
    public Class7795 method4328() {
        return Class8520.field35627;
    }
    
    @Override
    public Class402 method4330(final ItemStack class8321, final float n) {
        final Class402 method4330 = super.method4330(class8321, n);
        if (method4330 instanceof Class405) {
            ((Class405)method4330).method1995(new Class1948(Class9439.field40475, 600));
        }
        return method4330;
    }
}