// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import java.util.Random;

public abstract class Class763 extends Class787 implements Class762
{
    public Class763(final EntityType<? extends Class763> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4108 = 5;
    }
    
    @Override
    public Class286 method1922() {
        return Class286.field1583;
    }
    
    @Override
    public void method2736() {
        this.method2709();
        this.method4227();
        super.method2736();
    }
    
    public void method4227() {
        if (this.method1726() > 0.5f) {
            this.field2959 += 2;
        }
    }
    
    @Override
    public boolean method4170() {
        return true;
    }
    
    @Override
    public Class7795 method1686() {
        return Class8520.field35290;
    }
    
    @Override
    public Class7795 method1687() {
        return Class8520.field35289;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        return !this.method1849(class7929) && super.attackEntityFrom(class7929, n);
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35287;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35286;
    }
    
    @Override
    public Class7795 method2685(final int n) {
        return (n <= 4) ? Class8520.field35288 : Class8520.field35285;
    }
    
    @Override
    public float method4228(final BlockPos class354, final Class1852 class355) {
        return 0.5f - class355.method6963(class354);
    }
    
    public static boolean method4229(final Class1851 class1851, final BlockPos class1852, final Random random) {
        return class1851.method6992(Class237.field911, class1852) <= random.nextInt(32) && (class1851.method6744().method6770() ? class1851.method6970(class1852, 10) : class1851.method6969(class1852)) <= random.nextInt(8);
    }
    
    public static boolean method4230(final EntityType<? extends Class763> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        if (class7500.method6954() != Class2113.field12290) {
            if (method4229(class7500, class7502, random)) {
                if (Class759.method4178(class7499, class7500, class7501, class7502, random)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean method4231(final EntityType<? extends Class763> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        return class7500.method6954() != Class2113.field12290 && Class759.method4178(class7499, class7500, class7501, class7502, random);
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2711().method20873(Class8107.field33410);
    }
    
    @Override
    public boolean method2628() {
        return true;
    }
    
    public boolean method4232(final PlayerEntity playerEntity) {
        return true;
    }
    
    @Override
    public ItemStack method2790(final ItemStack class8321) {
        if (!(class8321.getItem() instanceof Class4085)) {
            return ItemStack.EMPTY;
        }
        final ItemStack method12291 = Class4085.method12291(this, ((Class4085)class8321.getItem()).method12289());
        return method12291.method27620() ? new ItemStack(Items.field31280) : method12291;
    }
}
