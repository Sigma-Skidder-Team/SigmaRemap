// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class Class7957 implements Class7954
{
    private static String[] field32691;
    private final int field32692;
    
    public Class7957(final int field32692) {
        this.field32692 = field32692;
    }
    
    @Override
    public Class9017 method25804(final Entity class399, final Random random) {
        final Class6257 class400 = Registry.field209.method508(random);
        final int method35658 = MathHelper.method35658(random, class400.method18593(), class400.method18588());
        final ItemStack method35659 = Class4034.method12227(new Class6827(class400, method35658));
        int n = 2 + random.nextInt(5 + method35658 * 10) + 3 * method35658;
        if (class400.method18603()) {
            n *= 2;
        }
        if (n > 64) {
            n = 64;
        }
        return new Class9017(new ItemStack(Items.field31514, n), new ItemStack(Items.field31370), method35659, 12, this.field32692, 0.2f);
    }
}