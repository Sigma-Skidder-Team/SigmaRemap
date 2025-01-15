// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.AbstractList;

public class Class4035 extends Class3820
{
    public Class4035(final Class8959 class8959) {
        super(class8959);
    }
    
    public static void method12228(final ItemStack class8321, final Class5328 class8322, final int n) {
        final Class51 method27658 = class8321.method27658();
        final Class52 method27659 = method27658.method328("Effects", 9);
        final Class51 e = new Class51();
        e.method296("EffectId", (byte)Class5328.method16451(class8322));
        e.method298("EffectDuration", n);
        ((AbstractList<Class51>)method27659).add(e);
        method27658.method295("Effects", method27659);
    }
    
    @Override
    public ItemStack method11707(final ItemStack class8321, final World class8322, final LivingEntity class8323) {
        final ItemStack method11707 = super.method11707(class8321, class8322, class8323);
        final Class51 method11708 = class8321.method27657();
        if (method11708 != null) {
            if (method11708.method316("Effects", 9)) {
                final Class52 method11709 = method11708.method328("Effects", 10);
                for (int i = 0; i < method11709.size(); ++i) {
                    int method11710 = 160;
                    final Class51 method11711 = method11709.method346(i);
                    if (method11711.method316("EffectDuration", 3)) {
                        method11710 = method11711.method319("EffectDuration");
                    }
                    final Class5328 method11712 = Class5328.method16450(method11711.method317("EffectId"));
                    if (method11712 != null) {
                        class8323.method2655(new Class1948(method11712, method11710));
                    }
                }
            }
        }
        return (class8323 instanceof Class512 && ((Class512)class8323).field3025.field27304) ? method11707 : new ItemStack(Class7739.field31300);
    }
}
