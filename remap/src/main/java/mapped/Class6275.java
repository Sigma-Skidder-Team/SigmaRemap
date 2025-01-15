// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

import java.util.Map;
import java.util.Random;

public class Class6275 extends Class6257
{
    private static String[] field25142;
    
    public Class6275(final Class2233 class2233, final Class2215... array) {
        super(class2233, Class242.field1194, array);
    }
    
    @Override
    public int method18586(final int n) {
        return 10 + 20 * (n - 1);
    }
    
    @Override
    public int method18587(final int n) {
        return super.method18586(n) + 50;
    }
    
    @Override
    public int method18588() {
        return 3;
    }
    
    @Override
    public boolean method18600(final ItemStack class8321) {
        return class8321.method27622() instanceof Class4055 || super.method18600(class8321);
    }
    
    @Override
    public void method18602(final LivingEntity class511, final Entity class512, final int n) {
        final Random method2633 = class511.method2633();
        final Map.Entry<Class2215, ItemStack> method2634 = Class8742.method30222(Class7882.field32354, class511);
        if (!method18610(n, method2633)) {
            if (method2634 != null) {
                method2634.getValue().method27636(1, class511, class513 -> class513.method2794(entry.getKey()));
            }
        }
        else {
            if (class512 != null) {
                class512.attackEntityFrom(DamageSource.method25701(class511), (float)method18611(n, method2633));
            }
            if (method2634 != null) {
                method2634.getValue().method27636(3, class511, class514 -> class514.method2794(entry2.getKey()));
            }
        }
    }
    
    public static boolean method18610(final int n, final Random random) {
        return n > 0 && random.nextFloat() < 0.15f * n;
    }
    
    public static int method18611(final int n, final Random random) {
        return (n <= 10) ? (1 + random.nextInt(4)) : (n - 10);
    }
}
