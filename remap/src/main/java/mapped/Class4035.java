// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.AbstractList;

public class Class4035 extends Item
{
    public Class4035(final Properties properties) {
        super(properties);
    }
    
    public static void method12228(final ItemStack class8321, final Class5328 class8322, final int n) {
        final CompoundNBT method27658 = class8321.method27658();
        final ListNBT method27659 = method27658.getList("Effects", 9);
        final CompoundNBT e = new CompoundNBT();
        e.putByte("EffectId", (byte)Class5328.method16451(class8322));
        e.putInt("EffectDuration", n);
        ((AbstractList<CompoundNBT>)method27659).add(e);
        method27658.put("Effects", method27659);
    }
    
    @Override
    public ItemStack method11707(final ItemStack class8321, final World class8322, final LivingEntity class8323) {
        final ItemStack method11707 = super.method11707(class8321, class8322, class8323);
        final CompoundNBT method11708 = class8321.method27657();
        if (method11708 != null) {
            if (method11708.contains("Effects", 9)) {
                final ListNBT method11709 = method11708.getList("Effects", 10);
                for (int i = 0; i < method11709.size(); ++i) {
                    int method11710 = 160;
                    final CompoundNBT method11711 = method11709.method346(i);
                    if (method11711.contains("EffectDuration", 3)) {
                        method11710 = method11711.getInt("EffectDuration");
                    }
                    final Class5328 method11712 = Class5328.method16450(method11711.getByte("EffectId"));
                    if (method11712 != null) {
                        class8323.method2655(new Class1948(method11712, method11710));
                    }
                }
            }
        }
        return (class8323 instanceof PlayerEntity && ((PlayerEntity)class8323).field3025.field27304) ? method11707 : new ItemStack(Items.field31300);
    }
}
