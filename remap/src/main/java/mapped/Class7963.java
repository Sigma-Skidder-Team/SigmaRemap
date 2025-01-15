// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class Class7963 implements Class7954
{
    private static String[] field32723;
    private final ItemStack field32724;
    private final int field32725;
    private final int field32726;
    private final int field32727;
    private final float field32728;
    
    public Class7963(final Item class3820, final int n, final int n2, final int n3) {
        this(class3820, n, n2, n3, 0.05f);
    }
    
    public Class7963(final Item class3820, final int field32725, final int field32726, final int field32727, final float field32728) {
        this.field32724 = new ItemStack(class3820);
        this.field32725 = field32725;
        this.field32726 = field32726;
        this.field32727 = field32727;
        this.field32728 = field32728;
    }
    
    @Override
    public Class9017 method25804(final Entity class399, final Random random) {
        final int n = 5 + random.nextInt(15);
        return new Class9017(new ItemStack(Items.field31514, Math.min(this.field32725 + n, 64)), Class8742.method30224(random, new ItemStack(this.field32724.getItem()), n, false), this.field32726, this.field32727, this.field32728);
    }
}
