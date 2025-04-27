// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class Class829 extends Class827
{
    private static String[] field4439;
    
    public Class829(final EntityType<? extends Class829> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public static boolean method4941(final EntityType<Class829> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        return Class763.method4230(class7499, class7500, class7501, class7502, random) && (class7501 == Class2101.field12176 || class7500.method6994(class7502));
    }
    
    @Override
    public boolean method4931() {
        return false;
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35291;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35294;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35293;
    }
    
    @Override
    public Class7795 method4917() {
        return Class8520.field35295;
    }
    
    @Override
    public boolean method2734(final Entity class399) {
        final boolean method2734 = super.method2734(class399);
        if (method2734) {
            if (this.getHeldItemMainhand().method27620()) {
                if (class399 instanceof LivingEntity) {
                    ((LivingEntity)class399).method2655(new Class1948(Class9439.field40490, 140 * (int)this.world.method6784(new BlockPos(this)).method35973()));
                }
            }
        }
        return method2734;
    }
    
    @Override
    public boolean method4912() {
        return true;
    }
    
    @Override
    public void method4929() {
        this.method4930(EntityType.field29052);
        this.world.playEvent(null, 1041, new BlockPos(this), 0);
    }
    
    @Override
    public ItemStack method4918() {
        return ItemStack.EMPTY;
    }
}
